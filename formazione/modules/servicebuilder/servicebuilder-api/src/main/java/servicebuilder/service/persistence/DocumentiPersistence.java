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

import servicebuilder.exception.NoSuchDocumentiException;

import servicebuilder.model.Documenti;

/**
 * The persistence interface for the documenti service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DocumentiUtil
 * @generated
 */
@ProviderType
public interface DocumentiPersistence extends BasePersistence<Documenti> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DocumentiUtil} to access the documenti persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the documenti in the entity cache if it is enabled.
	 *
	 * @param documenti the documenti
	 */
	public void cacheResult(Documenti documenti);

	/**
	 * Caches the documentis in the entity cache if it is enabled.
	 *
	 * @param documentis the documentis
	 */
	public void cacheResult(java.util.List<Documenti> documentis);

	/**
	 * Creates a new documenti with the primary key. Does not add the documenti to the database.
	 *
	 * @param CodiceDocumento the primary key for the new documenti
	 * @return the new documenti
	 */
	public Documenti create(String CodiceDocumento);

	/**
	 * Removes the documenti with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CodiceDocumento the primary key of the documenti
	 * @return the documenti that was removed
	 * @throws NoSuchDocumentiException if a documenti with the primary key could not be found
	 */
	public Documenti remove(String CodiceDocumento)
		throws NoSuchDocumentiException;

	public Documenti updateImpl(Documenti documenti);

	/**
	 * Returns the documenti with the primary key or throws a <code>NoSuchDocumentiException</code> if it could not be found.
	 *
	 * @param CodiceDocumento the primary key of the documenti
	 * @return the documenti
	 * @throws NoSuchDocumentiException if a documenti with the primary key could not be found
	 */
	public Documenti findByPrimaryKey(String CodiceDocumento)
		throws NoSuchDocumentiException;

	/**
	 * Returns the documenti with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CodiceDocumento the primary key of the documenti
	 * @return the documenti, or <code>null</code> if a documenti with the primary key could not be found
	 */
	public Documenti fetchByPrimaryKey(String CodiceDocumento);

	/**
	 * Returns all the documentis.
	 *
	 * @return the documentis
	 */
	public java.util.List<Documenti> findAll();

	/**
	 * Returns a range of all the documentis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documentis
	 * @param end the upper bound of the range of documentis (not inclusive)
	 * @return the range of documentis
	 */
	public java.util.List<Documenti> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the documentis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documentis
	 * @param end the upper bound of the range of documentis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of documentis
	 */
	public java.util.List<Documenti> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Documenti>
			orderByComparator);

	/**
	 * Returns an ordered range of all the documentis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documentis
	 * @param end the upper bound of the range of documentis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of documentis
	 */
	public java.util.List<Documenti> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Documenti>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the documentis from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of documentis.
	 *
	 * @return the number of documentis
	 */
	public int countAll();

}