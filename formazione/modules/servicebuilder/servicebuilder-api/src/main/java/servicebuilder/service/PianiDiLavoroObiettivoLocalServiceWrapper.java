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
 * Provides a wrapper for {@link PianiDiLavoroObiettivoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PianiDiLavoroObiettivoLocalService
 * @generated
 */
public class PianiDiLavoroObiettivoLocalServiceWrapper
	implements PianiDiLavoroObiettivoLocalService,
			   ServiceWrapper<PianiDiLavoroObiettivoLocalService> {

	public PianiDiLavoroObiettivoLocalServiceWrapper() {
		this(null);
	}

	public PianiDiLavoroObiettivoLocalServiceWrapper(
		PianiDiLavoroObiettivoLocalService pianiDiLavoroObiettivoLocalService) {

		_pianiDiLavoroObiettivoLocalService =
			pianiDiLavoroObiettivoLocalService;
	}

	/**
	 * Adds the piani di lavoro obiettivo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiDiLavoroObiettivoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianiDiLavoroObiettivo the piani di lavoro obiettivo
	 * @return the piani di lavoro obiettivo that was added
	 */
	@Override
	public servicebuilder.model.PianiDiLavoroObiettivo
		addPianiDiLavoroObiettivo(
			servicebuilder.model.PianiDiLavoroObiettivo
				pianiDiLavoroObiettivo) {

		return _pianiDiLavoroObiettivoLocalService.addPianiDiLavoroObiettivo(
			pianiDiLavoroObiettivo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiDiLavoroObiettivoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new piani di lavoro obiettivo with the primary key. Does not add the piani di lavoro obiettivo to the database.
	 *
	 * @param Id_PianoDiLavoro the primary key for the new piani di lavoro obiettivo
	 * @return the new piani di lavoro obiettivo
	 */
	@Override
	public servicebuilder.model.PianiDiLavoroObiettivo
		createPianiDiLavoroObiettivo(long Id_PianoDiLavoro) {

		return _pianiDiLavoroObiettivoLocalService.createPianiDiLavoroObiettivo(
			Id_PianoDiLavoro);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiDiLavoroObiettivoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the piani di lavoro obiettivo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiDiLavoroObiettivoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Id_PianoDiLavoro the primary key of the piani di lavoro obiettivo
	 * @return the piani di lavoro obiettivo that was removed
	 * @throws PortalException if a piani di lavoro obiettivo with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.PianiDiLavoroObiettivo
			deletePianiDiLavoroObiettivo(long Id_PianoDiLavoro)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiDiLavoroObiettivoLocalService.deletePianiDiLavoroObiettivo(
			Id_PianoDiLavoro);
	}

	/**
	 * Deletes the piani di lavoro obiettivo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiDiLavoroObiettivoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianiDiLavoroObiettivo the piani di lavoro obiettivo
	 * @return the piani di lavoro obiettivo that was removed
	 */
	@Override
	public servicebuilder.model.PianiDiLavoroObiettivo
		deletePianiDiLavoroObiettivo(
			servicebuilder.model.PianiDiLavoroObiettivo
				pianiDiLavoroObiettivo) {

		return _pianiDiLavoroObiettivoLocalService.deletePianiDiLavoroObiettivo(
			pianiDiLavoroObiettivo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pianiDiLavoroObiettivoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pianiDiLavoroObiettivoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pianiDiLavoroObiettivoLocalService.dynamicQuery();
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

		return _pianiDiLavoroObiettivoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianiDiLavoroObiettivoModelImpl</code>.
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

		return _pianiDiLavoroObiettivoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianiDiLavoroObiettivoModelImpl</code>.
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

		return _pianiDiLavoroObiettivoLocalService.dynamicQuery(
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

		return _pianiDiLavoroObiettivoLocalService.dynamicQueryCount(
			dynamicQuery);
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

		return _pianiDiLavoroObiettivoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public servicebuilder.model.PianiDiLavoroObiettivo
		fetchPianiDiLavoroObiettivo(long Id_PianoDiLavoro) {

		return _pianiDiLavoroObiettivoLocalService.fetchPianiDiLavoroObiettivo(
			Id_PianoDiLavoro);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pianiDiLavoroObiettivoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pianiDiLavoroObiettivoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pianiDiLavoroObiettivoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiDiLavoroObiettivoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the piani di lavoro obiettivo with the primary key.
	 *
	 * @param Id_PianoDiLavoro the primary key of the piani di lavoro obiettivo
	 * @return the piani di lavoro obiettivo
	 * @throws PortalException if a piani di lavoro obiettivo with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.PianiDiLavoroObiettivo
			getPianiDiLavoroObiettivo(long Id_PianoDiLavoro)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiDiLavoroObiettivoLocalService.getPianiDiLavoroObiettivo(
			Id_PianoDiLavoro);
	}

	/**
	 * Returns a range of all the piani di lavoro obiettivos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianiDiLavoroObiettivoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani di lavoro obiettivos
	 * @param end the upper bound of the range of piani di lavoro obiettivos (not inclusive)
	 * @return the range of piani di lavoro obiettivos
	 */
	@Override
	public java.util.List<servicebuilder.model.PianiDiLavoroObiettivo>
		getPianiDiLavoroObiettivos(int start, int end) {

		return _pianiDiLavoroObiettivoLocalService.getPianiDiLavoroObiettivos(
			start, end);
	}

	/**
	 * Returns the number of piani di lavoro obiettivos.
	 *
	 * @return the number of piani di lavoro obiettivos
	 */
	@Override
	public int getPianiDiLavoroObiettivosCount() {
		return _pianiDiLavoroObiettivoLocalService.
			getPianiDiLavoroObiettivosCount();
	}

	/**
	 * Updates the piani di lavoro obiettivo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiDiLavoroObiettivoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianiDiLavoroObiettivo the piani di lavoro obiettivo
	 * @return the piani di lavoro obiettivo that was updated
	 */
	@Override
	public servicebuilder.model.PianiDiLavoroObiettivo
		updatePianiDiLavoroObiettivo(
			servicebuilder.model.PianiDiLavoroObiettivo
				pianiDiLavoroObiettivo) {

		return _pianiDiLavoroObiettivoLocalService.updatePianiDiLavoroObiettivo(
			pianiDiLavoroObiettivo);
	}

	@Override
	public PianiDiLavoroObiettivoLocalService getWrappedService() {
		return _pianiDiLavoroObiettivoLocalService;
	}

	@Override
	public void setWrappedService(
		PianiDiLavoroObiettivoLocalService pianiDiLavoroObiettivoLocalService) {

		_pianiDiLavoroObiettivoLocalService =
			pianiDiLavoroObiettivoLocalService;
	}

	private PianiDiLavoroObiettivoLocalService
		_pianiDiLavoroObiettivoLocalService;

}