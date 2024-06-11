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

import servicebuilder.exception.NoSuchPianiDiLavoroObiettivoException;

import servicebuilder.model.PianiDiLavoroObiettivo;

/**
 * The persistence interface for the piani di lavoro obiettivo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianiDiLavoroObiettivoUtil
 * @generated
 */
@ProviderType
public interface PianiDiLavoroObiettivoPersistence
	extends BasePersistence<PianiDiLavoroObiettivo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PianiDiLavoroObiettivoUtil} to access the piani di lavoro obiettivo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the piani di lavoro obiettivos where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @return the matching piani di lavoro obiettivos
	 */
	public java.util.List<PianiDiLavoroObiettivo> findByProgettiFabbisogni(
		long FK_progettiFabbisogni);

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
	public java.util.List<PianiDiLavoroObiettivo> findByProgettiFabbisogni(
		long FK_progettiFabbisogni, int start, int end);

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
	public java.util.List<PianiDiLavoroObiettivo> findByProgettiFabbisogni(
		long FK_progettiFabbisogni, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PianiDiLavoroObiettivo>
			orderByComparator);

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
	public java.util.List<PianiDiLavoroObiettivo> findByProgettiFabbisogni(
		long FK_progettiFabbisogni, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PianiDiLavoroObiettivo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first piani di lavoro obiettivo in the ordered set where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching piani di lavoro obiettivo
	 * @throws NoSuchPianiDiLavoroObiettivoException if a matching piani di lavoro obiettivo could not be found
	 */
	public PianiDiLavoroObiettivo findByProgettiFabbisogni_First(
			long FK_progettiFabbisogni,
			com.liferay.portal.kernel.util.OrderByComparator
				<PianiDiLavoroObiettivo> orderByComparator)
		throws NoSuchPianiDiLavoroObiettivoException;

	/**
	 * Returns the first piani di lavoro obiettivo in the ordered set where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching piani di lavoro obiettivo, or <code>null</code> if a matching piani di lavoro obiettivo could not be found
	 */
	public PianiDiLavoroObiettivo fetchByProgettiFabbisogni_First(
		long FK_progettiFabbisogni,
		com.liferay.portal.kernel.util.OrderByComparator<PianiDiLavoroObiettivo>
			orderByComparator);

	/**
	 * Returns the last piani di lavoro obiettivo in the ordered set where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching piani di lavoro obiettivo
	 * @throws NoSuchPianiDiLavoroObiettivoException if a matching piani di lavoro obiettivo could not be found
	 */
	public PianiDiLavoroObiettivo findByProgettiFabbisogni_Last(
			long FK_progettiFabbisogni,
			com.liferay.portal.kernel.util.OrderByComparator
				<PianiDiLavoroObiettivo> orderByComparator)
		throws NoSuchPianiDiLavoroObiettivoException;

	/**
	 * Returns the last piani di lavoro obiettivo in the ordered set where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching piani di lavoro obiettivo, or <code>null</code> if a matching piani di lavoro obiettivo could not be found
	 */
	public PianiDiLavoroObiettivo fetchByProgettiFabbisogni_Last(
		long FK_progettiFabbisogni,
		com.liferay.portal.kernel.util.OrderByComparator<PianiDiLavoroObiettivo>
			orderByComparator);

	/**
	 * Returns the piani di lavoro obiettivos before and after the current piani di lavoro obiettivo in the ordered set where FK_progettiFabbisogni = &#63;.
	 *
	 * @param Id_PianoDiLavoro the primary key of the current piani di lavoro obiettivo
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next piani di lavoro obiettivo
	 * @throws NoSuchPianiDiLavoroObiettivoException if a piani di lavoro obiettivo with the primary key could not be found
	 */
	public PianiDiLavoroObiettivo[] findByProgettiFabbisogni_PrevAndNext(
			long Id_PianoDiLavoro, long FK_progettiFabbisogni,
			com.liferay.portal.kernel.util.OrderByComparator
				<PianiDiLavoroObiettivo> orderByComparator)
		throws NoSuchPianiDiLavoroObiettivoException;

	/**
	 * Removes all the piani di lavoro obiettivos where FK_progettiFabbisogni = &#63; from the database.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 */
	public void removeByProgettiFabbisogni(long FK_progettiFabbisogni);

	/**
	 * Returns the number of piani di lavoro obiettivos where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @return the number of matching piani di lavoro obiettivos
	 */
	public int countByProgettiFabbisogni(long FK_progettiFabbisogni);

	/**
	 * Caches the piani di lavoro obiettivo in the entity cache if it is enabled.
	 *
	 * @param pianiDiLavoroObiettivo the piani di lavoro obiettivo
	 */
	public void cacheResult(PianiDiLavoroObiettivo pianiDiLavoroObiettivo);

	/**
	 * Caches the piani di lavoro obiettivos in the entity cache if it is enabled.
	 *
	 * @param pianiDiLavoroObiettivos the piani di lavoro obiettivos
	 */
	public void cacheResult(
		java.util.List<PianiDiLavoroObiettivo> pianiDiLavoroObiettivos);

	/**
	 * Creates a new piani di lavoro obiettivo with the primary key. Does not add the piani di lavoro obiettivo to the database.
	 *
	 * @param Id_PianoDiLavoro the primary key for the new piani di lavoro obiettivo
	 * @return the new piani di lavoro obiettivo
	 */
	public PianiDiLavoroObiettivo create(long Id_PianoDiLavoro);

	/**
	 * Removes the piani di lavoro obiettivo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_PianoDiLavoro the primary key of the piani di lavoro obiettivo
	 * @return the piani di lavoro obiettivo that was removed
	 * @throws NoSuchPianiDiLavoroObiettivoException if a piani di lavoro obiettivo with the primary key could not be found
	 */
	public PianiDiLavoroObiettivo remove(long Id_PianoDiLavoro)
		throws NoSuchPianiDiLavoroObiettivoException;

	public PianiDiLavoroObiettivo updateImpl(
		PianiDiLavoroObiettivo pianiDiLavoroObiettivo);

	/**
	 * Returns the piani di lavoro obiettivo with the primary key or throws a <code>NoSuchPianiDiLavoroObiettivoException</code> if it could not be found.
	 *
	 * @param Id_PianoDiLavoro the primary key of the piani di lavoro obiettivo
	 * @return the piani di lavoro obiettivo
	 * @throws NoSuchPianiDiLavoroObiettivoException if a piani di lavoro obiettivo with the primary key could not be found
	 */
	public PianiDiLavoroObiettivo findByPrimaryKey(long Id_PianoDiLavoro)
		throws NoSuchPianiDiLavoroObiettivoException;

	/**
	 * Returns the piani di lavoro obiettivo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_PianoDiLavoro the primary key of the piani di lavoro obiettivo
	 * @return the piani di lavoro obiettivo, or <code>null</code> if a piani di lavoro obiettivo with the primary key could not be found
	 */
	public PianiDiLavoroObiettivo fetchByPrimaryKey(long Id_PianoDiLavoro);

	/**
	 * Returns all the piani di lavoro obiettivos.
	 *
	 * @return the piani di lavoro obiettivos
	 */
	public java.util.List<PianiDiLavoroObiettivo> findAll();

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
	public java.util.List<PianiDiLavoroObiettivo> findAll(int start, int end);

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
	public java.util.List<PianiDiLavoroObiettivo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PianiDiLavoroObiettivo>
			orderByComparator);

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
	public java.util.List<PianiDiLavoroObiettivo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PianiDiLavoroObiettivo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the piani di lavoro obiettivos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of piani di lavoro obiettivos.
	 *
	 * @return the number of piani di lavoro obiettivos
	 */
	public int countAll();

}