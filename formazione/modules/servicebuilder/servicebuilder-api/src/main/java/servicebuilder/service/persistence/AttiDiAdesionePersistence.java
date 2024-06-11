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

import servicebuilder.exception.NoSuchAttiDiAdesioneException;

import servicebuilder.model.AttiDiAdesione;

/**
 * The persistence interface for the atti di adesione service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttiDiAdesioneUtil
 * @generated
 */
@ProviderType
public interface AttiDiAdesionePersistence
	extends BasePersistence<AttiDiAdesione> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttiDiAdesioneUtil} to access the atti di adesione persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the atti di adesiones where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @return the matching atti di adesiones
	 */
	public java.util.List<AttiDiAdesione> findByAccordoQuadro(
		long FK_accordoQuadro);

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
	public java.util.List<AttiDiAdesione> findByAccordoQuadro(
		long FK_accordoQuadro, int start, int end);

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
	public java.util.List<AttiDiAdesione> findByAccordoQuadro(
		long FK_accordoQuadro, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AttiDiAdesione>
			orderByComparator);

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
	public java.util.List<AttiDiAdesione> findByAccordoQuadro(
		long FK_accordoQuadro, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AttiDiAdesione>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first atti di adesione in the ordered set where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching atti di adesione
	 * @throws NoSuchAttiDiAdesioneException if a matching atti di adesione could not be found
	 */
	public AttiDiAdesione findByAccordoQuadro_First(
			long FK_accordoQuadro,
			com.liferay.portal.kernel.util.OrderByComparator<AttiDiAdesione>
				orderByComparator)
		throws NoSuchAttiDiAdesioneException;

	/**
	 * Returns the first atti di adesione in the ordered set where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching atti di adesione, or <code>null</code> if a matching atti di adesione could not be found
	 */
	public AttiDiAdesione fetchByAccordoQuadro_First(
		long FK_accordoQuadro,
		com.liferay.portal.kernel.util.OrderByComparator<AttiDiAdesione>
			orderByComparator);

	/**
	 * Returns the last atti di adesione in the ordered set where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching atti di adesione
	 * @throws NoSuchAttiDiAdesioneException if a matching atti di adesione could not be found
	 */
	public AttiDiAdesione findByAccordoQuadro_Last(
			long FK_accordoQuadro,
			com.liferay.portal.kernel.util.OrderByComparator<AttiDiAdesione>
				orderByComparator)
		throws NoSuchAttiDiAdesioneException;

	/**
	 * Returns the last atti di adesione in the ordered set where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching atti di adesione, or <code>null</code> if a matching atti di adesione could not be found
	 */
	public AttiDiAdesione fetchByAccordoQuadro_Last(
		long FK_accordoQuadro,
		com.liferay.portal.kernel.util.OrderByComparator<AttiDiAdesione>
			orderByComparator);

	/**
	 * Returns the atti di adesiones before and after the current atti di adesione in the ordered set where FK_accordoQuadro = &#63;.
	 *
	 * @param Id_AttiDiAdesione the primary key of the current atti di adesione
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next atti di adesione
	 * @throws NoSuchAttiDiAdesioneException if a atti di adesione with the primary key could not be found
	 */
	public AttiDiAdesione[] findByAccordoQuadro_PrevAndNext(
			long Id_AttiDiAdesione, long FK_accordoQuadro,
			com.liferay.portal.kernel.util.OrderByComparator<AttiDiAdesione>
				orderByComparator)
		throws NoSuchAttiDiAdesioneException;

	/**
	 * Removes all the atti di adesiones where FK_accordoQuadro = &#63; from the database.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 */
	public void removeByAccordoQuadro(long FK_accordoQuadro);

	/**
	 * Returns the number of atti di adesiones where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @return the number of matching atti di adesiones
	 */
	public int countByAccordoQuadro(long FK_accordoQuadro);

	/**
	 * Caches the atti di adesione in the entity cache if it is enabled.
	 *
	 * @param attiDiAdesione the atti di adesione
	 */
	public void cacheResult(AttiDiAdesione attiDiAdesione);

	/**
	 * Caches the atti di adesiones in the entity cache if it is enabled.
	 *
	 * @param attiDiAdesiones the atti di adesiones
	 */
	public void cacheResult(java.util.List<AttiDiAdesione> attiDiAdesiones);

	/**
	 * Creates a new atti di adesione with the primary key. Does not add the atti di adesione to the database.
	 *
	 * @param Id_AttiDiAdesione the primary key for the new atti di adesione
	 * @return the new atti di adesione
	 */
	public AttiDiAdesione create(long Id_AttiDiAdesione);

	/**
	 * Removes the atti di adesione with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_AttiDiAdesione the primary key of the atti di adesione
	 * @return the atti di adesione that was removed
	 * @throws NoSuchAttiDiAdesioneException if a atti di adesione with the primary key could not be found
	 */
	public AttiDiAdesione remove(long Id_AttiDiAdesione)
		throws NoSuchAttiDiAdesioneException;

	public AttiDiAdesione updateImpl(AttiDiAdesione attiDiAdesione);

	/**
	 * Returns the atti di adesione with the primary key or throws a <code>NoSuchAttiDiAdesioneException</code> if it could not be found.
	 *
	 * @param Id_AttiDiAdesione the primary key of the atti di adesione
	 * @return the atti di adesione
	 * @throws NoSuchAttiDiAdesioneException if a atti di adesione with the primary key could not be found
	 */
	public AttiDiAdesione findByPrimaryKey(long Id_AttiDiAdesione)
		throws NoSuchAttiDiAdesioneException;

	/**
	 * Returns the atti di adesione with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_AttiDiAdesione the primary key of the atti di adesione
	 * @return the atti di adesione, or <code>null</code> if a atti di adesione with the primary key could not be found
	 */
	public AttiDiAdesione fetchByPrimaryKey(long Id_AttiDiAdesione);

	/**
	 * Returns all the atti di adesiones.
	 *
	 * @return the atti di adesiones
	 */
	public java.util.List<AttiDiAdesione> findAll();

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
	public java.util.List<AttiDiAdesione> findAll(int start, int end);

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
	public java.util.List<AttiDiAdesione> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AttiDiAdesione>
			orderByComparator);

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
	public java.util.List<AttiDiAdesione> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AttiDiAdesione>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the atti di adesiones from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of atti di adesiones.
	 *
	 * @return the number of atti di adesiones
	 */
	public int countAll();

}