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

import servicebuilder.exception.NoSuchPianiDeiRischiException;

import servicebuilder.model.PianiDeiRischi;

/**
 * The persistence interface for the piani dei rischi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianiDeiRischiUtil
 * @generated
 */
@ProviderType
public interface PianiDeiRischiPersistence
	extends BasePersistence<PianiDeiRischi> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PianiDeiRischiUtil} to access the piani dei rischi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the piani dei rischi in the entity cache if it is enabled.
	 *
	 * @param pianiDeiRischi the piani dei rischi
	 */
	public void cacheResult(PianiDeiRischi pianiDeiRischi);

	/**
	 * Caches the piani dei rischis in the entity cache if it is enabled.
	 *
	 * @param pianiDeiRischis the piani dei rischis
	 */
	public void cacheResult(java.util.List<PianiDeiRischi> pianiDeiRischis);

	/**
	 * Creates a new piani dei rischi with the primary key. Does not add the piani dei rischi to the database.
	 *
	 * @param Id_PianiDeiRischi the primary key for the new piani dei rischi
	 * @return the new piani dei rischi
	 */
	public PianiDeiRischi create(long Id_PianiDeiRischi);

	/**
	 * Removes the piani dei rischi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_PianiDeiRischi the primary key of the piani dei rischi
	 * @return the piani dei rischi that was removed
	 * @throws NoSuchPianiDeiRischiException if a piani dei rischi with the primary key could not be found
	 */
	public PianiDeiRischi remove(long Id_PianiDeiRischi)
		throws NoSuchPianiDeiRischiException;

	public PianiDeiRischi updateImpl(PianiDeiRischi pianiDeiRischi);

	/**
	 * Returns the piani dei rischi with the primary key or throws a <code>NoSuchPianiDeiRischiException</code> if it could not be found.
	 *
	 * @param Id_PianiDeiRischi the primary key of the piani dei rischi
	 * @return the piani dei rischi
	 * @throws NoSuchPianiDeiRischiException if a piani dei rischi with the primary key could not be found
	 */
	public PianiDeiRischi findByPrimaryKey(long Id_PianiDeiRischi)
		throws NoSuchPianiDeiRischiException;

	/**
	 * Returns the piani dei rischi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_PianiDeiRischi the primary key of the piani dei rischi
	 * @return the piani dei rischi, or <code>null</code> if a piani dei rischi with the primary key could not be found
	 */
	public PianiDeiRischi fetchByPrimaryKey(long Id_PianiDeiRischi);

	/**
	 * Returns all the piani dei rischis.
	 *
	 * @return the piani dei rischis
	 */
	public java.util.List<PianiDeiRischi> findAll();

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
	public java.util.List<PianiDeiRischi> findAll(int start, int end);

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
	public java.util.List<PianiDeiRischi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PianiDeiRischi>
			orderByComparator);

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
	public java.util.List<PianiDeiRischi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PianiDeiRischi>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the piani dei rischis from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of piani dei rischis.
	 *
	 * @return the number of piani dei rischis
	 */
	public int countAll();

}