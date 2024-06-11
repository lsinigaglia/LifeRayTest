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

import servicebuilder.exception.NoSuchPianoStatoRelException;

import servicebuilder.model.PianoStatoRel;

/**
 * The persistence interface for the piano stato rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianoStatoRelUtil
 * @generated
 */
@ProviderType
public interface PianoStatoRelPersistence
	extends BasePersistence<PianoStatoRel> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PianoStatoRelUtil} to access the piano stato rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the piano stato rel in the entity cache if it is enabled.
	 *
	 * @param pianoStatoRel the piano stato rel
	 */
	public void cacheResult(PianoStatoRel pianoStatoRel);

	/**
	 * Caches the piano stato rels in the entity cache if it is enabled.
	 *
	 * @param pianoStatoRels the piano stato rels
	 */
	public void cacheResult(java.util.List<PianoStatoRel> pianoStatoRels);

	/**
	 * Creates a new piano stato rel with the primary key. Does not add the piano stato rel to the database.
	 *
	 * @param Id_Relazione the primary key for the new piano stato rel
	 * @return the new piano stato rel
	 */
	public PianoStatoRel create(long Id_Relazione);

	/**
	 * Removes the piano stato rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_Relazione the primary key of the piano stato rel
	 * @return the piano stato rel that was removed
	 * @throws NoSuchPianoStatoRelException if a piano stato rel with the primary key could not be found
	 */
	public PianoStatoRel remove(long Id_Relazione)
		throws NoSuchPianoStatoRelException;

	public PianoStatoRel updateImpl(PianoStatoRel pianoStatoRel);

	/**
	 * Returns the piano stato rel with the primary key or throws a <code>NoSuchPianoStatoRelException</code> if it could not be found.
	 *
	 * @param Id_Relazione the primary key of the piano stato rel
	 * @return the piano stato rel
	 * @throws NoSuchPianoStatoRelException if a piano stato rel with the primary key could not be found
	 */
	public PianoStatoRel findByPrimaryKey(long Id_Relazione)
		throws NoSuchPianoStatoRelException;

	/**
	 * Returns the piano stato rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_Relazione the primary key of the piano stato rel
	 * @return the piano stato rel, or <code>null</code> if a piano stato rel with the primary key could not be found
	 */
	public PianoStatoRel fetchByPrimaryKey(long Id_Relazione);

	/**
	 * Returns all the piano stato rels.
	 *
	 * @return the piano stato rels
	 */
	public java.util.List<PianoStatoRel> findAll();

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
	public java.util.List<PianoStatoRel> findAll(int start, int end);

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
	public java.util.List<PianoStatoRel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PianoStatoRel>
			orderByComparator);

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
	public java.util.List<PianoStatoRel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PianoStatoRel>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the piano stato rels from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of piano stato rels.
	 *
	 * @return the number of piano stato rels
	 */
	public int countAll();

}