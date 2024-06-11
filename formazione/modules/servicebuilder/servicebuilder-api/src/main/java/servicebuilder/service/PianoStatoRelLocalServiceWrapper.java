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

package servicebuilder.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PianoStatoRelLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PianoStatoRelLocalService
 * @generated
 */
public class PianoStatoRelLocalServiceWrapper
	implements PianoStatoRelLocalService,
			   ServiceWrapper<PianoStatoRelLocalService> {

	public PianoStatoRelLocalServiceWrapper() {
		this(null);
	}

	public PianoStatoRelLocalServiceWrapper(
		PianoStatoRelLocalService pianoStatoRelLocalService) {

		_pianoStatoRelLocalService = pianoStatoRelLocalService;
	}

	/**
	 * Adds the piano stato rel to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianoStatoRelLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianoStatoRel the piano stato rel
	 * @return the piano stato rel that was added
	 */
	@Override
	public servicebuilder.model.PianoStatoRel addPianoStatoRel(
		servicebuilder.model.PianoStatoRel pianoStatoRel) {

		return _pianoStatoRelLocalService.addPianoStatoRel(pianoStatoRel);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianoStatoRelLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new piano stato rel with the primary key. Does not add the piano stato rel to the database.
	 *
	 * @param Id_Relazione the primary key for the new piano stato rel
	 * @return the new piano stato rel
	 */
	@Override
	public servicebuilder.model.PianoStatoRel createPianoStatoRel(
		long Id_Relazione) {

		return _pianoStatoRelLocalService.createPianoStatoRel(Id_Relazione);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianoStatoRelLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the piano stato rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianoStatoRelLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Id_Relazione the primary key of the piano stato rel
	 * @return the piano stato rel that was removed
	 * @throws PortalException if a piano stato rel with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.PianoStatoRel deletePianoStatoRel(
			long Id_Relazione)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianoStatoRelLocalService.deletePianoStatoRel(Id_Relazione);
	}

	/**
	 * Deletes the piano stato rel from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianoStatoRelLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianoStatoRel the piano stato rel
	 * @return the piano stato rel that was removed
	 */
	@Override
	public servicebuilder.model.PianoStatoRel deletePianoStatoRel(
		servicebuilder.model.PianoStatoRel pianoStatoRel) {

		return _pianoStatoRelLocalService.deletePianoStatoRel(pianoStatoRel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pianoStatoRelLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pianoStatoRelLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pianoStatoRelLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _pianoStatoRelLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianoStatoRelModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _pianoStatoRelLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianoStatoRelModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _pianoStatoRelLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _pianoStatoRelLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _pianoStatoRelLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public servicebuilder.model.PianoStatoRel fetchPianoStatoRel(
		long Id_Relazione) {

		return _pianoStatoRelLocalService.fetchPianoStatoRel(Id_Relazione);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pianoStatoRelLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pianoStatoRelLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pianoStatoRelLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianoStatoRelLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the piano stato rel with the primary key.
	 *
	 * @param Id_Relazione the primary key of the piano stato rel
	 * @return the piano stato rel
	 * @throws PortalException if a piano stato rel with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.PianoStatoRel getPianoStatoRel(
			long Id_Relazione)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianoStatoRelLocalService.getPianoStatoRel(Id_Relazione);
	}

	/**
	 * Returns a range of all the piano stato rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianoStatoRelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piano stato rels
	 * @param end the upper bound of the range of piano stato rels (not inclusive)
	 * @return the range of piano stato rels
	 */
	@Override
	public java.util.List<servicebuilder.model.PianoStatoRel> getPianoStatoRels(
		int start, int end) {

		return _pianoStatoRelLocalService.getPianoStatoRels(start, end);
	}

	/**
	 * Returns the number of piano stato rels.
	 *
	 * @return the number of piano stato rels
	 */
	@Override
	public int getPianoStatoRelsCount() {
		return _pianoStatoRelLocalService.getPianoStatoRelsCount();
	}

	/**
	 * Updates the piano stato rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianoStatoRelLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianoStatoRel the piano stato rel
	 * @return the piano stato rel that was updated
	 */
	@Override
	public servicebuilder.model.PianoStatoRel updatePianoStatoRel(
		servicebuilder.model.PianoStatoRel pianoStatoRel) {

		return _pianoStatoRelLocalService.updatePianoStatoRel(pianoStatoRel);
	}

	@Override
	public PianoStatoRelLocalService getWrappedService() {
		return _pianoStatoRelLocalService;
	}

	@Override
	public void setWrappedService(
		PianoStatoRelLocalService pianoStatoRelLocalService) {

		_pianoStatoRelLocalService = pianoStatoRelLocalService;
	}

	private PianoStatoRelLocalService _pianoStatoRelLocalService;

}