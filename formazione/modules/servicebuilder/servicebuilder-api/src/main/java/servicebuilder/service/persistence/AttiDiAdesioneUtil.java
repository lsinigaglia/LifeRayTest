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

import servicebuilder.model.AttiDiAdesione;

/**
 * The persistence utility for the atti di adesione service. This utility wraps <code>servicebuilder.service.persistence.impl.AttiDiAdesionePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttiDiAdesionePersistence
 * @generated
 */
public class AttiDiAdesioneUtil {

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
	public static void clearCache(AttiDiAdesione attiDiAdesione) {
		getPersistence().clearCache(attiDiAdesione);
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
	public static Map<Serializable, AttiDiAdesione> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AttiDiAdesione> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttiDiAdesione> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttiDiAdesione> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttiDiAdesione> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttiDiAdesione update(AttiDiAdesione attiDiAdesione) {
		return getPersistence().update(attiDiAdesione);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttiDiAdesione update(
		AttiDiAdesione attiDiAdesione, ServiceContext serviceContext) {

		return getPersistence().update(attiDiAdesione, serviceContext);
	}

	/**
	 * Returns all the atti di adesiones where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @return the matching atti di adesiones
	 */
	public static List<AttiDiAdesione> findByAccordoQuadro(
		long FK_accordoQuadro) {

		return getPersistence().findByAccordoQuadro(FK_accordoQuadro);
	}

	/**
	 * Returns a range of all the atti di adesiones where FK_accordoQuadro = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttiDiAdesioneModelImpl</code>.
	 * </p>
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param start the lower bound of the range of atti di adesiones
	 * @param end the upper bound of the range of atti di adesiones (not inclusive)
	 * @return the range of matching atti di adesiones
	 */
	public static List<AttiDiAdesione> findByAccordoQuadro(
		long FK_accordoQuadro, int start, int end) {

		return getPersistence().findByAccordoQuadro(
			FK_accordoQuadro, start, end);
	}

	/**
	 * Returns an ordered range of all the atti di adesiones where FK_accordoQuadro = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttiDiAdesioneModelImpl</code>.
	 * </p>
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param start the lower bound of the range of atti di adesiones
	 * @param end the upper bound of the range of atti di adesiones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching atti di adesiones
	 */
	public static List<AttiDiAdesione> findByAccordoQuadro(
		long FK_accordoQuadro, int start, int end,
		OrderByComparator<AttiDiAdesione> orderByComparator) {

		return getPersistence().findByAccordoQuadro(
			FK_accordoQuadro, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the atti di adesiones where FK_accordoQuadro = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttiDiAdesioneModelImpl</code>.
	 * </p>
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param start the lower bound of the range of atti di adesiones
	 * @param end the upper bound of the range of atti di adesiones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching atti di adesiones
	 */
	public static List<AttiDiAdesione> findByAccordoQuadro(
		long FK_accordoQuadro, int start, int end,
		OrderByComparator<AttiDiAdesione> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByAccordoQuadro(
			FK_accordoQuadro, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first atti di adesione in the ordered set where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching atti di adesione
	 * @throws NoSuchAttiDiAdesioneException if a matching atti di adesione could not be found
	 */
	public static AttiDiAdesione findByAccordoQuadro_First(
			long FK_accordoQuadro,
			OrderByComparator<AttiDiAdesione> orderByComparator)
		throws servicebuilder.exception.NoSuchAttiDiAdesioneException {

		return getPersistence().findByAccordoQuadro_First(
			FK_accordoQuadro, orderByComparator);
	}

	/**
	 * Returns the first atti di adesione in the ordered set where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching atti di adesione, or <code>null</code> if a matching atti di adesione could not be found
	 */
	public static AttiDiAdesione fetchByAccordoQuadro_First(
		long FK_accordoQuadro,
		OrderByComparator<AttiDiAdesione> orderByComparator) {

		return getPersistence().fetchByAccordoQuadro_First(
			FK_accordoQuadro, orderByComparator);
	}

	/**
	 * Returns the last atti di adesione in the ordered set where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching atti di adesione
	 * @throws NoSuchAttiDiAdesioneException if a matching atti di adesione could not be found
	 */
	public static AttiDiAdesione findByAccordoQuadro_Last(
			long FK_accordoQuadro,
			OrderByComparator<AttiDiAdesione> orderByComparator)
		throws servicebuilder.exception.NoSuchAttiDiAdesioneException {

		return getPersistence().findByAccordoQuadro_Last(
			FK_accordoQuadro, orderByComparator);
	}

	/**
	 * Returns the last atti di adesione in the ordered set where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching atti di adesione, or <code>null</code> if a matching atti di adesione could not be found
	 */
	public static AttiDiAdesione fetchByAccordoQuadro_Last(
		long FK_accordoQuadro,
		OrderByComparator<AttiDiAdesione> orderByComparator) {

		return getPersistence().fetchByAccordoQuadro_Last(
			FK_accordoQuadro, orderByComparator);
	}

	/**
	 * Returns the atti di adesiones before and after the current atti di adesione in the ordered set where FK_accordoQuadro = &#63;.
	 *
	 * @param Id_AttiDiAdesione the primary key of the current atti di adesione
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next atti di adesione
	 * @throws NoSuchAttiDiAdesioneException if a atti di adesione with the primary key could not be found
	 */
	public static AttiDiAdesione[] findByAccordoQuadro_PrevAndNext(
			long Id_AttiDiAdesione, long FK_accordoQuadro,
			OrderByComparator<AttiDiAdesione> orderByComparator)
		throws servicebuilder.exception.NoSuchAttiDiAdesioneException {

		return getPersistence().findByAccordoQuadro_PrevAndNext(
			Id_AttiDiAdesione, FK_accordoQuadro, orderByComparator);
	}

	/**
	 * Removes all the atti di adesiones where FK_accordoQuadro = &#63; from the database.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 */
	public static void removeByAccordoQuadro(long FK_accordoQuadro) {
		getPersistence().removeByAccordoQuadro(FK_accordoQuadro);
	}

	/**
	 * Returns the number of atti di adesiones where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @return the number of matching atti di adesiones
	 */
	public static int countByAccordoQuadro(long FK_accordoQuadro) {
		return getPersistence().countByAccordoQuadro(FK_accordoQuadro);
	}

	/**
	 * Caches the atti di adesione in the entity cache if it is enabled.
	 *
	 * @param attiDiAdesione the atti di adesione
	 */
	public static void cacheResult(AttiDiAdesione attiDiAdesione) {
		getPersistence().cacheResult(attiDiAdesione);
	}

	/**
	 * Caches the atti di adesiones in the entity cache if it is enabled.
	 *
	 * @param attiDiAdesiones the atti di adesiones
	 */
	public static void cacheResult(List<AttiDiAdesione> attiDiAdesiones) {
		getPersistence().cacheResult(attiDiAdesiones);
	}

	/**
	 * Creates a new atti di adesione with the primary key. Does not add the atti di adesione to the database.
	 *
	 * @param Id_AttiDiAdesione the primary key for the new atti di adesione
	 * @return the new atti di adesione
	 */
	public static AttiDiAdesione create(long Id_AttiDiAdesione) {
		return getPersistence().create(Id_AttiDiAdesione);
	}

	/**
	 * Removes the atti di adesione with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_AttiDiAdesione the primary key of the atti di adesione
	 * @return the atti di adesione that was removed
	 * @throws NoSuchAttiDiAdesioneException if a atti di adesione with the primary key could not be found
	 */
	public static AttiDiAdesione remove(long Id_AttiDiAdesione)
		throws servicebuilder.exception.NoSuchAttiDiAdesioneException {

		return getPersistence().remove(Id_AttiDiAdesione);
	}

	public static AttiDiAdesione updateImpl(AttiDiAdesione attiDiAdesione) {
		return getPersistence().updateImpl(attiDiAdesione);
	}

	/**
	 * Returns the atti di adesione with the primary key or throws a <code>NoSuchAttiDiAdesioneException</code> if it could not be found.
	 *
	 * @param Id_AttiDiAdesione the primary key of the atti di adesione
	 * @return the atti di adesione
	 * @throws NoSuchAttiDiAdesioneException if a atti di adesione with the primary key could not be found
	 */
	public static AttiDiAdesione findByPrimaryKey(long Id_AttiDiAdesione)
		throws servicebuilder.exception.NoSuchAttiDiAdesioneException {

		return getPersistence().findByPrimaryKey(Id_AttiDiAdesione);
	}

	/**
	 * Returns the atti di adesione with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_AttiDiAdesione the primary key of the atti di adesione
	 * @return the atti di adesione, or <code>null</code> if a atti di adesione with the primary key could not be found
	 */
	public static AttiDiAdesione fetchByPrimaryKey(long Id_AttiDiAdesione) {
		return getPersistence().fetchByPrimaryKey(Id_AttiDiAdesione);
	}

	/**
	 * Returns all the atti di adesiones.
	 *
	 * @return the atti di adesiones
	 */
	public static List<AttiDiAdesione> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the atti di adesiones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttiDiAdesioneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of atti di adesiones
	 * @param end the upper bound of the range of atti di adesiones (not inclusive)
	 * @return the range of atti di adesiones
	 */
	public static List<AttiDiAdesione> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the atti di adesiones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttiDiAdesioneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of atti di adesiones
	 * @param end the upper bound of the range of atti di adesiones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of atti di adesiones
	 */
	public static List<AttiDiAdesione> findAll(
		int start, int end,
		OrderByComparator<AttiDiAdesione> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the atti di adesiones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttiDiAdesioneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of atti di adesiones
	 * @param end the upper bound of the range of atti di adesiones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of atti di adesiones
	 */
	public static List<AttiDiAdesione> findAll(
		int start, int end, OrderByComparator<AttiDiAdesione> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the atti di adesiones from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of atti di adesiones.
	 *
	 * @return the number of atti di adesiones
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttiDiAdesionePersistence getPersistence() {
		return _persistence;
	}

	private static volatile AttiDiAdesionePersistence _persistence;

}