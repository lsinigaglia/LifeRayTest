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

import servicebuilder.exception.NoSuchProgettiFabbisogniException;

import servicebuilder.model.ProgettiFabbisogni;

/**
 * The persistence interface for the progetti fabbisogni service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProgettiFabbisogniUtil
 * @generated
 */
@ProviderType
public interface ProgettiFabbisogniPersistence
	extends BasePersistence<ProgettiFabbisogni> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProgettiFabbisogniUtil} to access the progetti fabbisogni persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the progetti fabbisognis where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @return the matching progetti fabbisognis
	 */
	public java.util.List<ProgettiFabbisogni> findByPianiFabbisogni(
		long FK_pianiFabbisogni);

	/**
	 * Returns a range of all the progetti fabbisognis where FK_pianiFabbisogni = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @return the range of matching progetti fabbisognis
	 */
	public java.util.List<ProgettiFabbisogni> findByPianiFabbisogni(
		long FK_pianiFabbisogni, int start, int end);

	/**
	 * Returns an ordered range of all the progetti fabbisognis where FK_pianiFabbisogni = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching progetti fabbisognis
	 */
	public java.util.List<ProgettiFabbisogni> findByPianiFabbisogni(
		long FK_pianiFabbisogni, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProgettiFabbisogni>
			orderByComparator);

	/**
	 * Returns an ordered range of all the progetti fabbisognis where FK_pianiFabbisogni = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching progetti fabbisognis
	 */
	public java.util.List<ProgettiFabbisogni> findByPianiFabbisogni(
		long FK_pianiFabbisogni, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProgettiFabbisogni>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first progetti fabbisogni in the ordered set where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching progetti fabbisogni
	 * @throws NoSuchProgettiFabbisogniException if a matching progetti fabbisogni could not be found
	 */
	public ProgettiFabbisogni findByPianiFabbisogni_First(
			long FK_pianiFabbisogni,
			com.liferay.portal.kernel.util.OrderByComparator<ProgettiFabbisogni>
				orderByComparator)
		throws NoSuchProgettiFabbisogniException;

	/**
	 * Returns the first progetti fabbisogni in the ordered set where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching progetti fabbisogni, or <code>null</code> if a matching progetti fabbisogni could not be found
	 */
	public ProgettiFabbisogni fetchByPianiFabbisogni_First(
		long FK_pianiFabbisogni,
		com.liferay.portal.kernel.util.OrderByComparator<ProgettiFabbisogni>
			orderByComparator);

	/**
	 * Returns the last progetti fabbisogni in the ordered set where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching progetti fabbisogni
	 * @throws NoSuchProgettiFabbisogniException if a matching progetti fabbisogni could not be found
	 */
	public ProgettiFabbisogni findByPianiFabbisogni_Last(
			long FK_pianiFabbisogni,
			com.liferay.portal.kernel.util.OrderByComparator<ProgettiFabbisogni>
				orderByComparator)
		throws NoSuchProgettiFabbisogniException;

	/**
	 * Returns the last progetti fabbisogni in the ordered set where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching progetti fabbisogni, or <code>null</code> if a matching progetti fabbisogni could not be found
	 */
	public ProgettiFabbisogni fetchByPianiFabbisogni_Last(
		long FK_pianiFabbisogni,
		com.liferay.portal.kernel.util.OrderByComparator<ProgettiFabbisogni>
			orderByComparator);

	/**
	 * Returns the progetti fabbisognis before and after the current progetti fabbisogni in the ordered set where FK_pianiFabbisogni = &#63;.
	 *
	 * @param Id_ProgettiFabbisogni the primary key of the current progetti fabbisogni
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next progetti fabbisogni
	 * @throws NoSuchProgettiFabbisogniException if a progetti fabbisogni with the primary key could not be found
	 */
	public ProgettiFabbisogni[] findByPianiFabbisogni_PrevAndNext(
			long Id_ProgettiFabbisogni, long FK_pianiFabbisogni,
			com.liferay.portal.kernel.util.OrderByComparator<ProgettiFabbisogni>
				orderByComparator)
		throws NoSuchProgettiFabbisogniException;

	/**
	 * Removes all the progetti fabbisognis where FK_pianiFabbisogni = &#63; from the database.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 */
	public void removeByPianiFabbisogni(long FK_pianiFabbisogni);

	/**
	 * Returns the number of progetti fabbisognis where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @return the number of matching progetti fabbisognis
	 */
	public int countByPianiFabbisogni(long FK_pianiFabbisogni);

	/**
	 * Caches the progetti fabbisogni in the entity cache if it is enabled.
	 *
	 * @param progettiFabbisogni the progetti fabbisogni
	 */
	public void cacheResult(ProgettiFabbisogni progettiFabbisogni);

	/**
	 * Caches the progetti fabbisognis in the entity cache if it is enabled.
	 *
	 * @param progettiFabbisognis the progetti fabbisognis
	 */
	public void cacheResult(
		java.util.List<ProgettiFabbisogni> progettiFabbisognis);

	/**
	 * Creates a new progetti fabbisogni with the primary key. Does not add the progetti fabbisogni to the database.
	 *
	 * @param Id_ProgettiFabbisogni the primary key for the new progetti fabbisogni
	 * @return the new progetti fabbisogni
	 */
	public ProgettiFabbisogni create(long Id_ProgettiFabbisogni);

	/**
	 * Removes the progetti fabbisogni with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_ProgettiFabbisogni the primary key of the progetti fabbisogni
	 * @return the progetti fabbisogni that was removed
	 * @throws NoSuchProgettiFabbisogniException if a progetti fabbisogni with the primary key could not be found
	 */
	public ProgettiFabbisogni remove(long Id_ProgettiFabbisogni)
		throws NoSuchProgettiFabbisogniException;

	public ProgettiFabbisogni updateImpl(ProgettiFabbisogni progettiFabbisogni);

	/**
	 * Returns the progetti fabbisogni with the primary key or throws a <code>NoSuchProgettiFabbisogniException</code> if it could not be found.
	 *
	 * @param Id_ProgettiFabbisogni the primary key of the progetti fabbisogni
	 * @return the progetti fabbisogni
	 * @throws NoSuchProgettiFabbisogniException if a progetti fabbisogni with the primary key could not be found
	 */
	public ProgettiFabbisogni findByPrimaryKey(long Id_ProgettiFabbisogni)
		throws NoSuchProgettiFabbisogniException;

	/**
	 * Returns the progetti fabbisogni with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_ProgettiFabbisogni the primary key of the progetti fabbisogni
	 * @return the progetti fabbisogni, or <code>null</code> if a progetti fabbisogni with the primary key could not be found
	 */
	public ProgettiFabbisogni fetchByPrimaryKey(long Id_ProgettiFabbisogni);

	/**
	 * Returns all the progetti fabbisognis.
	 *
	 * @return the progetti fabbisognis
	 */
	public java.util.List<ProgettiFabbisogni> findAll();

	/**
	 * Returns a range of all the progetti fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @return the range of progetti fabbisognis
	 */
	public java.util.List<ProgettiFabbisogni> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the progetti fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of progetti fabbisognis
	 */
	public java.util.List<ProgettiFabbisogni> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProgettiFabbisogni>
			orderByComparator);

	/**
	 * Returns an ordered range of all the progetti fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of progetti fabbisognis
	 */
	public java.util.List<ProgettiFabbisogni> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProgettiFabbisogni>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the progetti fabbisognis from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of progetti fabbisognis.
	 *
	 * @return the number of progetti fabbisognis
	 */
	public int countAll();

}