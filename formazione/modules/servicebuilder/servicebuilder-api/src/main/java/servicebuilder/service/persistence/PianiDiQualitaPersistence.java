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

import org.osgi.annotation.versioning.ProviderType;

import servicebuilder.exception.NoSuchPianiDiQualitaException;

import servicebuilder.model.PianiDiQualita;

/**
 * The persistence interface for the piani di qualita service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianiDiQualitaUtil
 * @generated
 */
@ProviderType
public interface PianiDiQualitaPersistence
	extends BasePersistence<PianiDiQualita> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PianiDiQualitaUtil} to access the piani di qualita persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the piani di qualita in the entity cache if it is enabled.
	 *
	 * @param pianiDiQualita the piani di qualita
	 */
	public void cacheResult(PianiDiQualita pianiDiQualita);

	/**
	 * Caches the piani di qualitas in the entity cache if it is enabled.
	 *
	 * @param pianiDiQualitas the piani di qualitas
	 */
	public void cacheResult(java.util.List<PianiDiQualita> pianiDiQualitas);

	/**
	 * Creates a new piani di qualita with the primary key. Does not add the piani di qualita to the database.
	 *
	 * @param Id_PianiDiQualita the primary key for the new piani di qualita
	 * @return the new piani di qualita
	 */
	public PianiDiQualita create(long Id_PianiDiQualita);

	/**
	 * Removes the piani di qualita with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_PianiDiQualita the primary key of the piani di qualita
	 * @return the piani di qualita that was removed
	 * @throws NoSuchPianiDiQualitaException if a piani di qualita with the primary key could not be found
	 */
	public PianiDiQualita remove(long Id_PianiDiQualita)
		throws NoSuchPianiDiQualitaException;

	public PianiDiQualita updateImpl(PianiDiQualita pianiDiQualita);

	/**
	 * Returns the piani di qualita with the primary key or throws a <code>NoSuchPianiDiQualitaException</code> if it could not be found.
	 *
	 * @param Id_PianiDiQualita the primary key of the piani di qualita
	 * @return the piani di qualita
	 * @throws NoSuchPianiDiQualitaException if a piani di qualita with the primary key could not be found
	 */
	public PianiDiQualita findByPrimaryKey(long Id_PianiDiQualita)
		throws NoSuchPianiDiQualitaException;

	/**
	 * Returns the piani di qualita with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_PianiDiQualita the primary key of the piani di qualita
	 * @return the piani di qualita, or <code>null</code> if a piani di qualita with the primary key could not be found
	 */
	public PianiDiQualita fetchByPrimaryKey(long Id_PianiDiQualita);

	/**
	 * Returns all the piani di qualitas.
	 *
	 * @return the piani di qualitas
	 */
	public java.util.List<PianiDiQualita> findAll();

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
	public java.util.List<PianiDiQualita> findAll(int start, int end);

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
	public java.util.List<PianiDiQualita> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PianiDiQualita>
			orderByComparator);

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
	public java.util.List<PianiDiQualita> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PianiDiQualita>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the piani di qualitas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of piani di qualitas.
	 *
	 * @return the number of piani di qualitas
	 */
	public int countAll();

}