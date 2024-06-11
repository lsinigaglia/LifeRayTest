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

import servicebuilder.model.PianiDiLavoroObiettivo;

/**
 * The persistence utility for the piani di lavoro obiettivo service. This utility wraps <code>servicebuilder.service.persistence.impl.PianiDiLavoroObiettivoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianiDiLavoroObiettivoPersistence
 * @generated
 */
public class PianiDiLavoroObiettivoUtil {

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
	public static void clearCache(
		PianiDiLavoroObiettivo pianiDiLavoroObiettivo) {

		getPersistence().clearCache(pianiDiLavoroObiettivo);
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
	public static Map<Serializable, PianiDiLavoroObiettivo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PianiDiLavoroObiettivo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PianiDiLavoroObiettivo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PianiDiLavoroObiettivo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PianiDiLavoroObiettivo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PianiDiLavoroObiettivo update(
		PianiDiLavoroObiettivo pianiDiLavoroObiettivo) {

		return getPersistence().update(pianiDiLavoroObiettivo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PianiDiLavoroObiettivo update(
		PianiDiLavoroObiettivo pianiDiLavoroObiettivo,
		ServiceContext serviceContext) {

		return getPersistence().update(pianiDiLavoroObiettivo, serviceContext);
	}

	/**
	 * Returns all the piani di lavoro obiettivos where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @return the matching piani di lavoro obiettivos
	 */
	public static List<PianiDiLavoroObiettivo> findByProgettiFabbisogni(
		long FK_progettiFabbisogni) {

		return getPersistence().findByProgettiFabbisogni(FK_progettiFabbisogni);
	}

	/**
	 * Returns a range of all the piani di lavoro obiettivos where FK_progettiFabbisogni = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiLavoroObiettivoModelImpl</code>.
	 * </p>
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param start the lower bound of the range of piani di lavoro obiettivos
	 * @param end the upper bound of the range of piani di lavoro obiettivos (not inclusive)
	 * @return the range of matching piani di lavoro obiettivos
	 */
	public static List<PianiDiLavoroObiettivo> findByProgettiFabbisogni(
		long FK_progettiFabbisogni, int start, int end) {

		return getPersistence().findByProgettiFabbisogni(
			FK_progettiFabbisogni, start, end);
	}

	/**
	 * Returns an ordered range of all the piani di lavoro obiettivos where FK_progettiFabbisogni = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiLavoroObiettivoModelImpl</code>.
	 * </p>
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param start the lower bound of the range of piani di lavoro obiettivos
	 * @param end the upper bound of the range of piani di lavoro obiettivos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching piani di lavoro obiettivos
	 */
	public static List<PianiDiLavoroObiettivo> findByProgettiFabbisogni(
		long FK_progettiFabbisogni, int start, int end,
		OrderByComparator<PianiDiLavoroObiettivo> orderByComparator) {

		return getPersistence().findByProgettiFabbisogni(
			FK_progettiFabbisogni, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the piani di lavoro obiettivos where FK_progettiFabbisogni = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiLavoroObiettivoModelImpl</code>.
	 * </p>
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param start the lower bound of the range of piani di lavoro obiettivos
	 * @param end the upper bound of the range of piani di lavoro obiettivos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching piani di lavoro obiettivos
	 */
	public static List<PianiDiLavoroObiettivo> findByProgettiFabbisogni(
		long FK_progettiFabbisogni, int start, int end,
		OrderByComparator<PianiDiLavoroObiettivo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByProgettiFabbisogni(
			FK_progettiFabbisogni, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first piani di lavoro obiettivo in the ordered set where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching piani di lavoro obiettivo
	 * @throws NoSuchPianiDiLavoroObiettivoException if a matching piani di lavoro obiettivo could not be found
	 */
	public static PianiDiLavoroObiettivo findByProgettiFabbisogni_First(
			long FK_progettiFabbisogni,
			OrderByComparator<PianiDiLavoroObiettivo> orderByComparator)
		throws servicebuilder.exception.NoSuchPianiDiLavoroObiettivoException {

		return getPersistence().findByProgettiFabbisogni_First(
			FK_progettiFabbisogni, orderByComparator);
	}

	/**
	 * Returns the first piani di lavoro obiettivo in the ordered set where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching piani di lavoro obiettivo, or <code>null</code> if a matching piani di lavoro obiettivo could not be found
	 */
	public static PianiDiLavoroObiettivo fetchByProgettiFabbisogni_First(
		long FK_progettiFabbisogni,
		OrderByComparator<PianiDiLavoroObiettivo> orderByComparator) {

		return getPersistence().fetchByProgettiFabbisogni_First(
			FK_progettiFabbisogni, orderByComparator);
	}

	/**
	 * Returns the last piani di lavoro obiettivo in the ordered set where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching piani di lavoro obiettivo
	 * @throws NoSuchPianiDiLavoroObiettivoException if a matching piani di lavoro obiettivo could not be found
	 */
	public static PianiDiLavoroObiettivo findByProgettiFabbisogni_Last(
			long FK_progettiFabbisogni,
			OrderByComparator<PianiDiLavoroObiettivo> orderByComparator)
		throws servicebuilder.exception.NoSuchPianiDiLavoroObiettivoException {

		return getPersistence().findByProgettiFabbisogni_Last(
			FK_progettiFabbisogni, orderByComparator);
	}

	/**
	 * Returns the last piani di lavoro obiettivo in the ordered set where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching piani di lavoro obiettivo, or <code>null</code> if a matching piani di lavoro obiettivo could not be found
	 */
	public static PianiDiLavoroObiettivo fetchByProgettiFabbisogni_Last(
		long FK_progettiFabbisogni,
		OrderByComparator<PianiDiLavoroObiettivo> orderByComparator) {

		return getPersistence().fetchByProgettiFabbisogni_Last(
			FK_progettiFabbisogni, orderByComparator);
	}

	/**
	 * Returns the piani di lavoro obiettivos before and after the current piani di lavoro obiettivo in the ordered set where FK_progettiFabbisogni = &#63;.
	 *
	 * @param Id_PianoDiLavoro the primary key of the current piani di lavoro obiettivo
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next piani di lavoro obiettivo
	 * @throws NoSuchPianiDiLavoroObiettivoException if a piani di lavoro obiettivo with the primary key could not be found
	 */
	public static PianiDiLavoroObiettivo[] findByProgettiFabbisogni_PrevAndNext(
			long Id_PianoDiLavoro, long FK_progettiFabbisogni,
			OrderByComparator<PianiDiLavoroObiettivo> orderByComparator)
		throws servicebuilder.exception.NoSuchPianiDiLavoroObiettivoException {

		return getPersistence().findByProgettiFabbisogni_PrevAndNext(
			Id_PianoDiLavoro, FK_progettiFabbisogni, orderByComparator);
	}

	/**
	 * Removes all the piani di lavoro obiettivos where FK_progettiFabbisogni = &#63; from the database.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 */
	public static void removeByProgettiFabbisogni(long FK_progettiFabbisogni) {
		getPersistence().removeByProgettiFabbisogni(FK_progettiFabbisogni);
	}

	/**
	 * Returns the number of piani di lavoro obiettivos where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @return the number of matching piani di lavoro obiettivos
	 */
	public static int countByProgettiFabbisogni(long FK_progettiFabbisogni) {
		return getPersistence().countByProgettiFabbisogni(
			FK_progettiFabbisogni);
	}

	/**
	 * Caches the piani di lavoro obiettivo in the entity cache if it is enabled.
	 *
	 * @param pianiDiLavoroObiettivo the piani di lavoro obiettivo
	 */
	public static void cacheResult(
		PianiDiLavoroObiettivo pianiDiLavoroObiettivo) {

		getPersistence().cacheResult(pianiDiLavoroObiettivo);
	}

	/**
	 * Caches the piani di lavoro obiettivos in the entity cache if it is enabled.
	 *
	 * @param pianiDiLavoroObiettivos the piani di lavoro obiettivos
	 */
	public static void cacheResult(
		List<PianiDiLavoroObiettivo> pianiDiLavoroObiettivos) {

		getPersistence().cacheResult(pianiDiLavoroObiettivos);
	}

	/**
	 * Creates a new piani di lavoro obiettivo with the primary key. Does not add the piani di lavoro obiettivo to the database.
	 *
	 * @param Id_PianoDiLavoro the primary key for the new piani di lavoro obiettivo
	 * @return the new piani di lavoro obiettivo
	 */
	public static PianiDiLavoroObiettivo create(long Id_PianoDiLavoro) {
		return getPersistence().create(Id_PianoDiLavoro);
	}

	/**
	 * Removes the piani di lavoro obiettivo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_PianoDiLavoro the primary key of the piani di lavoro obiettivo
	 * @return the piani di lavoro obiettivo that was removed
	 * @throws NoSuchPianiDiLavoroObiettivoException if a piani di lavoro obiettivo with the primary key could not be found
	 */
	public static PianiDiLavoroObiettivo remove(long Id_PianoDiLavoro)
		throws servicebuilder.exception.NoSuchPianiDiLavoroObiettivoException {

		return getPersistence().remove(Id_PianoDiLavoro);
	}

	public static PianiDiLavoroObiettivo updateImpl(
		PianiDiLavoroObiettivo pianiDiLavoroObiettivo) {

		return getPersistence().updateImpl(pianiDiLavoroObiettivo);
	}

	/**
	 * Returns the piani di lavoro obiettivo with the primary key or throws a <code>NoSuchPianiDiLavoroObiettivoException</code> if it could not be found.
	 *
	 * @param Id_PianoDiLavoro the primary key of the piani di lavoro obiettivo
	 * @return the piani di lavoro obiettivo
	 * @throws NoSuchPianiDiLavoroObiettivoException if a piani di lavoro obiettivo with the primary key could not be found
	 */
	public static PianiDiLavoroObiettivo findByPrimaryKey(long Id_PianoDiLavoro)
		throws servicebuilder.exception.NoSuchPianiDiLavoroObiettivoException {

		return getPersistence().findByPrimaryKey(Id_PianoDiLavoro);
	}

	/**
	 * Returns the piani di lavoro obiettivo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_PianoDiLavoro the primary key of the piani di lavoro obiettivo
	 * @return the piani di lavoro obiettivo, or <code>null</code> if a piani di lavoro obiettivo with the primary key could not be found
	 */
	public static PianiDiLavoroObiettivo fetchByPrimaryKey(
		long Id_PianoDiLavoro) {

		return getPersistence().fetchByPrimaryKey(Id_PianoDiLavoro);
	}

	/**
	 * Returns all the piani di lavoro obiettivos.
	 *
	 * @return the piani di lavoro obiettivos
	 */
	public static List<PianiDiLavoroObiettivo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the piani di lavoro obiettivos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiLavoroObiettivoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani di lavoro obiettivos
	 * @param end the upper bound of the range of piani di lavoro obiettivos (not inclusive)
	 * @return the range of piani di lavoro obiettivos
	 */
	public static List<PianiDiLavoroObiettivo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the piani di lavoro obiettivos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiLavoroObiettivoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani di lavoro obiettivos
	 * @param end the upper bound of the range of piani di lavoro obiettivos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of piani di lavoro obiettivos
	 */
	public static List<PianiDiLavoroObiettivo> findAll(
		int start, int end,
		OrderByComparator<PianiDiLavoroObiettivo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the piani di lavoro obiettivos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiLavoroObiettivoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani di lavoro obiettivos
	 * @param end the upper bound of the range of piani di lavoro obiettivos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of piani di lavoro obiettivos
	 */
	public static List<PianiDiLavoroObiettivo> findAll(
		int start, int end,
		OrderByComparator<PianiDiLavoroObiettivo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the piani di lavoro obiettivos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of piani di lavoro obiettivos.
	 *
	 * @return the number of piani di lavoro obiettivos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PianiDiLavoroObiettivoPersistence getPersistence() {
		return _persistence;
	}

	private static volatile PianiDiLavoroObiettivoPersistence _persistence;

}