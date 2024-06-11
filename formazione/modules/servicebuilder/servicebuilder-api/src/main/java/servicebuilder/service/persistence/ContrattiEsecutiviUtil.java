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

import servicebuilder.model.ContrattiEsecutivi;

/**
 * The persistence utility for the contratti esecutivi service. This utility wraps <code>servicebuilder.service.persistence.impl.ContrattiEsecutiviPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContrattiEsecutiviPersistence
 * @generated
 */
public class ContrattiEsecutiviUtil {

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
	public static void clearCache(ContrattiEsecutivi contrattiEsecutivi) {
		getPersistence().clearCache(contrattiEsecutivi);
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
	public static Map<Serializable, ContrattiEsecutivi> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ContrattiEsecutivi> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ContrattiEsecutivi> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ContrattiEsecutivi> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ContrattiEsecutivi> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ContrattiEsecutivi update(
		ContrattiEsecutivi contrattiEsecutivi) {

		return getPersistence().update(contrattiEsecutivi);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ContrattiEsecutivi update(
		ContrattiEsecutivi contrattiEsecutivi, ServiceContext serviceContext) {

		return getPersistence().update(contrattiEsecutivi, serviceContext);
	}

	/**
	 * Caches the contratti esecutivi in the entity cache if it is enabled.
	 *
	 * @param contrattiEsecutivi the contratti esecutivi
	 */
	public static void cacheResult(ContrattiEsecutivi contrattiEsecutivi) {
		getPersistence().cacheResult(contrattiEsecutivi);
	}

	/**
	 * Caches the contratti esecutivis in the entity cache if it is enabled.
	 *
	 * @param contrattiEsecutivis the contratti esecutivis
	 */
	public static void cacheResult(
		List<ContrattiEsecutivi> contrattiEsecutivis) {

		getPersistence().cacheResult(contrattiEsecutivis);
	}

	/**
	 * Creates a new contratti esecutivi with the primary key. Does not add the contratti esecutivi to the database.
	 *
	 * @param contrattiEsecutiviPK the primary key for the new contratti esecutivi
	 * @return the new contratti esecutivi
	 */
	public static ContrattiEsecutivi create(
		servicebuilder.service.persistence.ContrattiEsecutiviPK
			contrattiEsecutiviPK) {

		return getPersistence().create(contrattiEsecutiviPK);
	}

	/**
	 * Removes the contratti esecutivi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contrattiEsecutiviPK the primary key of the contratti esecutivi
	 * @return the contratti esecutivi that was removed
	 * @throws NoSuchContrattiEsecutiviException if a contratti esecutivi with the primary key could not be found
	 */
	public static ContrattiEsecutivi remove(
			servicebuilder.service.persistence.ContrattiEsecutiviPK
				contrattiEsecutiviPK)
		throws servicebuilder.exception.NoSuchContrattiEsecutiviException {

		return getPersistence().remove(contrattiEsecutiviPK);
	}

	public static ContrattiEsecutivi updateImpl(
		ContrattiEsecutivi contrattiEsecutivi) {

		return getPersistence().updateImpl(contrattiEsecutivi);
	}

	/**
	 * Returns the contratti esecutivi with the primary key or throws a <code>NoSuchContrattiEsecutiviException</code> if it could not be found.
	 *
	 * @param contrattiEsecutiviPK the primary key of the contratti esecutivi
	 * @return the contratti esecutivi
	 * @throws NoSuchContrattiEsecutiviException if a contratti esecutivi with the primary key could not be found
	 */
	public static ContrattiEsecutivi findByPrimaryKey(
			servicebuilder.service.persistence.ContrattiEsecutiviPK
				contrattiEsecutiviPK)
		throws servicebuilder.exception.NoSuchContrattiEsecutiviException {

		return getPersistence().findByPrimaryKey(contrattiEsecutiviPK);
	}

	/**
	 * Returns the contratti esecutivi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contrattiEsecutiviPK the primary key of the contratti esecutivi
	 * @return the contratti esecutivi, or <code>null</code> if a contratti esecutivi with the primary key could not be found
	 */
	public static ContrattiEsecutivi fetchByPrimaryKey(
		servicebuilder.service.persistence.ContrattiEsecutiviPK
			contrattiEsecutiviPK) {

		return getPersistence().fetchByPrimaryKey(contrattiEsecutiviPK);
	}

	/**
	 * Returns all the contratti esecutivis.
	 *
	 * @return the contratti esecutivis
	 */
	public static List<ContrattiEsecutivi> findAll() {
		return getPersistence().findAll();
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
	public static List<ContrattiEsecutivi> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<ContrattiEsecutivi> findAll(
		int start, int end,
		OrderByComparator<ContrattiEsecutivi> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<ContrattiEsecutivi> findAll(
		int start, int end,
		OrderByComparator<ContrattiEsecutivi> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the contratti esecutivis from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of contratti esecutivis.
	 *
	 * @return the number of contratti esecutivis
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static ContrattiEsecutiviPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ContrattiEsecutiviPersistence _persistence;

}