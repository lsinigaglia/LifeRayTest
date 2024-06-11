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

import servicebuilder.model.PianiFabbisogni;

/**
 * The persistence utility for the piani fabbisogni service. This utility wraps <code>servicebuilder.service.persistence.impl.PianiFabbisogniPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianiFabbisogniPersistence
 * @generated
 */
public class PianiFabbisogniUtil {

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
	public static void clearCache(PianiFabbisogni pianiFabbisogni) {
		getPersistence().clearCache(pianiFabbisogni);
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
	public static Map<Serializable, PianiFabbisogni> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PianiFabbisogni> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PianiFabbisogni> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PianiFabbisogni> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PianiFabbisogni> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PianiFabbisogni update(PianiFabbisogni pianiFabbisogni) {
		return getPersistence().update(pianiFabbisogni);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PianiFabbisogni update(
		PianiFabbisogni pianiFabbisogni, ServiceContext serviceContext) {

		return getPersistence().update(pianiFabbisogni, serviceContext);
	}

	/**
	 * Returns all the piani fabbisognis where FK_attiDiAdesione = &#63;.
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @return the matching piani fabbisognis
	 */
	public static List<PianiFabbisogni> findByAttiDiAdesione(
		long FK_attiDiAdesione) {

		return getPersistence().findByAttiDiAdesione(FK_attiDiAdesione);
	}

	/**
	 * Returns a range of all the piani fabbisognis where FK_attiDiAdesione = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @param start the lower bound of the range of piani fabbisognis
	 * @param end the upper bound of the range of piani fabbisognis (not inclusive)
	 * @return the range of matching piani fabbisognis
	 */
	public static List<PianiFabbisogni> findByAttiDiAdesione(
		long FK_attiDiAdesione, int start, int end) {

		return getPersistence().findByAttiDiAdesione(
			FK_attiDiAdesione, start, end);
	}

	/**
	 * Returns an ordered range of all the piani fabbisognis where FK_attiDiAdesione = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @param start the lower bound of the range of piani fabbisognis
	 * @param end the upper bound of the range of piani fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching piani fabbisognis
	 */
	public static List<PianiFabbisogni> findByAttiDiAdesione(
		long FK_attiDiAdesione, int start, int end,
		OrderByComparator<PianiFabbisogni> orderByComparator) {

		return getPersistence().findByAttiDiAdesione(
			FK_attiDiAdesione, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the piani fabbisognis where FK_attiDiAdesione = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @param start the lower bound of the range of piani fabbisognis
	 * @param end the upper bound of the range of piani fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching piani fabbisognis
	 */
	public static List<PianiFabbisogni> findByAttiDiAdesione(
		long FK_attiDiAdesione, int start, int end,
		OrderByComparator<PianiFabbisogni> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByAttiDiAdesione(
			FK_attiDiAdesione, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first piani fabbisogni in the ordered set where FK_attiDiAdesione = &#63;.
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching piani fabbisogni
	 * @throws NoSuchPianiFabbisogniException if a matching piani fabbisogni could not be found
	 */
	public static PianiFabbisogni findByAttiDiAdesione_First(
			long FK_attiDiAdesione,
			OrderByComparator<PianiFabbisogni> orderByComparator)
		throws servicebuilder.exception.NoSuchPianiFabbisogniException {

		return getPersistence().findByAttiDiAdesione_First(
			FK_attiDiAdesione, orderByComparator);
	}

	/**
	 * Returns the first piani fabbisogni in the ordered set where FK_attiDiAdesione = &#63;.
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching piani fabbisogni, or <code>null</code> if a matching piani fabbisogni could not be found
	 */
	public static PianiFabbisogni fetchByAttiDiAdesione_First(
		long FK_attiDiAdesione,
		OrderByComparator<PianiFabbisogni> orderByComparator) {

		return getPersistence().fetchByAttiDiAdesione_First(
			FK_attiDiAdesione, orderByComparator);
	}

	/**
	 * Returns the last piani fabbisogni in the ordered set where FK_attiDiAdesione = &#63;.
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching piani fabbisogni
	 * @throws NoSuchPianiFabbisogniException if a matching piani fabbisogni could not be found
	 */
	public static PianiFabbisogni findByAttiDiAdesione_Last(
			long FK_attiDiAdesione,
			OrderByComparator<PianiFabbisogni> orderByComparator)
		throws servicebuilder.exception.NoSuchPianiFabbisogniException {

		return getPersistence().findByAttiDiAdesione_Last(
			FK_attiDiAdesione, orderByComparator);
	}

	/**
	 * Returns the last piani fabbisogni in the ordered set where FK_attiDiAdesione = &#63;.
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching piani fabbisogni, or <code>null</code> if a matching piani fabbisogni could not be found
	 */
	public static PianiFabbisogni fetchByAttiDiAdesione_Last(
		long FK_attiDiAdesione,
		OrderByComparator<PianiFabbisogni> orderByComparator) {

		return getPersistence().fetchByAttiDiAdesione_Last(
			FK_attiDiAdesione, orderByComparator);
	}

	/**
	 * Returns the piani fabbisognis before and after the current piani fabbisogni in the ordered set where FK_attiDiAdesione = &#63;.
	 *
	 * @param Id_PianiFabbisogni the primary key of the current piani fabbisogni
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next piani fabbisogni
	 * @throws NoSuchPianiFabbisogniException if a piani fabbisogni with the primary key could not be found
	 */
	public static PianiFabbisogni[] findByAttiDiAdesione_PrevAndNext(
			long Id_PianiFabbisogni, long FK_attiDiAdesione,
			OrderByComparator<PianiFabbisogni> orderByComparator)
		throws servicebuilder.exception.NoSuchPianiFabbisogniException {

		return getPersistence().findByAttiDiAdesione_PrevAndNext(
			Id_PianiFabbisogni, FK_attiDiAdesione, orderByComparator);
	}

	/**
	 * Removes all the piani fabbisognis where FK_attiDiAdesione = &#63; from the database.
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 */
	public static void removeByAttiDiAdesione(long FK_attiDiAdesione) {
		getPersistence().removeByAttiDiAdesione(FK_attiDiAdesione);
	}

	/**
	 * Returns the number of piani fabbisognis where FK_attiDiAdesione = &#63;.
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @return the number of matching piani fabbisognis
	 */
	public static int countByAttiDiAdesione(long FK_attiDiAdesione) {
		return getPersistence().countByAttiDiAdesione(FK_attiDiAdesione);
	}

	/**
	 * Caches the piani fabbisogni in the entity cache if it is enabled.
	 *
	 * @param pianiFabbisogni the piani fabbisogni
	 */
	public static void cacheResult(PianiFabbisogni pianiFabbisogni) {
		getPersistence().cacheResult(pianiFabbisogni);
	}

	/**
	 * Caches the piani fabbisognis in the entity cache if it is enabled.
	 *
	 * @param pianiFabbisognis the piani fabbisognis
	 */
	public static void cacheResult(List<PianiFabbisogni> pianiFabbisognis) {
		getPersistence().cacheResult(pianiFabbisognis);
	}

	/**
	 * Creates a new piani fabbisogni with the primary key. Does not add the piani fabbisogni to the database.
	 *
	 * @param Id_PianiFabbisogni the primary key for the new piani fabbisogni
	 * @return the new piani fabbisogni
	 */
	public static PianiFabbisogni create(long Id_PianiFabbisogni) {
		return getPersistence().create(Id_PianiFabbisogni);
	}

	/**
	 * Removes the piani fabbisogni with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_PianiFabbisogni the primary key of the piani fabbisogni
	 * @return the piani fabbisogni that was removed
	 * @throws NoSuchPianiFabbisogniException if a piani fabbisogni with the primary key could not be found
	 */
	public static PianiFabbisogni remove(long Id_PianiFabbisogni)
		throws servicebuilder.exception.NoSuchPianiFabbisogniException {

		return getPersistence().remove(Id_PianiFabbisogni);
	}

	public static PianiFabbisogni updateImpl(PianiFabbisogni pianiFabbisogni) {
		return getPersistence().updateImpl(pianiFabbisogni);
	}

	/**
	 * Returns the piani fabbisogni with the primary key or throws a <code>NoSuchPianiFabbisogniException</code> if it could not be found.
	 *
	 * @param Id_PianiFabbisogni the primary key of the piani fabbisogni
	 * @return the piani fabbisogni
	 * @throws NoSuchPianiFabbisogniException if a piani fabbisogni with the primary key could not be found
	 */
	public static PianiFabbisogni findByPrimaryKey(long Id_PianiFabbisogni)
		throws servicebuilder.exception.NoSuchPianiFabbisogniException {

		return getPersistence().findByPrimaryKey(Id_PianiFabbisogni);
	}

	/**
	 * Returns the piani fabbisogni with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_PianiFabbisogni the primary key of the piani fabbisogni
	 * @return the piani fabbisogni, or <code>null</code> if a piani fabbisogni with the primary key could not be found
	 */
	public static PianiFabbisogni fetchByPrimaryKey(long Id_PianiFabbisogni) {
		return getPersistence().fetchByPrimaryKey(Id_PianiFabbisogni);
	}

	/**
	 * Returns all the piani fabbisognis.
	 *
	 * @return the piani fabbisognis
	 */
	public static List<PianiFabbisogni> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the piani fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani fabbisognis
	 * @param end the upper bound of the range of piani fabbisognis (not inclusive)
	 * @return the range of piani fabbisognis
	 */
	public static List<PianiFabbisogni> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the piani fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani fabbisognis
	 * @param end the upper bound of the range of piani fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of piani fabbisognis
	 */
	public static List<PianiFabbisogni> findAll(
		int start, int end,
		OrderByComparator<PianiFabbisogni> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the piani fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani fabbisognis
	 * @param end the upper bound of the range of piani fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of piani fabbisognis
	 */
	public static List<PianiFabbisogni> findAll(
		int start, int end,
		OrderByComparator<PianiFabbisogni> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the piani fabbisognis from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of piani fabbisognis.
	 *
	 * @return the number of piani fabbisognis
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PianiFabbisogniPersistence getPersistence() {
		return _persistence;
	}

	private static volatile PianiFabbisogniPersistence _persistence;

}