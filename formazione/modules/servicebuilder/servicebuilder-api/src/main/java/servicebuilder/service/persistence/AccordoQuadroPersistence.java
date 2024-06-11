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

import servicebuilder.exception.NoSuchAccordoQuadroException;

import servicebuilder.model.AccordoQuadro;

/**
 * The persistence interface for the accordo quadro service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccordoQuadroUtil
 * @generated
 */
@ProviderType
public interface AccordoQuadroPersistence
	extends BasePersistence<AccordoQuadro> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccordoQuadroUtil} to access the accordo quadro persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the accordo quadro in the entity cache if it is enabled.
	 *
	 * @param accordoQuadro the accordo quadro
	 */
	public void cacheResult(AccordoQuadro accordoQuadro);

	/**
	 * Caches the accordo quadros in the entity cache if it is enabled.
	 *
	 * @param accordoQuadros the accordo quadros
	 */
	public void cacheResult(java.util.List<AccordoQuadro> accordoQuadros);

	/**
	 * Creates a new accordo quadro with the primary key. Does not add the accordo quadro to the database.
	 *
	 * @param Id_AccordoQuadro the primary key for the new accordo quadro
	 * @return the new accordo quadro
	 */
	public AccordoQuadro create(long Id_AccordoQuadro);

	/**
	 * Removes the accordo quadro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_AccordoQuadro the primary key of the accordo quadro
	 * @return the accordo quadro that was removed
	 * @throws NoSuchAccordoQuadroException if a accordo quadro with the primary key could not be found
	 */
	public AccordoQuadro remove(long Id_AccordoQuadro)
		throws NoSuchAccordoQuadroException;

	public AccordoQuadro updateImpl(AccordoQuadro accordoQuadro);

	/**
	 * Returns the accordo quadro with the primary key or throws a <code>NoSuchAccordoQuadroException</code> if it could not be found.
	 *
	 * @param Id_AccordoQuadro the primary key of the accordo quadro
	 * @return the accordo quadro
	 * @throws NoSuchAccordoQuadroException if a accordo quadro with the primary key could not be found
	 */
	public AccordoQuadro findByPrimaryKey(long Id_AccordoQuadro)
		throws NoSuchAccordoQuadroException;

	/**
	 * Returns the accordo quadro with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_AccordoQuadro the primary key of the accordo quadro
	 * @return the accordo quadro, or <code>null</code> if a accordo quadro with the primary key could not be found
	 */
	public AccordoQuadro fetchByPrimaryKey(long Id_AccordoQuadro);

	/**
	 * Returns all the accordo quadros.
	 *
	 * @return the accordo quadros
	 */
	public java.util.List<AccordoQuadro> findAll();

	/**
	 * Returns a range of all the accordo quadros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccordoQuadroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of accordo quadros
	 * @param end the upper bound of the range of accordo quadros (not inclusive)
	 * @return the range of accordo quadros
	 */
	public java.util.List<AccordoQuadro> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the accordo quadros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccordoQuadroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of accordo quadros
	 * @param end the upper bound of the range of accordo quadros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of accordo quadros
	 */
	public java.util.List<AccordoQuadro> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccordoQuadro>
			orderByComparator);

	/**
	 * Returns an ordered range of all the accordo quadros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccordoQuadroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of accordo quadros
	 * @param end the upper bound of the range of accordo quadros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of accordo quadros
	 */
	public java.util.List<AccordoQuadro> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccordoQuadro>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the accordo quadros from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of accordo quadros.
	 *
	 * @return the number of accordo quadros
	 */
	public int countAll();

}