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

import servicebuilder.exception.NoSuchPianiSubentroException;

import servicebuilder.model.PianiSubentro;

/**
 * The persistence interface for the piani subentro service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianiSubentroUtil
 * @generated
 */
@ProviderType
public interface PianiSubentroPersistence
	extends BasePersistence<PianiSubentro> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PianiSubentroUtil} to access the piani subentro persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the piani subentro in the entity cache if it is enabled.
	 *
	 * @param pianiSubentro the piani subentro
	 */
	public void cacheResult(PianiSubentro pianiSubentro);

	/**
	 * Caches the piani subentros in the entity cache if it is enabled.
	 *
	 * @param pianiSubentros the piani subentros
	 */
	public void cacheResult(java.util.List<PianiSubentro> pianiSubentros);

	/**
	 * Creates a new piani subentro with the primary key. Does not add the piani subentro to the database.
	 *
	 * @param Id_PianiSubentro the primary key for the new piani subentro
	 * @return the new piani subentro
	 */
	public PianiSubentro create(long Id_PianiSubentro);

	/**
	 * Removes the piani subentro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_PianiSubentro the primary key of the piani subentro
	 * @return the piani subentro that was removed
	 * @throws NoSuchPianiSubentroException if a piani subentro with the primary key could not be found
	 */
	public PianiSubentro remove(long Id_PianiSubentro)
		throws NoSuchPianiSubentroException;

	public PianiSubentro updateImpl(PianiSubentro pianiSubentro);

	/**
	 * Returns the piani subentro with the primary key or throws a <code>NoSuchPianiSubentroException</code> if it could not be found.
	 *
	 * @param Id_PianiSubentro the primary key of the piani subentro
	 * @return the piani subentro
	 * @throws NoSuchPianiSubentroException if a piani subentro with the primary key could not be found
	 */
	public PianiSubentro findByPrimaryKey(long Id_PianiSubentro)
		throws NoSuchPianiSubentroException;

	/**
	 * Returns the piani subentro with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_PianiSubentro the primary key of the piani subentro
	 * @return the piani subentro, or <code>null</code> if a piani subentro with the primary key could not be found
	 */
	public PianiSubentro fetchByPrimaryKey(long Id_PianiSubentro);

	/**
	 * Returns all the piani subentros.
	 *
	 * @return the piani subentros
	 */
	public java.util.List<PianiSubentro> findAll();

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
	public java.util.List<PianiSubentro> findAll(int start, int end);

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
	public java.util.List<PianiSubentro> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PianiSubentro>
			orderByComparator);

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
	public java.util.List<PianiSubentro> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PianiSubentro>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the piani subentros from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of piani subentros.
	 *
	 * @return the number of piani subentros
	 */
	public int countAll();

}