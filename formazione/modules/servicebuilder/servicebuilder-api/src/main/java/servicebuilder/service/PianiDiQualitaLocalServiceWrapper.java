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
 * Provides a wrapper for {@link PianiDiQualitaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PianiDiQualitaLocalService
 * @generated
 */
public class PianiDiQualitaLocalServiceWrapper
	implements PianiDiQualitaLocalService,
			   ServiceWrapper<PianiDiQualitaLocalService> {

	public PianiDiQualitaLocalServiceWrapper() {
		this(null);
	}

	public PianiDiQualitaLocalServiceWrapper(
		PianiDiQualitaLocalService pianiDiQualitaLocalService) {

		_pianiDiQualitaLocalService = pianiDiQualitaLocalService;
	}

	/**
	 * Adds the piani di qualita to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiDiQualitaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianiDiQualita the piani di qualita
	 * @return the piani di qualita that was added
	 */
	@Override
	public servicebuilder.model.PianiDiQualita addPianiDiQualita(
		servicebuilder.model.PianiDiQualita pianiDiQualita) {

		return _pianiDiQualitaLocalService.addPianiDiQualita(pianiDiQualita);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiDiQualitaLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new piani di qualita with the primary key. Does not add the piani di qualita to the database.
	 *
	 * @param Id_PianiDiQualita the primary key for the new piani di qualita
	 * @return the new piani di qualita
	 */
	@Override
	public servicebuilder.model.PianiDiQualita createPianiDiQualita(
		long Id_PianiDiQualita) {

		return _pianiDiQualitaLocalService.createPianiDiQualita(
			Id_PianiDiQualita);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiDiQualitaLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the piani di qualita with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiDiQualitaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Id_PianiDiQualita the primary key of the piani di qualita
	 * @return the piani di qualita that was removed
	 * @throws PortalException if a piani di qualita with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.PianiDiQualita deletePianiDiQualita(
			long Id_PianiDiQualita)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiDiQualitaLocalService.deletePianiDiQualita(
			Id_PianiDiQualita);
	}

	/**
	 * Deletes the piani di qualita from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiDiQualitaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianiDiQualita the piani di qualita
	 * @return the piani di qualita that was removed
	 */
	@Override
	public servicebuilder.model.PianiDiQualita deletePianiDiQualita(
		servicebuilder.model.PianiDiQualita pianiDiQualita) {

		return _pianiDiQualitaLocalService.deletePianiDiQualita(pianiDiQualita);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pianiDiQualitaLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pianiDiQualitaLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pianiDiQualitaLocalService.dynamicQuery();
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

		return _pianiDiQualitaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianiDiQualitaModelImpl</code>.
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

		return _pianiDiQualitaLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianiDiQualitaModelImpl</code>.
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

		return _pianiDiQualitaLocalService.dynamicQuery(
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

		return _pianiDiQualitaLocalService.dynamicQueryCount(dynamicQuery);
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

		return _pianiDiQualitaLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public servicebuilder.model.PianiDiQualita fetchPianiDiQualita(
		long Id_PianiDiQualita) {

		return _pianiDiQualitaLocalService.fetchPianiDiQualita(
			Id_PianiDiQualita);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pianiDiQualitaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pianiDiQualitaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pianiDiQualitaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiDiQualitaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the piani di qualita with the primary key.
	 *
	 * @param Id_PianiDiQualita the primary key of the piani di qualita
	 * @return the piani di qualita
	 * @throws PortalException if a piani di qualita with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.PianiDiQualita getPianiDiQualita(
			long Id_PianiDiQualita)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiDiQualitaLocalService.getPianiDiQualita(Id_PianiDiQualita);
	}

	/**
	 * Returns a range of all the piani di qualitas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianiDiQualitaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani di qualitas
	 * @param end the upper bound of the range of piani di qualitas (not inclusive)
	 * @return the range of piani di qualitas
	 */
	@Override
	public java.util.List<servicebuilder.model.PianiDiQualita>
		getPianiDiQualitas(int start, int end) {

		return _pianiDiQualitaLocalService.getPianiDiQualitas(start, end);
	}

	/**
	 * Returns the number of piani di qualitas.
	 *
	 * @return the number of piani di qualitas
	 */
	@Override
	public int getPianiDiQualitasCount() {
		return _pianiDiQualitaLocalService.getPianiDiQualitasCount();
	}

	/**
	 * Updates the piani di qualita in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiDiQualitaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianiDiQualita the piani di qualita
	 * @return the piani di qualita that was updated
	 */
	@Override
	public servicebuilder.model.PianiDiQualita updatePianiDiQualita(
		servicebuilder.model.PianiDiQualita pianiDiQualita) {

		return _pianiDiQualitaLocalService.updatePianiDiQualita(pianiDiQualita);
	}

	@Override
	public PianiDiQualitaLocalService getWrappedService() {
		return _pianiDiQualitaLocalService;
	}

	@Override
	public void setWrappedService(
		PianiDiQualitaLocalService pianiDiQualitaLocalService) {

		_pianiDiQualitaLocalService = pianiDiQualitaLocalService;
	}

	private PianiDiQualitaLocalService _pianiDiQualitaLocalService;

}