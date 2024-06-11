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
import com.liferay.portal.kernel.util.SetUtil;

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

import servicebuilder.exception.NoSuchContrattiEsecutiviException;

import servicebuilder.model.ContrattiEsecutivi;
import servicebuilder.model.ContrattiEsecutiviTable;
import servicebuilder.model.impl.ContrattiEsecutiviImpl;
import servicebuilder.model.impl.ContrattiEsecutiviModelImpl;

import servicebuilder.service.persistence.ContrattiEsecutiviPK;
import servicebuilder.service.persistence.ContrattiEsecutiviPersistence;
import servicebuilder.service.persistence.ContrattiEsecutiviUtil;
import servicebuilder.service.persistence.impl.constants.AQPersistenceConstants;

/**
 * The persistence implementation for the contratti esecutivi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {ContrattiEsecutiviPersistence.class, BasePersistence.class}
)
public class ContrattiEsecutiviPersistenceImpl
	extends BasePersistenceImpl<ContrattiEsecutivi>
	implements ContrattiEsecutiviPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ContrattiEsecutiviUtil</code> to access the contratti esecutivi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ContrattiEsecutiviImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public ContrattiEsecutiviPersistenceImpl() {
		setModelClass(ContrattiEsecutivi.class);

		setModelImplClass(ContrattiEsecutiviImpl.class);
		setModelPKClass(ContrattiEsecutiviPK.class);

		setTable(ContrattiEsecutiviTable.INSTANCE);
	}

	/**
	 * Caches the contratti esecutivi in the entity cache if it is enabled.
	 *
	 * @param contrattiEsecutivi the contratti esecutivi
	 */
	@Override
	public void cacheResult(ContrattiEsecutivi contrattiEsecutivi) {
		entityCache.putResult(
			ContrattiEsecutiviImpl.class, contrattiEsecutivi.getPrimaryKey(),
			contrattiEsecutivi);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the contratti esecutivis in the entity cache if it is enabled.
	 *
	 * @param contrattiEsecutivis the contratti esecutivis
	 */
	@Override
	public void cacheResult(List<ContrattiEsecutivi> contrattiEsecutivis) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (contrattiEsecutivis.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ContrattiEsecutivi contrattiEsecutivi : contrattiEsecutivis) {
			if (entityCache.getResult(
					ContrattiEsecutiviImpl.class,
					contrattiEsecutivi.getPrimaryKey()) == null) {

				cacheResult(contrattiEsecutivi);
			}
		}
	}

	/**
	 * Clears the cache for all contratti esecutivis.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ContrattiEsecutiviImpl.class);

		finderCache.clearCache(ContrattiEsecutiviImpl.class);
	}

	/**
	 * Clears the cache for the contratti esecutivi.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ContrattiEsecutivi contrattiEsecutivi) {
		entityCache.removeResult(
			ContrattiEsecutiviImpl.class, contrattiEsecutivi);
	}

	@Override
	public void clearCache(List<ContrattiEsecutivi> contrattiEsecutivis) {
		for (ContrattiEsecutivi contrattiEsecutivi : contrattiEsecutivis) {
			entityCache.removeResult(
				ContrattiEsecutiviImpl.class, contrattiEsecutivi);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ContrattiEsecutiviImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ContrattiEsecutiviImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new contratti esecutivi with the primary key. Does not add the contratti esecutivi to the database.
	 *
	 * @param contrattiEsecutiviPK the primary key for the new contratti esecutivi
	 * @return the new contratti esecutivi
	 */
	@Override
	public ContrattiEsecutivi create(
		ContrattiEsecutiviPK contrattiEsecutiviPK) {

		ContrattiEsecutivi contrattiEsecutivi = new ContrattiEsecutiviImpl();

		contrattiEsecutivi.setNew(true);
		contrattiEsecutivi.setPrimaryKey(contrattiEsecutiviPK);

		return contrattiEsecutivi;
	}

	/**
	 * Removes the contratti esecutivi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contrattiEsecutiviPK the primary key of the contratti esecutivi
	 * @return the contratti esecutivi that was removed
	 * @throws NoSuchContrattiEsecutiviException if a contratti esecutivi with the primary key could not be found
	 */
	@Override
	public ContrattiEsecutivi remove(ContrattiEsecutiviPK contrattiEsecutiviPK)
		throws NoSuchContrattiEsecutiviException {

		return remove((Serializable)contrattiEsecutiviPK);
	}

	/**
	 * Removes the contratti esecutivi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the contratti esecutivi
	 * @return the contratti esecutivi that was removed
	 * @throws NoSuchContrattiEsecutiviException if a contratti esecutivi with the primary key could not be found
	 */
	@Override
	public ContrattiEsecutivi remove(Serializable primaryKey)
		throws NoSuchContrattiEsecutiviException {

		Session session = null;

		try {
			session = openSession();

			ContrattiEsecutivi contrattiEsecutivi =
				(ContrattiEsecutivi)session.get(
					ContrattiEsecutiviImpl.class, primaryKey);

			if (contrattiEsecutivi == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchContrattiEsecutiviException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(contrattiEsecutivi);
		}
		catch (NoSuchContrattiEsecutiviException noSuchEntityException) {
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
	protected ContrattiEsecutivi removeImpl(
		ContrattiEsecutivi contrattiEsecutivi) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(contrattiEsecutivi)) {
				contrattiEsecutivi = (ContrattiEsecutivi)session.get(
					ContrattiEsecutiviImpl.class,
					contrattiEsecutivi.getPrimaryKeyObj());
			}

			if (contrattiEsecutivi != null) {
				session.delete(contrattiEsecutivi);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (contrattiEsecutivi != null) {
			clearCache(contrattiEsecutivi);
		}

		return contrattiEsecutivi;
	}

	@Override
	public ContrattiEsecutivi updateImpl(
		ContrattiEsecutivi contrattiEsecutivi) {

		boolean isNew = contrattiEsecutivi.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(contrattiEsecutivi);
			}
			else {
				contrattiEsecutivi = (ContrattiEsecutivi)session.merge(
					contrattiEsecutivi);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ContrattiEsecutiviImpl.class, contrattiEsecutivi, false, true);

		if (isNew) {
			contrattiEsecutivi.setNew(false);
		}

		contrattiEsecutivi.resetOriginalValues();

		return contrattiEsecutivi;
	}

	/**
	 * Returns the contratti esecutivi with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the contratti esecutivi
	 * @return the contratti esecutivi
	 * @throws NoSuchContrattiEsecutiviException if a contratti esecutivi with the primary key could not be found
	 */
	@Override
	public ContrattiEsecutivi findByPrimaryKey(Serializable primaryKey)
		throws NoSuchContrattiEsecutiviException {

		ContrattiEsecutivi contrattiEsecutivi = fetchByPrimaryKey(primaryKey);

		if (contrattiEsecutivi == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchContrattiEsecutiviException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return contrattiEsecutivi;
	}

	/**
	 * Returns the contratti esecutivi with the primary key or throws a <code>NoSuchContrattiEsecutiviException</code> if it could not be found.
	 *
	 * @param contrattiEsecutiviPK the primary key of the contratti esecutivi
	 * @return the contratti esecutivi
	 * @throws NoSuchContrattiEsecutiviException if a contratti esecutivi with the primary key could not be found
	 */
	@Override
	public ContrattiEsecutivi findByPrimaryKey(
			ContrattiEsecutiviPK contrattiEsecutiviPK)
		throws NoSuchContrattiEsecutiviException {

		return findByPrimaryKey((Serializable)contrattiEsecutiviPK);
	}

	/**
	 * Returns the contratti esecutivi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contrattiEsecutiviPK the primary key of the contratti esecutivi
	 * @return the contratti esecutivi, or <code>null</code> if a contratti esecutivi with the primary key could not be found
	 */
	@Override
	public ContrattiEsecutivi fetchByPrimaryKey(
		ContrattiEsecutiviPK contrattiEsecutiviPK) {

		return fetchByPrimaryKey((Serializable)contrattiEsecutiviPK);
	}

	/**
	 * Returns all the contratti esecutivis.
	 *
	 * @return the contratti esecutivis
	 */
	@Override
	public List<ContrattiEsecutivi> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the contratti esecutivis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContrattiEsecutiviModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contratti esecutivis
	 * @param end the upper bound of the range of contratti esecutivis (not inclusive)
	 * @return the range of contratti esecutivis
	 */
	@Override
	public List<ContrattiEsecutivi> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the contratti esecutivis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContrattiEsecutiviModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contratti esecutivis
	 * @param end the upper bound of the range of contratti esecutivis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of contratti esecutivis
	 */
	@Override
	public List<ContrattiEsecutivi> findAll(
		int start, int end,
		OrderByComparator<ContrattiEsecutivi> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the contratti esecutivis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContrattiEsecutiviModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contratti esecutivis
	 * @param end the upper bound of the range of contratti esecutivis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of contratti esecutivis
	 */
	@Override
	public List<ContrattiEsecutivi> findAll(
		int start, int end,
		OrderByComparator<ContrattiEsecutivi> orderByComparator,
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

		List<ContrattiEsecutivi> list = null;

		if (useFinderCache) {
			list = (List<ContrattiEsecutivi>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CONTRATTIESECUTIVI);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CONTRATTIESECUTIVI;

				sql = sql.concat(ContrattiEsecutiviModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ContrattiEsecutivi>)QueryUtil.list(
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
	 * Removes all the contratti esecutivis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ContrattiEsecutivi contrattiEsecutivi : findAll()) {
			remove(contrattiEsecutivi);
		}
	}

	/**
	 * Returns the number of contratti esecutivis.
	 *
	 * @return the number of contratti esecutivis
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
					_SQL_COUNT_CONTRATTIESECUTIVI);

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
	public Set<String> getCompoundPKColumnNames() {
		return _compoundPKColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "contrattiEsecutiviPK";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CONTRATTIESECUTIVI;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ContrattiEsecutiviModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the contratti esecutivi persistence.
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

		_setContrattiEsecutiviUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setContrattiEsecutiviUtilPersistence(null);

		entityCache.removeCache(ContrattiEsecutiviImpl.class.getName());
	}

	private void _setContrattiEsecutiviUtilPersistence(
		ContrattiEsecutiviPersistence contrattiEsecutiviPersistence) {

		try {
			Field field = ContrattiEsecutiviUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, contrattiEsecutiviPersistence);
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

	private static final String _SQL_SELECT_CONTRATTIESECUTIVI =
		"SELECT contrattiEsecutivi FROM ContrattiEsecutivi contrattiEsecutivi";

	private static final String _SQL_COUNT_CONTRATTIESECUTIVI =
		"SELECT COUNT(contrattiEsecutivi) FROM ContrattiEsecutivi contrattiEsecutivi";

	private static final String _ORDER_BY_ENTITY_ALIAS = "contrattiEsecutivi.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ContrattiEsecutivi exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		ContrattiEsecutiviPersistenceImpl.class);

	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(
		new String[] {"CodiceContratto", "Id_ContrattiEsecutivi"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private ContrattiEsecutiviModelArgumentsResolver
		_contrattiEsecutiviModelArgumentsResolver;

}