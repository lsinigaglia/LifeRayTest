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

import servicebuilder.model.PianiDeiRischi;

/**
 * The persistence utility for the piani dei rischi service. This utility wraps <code>servicebuilder.service.persistence.impl.PianiDeiRischiPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianiDeiRischiPersistence
 * @generated
 */
public class PianiDeiRischiUtil {

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
	public static void clearCache(PianiDeiRischi pianiDeiRischi) {
		getPersistence().clearCache(pianiDeiRischi);
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
	public static Map<Serializable, PianiDeiRischi> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PianiDeiRischi> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PianiDeiRischi> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PianiDeiRischi> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PianiDeiRischi> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PianiDeiRischi update(PianiDeiRischi pianiDeiRischi) {
		return getPersistence().update(pianiDeiRischi);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PianiDeiRischi update(
		PianiDeiRischi pianiDeiRischi, ServiceContext serviceContext) {

		return getPersistence().update(pianiDeiRischi, serviceContext);
	}

	/**
	 * Caches the piani dei rischi in the entity cache if it is enabled.
	 *
	 * @param pianiDeiRischi the piani dei rischi
	 */
	public static void cacheResult(PianiDeiRischi pianiDeiRischi) {
		getPersistence().cacheResult(pianiDeiRischi);
	}

	/**
	 * Caches the piani dei rischis in the entity cache if it is enabled.
	 *
	 * @param pianiDeiRischis the piani dei rischis
	 */
	public static void cacheResult(List<PianiDeiRischi> pianiDeiRischis) {
		getPersistence().cacheResult(pianiDeiRischis);
	}

	/**
	 * Creates a new piani dei rischi with the primary key. Does not add the piani dei rischi to the database.
	 *
	 * @param Id_PianiDeiRischi the primary key for the new piani dei rischi
	 * @return the new piani dei rischi
	 */
	public static PianiDeiRischi create(long Id_PianiDeiRischi) {
		return getPersistence().create(Id_PianiDeiRischi);
	}

	/**
	 * Removes the piani dei rischi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_PianiDeiRischi the primary key of the piani dei rischi
	 * @return the piani dei rischi that was removed
	 * @throws NoSuchPianiDeiRischiException if a piani dei rischi with the primary key could not be found
	 */
	public static PianiDeiRischi remove(long Id_PianiDeiRischi)
		throws servicebuilder.exception.NoSuchPianiDeiRischiException {

		return getPersistence().remove(Id_PianiDeiRischi);
	}

	public static PianiDeiRischi updateImpl(PianiDeiRischi pianiDeiRischi) {
		return getPersistence().updateImpl(pianiDeiRischi);
	}

	/**
	 * Returns the piani dei rischi with the primary key or throws a <code>NoSuchPianiDeiRischiException</code> if it could not be found.
	 *
	 * @param Id_PianiDeiRischi the primary key of the piani dei rischi
	 * @return the piani dei rischi
	 * @throws NoSuchPianiDeiRischiException if a piani dei rischi with the primary key could not be found
	 */
	public static PianiDeiRischi findByPrimaryKey(long Id_PianiDeiRischi)
		throws servicebuilder.exception.NoSuchPianiDeiRischiException {

		return getPersistence().findByPrimaryKey(Id_PianiDeiRischi);
	}

	/**
	 * Returns the piani dei rischi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_PianiDeiRischi the primary key of the piani dei rischi
	 * @return the piani dei rischi, or <code>null</code> if a piani dei rischi with the primary key could not be found
	 */
	public static PianiDeiRischi fetchByPrimaryKey(long Id_PianiDeiRischi) {
		return getPersistence().fetchByPrimaryKey(Id_PianiDeiRischi);
	}

	/**
	 * Returns all the piani dei rischis.
	 *
	 * @return the piani dei rischis
	 */
	public static List<PianiDeiRischi> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the piani dei rischis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDeiRischiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani dei rischis
	 * @param end the upper bound of the range of piani dei rischis (not inclusive)
	 * @return the range of piani dei rischis
	 */
	public static List<PianiDeiRischi> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the piani dei rischis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDeiRischiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani dei rischis
	 * @param end the upper bound of the range of piani dei rischis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of piani dei rischis
	 */
	public static List<PianiDeiRischi> findAll(
		int start, int end,
		OrderByComparator<PianiDeiRischi> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the piani dei rischis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDeiRischiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani dei rischis
	 * @param end the upper bound of the range of piani dei rischis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of piani dei rischis
	 */
	public static List<PianiDeiRischi> findAll(
		int start, int end, OrderByComparator<PianiDeiRischi> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the piani dei rischis from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of piani dei rischis.
	 *
	 * @return the number of piani dei rischis
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PianiDeiRischiPersistence getPersistence() {
		return _persistence;
	}

	private static volatile PianiDeiRischiPersistence _persistence;

}