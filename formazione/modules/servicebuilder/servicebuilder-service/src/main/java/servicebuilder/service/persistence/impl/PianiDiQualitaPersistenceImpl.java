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

import servicebuilder.exception.NoSuchPianiDiQualitaException;

import servicebuilder.model.PianiDiQualita;
import servicebuilder.model.PianiDiQualitaTable;
import servicebuilder.model.impl.PianiDiQualitaImpl;
import servicebuilder.model.impl.PianiDiQualitaModelImpl;

import servicebuilder.service.persistence.PianiDiQualitaPersistence;
import servicebuilder.service.persistence.PianiDiQualitaUtil;
import servicebuilder.service.persistence.impl.constants.AQPersistenceConstants;

/**
 * The persistence implementation for the piani di qualita service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {PianiDiQualitaPersistence.class, BasePersistence.class})
public class PianiDiQualitaPersistenceImpl
	extends BasePersistenceImpl<PianiDiQualita>
	implements PianiDiQualitaPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PianiDiQualitaUtil</code> to access the piani di qualita persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PianiDiQualitaImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public PianiDiQualitaPersistenceImpl() {
		setModelClass(PianiDiQualita.class);

		setModelImplClass(PianiDiQualitaImpl.class);
		setModelPKClass(long.class);

		setTable(PianiDiQualitaTable.INSTANCE);
	}

	/**
	 * Caches the piani di qualita in the entity cache if it is enabled.
	 *
	 * @param pianiDiQualita the piani di qualita
	 */
	@Override
	public void cacheResult(PianiDiQualita pianiDiQualita) {
		entityCache.putResult(
			PianiDiQualitaImpl.class, pianiDiQualita.getPrimaryKey(),
			pianiDiQualita);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the piani di qualitas in the entity cache if it is enabled.
	 *
	 * @param pianiDiQualitas the piani di qualitas
	 */
	@Override
	public void cacheResult(List<PianiDiQualita> pianiDiQualitas) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pianiDiQualitas.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PianiDiQualita pianiDiQualita : pianiDiQualitas) {
			if (entityCache.getResult(
					PianiDiQualitaImpl.class, pianiDiQualita.getPrimaryKey()) ==
						null) {

				cacheResult(pianiDiQualita);
			}
		}
	}

	/**
	 * Clears the cache for all piani di qualitas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PianiDiQualitaImpl.class);

		finderCache.clearCache(PianiDiQualitaImpl.class);
	}

	/**
	 * Clears the cache for the piani di qualita.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PianiDiQualita pianiDiQualita) {
		entityCache.removeResult(PianiDiQualitaImpl.class, pianiDiQualita);
	}

	@Override
	public void clearCache(List<PianiDiQualita> pianiDiQualitas) {
		for (PianiDiQualita pianiDiQualita : pianiDiQualitas) {
			entityCache.removeResult(PianiDiQualitaImpl.class, pianiDiQualita);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PianiDiQualitaImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(PianiDiQualitaImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new piani di qualita with the primary key. Does not add the piani di qualita to the database.
	 *
	 * @param Id_PianiDiQualita the primary key for the new piani di qualita
	 * @return the new piani di qualita
	 */
	@Override
	public PianiDiQualita create(long Id_PianiDiQualita) {
		PianiDiQualita pianiDiQualita = new PianiDiQualitaImpl();

		pianiDiQualita.setNew(true);
		pianiDiQualita.setPrimaryKey(Id_PianiDiQualita);

		return pianiDiQualita;
	}

	/**
	 * Removes the piani di qualita with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_PianiDiQualita the primary key of the piani di qualita
	 * @return the piani di qualita that was removed
	 * @throws NoSuchPianiDiQualitaException if a piani di qualita with the primary key could not be found
	 */
	@Override
	public PianiDiQualita remove(long Id_PianiDiQualita)
		throws NoSuchPianiDiQualitaException {

		return remove((Serializable)Id_PianiDiQualita);
	}

	/**
	 * Removes the piani di qualita with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the piani di qualita
	 * @return the piani di qualita that was removed
	 * @throws NoSuchPianiDiQualitaException if a piani di qualita with the primary key could not be found
	 */
	@Override
	public PianiDiQualita remove(Serializable primaryKey)
		throws NoSuchPianiDiQualitaException {

		Session session = null;

		try {
			session = openSession();

			PianiDiQualita pianiDiQualita = (PianiDiQualita)session.get(
				PianiDiQualitaImpl.class, primaryKey);

			if (pianiDiQualita == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPianiDiQualitaException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pianiDiQualita);
		}
		catch (NoSuchPianiDiQualitaException noSuchEntityException) {
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
	protected PianiDiQualita removeImpl(PianiDiQualita pianiDiQualita) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pianiDiQualita)) {
				pianiDiQualita = (PianiDiQualita)session.get(
					PianiDiQualitaImpl.class,
					pianiDiQualita.getPrimaryKeyObj());
			}

			if (pianiDiQualita != null) {
				session.delete(pianiDiQualita);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pianiDiQualita != null) {
			clearCache(pianiDiQualita);
		}

		return pianiDiQualita;
	}

	@Override
	public PianiDiQualita updateImpl(PianiDiQualita pianiDiQualita) {
		boolean isNew = pianiDiQualita.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pianiDiQualita);
			}
			else {
				pianiDiQualita = (PianiDiQualita)session.merge(pianiDiQualita);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PianiDiQualitaImpl.class, pianiDiQualita, false, true);

		if (isNew) {
			pianiDiQualita.setNew(false);
		}

		pianiDiQualita.resetOriginalValues();

		return pianiDiQualita;
	}

	/**
	 * Returns the piani di qualita with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the piani di qualita
	 * @return the piani di qualita
	 * @throws NoSuchPianiDiQualitaException if a piani di qualita with the primary key could not be found
	 */
	@Override
	public PianiDiQualita findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPianiDiQualitaException {

		PianiDiQualita pianiDiQualita = fetchByPrimaryKey(primaryKey);

		if (pianiDiQualita == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPianiDiQualitaException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pianiDiQualita;
	}

	/**
	 * Returns the piani di qualita with the primary key or throws a <code>NoSuchPianiDiQualitaException</code> if it could not be found.
	 *
	 * @param Id_PianiDiQualita the primary key of the piani di qualita
	 * @return the piani di qualita
	 * @throws NoSuchPianiDiQualitaException if a piani di qualita with the primary key could not be found
	 */
	@Override
	public PianiDiQualita findByPrimaryKey(long Id_PianiDiQualita)
		throws NoSuchPianiDiQualitaException {

		return findByPrimaryKey((Serializable)Id_PianiDiQualita);
	}

	/**
	 * Returns the piani di qualita with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_PianiDiQualita the primary key of the piani di qualita
	 * @return the piani di qualita, or <code>null</code> if a piani di qualita with the primary key could not be found
	 */
	@Override
	public PianiDiQualita fetchByPrimaryKey(long Id_PianiDiQualita) {
		return fetchByPrimaryKey((Serializable)Id_PianiDiQualita);
	}

	/**
	 * Returns all the piani di qualitas.
	 *
	 * @return the piani di qualitas
	 */
	@Override
	public List<PianiDiQualita> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the piani di qualitas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiQualitaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani di qualitas
	 * @param end the upper bound of the range of piani di qualitas (not inclusive)
	 * @return the range of piani di qualitas
	 */
	@Override
	public List<PianiDiQualita> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the piani di qualitas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiQualitaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani di qualitas
	 * @param end the upper bound of the range of piani di qualitas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of piani di qualitas
	 */
	@Override
	public List<PianiDiQualita> findAll(
		int start, int end,
		OrderByComparator<PianiDiQualita> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the piani di qualitas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiQualitaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani di qualitas
	 * @param end the upper bound of the range of piani di qualitas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of piani di qualitas
	 */
	@Override
	public List<PianiDiQualita> findAll(
		int start, int end, OrderByComparator<PianiDiQualita> orderByComparator,
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

		List<PianiDiQualita> list = null;

		if (useFinderCache) {
			list = (List<PianiDiQualita>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PIANIDIQUALITA);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PIANIDIQUALITA;

				sql = sql.concat(PianiDiQualitaModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PianiDiQualita>)QueryUtil.list(
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
	 * Removes all the piani di qualitas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PianiDiQualita pianiDiQualita : findAll()) {
			remove(pianiDiQualita);
		}
	}

	/**
	 * Returns the number of piani di qualitas.
	 *
	 * @return the number of piani di qualitas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PIANIDIQUALITA);

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
		return "Id_PianiDiQualita";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PIANIDIQUALITA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PianiDiQualitaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the piani di qualita persistence.
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

		_setPianiDiQualitaUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setPianiDiQualitaUtilPersistence(null);

		entityCache.removeCache(PianiDiQualitaImpl.class.getName());
	}

	private void _setPianiDiQualitaUtilPersistence(
		PianiDiQualitaPersistence pianiDiQualitaPersistence) {

		try {
			Field field = PianiDiQualitaUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, pianiDiQualitaPersistence);
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

	private static final String _SQL_SELECT_PIANIDIQUALITA =
		"SELECT pianiDiQualita FROM PianiDiQualita pianiDiQualita";

	private static final String _SQL_COUNT_PIANIDIQUALITA =
		"SELECT COUNT(pianiDiQualita) FROM PianiDiQualita pianiDiQualita";

	private static final String _ORDER_BY_ENTITY_ALIAS = "pianiDiQualita.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PianiDiQualita exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		PianiDiQualitaPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PianiDiQualitaModelArgumentsResolver
		_pianiDiQualitaModelArgumentsResolver;

}