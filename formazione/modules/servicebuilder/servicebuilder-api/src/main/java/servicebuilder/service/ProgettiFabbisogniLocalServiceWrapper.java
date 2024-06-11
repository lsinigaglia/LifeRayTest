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
 * Provides a wrapper for {@link ProgettiFabbisogniLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProgettiFabbisogniLocalService
 * @generated
 */
public class ProgettiFabbisogniLocalServiceWrapper
	implements ProgettiFabbisogniLocalService,
			   ServiceWrapper<ProgettiFabbisogniLocalService> {

	public ProgettiFabbisogniLocalServiceWrapper() {
		this(null);
	}

	public ProgettiFabbisogniLocalServiceWrapper(
		ProgettiFabbisogniLocalService progettiFabbisogniLocalService) {

		_progettiFabbisogniLocalService = progettiFabbisogniLocalService;
	}

	/**
	 * Adds the progetti fabbisogni to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProgettiFabbisogniLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param progettiFabbisogni the progetti fabbisogni
	 * @return the progetti fabbisogni that was added
	 */
	@Override
	public servicebuilder.model.ProgettiFabbisogni addProgettiFabbisogni(
		servicebuilder.model.ProgettiFabbisogni progettiFabbisogni) {

		return _progettiFabbisogniLocalService.addProgettiFabbisogni(
			progettiFabbisogni);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _progettiFabbisogniLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new progetti fabbisogni with the primary key. Does not add the progetti fabbisogni to the database.
	 *
	 * @param Id_ProgettiFabbisogni the primary key for the new progetti fabbisogni
	 * @return the new progetti fabbisogni
	 */
	@Override
	public servicebuilder.model.ProgettiFabbisogni createProgettiFabbisogni(
		long Id_ProgettiFabbisogni) {

		return _progettiFabbisogniLocalService.createProgettiFabbisogni(
			Id_ProgettiFabbisogni);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _progettiFabbisogniLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the progetti fabbisogni with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProgettiFabbisogniLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Id_ProgettiFabbisogni the primary key of the progetti fabbisogni
	 * @return the progetti fabbisogni that was removed
	 * @throws PortalException if a progetti fabbisogni with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.ProgettiFabbisogni deleteProgettiFabbisogni(
			long Id_ProgettiFabbisogni)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _progettiFabbisogniLocalService.deleteProgettiFabbisogni(
			Id_ProgettiFabbisogni);
	}

	/**
	 * Deletes the progetti fabbisogni from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProgettiFabbisogniLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param progettiFabbisogni the progetti fabbisogni
	 * @return the progetti fabbisogni that was removed
	 */
	@Override
	public servicebuilder.model.ProgettiFabbisogni deleteProgettiFabbisogni(
		servicebuilder.model.ProgettiFabbisogni progettiFabbisogni) {

		return _progettiFabbisogniLocalService.deleteProgettiFabbisogni(
			progettiFabbisogni);
	}

	@Override
	public servicebuilder.model.ProgettiFabbisogni
			deleteProgettiFabbisogniWithChildren(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _progettiFabbisogniLocalService.
			deleteProgettiFabbisogniWithChildren(id);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _progettiFabbisogniLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _progettiFabbisogniLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _progettiFabbisogniLocalService.dynamicQuery();
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

		return _progettiFabbisogniLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.ProgettiFabbisogniModelImpl</code>.
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

		return _progettiFabbisogniLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.ProgettiFabbisogniModelImpl</code>.
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

		return _progettiFabbisogniLocalService.dynamicQuery(
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

		return _progettiFabbisogniLocalService.dynamicQueryCount(dynamicQuery);
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

		return _progettiFabbisogniLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public servicebuilder.model.ProgettiFabbisogni fetchProgettiFabbisogni(
		long Id_ProgettiFabbisogni) {

		return _progettiFabbisogniLocalService.fetchProgettiFabbisogni(
			Id_ProgettiFabbisogni);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _progettiFabbisogniLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _progettiFabbisogniLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _progettiFabbisogniLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _progettiFabbisogniLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the progetti fabbisogni with the primary key.
	 *
	 * @param Id_ProgettiFabbisogni the primary key of the progetti fabbisogni
	 * @return the progetti fabbisogni
	 * @throws PortalException if a progetti fabbisogni with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.ProgettiFabbisogni getProgettiFabbisogni(
			long Id_ProgettiFabbisogni)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _progettiFabbisogniLocalService.getProgettiFabbisogni(
			Id_ProgettiFabbisogni);
	}

	/**
	 * Returns a range of all the progetti fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @return the range of progetti fabbisognis
	 */
	@Override
	public java.util.List<servicebuilder.model.ProgettiFabbisogni>
		getProgettiFabbisognis(int start, int end) {

		return _progettiFabbisogniLocalService.getProgettiFabbisognis(
			start, end);
	}

	/**
	 * Returns the number of progetti fabbisognis.
	 *
	 * @return the number of progetti fabbisognis
	 */
	@Override
	public int getProgettiFabbisognisCount() {
		return _progettiFabbisogniLocalService.getProgettiFabbisognisCount();
	}

	/**
	 * Updates the progetti fabbisogni in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProgettiFabbisogniLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param progettiFabbisogni the progetti fabbisogni
	 * @return the progetti fabbisogni that was updated
	 */
	@Override
	public servicebuilder.model.ProgettiFabbisogni updateProgettiFabbisogni(
		servicebuilder.model.ProgettiFabbisogni progettiFabbisogni) {

		return _progettiFabbisogniLocalService.updateProgettiFabbisogni(
			progettiFabbisogni);
	}

	@Override
	public ProgettiFabbisogniLocalService getWrappedService() {
		return _progettiFabbisogniLocalService;
	}

	@Override
	public void setWrappedService(
		ProgettiFabbisogniLocalService progettiFabbisogniLocalService) {

		_progettiFabbisogniLocalService = progettiFabbisogniLocalService;
	}

	private ProgettiFabbisogniLocalService _progettiFabbisogniLocalService;

}