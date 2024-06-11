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

import servicebuilder.model.StatoAvanzamentoLavori;

/**
 * The persistence utility for the stato avanzamento lavori service. This utility wraps <code>servicebuilder.service.persistence.impl.StatoAvanzamentoLavoriPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StatoAvanzamentoLavoriPersistence
 * @generated
 */
public class StatoAvanzamentoLavoriUtil {

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
		StatoAvanzamentoLavori statoAvanzamentoLavori) {

		getPersistence().clearCache(statoAvanzamentoLavori);
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
	public static Map<Serializable, StatoAvanzamentoLavori> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<StatoAvanzamentoLavori> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<StatoAvanzamentoLavori> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<StatoAvanzamentoLavori> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<StatoAvanzamentoLavori> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static StatoAvanzamentoLavori update(
		StatoAvanzamentoLavori statoAvanzamentoLavori) {

		return getPersistence().update(statoAvanzamentoLavori);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static StatoAvanzamentoLavori update(
		StatoAvanzamentoLavori statoAvanzamentoLavori,
		ServiceContext serviceContext) {

		return getPersistence().update(statoAvanzamentoLavori, serviceContext);
	}

	/**
	 * Caches the stato avanzamento lavori in the entity cache if it is enabled.
	 *
	 * @param statoAvanzamentoLavori the stato avanzamento lavori
	 */
	public static void cacheResult(
		StatoAvanzamentoLavori statoAvanzamentoLavori) {

		getPersistence().cacheResult(statoAvanzamentoLavori);
	}

	/**
	 * Caches the stato avanzamento lavoris in the entity cache if it is enabled.
	 *
	 * @param statoAvanzamentoLavoris the stato avanzamento lavoris
	 */
	public static void cacheResult(
		List<StatoAvanzamentoLavori> statoAvanzamentoLavoris) {

		getPersistence().cacheResult(statoAvanzamentoLavoris);
	}

	/**
	 * Creates a new stato avanzamento lavori with the primary key. Does not add the stato avanzamento lavori to the database.
	 *
	 * @param Id_SAL the primary key for the new stato avanzamento lavori
	 * @return the new stato avanzamento lavori
	 */
	public static StatoAvanzamentoLavori create(long Id_SAL) {
		return getPersistence().create(Id_SAL);
	}

	/**
	 * Removes the stato avanzamento lavori with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_SAL the primary key of the stato avanzamento lavori
	 * @return the stato avanzamento lavori that was removed
	 * @throws NoSuchStatoAvanzamentoLavoriException if a stato avanzamento lavori with the primary key could not be found
	 */
	public static StatoAvanzamentoLavori remove(long Id_SAL)
		throws servicebuilder.exception.NoSuchStatoAvanzamentoLavoriException {

		return getPersistence().remove(Id_SAL);
	}

	public static StatoAvanzamentoLavori updateImpl(
		StatoAvanzamentoLavori statoAvanzamentoLavori) {

		return getPersistence().updateImpl(statoAvanzamentoLavori);
	}

	/**
	 * Returns the stato avanzamento lavori with the primary key or throws a <code>NoSuchStatoAvanzamentoLavoriException</code> if it could not be found.
	 *
	 * @param Id_SAL the primary key of the stato avanzamento lavori
	 * @return the stato avanzamento lavori
	 * @throws NoSuchStatoAvanzamentoLavoriException if a stato avanzamento lavori with the primary key could not be found
	 */
	public static StatoAvanzamentoLavori findByPrimaryKey(long Id_SAL)
		throws servicebuilder.exception.NoSuchStatoAvanzamentoLavoriException {

		return getPersistence().findByPrimaryKey(Id_SAL);
	}

	/**
	 * Returns the stato avanzamento lavori with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_SAL the primary key of the stato avanzamento lavori
	 * @return the stato avanzamento lavori, or <code>null</code> if a stato avanzamento lavori with the primary key could not be found
	 */
	public static StatoAvanzamentoLavori fetchByPrimaryKey(long Id_SAL) {
		return getPersistence().fetchByPrimaryKey(Id_SAL);
	}

	/**
	 * Returns all the stato avanzamento lavoris.
	 *
	 * @return the stato avanzamento lavoris
	 */
	public static List<StatoAvanzamentoLavori> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the stato avanzamento lavoris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatoAvanzamentoLavoriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of stato avanzamento lavoris
	 * @param end the upper bound of the range of stato avanzamento lavoris (not inclusive)
	 * @return the range of stato avanzamento lavoris
	 */
	public static List<StatoAvanzamentoLavori> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the stato avanzamento lavoris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatoAvanzamentoLavoriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of stato avanzamento lavoris
	 * @param end the upper bound of the range of stato avanzamento lavoris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of stato avanzamento lavoris
	 */
	public static List<StatoAvanzamentoLavori> findAll(
		int start, int end,
		OrderByComparator<StatoAvanzamentoLavori> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the stato avanzamento lavoris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatoAvanzamentoLavoriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of stato avanzamento lavoris
	 * @param end the upper bound of the range of stato avanzamento lavoris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of stato avanzamento lavoris
	 */
	public static List<StatoAvanzamentoLavori> findAll(
		int start, int end,
		OrderByComparator<StatoAvanzamentoLavori> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the stato avanzamento lavoris from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of stato avanzamento lavoris.
	 *
	 * @return the number of stato avanzamento lavoris
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static StatoAvanzamentoLavoriPersistence getPersistence() {
		return _persistence;
	}

	private static volatile StatoAvanzamentoLavoriPersistence _persistence;

}