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

import servicebuilder.exception.NoSuchDocumentiException;

import servicebuilder.model.Documenti;
import servicebuilder.model.DocumentiTable;
import servicebuilder.model.impl.DocumentiImpl;
import servicebuilder.model.impl.DocumentiModelImpl;

import servicebuilder.service.persistence.DocumentiPersistence;
import servicebuilder.service.persistence.DocumentiUtil;
import servicebuilder.service.persistence.impl.constants.AQPersistenceConstants;

/**
 * The persistence implementation for the documenti service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {DocumentiPersistence.class, BasePersistence.class})
public class DocumentiPersistenceImpl
	extends BasePersistenceImpl<Documenti> implements DocumentiPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DocumentiUtil</code> to access the documenti persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DocumentiImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public DocumentiPersistenceImpl() {
		setModelClass(Documenti.class);

		setModelImplClass(DocumentiImpl.class);
		setModelPKClass(String.class);

		setTable(DocumentiTable.INSTANCE);
	}

	/**
	 * Caches the documenti in the entity cache if it is enabled.
	 *
	 * @param documenti the documenti
	 */
	@Override
	public void cacheResult(Documenti documenti) {
		entityCache.putResult(
			DocumentiImpl.class, documenti.getPrimaryKey(), documenti);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the documentis in the entity cache if it is enabled.
	 *
	 * @param documentis the documentis
	 */
	@Override
	public void cacheResult(List<Documenti> documentis) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (documentis.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Documenti documenti : documentis) {
			if (entityCache.getResult(
					DocumentiImpl.class, documenti.getPrimaryKey()) == null) {

				cacheResult(documenti);
			}
		}
	}

	/**
	 * Clears the cache for all documentis.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DocumentiImpl.class);

		finderCache.clearCache(DocumentiImpl.class);
	}

	/**
	 * Clears the cache for the documenti.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Documenti documenti) {
		entityCache.removeResult(DocumentiImpl.class, documenti);
	}

	@Override
	public void clearCache(List<Documenti> documentis) {
		for (Documenti documenti : documentis) {
			entityCache.removeResult(DocumentiImpl.class, documenti);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DocumentiImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(DocumentiImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new documenti with the primary key. Does not add the documenti to the database.
	 *
	 * @param CodiceDocumento the primary key for the new documenti
	 * @return the new documenti
	 */
	@Override
	public Documenti create(String CodiceDocumento) {
		Documenti documenti = new DocumentiImpl();

		documenti.setNew(true);
		documenti.setPrimaryKey(CodiceDocumento);

		return documenti;
	}

	/**
	 * Removes the documenti with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CodiceDocumento the primary key of the documenti
	 * @return the documenti that was removed
	 * @throws NoSuchDocumentiException if a documenti with the primary key could not be found
	 */
	@Override
	public Documenti remove(String CodiceDocumento)
		throws NoSuchDocumentiException {

		return remove((Serializable)CodiceDocumento);
	}

	/**
	 * Removes the documenti with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the documenti
	 * @return the documenti that was removed
	 * @throws NoSuchDocumentiException if a documenti with the primary key could not be found
	 */
	@Override
	public Documenti remove(Serializable primaryKey)
		throws NoSuchDocumentiException {

		Session session = null;

		try {
			session = openSession();

			Documenti documenti = (Documenti)session.get(
				DocumentiImpl.class, primaryKey);

			if (documenti == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDocumentiException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(documenti);
		}
		catch (NoSuchDocumentiException noSuchEntityException) {
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
	protected Documenti removeImpl(Documenti documenti) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(documenti)) {
				documenti = (Documenti)session.get(
					DocumentiImpl.class, documenti.getPrimaryKeyObj());
			}

			if (documenti != null) {
				session.delete(documenti);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (documenti != null) {
			clearCache(documenti);
		}

		return documenti;
	}

	@Override
	public Documenti updateImpl(Documenti documenti) {
		boolean isNew = documenti.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(documenti);
			}
			else {
				documenti = (Documenti)session.merge(documenti);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(DocumentiImpl.class, documenti, false, true);

		if (isNew) {
			documenti.setNew(false);
		}

		documenti.resetOriginalValues();

		return documenti;
	}

	/**
	 * Returns the documenti with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the documenti
	 * @return the documenti
	 * @throws NoSuchDocumentiException if a documenti with the primary key could not be found
	 */
	@Override
	public Documenti findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDocumentiException {

		Documenti documenti = fetchByPrimaryKey(primaryKey);

		if (documenti == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDocumentiException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return documenti;
	}

	/**
	 * Returns the documenti with the primary key or throws a <code>NoSuchDocumentiException</code> if it could not be found.
	 *
	 * @param CodiceDocumento the primary key of the documenti
	 * @return the documenti
	 * @throws NoSuchDocumentiException if a documenti with the primary key could not be found
	 */
	@Override
	public Documenti findByPrimaryKey(String CodiceDocumento)
		throws NoSuchDocumentiException {

		return findByPrimaryKey((Serializable)CodiceDocumento);
	}

	/**
	 * Returns the documenti with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CodiceDocumento the primary key of the documenti
	 * @return the documenti, or <code>null</code> if a documenti with the primary key could not be found
	 */
	@Override
	public Documenti fetchByPrimaryKey(String CodiceDocumento) {
		return fetchByPrimaryKey((Serializable)CodiceDocumento);
	}

	/**
	 * Returns all the documentis.
	 *
	 * @return the documentis
	 */
	@Override
	public List<Documenti> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the documentis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documentis
	 * @param end the upper bound of the range of documentis (not inclusive)
	 * @return the range of documentis
	 */
	@Override
	public List<Documenti> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the documentis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documentis
	 * @param end the upper bound of the range of documentis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of documentis
	 */
	@Override
	public List<Documenti> findAll(
		int start, int end, OrderByComparator<Documenti> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the documentis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documentis
	 * @param end the upper bound of the range of documentis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of documentis
	 */
	@Override
	public List<Documenti> findAll(
		int start, int end, OrderByComparator<Documenti> orderByComparator,
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

		List<Documenti> list = null;

		if (useFinderCache) {
			list = (List<Documenti>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DOCUMENTI);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DOCUMENTI;

				sql = sql.concat(DocumentiModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Documenti>)QueryUtil.list(
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
	 * Removes all the documentis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Documenti documenti : findAll()) {
			remove(documenti);
		}
	}

	/**
	 * Returns the number of documentis.
	 *
	 * @return the number of documentis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_DOCUMENTI);

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
		return "CodiceDocumento";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DOCUMENTI;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DocumentiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the documenti persistence.
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

		_setDocumentiUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setDocumentiUtilPersistence(null);

		entityCache.removeCache(DocumentiImpl.class.getName());
	}

	private void _setDocumentiUtilPersistence(
		DocumentiPersistence documentiPersistence) {

		try {
			Field field = DocumentiUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, documentiPersistence);
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

	private static final String _SQL_SELECT_DOCUMENTI =
		"SELECT documenti FROM Documenti documenti";

	private static final String _SQL_COUNT_DOCUMENTI =
		"SELECT COUNT(documenti) FROM Documenti documenti";

	private static final String _ORDER_BY_ENTITY_ALIAS = "documenti.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Documenti exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		DocumentiPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private DocumentiModelArgumentsResolver _documentiModelArgumentsResolver;

}