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
 * Provides a wrapper for {@link PianiDeiRischiLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PianiDeiRischiLocalService
 * @generated
 */
public class PianiDeiRischiLocalServiceWrapper
	implements PianiDeiRischiLocalService,
			   ServiceWrapper<PianiDeiRischiLocalService> {

	public PianiDeiRischiLocalServiceWrapper() {
		this(null);
	}

	public PianiDeiRischiLocalServiceWrapper(
		PianiDeiRischiLocalService pianiDeiRischiLocalService) {

		_pianiDeiRischiLocalService = pianiDeiRischiLocalService;
	}

	/**
	 * Adds the piani dei rischi to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiDeiRischiLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianiDeiRischi the piani dei rischi
	 * @return the piani dei rischi that was added
	 */
	@Override
	public servicebuilder.model.PianiDeiRischi addPianiDeiRischi(
		servicebuilder.model.PianiDeiRischi pianiDeiRischi) {

		return _pianiDeiRischiLocalService.addPianiDeiRischi(pianiDeiRischi);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiDeiRischiLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new piani dei rischi with the primary key. Does not add the piani dei rischi to the database.
	 *
	 * @param Id_PianiDeiRischi the primary key for the new piani dei rischi
	 * @return the new piani dei rischi
	 */
	@Override
	public servicebuilder.model.PianiDeiRischi createPianiDeiRischi(
		long Id_PianiDeiRischi) {

		return _pianiDeiRischiLocalService.createPianiDeiRischi(
			Id_PianiDeiRischi);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiDeiRischiLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the piani dei rischi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiDeiRischiLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Id_PianiDeiRischi the primary key of the piani dei rischi
	 * @return the piani dei rischi that was removed
	 * @throws PortalException if a piani dei rischi with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.PianiDeiRischi deletePianiDeiRischi(
			long Id_PianiDeiRischi)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiDeiRischiLocalService.deletePianiDeiRischi(
			Id_PianiDeiRischi);
	}

	/**
	 * Deletes the piani dei rischi from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiDeiRischiLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianiDeiRischi the piani dei rischi
	 * @return the piani dei rischi that was removed
	 */
	@Override
	public servicebuilder.model.PianiDeiRischi deletePianiDeiRischi(
		servicebuilder.model.PianiDeiRischi pianiDeiRischi) {

		return _pianiDeiRischiLocalService.deletePianiDeiRischi(pianiDeiRischi);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pianiDeiRischiLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pianiDeiRischiLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pianiDeiRischiLocalService.dynamicQuery();
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

		return _pianiDeiRischiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianiDeiRischiModelImpl</code>.
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

		return _pianiDeiRischiLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianiDeiRischiModelImpl</code>.
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

		return _pianiDeiRischiLocalService.dynamicQuery(
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

		return _pianiDeiRischiLocalService.dynamicQueryCount(dynamicQuery);
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

		return _pianiDeiRischiLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public servicebuilder.model.PianiDeiRischi fetchPianiDeiRischi(
		long Id_PianiDeiRischi) {

		return _pianiDeiRischiLocalService.fetchPianiDeiRischi(
			Id_PianiDeiRischi);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pianiDeiRischiLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pianiDeiRischiLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pianiDeiRischiLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiDeiRischiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the piani dei rischi with the primary key.
	 *
	 * @param Id_PianiDeiRischi the primary key of the piani dei rischi
	 * @return the piani dei rischi
	 * @throws PortalException if a piani dei rischi with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.PianiDeiRischi getPianiDeiRischi(
			long Id_PianiDeiRischi)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiDeiRischiLocalService.getPianiDeiRischi(Id_PianiDeiRischi);
	}

	/**
	 * Returns a range of all the piani dei rischis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianiDeiRischiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani dei rischis
	 * @param end the upper bound of the range of piani dei rischis (not inclusive)
	 * @return the range of piani dei rischis
	 */
	@Override
	public java.util.List<servicebuilder.model.PianiDeiRischi>
		getPianiDeiRischis(int start, int end) {

		return _pianiDeiRischiLocalService.getPianiDeiRischis(start, end);
	}

	/**
	 * Returns the number of piani dei rischis.
	 *
	 * @return the number of piani dei rischis
	 */
	@Override
	public int getPianiDeiRischisCount() {
		return _pianiDeiRischiLocalService.getPianiDeiRischisCount();
	}

	/**
	 * Updates the piani dei rischi in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiDeiRischiLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianiDeiRischi the piani dei rischi
	 * @return the piani dei rischi that was updated
	 */
	@Override
	public servicebuilder.model.PianiDeiRischi updatePianiDeiRischi(
		servicebuilder.model.PianiDeiRischi pianiDeiRischi) {

		return _pianiDeiRischiLocalService.updatePianiDeiRischi(pianiDeiRischi);
	}

	@Override
	public PianiDeiRischiLocalService getWrappedService() {
		return _pianiDeiRischiLocalService;
	}

	@Override
	public void setWrappedService(
		PianiDeiRischiLocalService pianiDeiRischiLocalService) {

		_pianiDeiRischiLocalService = pianiDeiRischiLocalService;
	}

	private PianiDeiRischiLocalService _pianiDeiRischiLocalService;

}