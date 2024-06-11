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
 * Provides a wrapper for {@link PianiSubentroLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PianiSubentroLocalService
 * @generated
 */
public class PianiSubentroLocalServiceWrapper
	implements PianiSubentroLocalService,
			   ServiceWrapper<PianiSubentroLocalService> {

	public PianiSubentroLocalServiceWrapper() {
		this(null);
	}

	public PianiSubentroLocalServiceWrapper(
		PianiSubentroLocalService pianiSubentroLocalService) {

		_pianiSubentroLocalService = pianiSubentroLocalService;
	}

	/**
	 * Adds the piani subentro to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiSubentroLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianiSubentro the piani subentro
	 * @return the piani subentro that was added
	 */
	@Override
	public servicebuilder.model.PianiSubentro addPianiSubentro(
		servicebuilder.model.PianiSubentro pianiSubentro) {

		return _pianiSubentroLocalService.addPianiSubentro(pianiSubentro);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiSubentroLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new piani subentro with the primary key. Does not add the piani subentro to the database.
	 *
	 * @param Id_PianiSubentro the primary key for the new piani subentro
	 * @return the new piani subentro
	 */
	@Override
	public servicebuilder.model.PianiSubentro createPianiSubentro(
		long Id_PianiSubentro) {

		return _pianiSubentroLocalService.createPianiSubentro(Id_PianiSubentro);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiSubentroLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the piani subentro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiSubentroLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Id_PianiSubentro the primary key of the piani subentro
	 * @return the piani subentro that was removed
	 * @throws PortalException if a piani subentro with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.PianiSubentro deletePianiSubentro(
			long Id_PianiSubentro)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiSubentroLocalService.deletePianiSubentro(Id_PianiSubentro);
	}

	/**
	 * Deletes the piani subentro from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiSubentroLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianiSubentro the piani subentro
	 * @return the piani subentro that was removed
	 */
	@Override
	public servicebuilder.model.PianiSubentro deletePianiSubentro(
		servicebuilder.model.PianiSubentro pianiSubentro) {

		return _pianiSubentroLocalService.deletePianiSubentro(pianiSubentro);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pianiSubentroLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pianiSubentroLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pianiSubentroLocalService.dynamicQuery();
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

		return _pianiSubentroLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianiSubentroModelImpl</code>.
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

		return _pianiSubentroLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianiSubentroModelImpl</code>.
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

		return _pianiSubentroLocalService.dynamicQuery(
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

		return _pianiSubentroLocalService.dynamicQueryCount(dynamicQuery);
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

		return _pianiSubentroLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public servicebuilder.model.PianiSubentro fetchPianiSubentro(
		long Id_PianiSubentro) {

		return _pianiSubentroLocalService.fetchPianiSubentro(Id_PianiSubentro);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pianiSubentroLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pianiSubentroLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pianiSubentroLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiSubentroLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the piani subentro with the primary key.
	 *
	 * @param Id_PianiSubentro the primary key of the piani subentro
	 * @return the piani subentro
	 * @throws PortalException if a piani subentro with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.PianiSubentro getPianiSubentro(
			long Id_PianiSubentro)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiSubentroLocalService.getPianiSubentro(Id_PianiSubentro);
	}

	/**
	 * Returns a range of all the piani subentros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianiSubentroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani subentros
	 * @param end the upper bound of the range of piani subentros (not inclusive)
	 * @return the range of piani subentros
	 */
	@Override
	public java.util.List<servicebuilder.model.PianiSubentro> getPianiSubentros(
		int start, int end) {

		return _pianiSubentroLocalService.getPianiSubentros(start, end);
	}

	/**
	 * Returns the number of piani subentros.
	 *
	 * @return the number of piani subentros
	 */
	@Override
	public int getPianiSubentrosCount() {
		return _pianiSubentroLocalService.getPianiSubentrosCount();
	}

	/**
	 * Updates the piani subentro in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiSubentroLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianiSubentro the piani subentro
	 * @return the piani subentro that was updated
	 */
	@Override
	public servicebuilder.model.PianiSubentro updatePianiSubentro(
		servicebuilder.model.PianiSubentro pianiSubentro) {

		return _pianiSubentroLocalService.updatePianiSubentro(pianiSubentro);
	}

	@Override
	public PianiSubentroLocalService getWrappedService() {
		return _pianiSubentroLocalService;
	}

	@Override
	public void setWrappedService(
		PianiSubentroLocalService pianiSubentroLocalService) {

		_pianiSubentroLocalService = pianiSubentroLocalService;
	}

	private PianiSubentroLocalService _pianiSubentroLocalService;

}