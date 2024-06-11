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

package servicebuilder.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import servicebuilder.model.Documenti;

/**
 * The persistence utility for the documenti service. This utility wraps <code>servicebuilder.service.persistence.impl.DocumentiPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DocumentiPersistence
 * @generated
 */
public class DocumentiUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Documenti documenti) {
		getPersistence().clearCache(documenti);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Documenti> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Documenti> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Documenti> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Documenti> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Documenti> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Documenti update(Documenti documenti) {
		return getPersistence().update(documenti);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Documenti update(
		Documenti documenti, ServiceContext serviceContext) {

		return getPersistence().update(documenti, serviceContext);
	}

	/**
	 * Caches the documenti in the entity cache if it is enabled.
	 *
	 * @param documenti the documenti
	 */
	public static void cacheResult(Documenti documenti) {
		getPersistence().cacheResult(documenti);
	}

	/**
	 * Caches the documentis in the entity cache if it is enabled.
	 *
	 * @param documentis the documentis
	 */
	public static void cacheResult(List<Documenti> documentis) {
		getPersistence().cacheResult(documentis);
	}

	/**
	 * Creates a new documenti with the primary key. Does not add the documenti to the database.
	 *
	 * @param CodiceDocumento the primary key for the new documenti
	 * @return the new documenti
	 */
	public static Documenti create(String CodiceDocumento) {
		return getPersistence().create(CodiceDocumento);
	}

	/**
	 * Removes the documenti with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CodiceDocumento the primary key of the documenti
	 * @return the documenti that was removed
	 * @throws NoSuchDocumentiException if a documenti with the primary key could not be found
	 */
	public static Documenti remove(String CodiceDocumento)
		throws servicebuilder.exception.NoSuchDocumentiException {

		return getPersistence().remove(CodiceDocumento);
	}

	public static Documenti updateImpl(Documenti documenti) {
		return getPersistence().updateImpl(documenti);
	}

	/**
	 * Returns the documenti with the primary key or throws a <code>NoSuchDocumentiException</code> if it could not be found.
	 *
	 * @param CodiceDocumento the primary key of the documenti
	 * @return the documenti
	 * @throws NoSuchDocumentiException if a documenti with the primary key could not be found
	 */
	public static Documenti findByPrimaryKey(String CodiceDocumento)
		throws servicebuilder.exception.NoSuchDocumentiException {

		return getPersistence().findByPrimaryKey(CodiceDocumento);
	}

	/**
	 * Returns the documenti with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CodiceDocumento the primary key of the documenti
	 * @return the documenti, or <code>null</code> if a documenti with the primary key could not be found
	 */
	public static Documenti fetchByPrimaryKey(String CodiceDocumento) {
		return getPersistence().fetchByPrimaryKey(CodiceDocumento);
	}

	/**
	 * Returns all the documentis.
	 *
	 * @return the documentis
	 */
	public static List<Documenti> findAll() {
		return getPersistence().findAll();
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
	public static List<Documenti> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<Documenti> findAll(
		int start, int end, OrderByComparator<Documenti> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<Documenti> findAll(
		int start, int end, OrderByComparator<Documenti> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the documentis from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of documentis.
	 *
	 * @return the number of documentis
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DocumentiPersistence getPersistence() {
		return _persistence;
	}

	private static volatile DocumentiPersistence _persistence;

}