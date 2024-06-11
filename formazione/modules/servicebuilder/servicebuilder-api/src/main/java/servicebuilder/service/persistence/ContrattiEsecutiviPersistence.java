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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;

import servicebuilder.exception.NoSuchContrattiEsecutiviException;

import servicebuilder.model.ContrattiEsecutivi;

/**
 * The persistence interface for the contratti esecutivi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContrattiEsecutiviUtil
 * @generated
 */
@ProviderType
public interface ContrattiEsecutiviPersistence
	extends BasePersistence<ContrattiEsecutivi> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ContrattiEsecutiviUtil} to access the contratti esecutivi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the contratti esecutivi in the entity cache if it is enabled.
	 *
	 * @param contrattiEsecutivi the contratti esecutivi
	 */
	public void cacheResult(ContrattiEsecutivi contrattiEsecutivi);

	/**
	 * Caches the contratti esecutivis in the entity cache if it is enabled.
	 *
	 * @param contrattiEsecutivis the contratti esecutivis
	 */
	public void cacheResult(
		java.util.List<ContrattiEsecutivi> contrattiEsecutivis);

	/**
	 * Creates a new contratti esecutivi with the primary key. Does not add the contratti esecutivi to the database.
	 *
	 * @param contrattiEsecutiviPK the primary key for the new contratti esecutivi
	 * @return the new contratti esecutivi
	 */
	public ContrattiEsecutivi create(
		servicebuilder.service.persistence.ContrattiEsecutiviPK
			contrattiEsecutiviPK);

	/**
	 * Removes the contratti esecutivi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contrattiEsecutiviPK the primary key of the contratti esecutivi
	 * @return the contratti esecutivi that was removed
	 * @throws NoSuchContrattiEsecutiviException if a contratti esecutivi with the primary key could not be found
	 */
	public ContrattiEsecutivi remove(
			servicebuilder.service.persistence.ContrattiEsecutiviPK
				contrattiEsecutiviPK)
		throws NoSuchContrattiEsecutiviException;

	public ContrattiEsecutivi updateImpl(ContrattiEsecutivi contrattiEsecutivi);

	/**
	 * Returns the contratti esecutivi with the primary key or throws a <code>NoSuchContrattiEsecutiviException</code> if it could not be found.
	 *
	 * @param contrattiEsecutiviPK the primary key of the contratti esecutivi
	 * @return the contratti esecutivi
	 * @throws NoSuchContrattiEsecutiviException if a contratti esecutivi with the primary key could not be found
	 */
	public ContrattiEsecutivi findByPrimaryKey(
			servicebuilder.service.persistence.ContrattiEsecutiviPK
				contrattiEsecutiviPK)
		throws NoSuchContrattiEsecutiviException;

	/**
	 * Returns the contratti esecutivi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contrattiEsecutiviPK the primary key of the contratti esecutivi
	 * @return the contratti esecutivi, or <code>null</code> if a contratti esecutivi with the primary key could not be found
	 */
	public ContrattiEsecutivi fetchByPrimaryKey(
		servicebuilder.service.persistence.ContrattiEsecutiviPK
			contrattiEsecutiviPK);

	/**
	 * Returns all the contratti esecutivis.
	 *
	 * @return the contratti esecutivis
	 */
	public java.util.List<ContrattiEsecutivi> findAll();

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
	public java.util.List<ContrattiEsecutivi> findAll(int start, int end);

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
	public java.util.List<ContrattiEsecutivi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContrattiEsecutivi>
			orderByComparator);

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
	public java.util.List<ContrattiEsecutivi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContrattiEsecutivi>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the contratti esecutivis from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of contratti esecutivis.
	 *
	 * @return the number of contratti esecutivis
	 */
	public int countAll();

	public Set<String> getCompoundPKColumnNames();

}