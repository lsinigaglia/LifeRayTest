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

import servicebuilder.model.PianiDiQualita;

/**
 * The persistence utility for the piani di qualita service. This utility wraps <code>servicebuilder.service.persistence.impl.PianiDiQualitaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianiDiQualitaPersistence
 * @generated
 */
public class PianiDiQualitaUtil {

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
	public static void clearCache(PianiDiQualita pianiDiQualita) {
		getPersistence().clearCache(pianiDiQualita);
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
	public static Map<Serializable, PianiDiQualita> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PianiDiQualita> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PianiDiQualita> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PianiDiQualita> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PianiDiQualita> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PianiDiQualita update(PianiDiQualita pianiDiQualita) {
		return getPersistence().update(pianiDiQualita);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PianiDiQualita update(
		PianiDiQualita pianiDiQualita, ServiceContext serviceContext) {

		return getPersistence().update(pianiDiQualita, serviceContext);
	}

	/**
	 * Caches the piani di qualita in the entity cache if it is enabled.
	 *
	 * @param pianiDiQualita the piani di qualita
	 */
	public static void cacheResult(PianiDiQualita pianiDiQualita) {
		getPersistence().cacheResult(pianiDiQualita);
	}

	/**
	 * Caches the piani di qualitas in the entity cache if it is enabled.
	 *
	 * @param pianiDiQualitas the piani di qualitas
	 */
	public static void cacheResult(List<PianiDiQualita> pianiDiQualitas) {
		getPersistence().cacheResult(pianiDiQualitas);
	}

	/**
	 * Creates a new piani di qualita with the primary key. Does not add the piani di qualita to the database.
	 *
	 * @param Id_PianiDiQualita the primary key for the new piani di qualita
	 * @return the new piani di qualita
	 */
	public static PianiDiQualita create(long Id_PianiDiQualita) {
		return getPersistence().create(Id_PianiDiQualita);
	}

	/**
	 * Removes the piani di qualita with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_PianiDiQualita the primary key of the piani di qualita
	 * @return the piani di qualita that was removed
	 * @throws NoSuchPianiDiQualitaException if a piani di qualita with the primary key could not be found
	 */
	public static PianiDiQualita remove(long Id_PianiDiQualita)
		throws servicebuilder.exception.NoSuchPianiDiQualitaException {

		return getPersistence().remove(Id_PianiDiQualita);
	}

	public static PianiDiQualita updateImpl(PianiDiQualita pianiDiQualita) {
		return getPersistence().updateImpl(pianiDiQualita);
	}

	/**
	 * Returns the piani di qualita with the primary key or throws a <code>NoSuchPianiDiQualitaException</code> if it could not be found.
	 *
	 * @param Id_PianiDiQualita the primary key of the piani di qualita
	 * @return the piani di qualita
	 * @throws NoSuchPianiDiQualitaException if a piani di qualita with the primary key could not be found
	 */
	public static PianiDiQualita findByPrimaryKey(long Id_PianiDiQualita)
		throws servicebuilder.exception.NoSuchPianiDiQualitaException {

		return getPersistence().findByPrimaryKey(Id_PianiDiQualita);
	}

	/**
	 * Returns the piani di qualita with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_PianiDiQualita the primary key of the piani di qualita
	 * @return the piani di qualita, or <code>null</code> if a piani di qualita with the primary key could not be found
	 */
	public static PianiDiQualita fetchByPrimaryKey(long Id_PianiDiQualita) {
		return getPersistence().fetchByPrimaryKey(Id_PianiDiQualita);
	}

	/**
	 * Returns all the piani di qualitas.
	 *
	 * @return the piani di qualitas
	 */
	public static List<PianiDiQualita> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the piani di qualitas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiQualitaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani di qualitas
	 * @param end the upper bound of the range of piani di qualitas (not inclusive)
	 * @return the range of piani di qualitas
	 */
	public static List<PianiDiQualita> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the piani di qualitas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiQualitaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani di qualitas
	 * @param end the upper bound of the range of piani di qualitas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of piani di qualitas
	 */
	public static List<PianiDiQualita> findAll(
		int start, int end,
		OrderByComparator<PianiDiQualita> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the piani di qualitas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiQualitaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani di qualitas
	 * @param end the upper bound of the range of piani di qualitas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of piani di qualitas
	 */
	public static List<PianiDiQualita> findAll(
		int start, int end, OrderByComparator<PianiDiQualita> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the piani di qualitas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of piani di qualitas.
	 *
	 * @return the number of piani di qualitas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PianiDiQualitaPersistence getPersistence() {
		return _persistence;
	}

	private static volatile PianiDiQualitaPersistence _persistence;

}