/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package servicebuilder.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import servicebuilder.exception.NoSuchPianiSubentroException;

import servicebuilder.model.PianiSubentro;
import servicebuilder.model.PianiSubentroTable;
import servicebuilder.model.impl.PianiSubentroImpl;
import servicebuilder.model.impl.PianiSubentroModelImpl;

import servicebuilder.service.persistence.PianiSubentroPersistence;
import servicebuilder.service.persistence.PianiSubentroUtil;
import servicebuilder.service.persistence.impl.constants.AQPersistenceConstants;

/**
 * The persistence implementation for the piani subentro service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {PianiSubentroPersistence.class, BasePersistence.class})
public class PianiSubentroPersistenceImpl
	extends BasePersistenceImpl<PianiSubentro>
	implements PianiSubentroPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PianiSubentroUtil</code> to access the piani subentro persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PianiSubentroImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public PianiSubentroPersistenceImpl() {
		setModelClass(PianiSubentro.class);

		setModelImplClass(PianiSubentroImpl.class);
		setModelPKClass(long.class);

		setTable(PianiSubentroTable.INSTANCE);
	}

	/**
	 * Caches the piani subentro in the entity cache if it is enabled.
	 *
	 * @param pianiSubentro the piani subentro
	 */
	@Override
	public void cacheResult(PianiSubentro pianiSubentro) {
		entityCache.putResult(
			PianiSubentroImpl.class, pianiSubentro.getPrimaryKey(),
			pianiSubentro);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the piani subentros in the entity cache if it is enabled.
	 *
	 * @param pianiSubentros the piani subentros
	 */
	@Override
	public void cacheResult(List<PianiSubentro> pianiSubentros) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pianiSubentros.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PianiSubentro pianiSubentro : pianiSubentros) {
			if (entityCache.getResult(
					PianiSubentroImpl.class, pianiSubentro.getPrimaryKey()) ==
						null) {

				cacheResult(pianiSubentro);
			}
		}
	}

	/**
	 * Clears the cache for all piani subentros.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PianiSubentroImpl.class);

		finderCache.clearCache(PianiSubentroImpl.class);
	}

	/**
	 * Clears the cache for the piani subentro.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PianiSubentro pianiSubentro) {
		entityCache.removeResult(PianiSubentroImpl.class, pianiSubentro);
	}

	@Override
	public void clearCache(List<PianiSubentro> pianiSubentros) {
		for (PianiSubentro pianiSubentro : pianiSubentros) {
			entityCache.removeResult(PianiSubentroImpl.class, pianiSubentro);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PianiSubentroImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(PianiSubentroImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new piani subentro with the primary key. Does not add the piani subentro to the database.
	 *
	 * @param Id_PianiSubentro the primary key for the new piani subentro
	 * @return the new piani subentro
	 */
	@Override
	public PianiSubentro create(long Id_PianiSubentro) {
		PianiSubentro pianiSubentro = new PianiSubentroImpl();

		pianiSubentro.setNew(true);
		pianiSubentro.setPrimaryKey(Id_PianiSubentro);

		return pianiSubentro;
	}

	/**
	 * Removes the piani subentro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_PianiSubentro the primary key of the piani subentro
	 * @return the piani subentro that was removed
	 * @throws NoSuchPianiSubentroException if a piani subentro with the primary key could not be found
	 */
	@Override
	public PianiSubentro remove(long Id_PianiSubentro)
		throws NoSuchPianiSubentroException {

		return remove((Serializable)Id_PianiSubentro);
	}

	/**
	 * Removes the piani subentro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the piani subentro
	 * @return the piani subentro that was removed
	 * @throws NoSuchPianiSubentroException if a piani subentro with the primary key could not be found
	 */
	@Override
	public PianiSubentro remove(Serializable primaryKey)
		throws NoSuchPianiSubentroException {

		Session session = null;

		try {
			session = openSession();

			PianiSubentro pianiSubentro = (PianiSubentro)session.get(
				PianiSubentroImpl.class, primaryKey);

			if (pianiSubentro == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPianiSubentroException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pianiSubentro);
		}
		catch (NoSuchPianiSubentroException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected PianiSubentro removeImpl(PianiSubentro pianiSubentro) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pianiSubentro)) {
				pianiSubentro = (PianiSubentro)session.get(
					PianiSubentroImpl.class, pianiSubentro.getPrimaryKeyObj());
			}

			if (pianiSubentro != null) {
				session.delete(pianiSubentro);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pianiSubentro != null) {
			clearCache(pianiSubentro);
		}

		return pianiSubentro;
	}

	@Override
	public PianiSubentro updateImpl(PianiSubentro pianiSubentro) {
		boolean isNew = pianiSubentro.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pianiSubentro);
			}
			else {
				pianiSubentro = (PianiSubentro)session.merge(pianiSubentro);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PianiSubentroImpl.class, pianiSubentro, false, true);

		if (isNew) {
			pianiSubentro.setNew(false);
		}

		pianiSubentro.resetOriginalValues();

		return pianiSubentro;
	}

	/**
	 * Returns the piani subentro with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the piani subentro
	 * @return the piani subentro
	 * @throws NoSuchPianiSubentroException if a piani subentro with the primary key could not be found
	 */
	@Override
	public PianiSubentro findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPianiSubentroException {

		PianiSubentro pianiSubentro = fetchByPrimaryKey(primaryKey);

		if (pianiSubentro == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPianiSubentroException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pianiSubentro;
	}

	/**
	 * Returns the piani subentro with the primary key or throws a <code>NoSuchPianiSubentroException</code> if it could not be found.
	 *
	 * @param Id_PianiSubentro the primary key of the piani subentro
	 * @return the piani subentro
	 * @throws NoSuchPianiSubentroException if a piani subentro with the primary key could not be found
	 */
	@Override
	public PianiSubentro findByPrimaryKey(long Id_PianiSubentro)
		throws NoSuchPianiSubentroException {

		return findByPrimaryKey((Serializable)Id_PianiSubentro);
	}

	/**
	 * Returns the piani subentro with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_PianiSubentro the primary key of the piani subentro
	 * @return the piani subentro, or <code>null</code> if a piani subentro with the primary key could not be found
	 */
	@Override
	public PianiSubentro fetchByPrimaryKey(long Id_PianiSubentro) {
		return fetchByPrimaryKey((Serializable)Id_PianiSubentro);
	}

	/**
	 * Returns all the piani subentros.
	 *
	 * @return the piani subentros
	 */
	@Override
	public List<PianiSubentro> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the piani subentros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiSubentroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani subentros
	 * @param end the upper bound of the range of piani subentros (not inclusive)
	 * @return the range of piani subentros
	 */
	@Override
	public List<PianiSubentro> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the piani subentros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiSubentroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani subentros
	 * @param end the upper bound of the range of piani subentros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of piani subentros
	 */
	@Override
	public List<PianiSubentro> findAll(
		int start, int end,
		OrderByComparator<PianiSubentro> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the piani subentros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiSubentroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani subentros
	 * @param end the upper bound of the range of piani subentros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of piani subentros
	 */
	@Override
	public List<PianiSubentro> findAll(
		int start, int end, OrderByComparator<PianiSubentro> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<PianiSubentro> list = null;

		if (useFinderCache) {
			list = (List<PianiSubentro>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PIANISUBENTRO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PIANISUBENTRO;

				sql = sql.concat(PianiSubentroModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PianiSubentro>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the piani subentros from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PianiSubentro pianiSubentro : findAll()) {
			remove(pianiSubentro);
		}
	}

	/**
	 * Returns the number of piani subentros.
	 *
	 * @return the number of piani subentros
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PIANISUBENTRO);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "Id_PianiSubentro";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PIANISUBENTRO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PianiSubentroModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the piani subentro persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_setPianiSubentroUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setPianiSubentroUtilPersistence(null);

		entityCache.removeCache(PianiSubentroImpl.class.getName());
	}

	private void _setPianiSubentroUtilPersistence(
		PianiSubentroPersistence pianiSubentroPersistence) {

		try {
			Field field = PianiSubentroUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, pianiSubentroPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = AQPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = AQPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = AQPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PIANISUBENTRO =
		"SELECT pianiSubentro FROM PianiSubentro pianiSubentro";

	private static final String _SQL_COUNT_PIANISUBENTRO =
		"SELECT COUNT(pianiSubentro) FROM PianiSubentro pianiSubentro";

	private static final String _ORDER_BY_ENTITY_ALIAS = "pianiSubentro.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PianiSubentro exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		PianiSubentroPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PianiSubentroModelArgumentsResolver
		_pianiSubentroModelArgumentsResolver;

}