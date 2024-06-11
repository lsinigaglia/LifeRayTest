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

import servicebuilder.exception.NoSuchStatoAvanzamentoLavoriException;

import servicebuilder.model.StatoAvanzamentoLavori;
import servicebuilder.model.StatoAvanzamentoLavoriTable;
import servicebuilder.model.impl.StatoAvanzamentoLavoriImpl;
import servicebuilder.model.impl.StatoAvanzamentoLavoriModelImpl;

import servicebuilder.service.persistence.StatoAvanzamentoLavoriPersistence;
import servicebuilder.service.persistence.StatoAvanzamentoLavoriUtil;
import servicebuilder.service.persistence.impl.constants.AQPersistenceConstants;

/**
 * The persistence implementation for the stato avanzamento lavori service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {StatoAvanzamentoLavoriPersistence.class, BasePersistence.class}
)
public class StatoAvanzamentoLavoriPersistenceImpl
	extends BasePersistenceImpl<StatoAvanzamentoLavori>
	implements StatoAvanzamentoLavoriPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>StatoAvanzamentoLavoriUtil</code> to access the stato avanzamento lavori persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		StatoAvanzamentoLavoriImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public StatoAvanzamentoLavoriPersistenceImpl() {
		setModelClass(StatoAvanzamentoLavori.class);

		setModelImplClass(StatoAvanzamentoLavoriImpl.class);
		setModelPKClass(long.class);

		setTable(StatoAvanzamentoLavoriTable.INSTANCE);
	}

	/**
	 * Caches the stato avanzamento lavori in the entity cache if it is enabled.
	 *
	 * @param statoAvanzamentoLavori the stato avanzamento lavori
	 */
	@Override
	public void cacheResult(StatoAvanzamentoLavori statoAvanzamentoLavori) {
		entityCache.putResult(
			StatoAvanzamentoLavoriImpl.class,
			statoAvanzamentoLavori.getPrimaryKey(), statoAvanzamentoLavori);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the stato avanzamento lavoris in the entity cache if it is enabled.
	 *
	 * @param statoAvanzamentoLavoris the stato avanzamento lavoris
	 */
	@Override
	public void cacheResult(
		List<StatoAvanzamentoLavori> statoAvanzamentoLavoris) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (statoAvanzamentoLavoris.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (StatoAvanzamentoLavori statoAvanzamentoLavori :
				statoAvanzamentoLavoris) {

			if (entityCache.getResult(
					StatoAvanzamentoLavoriImpl.class,
					statoAvanzamentoLavori.getPrimaryKey()) == null) {

				cacheResult(statoAvanzamentoLavori);
			}
		}
	}

	/**
	 * Clears the cache for all stato avanzamento lavoris.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(StatoAvanzamentoLavoriImpl.class);

		finderCache.clearCache(StatoAvanzamentoLavoriImpl.class);
	}

	/**
	 * Clears the cache for the stato avanzamento lavori.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StatoAvanzamentoLavori statoAvanzamentoLavori) {
		entityCache.removeResult(
			StatoAvanzamentoLavoriImpl.class, statoAvanzamentoLavori);
	}

	@Override
	public void clearCache(
		List<StatoAvanzamentoLavori> statoAvanzamentoLavoris) {

		for (StatoAvanzamentoLavori statoAvanzamentoLavori :
				statoAvanzamentoLavoris) {

			entityCache.removeResult(
				StatoAvanzamentoLavoriImpl.class, statoAvanzamentoLavori);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(StatoAvanzamentoLavoriImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				StatoAvanzamentoLavoriImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new stato avanzamento lavori with the primary key. Does not add the stato avanzamento lavori to the database.
	 *
	 * @param Id_SAL the primary key for the new stato avanzamento lavori
	 * @return the new stato avanzamento lavori
	 */
	@Override
	public StatoAvanzamentoLavori create(long Id_SAL) {
		StatoAvanzamentoLavori statoAvanzamentoLavori =
			new StatoAvanzamentoLavoriImpl();

		statoAvanzamentoLavori.setNew(true);
		statoAvanzamentoLavori.setPrimaryKey(Id_SAL);

		return statoAvanzamentoLavori;
	}

	/**
	 * Removes the stato avanzamento lavori with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_SAL the primary key of the stato avanzamento lavori
	 * @return the stato avanzamento lavori that was removed
	 * @throws NoSuchStatoAvanzamentoLavoriException if a stato avanzamento lavori with the primary key could not be found
	 */
	@Override
	public StatoAvanzamentoLavori remove(long Id_SAL)
		throws NoSuchStatoAvanzamentoLavoriException {

		return remove((Serializable)Id_SAL);
	}

	/**
	 * Removes the stato avanzamento lavori with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the stato avanzamento lavori
	 * @return the stato avanzamento lavori that was removed
	 * @throws NoSuchStatoAvanzamentoLavoriException if a stato avanzamento lavori with the primary key could not be found
	 */
	@Override
	public StatoAvanzamentoLavori remove(Serializable primaryKey)
		throws NoSuchStatoAvanzamentoLavoriException {

		Session session = null;

		try {
			session = openSession();

			StatoAvanzamentoLavori statoAvanzamentoLavori =
				(StatoAvanzamentoLavori)session.get(
					StatoAvanzamentoLavoriImpl.class, primaryKey);

			if (statoAvanzamentoLavori == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStatoAvanzamentoLavoriException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(statoAvanzamentoLavori);
		}
		catch (NoSuchStatoAvanzamentoLavoriException noSuchEntityException) {
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
	protected StatoAvanzamentoLavori removeImpl(
		StatoAvanzamentoLavori statoAvanzamentoLavori) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(statoAvanzamentoLavori)) {
				statoAvanzamentoLavori = (StatoAvanzamentoLavori)session.get(
					StatoAvanzamentoLavoriImpl.class,
					statoAvanzamentoLavori.getPrimaryKeyObj());
			}

			if (statoAvanzamentoLavori != null) {
				session.delete(statoAvanzamentoLavori);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (statoAvanzamentoLavori != null) {
			clearCache(statoAvanzamentoLavori);
		}

		return statoAvanzamentoLavori;
	}

	@Override
	public StatoAvanzamentoLavori updateImpl(
		StatoAvanzamentoLavori statoAvanzamentoLavori) {

		boolean isNew = statoAvanzamentoLavori.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(statoAvanzamentoLavori);
			}
			else {
				statoAvanzamentoLavori = (StatoAvanzamentoLavori)session.merge(
					statoAvanzamentoLavori);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			StatoAvanzamentoLavoriImpl.class, statoAvanzamentoLavori, false,
			true);

		if (isNew) {
			statoAvanzamentoLavori.setNew(false);
		}

		statoAvanzamentoLavori.resetOriginalValues();

		return statoAvanzamentoLavori;
	}

	/**
	 * Returns the stato avanzamento lavori with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the stato avanzamento lavori
	 * @return the stato avanzamento lavori
	 * @throws NoSuchStatoAvanzamentoLavoriException if a stato avanzamento lavori with the primary key could not be found
	 */
	@Override
	public StatoAvanzamentoLavori findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStatoAvanzamentoLavoriException {

		StatoAvanzamentoLavori statoAvanzamentoLavori = fetchByPrimaryKey(
			primaryKey);

		if (statoAvanzamentoLavori == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStatoAvanzamentoLavoriException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return statoAvanzamentoLavori;
	}

	/**
	 * Returns the stato avanzamento lavori with the primary key or throws a <code>NoSuchStatoAvanzamentoLavoriException</code> if it could not be found.
	 *
	 * @param Id_SAL the primary key of the stato avanzamento lavori
	 * @return the stato avanzamento lavori
	 * @throws NoSuchStatoAvanzamentoLavoriException if a stato avanzamento lavori with the primary key could not be found
	 */
	@Override
	public StatoAvanzamentoLavori findByPrimaryKey(long Id_SAL)
		throws NoSuchStatoAvanzamentoLavoriException {

		return findByPrimaryKey((Serializable)Id_SAL);
	}

	/**
	 * Returns the stato avanzamento lavori with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_SAL the primary key of the stato avanzamento lavori
	 * @return the stato avanzamento lavori, or <code>null</code> if a stato avanzamento lavori with the primary key could not be found
	 */
	@Override
	public StatoAvanzamentoLavori fetchByPrimaryKey(long Id_SAL) {
		return fetchByPrimaryKey((Serializable)Id_SAL);
	}

	/**
	 * Returns all the stato avanzamento lavoris.
	 *
	 * @return the stato avanzamento lavoris
	 */
	@Override
	public List<StatoAvanzamentoLavori> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the stato avanzamento lavoris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatoAvanzamentoLavoriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of stato avanzamento lavoris
	 * @param end the upper bound of the range of stato avanzamento lavoris (not inclusive)
	 * @return the range of stato avanzamento lavoris
	 */
	@Override
	public List<StatoAvanzamentoLavori> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the stato avanzamento lavoris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatoAvanzamentoLavoriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of stato avanzamento lavoris
	 * @param end the upper bound of the range of stato avanzamento lavoris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of stato avanzamento lavoris
	 */
	@Override
	public List<StatoAvanzamentoLavori> findAll(
		int start, int end,
		OrderByComparator<StatoAvanzamentoLavori> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the stato avanzamento lavoris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatoAvanzamentoLavoriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of stato avanzamento lavoris
	 * @param end the upper bound of the range of stato avanzamento lavoris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of stato avanzamento lavoris
	 */
	@Override
	public List<StatoAvanzamentoLavori> findAll(
		int start, int end,
		OrderByComparator<StatoAvanzamentoLavori> orderByComparator,
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

		List<StatoAvanzamentoLavori> list = null;

		if (useFinderCache) {
			list = (List<StatoAvanzamentoLavori>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_STATOAVANZAMENTOLAVORI);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_STATOAVANZAMENTOLAVORI;

				sql = sql.concat(StatoAvanzamentoLavoriModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<StatoAvanzamentoLavori>)QueryUtil.list(
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
	 * Removes all the stato avanzamento lavoris from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (StatoAvanzamentoLavori statoAvanzamentoLavori : findAll()) {
			remove(statoAvanzamentoLavori);
		}
	}

	/**
	 * Returns the number of stato avanzamento lavoris.
	 *
	 * @return the number of stato avanzamento lavoris
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_STATOAVANZAMENTOLAVORI);

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
		return "Id_SAL";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_STATOAVANZAMENTOLAVORI;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return StatoAvanzamentoLavoriModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the stato avanzamento lavori persistence.
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

		_setStatoAvanzamentoLavoriUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setStatoAvanzamentoLavoriUtilPersistence(null);

		entityCache.removeCache(StatoAvanzamentoLavoriImpl.class.getName());
	}

	private void _setStatoAvanzamentoLavoriUtilPersistence(
		StatoAvanzamentoLavoriPersistence statoAvanzamentoLavoriPersistence) {

		try {
			Field field = StatoAvanzamentoLavoriUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, statoAvanzamentoLavoriPersistence);
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

	private static final String _SQL_SELECT_STATOAVANZAMENTOLAVORI =
		"SELECT statoAvanzamentoLavori FROM StatoAvanzamentoLavori statoAvanzamentoLavori";

	private static final String _SQL_COUNT_STATOAVANZAMENTOLAVORI =
		"SELECT COUNT(statoAvanzamentoLavori) FROM StatoAvanzamentoLavori statoAvanzamentoLavori";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"statoAvanzamentoLavori.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No StatoAvanzamentoLavori exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		StatoAvanzamentoLavoriPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private StatoAvanzamentoLavoriModelArgumentsResolver
		_statoAvanzamentoLavoriModelArgumentsResolver;

}