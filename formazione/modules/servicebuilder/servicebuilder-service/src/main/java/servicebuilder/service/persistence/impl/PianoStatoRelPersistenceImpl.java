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

import servicebuilder.exception.NoSuchPianoStatoRelException;

import servicebuilder.model.PianoStatoRel;
import servicebuilder.model.PianoStatoRelTable;
import servicebuilder.model.impl.PianoStatoRelImpl;
import servicebuilder.model.impl.PianoStatoRelModelImpl;

import servicebuilder.service.persistence.PianoStatoRelPersistence;
import servicebuilder.service.persistence.PianoStatoRelUtil;
import servicebuilder.service.persistence.impl.constants.AQPersistenceConstants;

/**
 * The persistence implementation for the piano stato rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {PianoStatoRelPersistence.class, BasePersistence.class})
public class PianoStatoRelPersistenceImpl
	extends BasePersistenceImpl<PianoStatoRel>
	implements PianoStatoRelPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PianoStatoRelUtil</code> to access the piano stato rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PianoStatoRelImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public PianoStatoRelPersistenceImpl() {
		setModelClass(PianoStatoRel.class);

		setModelImplClass(PianoStatoRelImpl.class);
		setModelPKClass(long.class);

		setTable(PianoStatoRelTable.INSTANCE);
	}

	/**
	 * Caches the piano stato rel in the entity cache if it is enabled.
	 *
	 * @param pianoStatoRel the piano stato rel
	 */
	@Override
	public void cacheResult(PianoStatoRel pianoStatoRel) {
		entityCache.putResult(
			PianoStatoRelImpl.class, pianoStatoRel.getPrimaryKey(),
			pianoStatoRel);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the piano stato rels in the entity cache if it is enabled.
	 *
	 * @param pianoStatoRels the piano stato rels
	 */
	@Override
	public void cacheResult(List<PianoStatoRel> pianoStatoRels) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pianoStatoRels.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PianoStatoRel pianoStatoRel : pianoStatoRels) {
			if (entityCache.getResult(
					PianoStatoRelImpl.class, pianoStatoRel.getPrimaryKey()) ==
						null) {

				cacheResult(pianoStatoRel);
			}
		}
	}

	/**
	 * Clears the cache for all piano stato rels.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PianoStatoRelImpl.class);

		finderCache.clearCache(PianoStatoRelImpl.class);
	}

	/**
	 * Clears the cache for the piano stato rel.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PianoStatoRel pianoStatoRel) {
		entityCache.removeResult(PianoStatoRelImpl.class, pianoStatoRel);
	}

	@Override
	public void clearCache(List<PianoStatoRel> pianoStatoRels) {
		for (PianoStatoRel pianoStatoRel : pianoStatoRels) {
			entityCache.removeResult(PianoStatoRelImpl.class, pianoStatoRel);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PianoStatoRelImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(PianoStatoRelImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new piano stato rel with the primary key. Does not add the piano stato rel to the database.
	 *
	 * @param Id_Relazione the primary key for the new piano stato rel
	 * @return the new piano stato rel
	 */
	@Override
	public PianoStatoRel create(long Id_Relazione) {
		PianoStatoRel pianoStatoRel = new PianoStatoRelImpl();

		pianoStatoRel.setNew(true);
		pianoStatoRel.setPrimaryKey(Id_Relazione);

		return pianoStatoRel;
	}

	/**
	 * Removes the piano stato rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_Relazione the primary key of the piano stato rel
	 * @return the piano stato rel that was removed
	 * @throws NoSuchPianoStatoRelException if a piano stato rel with the primary key could not be found
	 */
	@Override
	public PianoStatoRel remove(long Id_Relazione)
		throws NoSuchPianoStatoRelException {

		return remove((Serializable)Id_Relazione);
	}

	/**
	 * Removes the piano stato rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the piano stato rel
	 * @return the piano stato rel that was removed
	 * @throws NoSuchPianoStatoRelException if a piano stato rel with the primary key could not be found
	 */
	@Override
	public PianoStatoRel remove(Serializable primaryKey)
		throws NoSuchPianoStatoRelException {

		Session session = null;

		try {
			session = openSession();

			PianoStatoRel pianoStatoRel = (PianoStatoRel)session.get(
				PianoStatoRelImpl.class, primaryKey);

			if (pianoStatoRel == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPianoStatoRelException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pianoStatoRel);
		}
		catch (NoSuchPianoStatoRelException noSuchEntityException) {
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
	protected PianoStatoRel removeImpl(PianoStatoRel pianoStatoRel) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pianoStatoRel)) {
				pianoStatoRel = (PianoStatoRel)session.get(
					PianoStatoRelImpl.class, pianoStatoRel.getPrimaryKeyObj());
			}

			if (pianoStatoRel != null) {
				session.delete(pianoStatoRel);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pianoStatoRel != null) {
			clearCache(pianoStatoRel);
		}

		return pianoStatoRel;
	}

	@Override
	public PianoStatoRel updateImpl(PianoStatoRel pianoStatoRel) {
		boolean isNew = pianoStatoRel.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pianoStatoRel);
			}
			else {
				pianoStatoRel = (PianoStatoRel)session.merge(pianoStatoRel);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PianoStatoRelImpl.class, pianoStatoRel, false, true);

		if (isNew) {
			pianoStatoRel.setNew(false);
		}

		pianoStatoRel.resetOriginalValues();

		return pianoStatoRel;
	}

	/**
	 * Returns the piano stato rel with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the piano stato rel
	 * @return the piano stato rel
	 * @throws NoSuchPianoStatoRelException if a piano stato rel with the primary key could not be found
	 */
	@Override
	public PianoStatoRel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPianoStatoRelException {

		PianoStatoRel pianoStatoRel = fetchByPrimaryKey(primaryKey);

		if (pianoStatoRel == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPianoStatoRelException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pianoStatoRel;
	}

	/**
	 * Returns the piano stato rel with the primary key or throws a <code>NoSuchPianoStatoRelException</code> if it could not be found.
	 *
	 * @param Id_Relazione the primary key of the piano stato rel
	 * @return the piano stato rel
	 * @throws NoSuchPianoStatoRelException if a piano stato rel with the primary key could not be found
	 */
	@Override
	public PianoStatoRel findByPrimaryKey(long Id_Relazione)
		throws NoSuchPianoStatoRelException {

		return findByPrimaryKey((Serializable)Id_Relazione);
	}

	/**
	 * Returns the piano stato rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_Relazione the primary key of the piano stato rel
	 * @return the piano stato rel, or <code>null</code> if a piano stato rel with the primary key could not be found
	 */
	@Override
	public PianoStatoRel fetchByPrimaryKey(long Id_Relazione) {
		return fetchByPrimaryKey((Serializable)Id_Relazione);
	}

	/**
	 * Returns all the piano stato rels.
	 *
	 * @return the piano stato rels
	 */
	@Override
	public List<PianoStatoRel> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the piano stato rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianoStatoRelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piano stato rels
	 * @param end the upper bound of the range of piano stato rels (not inclusive)
	 * @return the range of piano stato rels
	 */
	@Override
	public List<PianoStatoRel> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the piano stato rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianoStatoRelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piano stato rels
	 * @param end the upper bound of the range of piano stato rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of piano stato rels
	 */
	@Override
	public List<PianoStatoRel> findAll(
		int start, int end,
		OrderByComparator<PianoStatoRel> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the piano stato rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianoStatoRelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piano stato rels
	 * @param end the upper bound of the range of piano stato rels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of piano stato rels
	 */
	@Override
	public List<PianoStatoRel> findAll(
		int start, int end, OrderByComparator<PianoStatoRel> orderByComparator,
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

		List<PianoStatoRel> list = null;

		if (useFinderCache) {
			list = (List<PianoStatoRel>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PIANOSTATOREL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PIANOSTATOREL;

				sql = sql.concat(PianoStatoRelModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PianoStatoRel>)QueryUtil.list(
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
	 * Removes all the piano stato rels from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PianoStatoRel pianoStatoRel : findAll()) {
			remove(pianoStatoRel);
		}
	}

	/**
	 * Returns the number of piano stato rels.
	 *
	 * @return the number of piano stato rels
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PIANOSTATOREL);

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
		return "Id_Relazione";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PIANOSTATOREL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PianoStatoRelModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the piano stato rel persistence.
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

		_setPianoStatoRelUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setPianoStatoRelUtilPersistence(null);

		entityCache.removeCache(PianoStatoRelImpl.class.getName());
	}

	private void _setPianoStatoRelUtilPersistence(
		PianoStatoRelPersistence pianoStatoRelPersistence) {

		try {
			Field field = PianoStatoRelUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, pianoStatoRelPersistence);
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

	private static final String _SQL_SELECT_PIANOSTATOREL =
		"SELECT pianoStatoRel FROM PianoStatoRel pianoStatoRel";

	private static final String _SQL_COUNT_PIANOSTATOREL =
		"SELECT COUNT(pianoStatoRel) FROM PianoStatoRel pianoStatoRel";

	private static final String _ORDER_BY_ENTITY_ALIAS = "pianoStatoRel.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PianoStatoRel exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		PianoStatoRelPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PianoStatoRelModelArgumentsResolver
		_pianoStatoRelModelArgumentsResolver;

}