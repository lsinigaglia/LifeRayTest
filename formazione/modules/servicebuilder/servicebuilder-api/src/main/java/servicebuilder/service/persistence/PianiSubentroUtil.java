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

import servicebuilder.model.PianiSubentro;

/**
 * The persistence utility for the piani subentro service. This utility wraps <code>servicebuilder.service.persistence.impl.PianiSubentroPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianiSubentroPersistence
 * @generated
 */
public class PianiSubentroUtil {

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
	public static void clearCache(PianiSubentro pianiSubentro) {
		getPersistence().clearCache(pianiSubentro);
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
	public static Map<Serializable, PianiSubentro> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PianiSubentro> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PianiSubentro> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PianiSubentro> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PianiSubentro> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PianiSubentro update(PianiSubentro pianiSubentro) {
		return getPersistence().update(pianiSubentro);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PianiSubentro update(
		PianiSubentro pianiSubentro, ServiceContext serviceContext) {

		return getPersistence().update(pianiSubentro, serviceContext);
	}

	/**
	 * Caches the piani subentro in the entity cache if it is enabled.
	 *
	 * @param pianiSubentro the piani subentro
	 */
	public static void cacheResult(PianiSubentro pianiSubentro) {
		getPersistence().cacheResult(pianiSubentro);
	}

	/**
	 * Caches the piani subentros in the entity cache if it is enabled.
	 *
	 * @param pianiSubentros the piani subentros
	 */
	public static void cacheResult(List<PianiSubentro> pianiSubentros) {
		getPersistence().cacheResult(pianiSubentros);
	}

	/**
	 * Creates a new piani subentro with the primary key. Does not add the piani subentro to the database.
	 *
	 * @param Id_PianiSubentro the primary key for the new piani subentro
	 * @return the new piani subentro
	 */
	public static PianiSubentro create(long Id_PianiSubentro) {
		return getPersistence().create(Id_PianiSubentro);
	}

	/**
	 * Removes the piani subentro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_PianiSubentro the primary key of the piani subentro
	 * @return the piani subentro that was removed
	 * @throws NoSuchPianiSubentroException if a piani subentro with the primary key could not be found
	 */
	public static PianiSubentro remove(long Id_PianiSubentro)
		throws servicebuilder.exception.NoSuchPianiSubentroException {

		return getPersistence().remove(Id_PianiSubentro);
	}

	public static PianiSubentro updateImpl(PianiSubentro pianiSubentro) {
		return getPersistence().updateImpl(pianiSubentro);
	}

	/**
	 * Returns the piani subentro with the primary key or throws a <code>NoSuchPianiSubentroException</code> if it could not be found.
	 *
	 * @param Id_PianiSubentro the primary key of the piani subentro
	 * @return the piani subentro
	 * @throws NoSuchPianiSubentroException if a piani subentro with the primary key could not be found
	 */
	public static PianiSubentro findByPrimaryKey(long Id_PianiSubentro)
		throws servicebuilder.exception.NoSuchPianiSubentroException {

		return getPersistence().findByPrimaryKey(Id_PianiSubentro);
	}

	/**
	 * Returns the piani subentro with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_PianiSubentro the primary key of the piani subentro
	 * @return the piani subentro, or <code>null</code> if a piani subentro with the primary key could not be found
	 */
	public static PianiSubentro fetchByPrimaryKey(long Id_PianiSubentro) {
		return getPersistence().fetchByPrimaryKey(Id_PianiSubentro);
	}

	/**
	 * Returns all the piani subentros.
	 *
	 * @return the piani subentros
	 */
	public static List<PianiSubentro> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the piani subentros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiSubentroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani subentros
	 * @param end the upper bound of the range of piani subentros (not inclusive)
	 * @return the range of piani subentros
	 */
	public static List<PianiSubentro> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the piani subentros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiSubentroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani subentros
	 * @param end the upper bound of the range of piani subentros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of piani subentros
	 */
	public static List<PianiSubentro> findAll(
		int start, int end,
		OrderByComparator<PianiSubentro> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the piani subentros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiSubentroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani subentros
	 * @param end the upper bound of the range of piani subentros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of piani subentros
	 */
	public static List<PianiSubentro> findAll(
		int start, int end, OrderByComparator<PianiSubentro> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the piani subentros from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of piani subentros.
	 *
	 * @return the number of piani subentros
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PianiSubentroPersistence getPersistence() {
		return _persistence;
	}

	private static volatile PianiSubentroPersistence _persistence;

}