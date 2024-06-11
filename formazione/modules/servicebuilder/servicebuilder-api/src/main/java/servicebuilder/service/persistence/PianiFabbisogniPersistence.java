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

import servicebuilder.exception.NoSuchPianiFabbisogniException;

import servicebuilder.model.PianiFabbisogni;

/**
 * The persistence interface for the piani fabbisogni service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianiFabbisogniUtil
 * @generated
 */
@ProviderType
public interface PianiFabbisogniPersistence
	extends BasePersistence<PianiFabbisogni> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PianiFabbisogniUtil} to access the piani fabbisogni persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the piani fabbisognis where FK_attiDiAdesione = &#63;.
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @return the matching piani fabbisognis
	 */
	public java.util.List<PianiFabbisogni> findByAttiDiAdesione(
		long FK_attiDiAdesione);

	/**
	 * Returns a range of all the piani fabbisognis where FK_attiDiAdesione = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @param start the lower bound of the range of piani fabbisognis
	 * @param end the upper bound of the range of piani fabbisognis (not inclusive)
	 * @return the range of matching piani fabbisognis
	 */
	public java.util.List<PianiFabbisogni> findByAttiDiAdesione(
		long FK_attiDiAdesione, int start, int end);

	/**
	 * Returns an ordered range of all the piani fabbisognis where FK_attiDiAdesione = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @param start the lower bound of the range of piani fabbisognis
	 * @param end the upper bound of the range of piani fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching piani fabbisognis
	 */
	public java.util.List<PianiFabbisogni> findByAttiDiAdesione(
		long FK_attiDiAdesione, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PianiFabbisogni>
			orderByComparator);

	/**
	 * Returns an ordered range of all the piani fabbisognis where FK_attiDiAdesione = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @param start the lower bound of the range of piani fabbisognis
	 * @param end the upper bound of the range of piani fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching piani fabbisognis
	 */
	public java.util.List<PianiFabbisogni> findByAttiDiAdesione(
		long FK_attiDiAdesione, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PianiFabbisogni>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first piani fabbisogni in the ordered set where FK_attiDiAdesione = &#63;.
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching piani fabbisogni
	 * @throws NoSuchPianiFabbisogniException if a matching piani fabbisogni could not be found
	 */
	public PianiFabbisogni findByAttiDiAdesione_First(
			long FK_attiDiAdesione,
			com.liferay.portal.kernel.util.OrderByComparator<PianiFabbisogni>
				orderByComparator)
		throws NoSuchPianiFabbisogniException;

	/**
	 * Returns the first piani fabbisogni in the ordered set where FK_attiDiAdesione = &#63;.
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching piani fabbisogni, or <code>null</code> if a matching piani fabbisogni could not be found
	 */
	public PianiFabbisogni fetchByAttiDiAdesione_First(
		long FK_attiDiAdesione,
		com.liferay.portal.kernel.util.OrderByComparator<PianiFabbisogni>
			orderByComparator);

	/**
	 * Returns the last piani fabbisogni in the ordered set where FK_attiDiAdesione = &#63;.
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching piani fabbisogni
	 * @throws NoSuchPianiFabbisogniException if a matching piani fabbisogni could not be found
	 */
	public PianiFabbisogni findByAttiDiAdesione_Last(
			long FK_attiDiAdesione,
			com.liferay.portal.kernel.util.OrderByComparator<PianiFabbisogni>
				orderByComparator)
		throws NoSuchPianiFabbisogniException;

	/**
	 * Returns the last piani fabbisogni in the ordered set where FK_attiDiAdesione = &#63;.
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching piani fabbisogni, or <code>null</code> if a matching piani fabbisogni could not be found
	 */
	public PianiFabbisogni fetchByAttiDiAdesione_Last(
		long FK_attiDiAdesione,
		com.liferay.portal.kernel.util.OrderByComparator<PianiFabbisogni>
			orderByComparator);

	/**
	 * Returns the piani fabbisognis before and after the current piani fabbisogni in the ordered set where FK_attiDiAdesione = &#63;.
	 *
	 * @param Id_PianiFabbisogni the primary key of the current piani fabbisogni
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next piani fabbisogni
	 * @throws NoSuchPianiFabbisogniException if a piani fabbisogni with the primary key could not be found
	 */
	public PianiFabbisogni[] findByAttiDiAdesione_PrevAndNext(
			long Id_PianiFabbisogni, long FK_attiDiAdesione,
			com.liferay.portal.kernel.util.OrderByComparator<PianiFabbisogni>
				orderByComparator)
		throws NoSuchPianiFabbisogniException;

	/**
	 * Removes all the piani fabbisognis where FK_attiDiAdesione = &#63; from the database.
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 */
	public void removeByAttiDiAdesione(long FK_attiDiAdesione);

	/**
	 * Returns the number of piani fabbisognis where FK_attiDiAdesione = &#63;.
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione
	 * @return the number of matching piani fabbisognis
	 */
	public int countByAttiDiAdesione(long FK_attiDiAdesione);

	/**
	 * Caches the piani fabbisogni in the entity cache if it is enabled.
	 *
	 * @param pianiFabbisogni the piani fabbisogni
	 */
	public void cacheResult(PianiFabbisogni pianiFabbisogni);

	/**
	 * Caches the piani fabbisognis in the entity cache if it is enabled.
	 *
	 * @param pianiFabbisognis the piani fabbisognis
	 */
	public void cacheResult(java.util.List<PianiFabbisogni> pianiFabbisognis);

	/**
	 * Creates a new piani fabbisogni with the primary key. Does not add the piani fabbisogni to the database.
	 *
	 * @param Id_PianiFabbisogni the primary key for the new piani fabbisogni
	 * @return the new piani fabbisogni
	 */
	public PianiFabbisogni create(long Id_PianiFabbisogni);

	/**
	 * Removes the piani fabbisogni with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_PianiFabbisogni the primary key of the piani fabbisogni
	 * @return the piani fabbisogni that was removed
	 * @throws NoSuchPianiFabbisogniException if a piani fabbisogni with the primary key could not be found
	 */
	public PianiFabbisogni remove(long Id_PianiFabbisogni)
		throws NoSuchPianiFabbisogniException;

	public PianiFabbisogni updateImpl(PianiFabbisogni pianiFabbisogni);

	/**
	 * Returns the piani fabbisogni with the primary key or throws a <code>NoSuchPianiFabbisogniException</code> if it could not be found.
	 *
	 * @param Id_PianiFabbisogni the primary key of the piani fabbisogni
	 * @return the piani fabbisogni
	 * @throws NoSuchPianiFabbisogniException if a piani fabbisogni with the primary key could not be found
	 */
	public PianiFabbisogni findByPrimaryKey(long Id_PianiFabbisogni)
		throws NoSuchPianiFabbisogniException;

	/**
	 * Returns the piani fabbisogni with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_PianiFabbisogni the primary key of the piani fabbisogni
	 * @return the piani fabbisogni, or <code>null</code> if a piani fabbisogni with the primary key could not be found
	 */
	public PianiFabbisogni fetchByPrimaryKey(long Id_PianiFabbisogni);

	/**
	 * Returns all the piani fabbisognis.
	 *
	 * @return the piani fabbisognis
	 */
	public java.util.List<PianiFabbisogni> findAll();

	/**
	 * Returns a range of all the piani fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani fabbisognis
	 * @param end the upper bound of the range of piani fabbisognis (not inclusive)
	 * @return the range of piani fabbisognis
	 */
	public java.util.List<PianiFabbisogni> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the piani fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani fabbisognis
	 * @param end the upper bound of the range of piani fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of piani fabbisognis
	 */
	public java.util.List<PianiFabbisogni> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PianiFabbisogni>
			orderByComparator);

	/**
	 * Returns an ordered range of all the piani fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani fabbisognis
	 * @param end the upper bound of the range of piani fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of piani fabbisognis
	 */
	public java.util.List<PianiFabbisogni> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PianiFabbisogni>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the piani fabbisognis from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of piani fabbisognis.
	 *
	 * @return the number of piani fabbisognis
	 */
	public int countAll();

}