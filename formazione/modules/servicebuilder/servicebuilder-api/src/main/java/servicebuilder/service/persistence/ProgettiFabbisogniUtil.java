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

import servicebuilder.model.ProgettiFabbisogni;

/**
 * The persistence utility for the progetti fabbisogni service. This utility wraps <code>servicebuilder.service.persistence.impl.ProgettiFabbisogniPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProgettiFabbisogniPersistence
 * @generated
 */
public class ProgettiFabbisogniUtil {

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
	public static void clearCache(ProgettiFabbisogni progettiFabbisogni) {
		getPersistence().clearCache(progettiFabbisogni);
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
	public static Map<Serializable, ProgettiFabbisogni> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ProgettiFabbisogni> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ProgettiFabbisogni> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ProgettiFabbisogni> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ProgettiFabbisogni> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ProgettiFabbisogni update(
		ProgettiFabbisogni progettiFabbisogni) {

		return getPersistence().update(progettiFabbisogni);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ProgettiFabbisogni update(
		ProgettiFabbisogni progettiFabbisogni, ServiceContext serviceContext) {

		return getPersistence().update(progettiFabbisogni, serviceContext);
	}

	/**
	 * Returns all the progetti fabbisognis where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @return the matching progetti fabbisognis
	 */
	public static List<ProgettiFabbisogni> findByPianiFabbisogni(
		long FK_pianiFabbisogni) {

		return getPersistence().findByPianiFabbisogni(FK_pianiFabbisogni);
	}

	/**
	 * Returns a range of all the progetti fabbisognis where FK_pianiFabbisogni = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @return the range of matching progetti fabbisognis
	 */
	public static List<ProgettiFabbisogni> findByPianiFabbisogni(
		long FK_pianiFabbisogni, int start, int end) {

		return getPersistence().findByPianiFabbisogni(
			FK_pianiFabbisogni, start, end);
	}

	/**
	 * Returns an ordered range of all the progetti fabbisognis where FK_pianiFabbisogni = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching progetti fabbisognis
	 */
	public static List<ProgettiFabbisogni> findByPianiFabbisogni(
		long FK_pianiFabbisogni, int start, int end,
		OrderByComparator<ProgettiFabbisogni> orderByComparator) {

		return getPersistence().findByPianiFabbisogni(
			FK_pianiFabbisogni, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the progetti fabbisognis where FK_pianiFabbisogni = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching progetti fabbisognis
	 */
	public static List<ProgettiFabbisogni> findByPianiFabbisogni(
		long FK_pianiFabbisogni, int start, int end,
		OrderByComparator<ProgettiFabbisogni> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPianiFabbisogni(
			FK_pianiFabbisogni, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first progetti fabbisogni in the ordered set where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching progetti fabbisogni
	 * @throws NoSuchProgettiFabbisogniException if a matching progetti fabbisogni could not be found
	 */
	public static ProgettiFabbisogni findByPianiFabbisogni_First(
			long FK_pianiFabbisogni,
			OrderByComparator<ProgettiFabbisogni> orderByComparator)
		throws servicebuilder.exception.NoSuchProgettiFabbisogniException {

		return getPersistence().findByPianiFabbisogni_First(
			FK_pianiFabbisogni, orderByComparator);
	}

	/**
	 * Returns the first progetti fabbisogni in the ordered set where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching progetti fabbisogni, or <code>null</code> if a matching progetti fabbisogni could not be found
	 */
	public static ProgettiFabbisogni fetchByPianiFabbisogni_First(
		long FK_pianiFabbisogni,
		OrderByComparator<ProgettiFabbisogni> orderByComparator) {

		return getPersistence().fetchByPianiFabbisogni_First(
			FK_pianiFabbisogni, orderByComparator);
	}

	/**
	 * Returns the last progetti fabbisogni in the ordered set where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching progetti fabbisogni
	 * @throws NoSuchProgettiFabbisogniException if a matching progetti fabbisogni could not be found
	 */
	public static ProgettiFabbisogni findByPianiFabbisogni_Last(
			long FK_pianiFabbisogni,
			OrderByComparator<ProgettiFabbisogni> orderByComparator)
		throws servicebuilder.exception.NoSuchProgettiFabbisogniException {

		return getPersistence().findByPianiFabbisogni_Last(
			FK_pianiFabbisogni, orderByComparator);
	}

	/**
	 * Returns the last progetti fabbisogni in the ordered set where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching progetti fabbisogni, or <code>null</code> if a matching progetti fabbisogni could not be found
	 */
	public static ProgettiFabbisogni fetchByPianiFabbisogni_Last(
		long FK_pianiFabbisogni,
		OrderByComparator<ProgettiFabbisogni> orderByComparator) {

		return getPersistence().fetchByPianiFabbisogni_Last(
			FK_pianiFabbisogni, orderByComparator);
	}

	/**
	 * Returns the progetti fabbisognis before and after the current progetti fabbisogni in the ordered set where FK_pianiFabbisogni = &#63;.
	 *
	 * @param Id_ProgettiFabbisogni the primary key of the current progetti fabbisogni
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next progetti fabbisogni
	 * @throws NoSuchProgettiFabbisogniException if a progetti fabbisogni with the primary key could not be found
	 */
	public static ProgettiFabbisogni[] findByPianiFabbisogni_PrevAndNext(
			long Id_ProgettiFabbisogni, long FK_pianiFabbisogni,
			OrderByComparator<ProgettiFabbisogni> orderByComparator)
		throws servicebuilder.exception.NoSuchProgettiFabbisogniException {

		return getPersistence().findByPianiFabbisogni_PrevAndNext(
			Id_ProgettiFabbisogni, FK_pianiFabbisogni, orderByComparator);
	}

	/**
	 * Removes all the progetti fabbisognis where FK_pianiFabbisogni = &#63; from the database.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 */
	public static void removeByPianiFabbisogni(long FK_pianiFabbisogni) {
		getPersistence().removeByPianiFabbisogni(FK_pianiFabbisogni);
	}

	/**
	 * Returns the number of progetti fabbisognis where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @return the number of matching progetti fabbisognis
	 */
	public static int countByPianiFabbisogni(long FK_pianiFabbisogni) {
		return getPersistence().countByPianiFabbisogni(FK_pianiFabbisogni);
	}

	/**
	 * Caches the progetti fabbisogni in the entity cache if it is enabled.
	 *
	 * @param progettiFabbisogni the progetti fabbisogni
	 */
	public static void cacheResult(ProgettiFabbisogni progettiFabbisogni) {
		getPersistence().cacheResult(progettiFabbisogni);
	}

	/**
	 * Caches the progetti fabbisognis in the entity cache if it is enabled.
	 *
	 * @param progettiFabbisognis the progetti fabbisognis
	 */
	public static void cacheResult(
		List<ProgettiFabbisogni> progettiFabbisognis) {

		getPersistence().cacheResult(progettiFabbisognis);
	}

	/**
	 * Creates a new progetti fabbisogni with the primary key. Does not add the progetti fabbisogni to the database.
	 *
	 * @param Id_ProgettiFabbisogni the primary key for the new progetti fabbisogni
	 * @return the new progetti fabbisogni
	 */
	public static ProgettiFabbisogni create(long Id_ProgettiFabbisogni) {
		return getPersistence().create(Id_ProgettiFabbisogni);
	}

	/**
	 * Removes the progetti fabbisogni with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_ProgettiFabbisogni the primary key of the progetti fabbisogni
	 * @return the progetti fabbisogni that was removed
	 * @throws NoSuchProgettiFabbisogniException if a progetti fabbisogni with the primary key could not be found
	 */
	public static ProgettiFabbisogni remove(long Id_ProgettiFabbisogni)
		throws servicebuilder.exception.NoSuchProgettiFabbisogniException {

		return getPersistence().remove(Id_ProgettiFabbisogni);
	}

	public static ProgettiFabbisogni updateImpl(
		ProgettiFabbisogni progettiFabbisogni) {

		return getPersistence().updateImpl(progettiFabbisogni);
	}

	/**
	 * Returns the progetti fabbisogni with the primary key or throws a <code>NoSuchProgettiFabbisogniException</code> if it could not be found.
	 *
	 * @param Id_ProgettiFabbisogni the primary key of the progetti fabbisogni
	 * @return the progetti fabbisogni
	 * @throws NoSuchProgettiFabbisogniException if a progetti fabbisogni with the primary key could not be found
	 */
	public static ProgettiFabbisogni findByPrimaryKey(
			long Id_ProgettiFabbisogni)
		throws servicebuilder.exception.NoSuchProgettiFabbisogniException {

		return getPersistence().findByPrimaryKey(Id_ProgettiFabbisogni);
	}

	/**
	 * Returns the progetti fabbisogni with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_ProgettiFabbisogni the primary key of the progetti fabbisogni
	 * @return the progetti fabbisogni, or <code>null</code> if a progetti fabbisogni with the primary key could not be found
	 */
	public static ProgettiFabbisogni fetchByPrimaryKey(
		long Id_ProgettiFabbisogni) {

		return getPersistence().fetchByPrimaryKey(Id_ProgettiFabbisogni);
	}

	/**
	 * Returns all the progetti fabbisognis.
	 *
	 * @return the progetti fabbisognis
	 */
	public static List<ProgettiFabbisogni> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the progetti fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @return the range of progetti fabbisognis
	 */
	public static List<ProgettiFabbisogni> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the progetti fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of progetti fabbisognis
	 */
	public static List<ProgettiFabbisogni> findAll(
		int start, int end,
		OrderByComparator<ProgettiFabbisogni> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the progetti fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of progetti fabbisognis
	 */
	public static List<ProgettiFabbisogni> findAll(
		int start, int end,
		OrderByComparator<ProgettiFabbisogni> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the progetti fabbisognis from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of progetti fabbisognis.
	 *
	 * @return the number of progetti fabbisognis
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProgettiFabbisogniPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ProgettiFabbisogniPersistence _persistence;

}