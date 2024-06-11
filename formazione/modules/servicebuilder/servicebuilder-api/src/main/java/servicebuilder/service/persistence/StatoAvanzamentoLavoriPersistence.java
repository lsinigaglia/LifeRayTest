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

import servicebuilder.exception.NoSuchStatoAvanzamentoLavoriException;

import servicebuilder.model.StatoAvanzamentoLavori;

/**
 * The persistence interface for the stato avanzamento lavori service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StatoAvanzamentoLavoriUtil
 * @generated
 */
@ProviderType
public interface StatoAvanzamentoLavoriPersistence
	extends BasePersistence<StatoAvanzamentoLavori> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StatoAvanzamentoLavoriUtil} to access the stato avanzamento lavori persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the stato avanzamento lavori in the entity cache if it is enabled.
	 *
	 * @param statoAvanzamentoLavori the stato avanzamento lavori
	 */
	public void cacheResult(StatoAvanzamentoLavori statoAvanzamentoLavori);

	/**
	 * Caches the stato avanzamento lavoris in the entity cache if it is enabled.
	 *
	 * @param statoAvanzamentoLavoris the stato avanzamento lavoris
	 */
	public void cacheResult(
		java.util.List<StatoAvanzamentoLavori> statoAvanzamentoLavoris);

	/**
	 * Creates a new stato avanzamento lavori with the primary key. Does not add the stato avanzamento lavori to the database.
	 *
	 * @param Id_SAL the primary key for the new stato avanzamento lavori
	 * @return the new stato avanzamento lavori
	 */
	public StatoAvanzamentoLavori create(long Id_SAL);

	/**
	 * Removes the stato avanzamento lavori with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_SAL the primary key of the stato avanzamento lavori
	 * @return the stato avanzamento lavori that was removed
	 * @throws NoSuchStatoAvanzamentoLavoriException if a stato avanzamento lavori with the primary key could not be found
	 */
	public StatoAvanzamentoLavori remove(long Id_SAL)
		throws NoSuchStatoAvanzamentoLavoriException;

	public StatoAvanzamentoLavori updateImpl(
		StatoAvanzamentoLavori statoAvanzamentoLavori);

	/**
	 * Returns the stato avanzamento lavori with the primary key or throws a <code>NoSuchStatoAvanzamentoLavoriException</code> if it could not be found.
	 *
	 * @param Id_SAL the primary key of the stato avanzamento lavori
	 * @return the stato avanzamento lavori
	 * @throws NoSuchStatoAvanzamentoLavoriException if a stato avanzamento lavori with the primary key could not be found
	 */
	public StatoAvanzamentoLavori findByPrimaryKey(long Id_SAL)
		throws NoSuchStatoAvanzamentoLavoriException;

	/**
	 * Returns the stato avanzamento lavori with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_SAL the primary key of the stato avanzamento lavori
	 * @return the stato avanzamento lavori, or <code>null</code> if a stato avanzamento lavori with the primary key could not be found
	 */
	public StatoAvanzamentoLavori fetchByPrimaryKey(long Id_SAL);

	/**
	 * Returns all the stato avanzamento lavoris.
	 *
	 * @return the stato avanzamento lavoris
	 */
	public java.util.List<StatoAvanzamentoLavori> findAll();

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
	public java.util.List<StatoAvanzamentoLavori> findAll(int start, int end);

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
	public java.util.List<StatoAvanzamentoLavori> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StatoAvanzamentoLavori>
			orderByComparator);

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
	public java.util.List<StatoAvanzamentoLavori> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<StatoAvanzamentoLavori>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the stato avanzamento lavoris from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of stato avanzamento lavoris.
	 *
	 * @return the number of stato avanzamento lavoris
	 */
	public int countAll();

}