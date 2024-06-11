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
 * Provides a wrapper for {@link PianiFabbisogniLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PianiFabbisogniLocalService
 * @generated
 */
public class PianiFabbisogniLocalServiceWrapper
	implements PianiFabbisogniLocalService,
			   ServiceWrapper<PianiFabbisogniLocalService> {

	public PianiFabbisogniLocalServiceWrapper() {
		this(null);
	}

	public PianiFabbisogniLocalServiceWrapper(
		PianiFabbisogniLocalService pianiFabbisogniLocalService) {

		_pianiFabbisogniLocalService = pianiFabbisogniLocalService;
	}

	/**
	 * Adds the piani fabbisogni to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiFabbisogniLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianiFabbisogni the piani fabbisogni
	 * @return the piani fabbisogni that was added
	 */
	@Override
	public servicebuilder.model.PianiFabbisogni addPianiFabbisogni(
		servicebuilder.model.PianiFabbisogni pianiFabbisogni) {

		return _pianiFabbisogniLocalService.addPianiFabbisogni(pianiFabbisogni);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiFabbisogniLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new piani fabbisogni with the primary key. Does not add the piani fabbisogni to the database.
	 *
	 * @param Id_PianiFabbisogni the primary key for the new piani fabbisogni
	 * @return the new piani fabbisogni
	 */
	@Override
	public servicebuilder.model.PianiFabbisogni createPianiFabbisogni(
		long Id_PianiFabbisogni) {

		return _pianiFabbisogniLocalService.createPianiFabbisogni(
			Id_PianiFabbisogni);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiFabbisogniLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the piani fabbisogni with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiFabbisogniLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Id_PianiFabbisogni the primary key of the piani fabbisogni
	 * @return the piani fabbisogni that was removed
	 * @throws PortalException if a piani fabbisogni with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.PianiFabbisogni deletePianiFabbisogni(
			long Id_PianiFabbisogni)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiFabbisogniLocalService.deletePianiFabbisogni(
			Id_PianiFabbisogni);
	}

	/**
	 * Deletes the piani fabbisogni from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiFabbisogniLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianiFabbisogni the piani fabbisogni
	 * @return the piani fabbisogni that was removed
	 */
	@Override
	public servicebuilder.model.PianiFabbisogni deletePianiFabbisogni(
		servicebuilder.model.PianiFabbisogni pianiFabbisogni) {

		return _pianiFabbisogniLocalService.deletePianiFabbisogni(
			pianiFabbisogni);
	}

	@Override
	public servicebuilder.model.PianiFabbisogni
			deletePianiFabbisogniWithChildren(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiFabbisogniLocalService.deletePianiFabbisogniWithChildren(
			id);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pianiFabbisogniLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pianiFabbisogniLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pianiFabbisogniLocalService.dynamicQuery();
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

		return _pianiFabbisogniLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianiFabbisogniModelImpl</code>.
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

		return _pianiFabbisogniLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianiFabbisogniModelImpl</code>.
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

		return _pianiFabbisogniLocalService.dynamicQuery(
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

		return _pianiFabbisogniLocalService.dynamicQueryCount(dynamicQuery);
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

		return _pianiFabbisogniLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public servicebuilder.model.PianiFabbisogni fetchPianiFabbisogni(
		long Id_PianiFabbisogni) {

		return _pianiFabbisogniLocalService.fetchPianiFabbisogni(
			Id_PianiFabbisogni);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pianiFabbisogniLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pianiFabbisogniLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pianiFabbisogniLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiFabbisogniLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the piani fabbisogni with the primary key.
	 *
	 * @param Id_PianiFabbisogni the primary key of the piani fabbisogni
	 * @return the piani fabbisogni
	 * @throws PortalException if a piani fabbisogni with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.PianiFabbisogni getPianiFabbisogni(
			long Id_PianiFabbisogni)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pianiFabbisogniLocalService.getPianiFabbisogni(
			Id_PianiFabbisogni);
	}

	/**
	 * Returns a range of all the piani fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.PianiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani fabbisognis
	 * @param end the upper bound of the range of piani fabbisognis (not inclusive)
	 * @return the range of piani fabbisognis
	 */
	@Override
	public java.util.List<servicebuilder.model.PianiFabbisogni>
		getPianiFabbisognis(int start, int end) {

		return _pianiFabbisogniLocalService.getPianiFabbisognis(start, end);
	}

	/**
	 * Returns the number of piani fabbisognis.
	 *
	 * @return the number of piani fabbisognis
	 */
	@Override
	public int getPianiFabbisognisCount() {
		return _pianiFabbisogniLocalService.getPianiFabbisognisCount();
	}

	/**
	 * Updates the piani fabbisogni in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PianiFabbisogniLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pianiFabbisogni the piani fabbisogni
	 * @return the piani fabbisogni that was updated
	 */
	@Override
	public servicebuilder.model.PianiFabbisogni updatePianiFabbisogni(
		servicebuilder.model.PianiFabbisogni pianiFabbisogni) {

		return _pianiFabbisogniLocalService.updatePianiFabbisogni(
			pianiFabbisogni);
	}

	@Override
	public PianiFabbisogniLocalService getWrappedService() {
		return _pianiFabbisogniLocalService;
	}

	@Override
	public void setWrappedService(
		PianiFabbisogniLocalService pianiFabbisogniLocalService) {

		_pianiFabbisogniLocalService = pianiFabbisogniLocalService;
	}

	private PianiFabbisogniLocalService _pianiFabbisogniLocalService;

}