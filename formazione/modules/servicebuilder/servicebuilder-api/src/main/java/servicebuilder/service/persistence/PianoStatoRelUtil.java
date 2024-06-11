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

import servicebuilder.model.PianoStatoRel;

/**
 * The persistence utility for the piano stato rel service. This utility wraps <code>servicebuilder.service.persistence.impl.PianoStatoRelPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianoStatoRelPersistence
 * @generated
 */
public class PianoStatoRelUtil {

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
	public static void clearCache(PianoStatoRel pianoStatoRel) {
		getPersistence().clearCache(pianoStatoRel);
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
	public static Map<Serializable, PianoStatoRel> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PianoStatoRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PianoStatoRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PianoStatoRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PianoStatoRel> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PianoStatoRel update(PianoStatoRel pianoStatoRel) {
		return getPersistence().update(pianoStatoRel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PianoStatoRel update(
		PianoStatoRel pianoStatoRel, ServiceContext serviceContext) {

		return getPersistence().update(pianoStatoRel, serviceContext);
	}

	/**
	 * Caches the piano stato rel in the entity cache if it is enabled.
	 *
	 * @param pianoStatoRel the piano stato rel
	 */
	public static void cacheResult(PianoStatoRel pianoStatoRel) {
		getPersistence().cacheResult(pianoStatoRel);
	}

	/**
	 * Caches the piano stato rels in the entity cache if it is enabled.
	 *
	 * @param pianoStatoRels the piano stato rels
	 */
	public static void cacheResult(List<PianoStatoRel> pianoStatoRels) {
		getPersistence().cacheResult(pianoStatoRels);
	}

	/**
	 * Creates a new piano stato rel with the primary key. Does not add the piano stato rel to the database.
	 *
	 * @param Id_Relazione the primary key for the new piano stato rel
	 * @return the new piano stato rel
	 */
	public static PianoStatoRel create(long Id_Relazione) {
		return getPersistence().create(Id_Relazione);
	}

	/**
	 * Removes the piano stato rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_Relazione the primary key of the piano stato rel
	 * @return the piano stato rel that was removed
	 * @throws NoSuchPianoStatoRelException if a piano stato rel with the primary key could not be found
	 */
	public static PianoStatoRel remove(long Id_Relazione)
		throws servicebuilder.exception.NoSuchPianoStatoRelException {

		return getPersistence().remove(Id_Relazione);
	}

	public static PianoStatoRel updateImpl(PianoStatoRel pianoStatoRel) {
		return getPersistence().updateImpl(pianoStatoRel);
	}

	/**
	 * Returns the piano stato rel with the primary key or throws a <code>NoSuchPianoStatoRelException</code> if it could not be found.
	 *
	 * @param Id_Relazione the primary key of the piano stato rel
	 * @return the piano stato rel
	 * @throws NoSuchPianoStatoRelException if a piano stato rel with the primary key could not be found
	 */
	public static PianoStatoRel findByPrimaryKey(long Id_Relazione)
		throws servicebuilder.exception.NoSuchPianoStatoRelException {

		return getPersistence().findByPrimaryKey(Id_Relazione);
	}

	/**
	 * Returns the piano stato rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_Relazione the primary key of the piano stato rel
	 * @return the piano stato rel, or <code>null</code> if a piano stato rel with the primary key could not be found
	 */
	public static PianoStatoRel fetchByPrimaryKey(long Id_Relazione) {
		return getPersistence().fetchByPrimaryKey(Id_Relazione);
	}

	/**
	 * Returns all the piano stato rels.
	 *
	 * @return the piano stato rels
	 */
	public static List<PianoStatoRel> findAll() {
		return getPersistence().findAll();
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
	public static List<PianoStatoRel> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<PianoStatoRel> findAll(
		int start, int end,
		OrderByComparator<PianoStatoRel> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<PianoStatoRel> findAll(
		int start, int end, OrderByComparator<PianoStatoRel> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the piano stato rels from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of piano stato rels.
	 *
	 * @return the number of piano stato rels
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PianoStatoRelPersistence getPersistence() {
		return _persistence;
	}

	private static volatile PianoStatoRelPersistence _persistence;

}