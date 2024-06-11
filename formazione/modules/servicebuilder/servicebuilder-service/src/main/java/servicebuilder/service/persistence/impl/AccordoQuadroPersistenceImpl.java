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

import servicebuilder.exception.NoSuchAccordoQuadroException;

import servicebuilder.model.AccordoQuadro;
import servicebuilder.model.AccordoQuadroTable;
import servicebuilder.model.impl.AccordoQuadroImpl;
import servicebuilder.model.impl.AccordoQuadroModelImpl;

import servicebuilder.service.persistence.AccordoQuadroPersistence;
import servicebuilder.service.persistence.AccordoQuadroUtil;
import servicebuilder.service.persistence.impl.constants.AQPersistenceConstants;

/**
 * The persistence implementation for the accordo quadro service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {AccordoQuadroPersistence.class, BasePersistence.class})
public class AccordoQuadroPersistenceImpl
	extends BasePersistenceImpl<AccordoQuadro>
	implements AccordoQuadroPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AccordoQuadroUtil</code> to access the accordo quadro persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AccordoQuadroImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public AccordoQuadroPersistenceImpl() {
		setModelClass(AccordoQuadro.class);

		setModelImplClass(AccordoQuadroImpl.class);
		setModelPKClass(long.class);

		setTable(AccordoQuadroTable.INSTANCE);
	}

	/**
	 * Caches the accordo quadro in the entity cache if it is enabled.
	 *
	 * @param accordoQuadro the accordo quadro
	 */
	@Override
	public void cacheResult(AccordoQuadro accordoQuadro) {
		entityCache.putResult(
			AccordoQuadroImpl.class, accordoQuadro.getPrimaryKey(),
			accordoQuadro);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the accordo quadros in the entity cache if it is enabled.
	 *
	 * @param accordoQuadros the accordo quadros
	 */
	@Override
	public void cacheResult(List<AccordoQuadro> accordoQuadros) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (accordoQuadros.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AccordoQuadro accordoQuadro : accordoQuadros) {
			if (entityCache.getResult(
					AccordoQuadroImpl.class, accordoQuadro.getPrimaryKey()) ==
						null) {

				cacheResult(accordoQuadro);
			}
		}
	}

	/**
	 * Clears the cache for all accordo quadros.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AccordoQuadroImpl.class);

		finderCache.clearCache(AccordoQuadroImpl.class);
	}

	/**
	 * Clears the cache for the accordo quadro.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AccordoQuadro accordoQuadro) {
		entityCache.removeResult(AccordoQuadroImpl.class, accordoQuadro);
	}

	@Override
	public void clearCache(List<AccordoQuadro> accordoQuadros) {
		for (AccordoQuadro accordoQuadro : accordoQuadros) {
			entityCache.removeResult(AccordoQuadroImpl.class, accordoQuadro);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AccordoQuadroImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AccordoQuadroImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new accordo quadro with the primary key. Does not add the accordo quadro to the database.
	 *
	 * @param Id_AccordoQuadro the primary key for the new accordo quadro
	 * @return the new accordo quadro
	 */
	@Override
	public AccordoQuadro create(long Id_AccordoQuadro) {
		AccordoQuadro accordoQuadro = new AccordoQuadroImpl();

		accordoQuadro.setNew(true);
		accordoQuadro.setPrimaryKey(Id_AccordoQuadro);

		return accordoQuadro;
	}

	/**
	 * Removes the accordo quadro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_AccordoQuadro the primary key of the accordo quadro
	 * @return the accordo quadro that was removed
	 * @throws NoSuchAccordoQuadroException if a accordo quadro with the primary key could not be found
	 */
	@Override
	public AccordoQuadro remove(long Id_AccordoQuadro)
		throws NoSuchAccordoQuadroException {

		return remove((Serializable)Id_AccordoQuadro);
	}

	/**
	 * Removes the accordo quadro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the accordo quadro
	 * @return the accordo quadro that was removed
	 * @throws NoSuchAccordoQuadroException if a accordo quadro with the primary key could not be found
	 */
	@Override
	public AccordoQuadro remove(Serializable primaryKey)
		throws NoSuchAccordoQuadroException {

		Session session = null;

		try {
			session = openSession();

			AccordoQuadro accordoQuadro = (AccordoQuadro)session.get(
				AccordoQuadroImpl.class, primaryKey);

			if (accordoQuadro == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAccordoQuadroException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(accordoQuadro);
		}
		catch (NoSuchAccordoQuadroException noSuchEntityException) {
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
	protected AccordoQuadro removeImpl(AccordoQuadro accordoQuadro) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(accordoQuadro)) {
				accordoQuadro = (AccordoQuadro)session.get(
					AccordoQuadroImpl.class, accordoQuadro.getPrimaryKeyObj());
			}

			if (accordoQuadro != null) {
				session.delete(accordoQuadro);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (accordoQuadro != null) {
			clearCache(accordoQuadro);
		}

		return accordoQuadro;
	}

	@Override
	public AccordoQuadro updateImpl(AccordoQuadro accordoQuadro) {
		boolean isNew = accordoQuadro.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(accordoQuadro);
			}
			else {
				accordoQuadro = (AccordoQuadro)session.merge(accordoQuadro);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AccordoQuadroImpl.class, accordoQuadro, false, true);

		if (isNew) {
			accordoQuadro.setNew(false);
		}

		accordoQuadro.resetOriginalValues();

		return accordoQuadro;
	}

	/**
	 * Returns the accordo quadro with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the accordo quadro
	 * @return the accordo quadro
	 * @throws NoSuchAccordoQuadroException if a accordo quadro with the primary key could not be found
	 */
	@Override
	public AccordoQuadro findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAccordoQuadroException {

		AccordoQuadro accordoQuadro = fetchByPrimaryKey(primaryKey);

		if (accordoQuadro == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAccordoQuadroException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return accordoQuadro;
	}

	/**
	 * Returns the accordo quadro with the primary key or throws a <code>NoSuchAccordoQuadroException</code> if it could not be found.
	 *
	 * @param Id_AccordoQuadro the primary key of the accordo quadro
	 * @return the accordo quadro
	 * @throws NoSuchAccordoQuadroException if a accordo quadro with the primary key could not be found
	 */
	@Override
	public AccordoQuadro findByPrimaryKey(long Id_AccordoQuadro)
		throws NoSuchAccordoQuadroException {

		return findByPrimaryKey((Serializable)Id_AccordoQuadro);
	}

	/**
	 * Returns the accordo quadro with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_AccordoQuadro the primary key of the accordo quadro
	 * @return the accordo quadro, or <code>null</code> if a accordo quadro with the primary key could not be found
	 */
	@Override
	public AccordoQuadro fetchByPrimaryKey(long Id_AccordoQuadro) {
		return fetchByPrimaryKey((Serializable)Id_AccordoQuadro);
	}

	/**
	 * Returns all the accordo quadros.
	 *
	 * @return the accordo quadros
	 */
	@Override
	public List<AccordoQuadro> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the accordo quadros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccordoQuadroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of accordo quadros
	 * @param end the upper bound of the range of accordo quadros (not inclusive)
	 * @return the range of accordo quadros
	 */
	@Override
	public List<AccordoQuadro> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the accordo quadros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccordoQuadroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of accordo quadros
	 * @param end the upper bound of the range of accordo quadros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of accordo quadros
	 */
	@Override
	public List<AccordoQuadro> findAll(
		int start, int end,
		OrderByComparator<AccordoQuadro> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the accordo quadros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccordoQuadroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of accordo quadros
	 * @param end the upper bound of the range of accordo quadros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of accordo quadros
	 */
	@Override
	public List<AccordoQuadro> findAll(
		int start, int end, OrderByComparator<AccordoQuadro> orderByComparator,
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

		List<AccordoQuadro> list = null;

		if (useFinderCache) {
			list = (List<AccordoQuadro>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACCORDOQUADRO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACCORDOQUADRO;

				sql = sql.concat(AccordoQuadroModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AccordoQuadro>)QueryUtil.list(
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
	 * Removes all the accordo quadros from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AccordoQuadro accordoQuadro : findAll()) {
			remove(accordoQuadro);
		}
	}

	/**
	 * Returns the number of accordo quadros.
	 *
	 * @return the number of accordo quadros
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ACCORDOQUADRO);

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
		return "Id_AccordoQuadro";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACCORDOQUADRO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AccordoQuadroModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the accordo quadro persistence.
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

		_setAccordoQuadroUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setAccordoQuadroUtilPersistence(null);

		entityCache.removeCache(AccordoQuadroImpl.class.getName());
	}

	private void _setAccordoQuadroUtilPersistence(
		AccordoQuadroPersistence accordoQuadroPersistence) {

		try {
			Field field = AccordoQuadroUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, accordoQuadroPersistence);
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

	private static final String _SQL_SELECT_ACCORDOQUADRO =
		"SELECT accordoQuadro FROM AccordoQuadro accordoQuadro";

	private static final String _SQL_COUNT_ACCORDOQUADRO =
		"SELECT COUNT(accordoQuadro) FROM AccordoQuadro accordoQuadro";

	private static final String _ORDER_BY_ENTITY_ALIAS = "accordoQuadro.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AccordoQuadro exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		AccordoQuadroPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private AccordoQuadroModelArgumentsResolver
		_accordoQuadroModelArgumentsResolver;

}