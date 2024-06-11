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
 * Provides a wrapper for {@link ContrattiEsecutiviLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ContrattiEsecutiviLocalService
 * @generated
 */
public class ContrattiEsecutiviLocalServiceWrapper
	implements ContrattiEsecutiviLocalService,
			   ServiceWrapper<ContrattiEsecutiviLocalService> {

	public ContrattiEsecutiviLocalServiceWrapper() {
		this(null);
	}

	public ContrattiEsecutiviLocalServiceWrapper(
		ContrattiEsecutiviLocalService contrattiEsecutiviLocalService) {

		_contrattiEsecutiviLocalService = contrattiEsecutiviLocalService;
	}

	/**
	 * Adds the contratti esecutivi to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ContrattiEsecutiviLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contrattiEsecutivi the contratti esecutivi
	 * @return the contratti esecutivi that was added
	 */
	@Override
	public servicebuilder.model.ContrattiEsecutivi addContrattiEsecutivi(
		servicebuilder.model.ContrattiEsecutivi contrattiEsecutivi) {

		return _contrattiEsecutiviLocalService.addContrattiEsecutivi(
			contrattiEsecutivi);
	}

	/**
	 * Creates a new contratti esecutivi with the primary key. Does not add the contratti esecutivi to the database.
	 *
	 * @param contrattiEsecutiviPK the primary key for the new contratti esecutivi
	 * @return the new contratti esecutivi
	 */
	@Override
	public servicebuilder.model.ContrattiEsecutivi createContrattiEsecutivi(
		servicebuilder.service.persistence.ContrattiEsecutiviPK
			contrattiEsecutiviPK) {

		return _contrattiEsecutiviLocalService.createContrattiEsecutivi(
			contrattiEsecutiviPK);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contrattiEsecutiviLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the contratti esecutivi from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ContrattiEsecutiviLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contrattiEsecutivi the contratti esecutivi
	 * @return the contratti esecutivi that was removed
	 */
	@Override
	public servicebuilder.model.ContrattiEsecutivi deleteContrattiEsecutivi(
		servicebuilder.model.ContrattiEsecutivi contrattiEsecutivi) {

		return _contrattiEsecutiviLocalService.deleteContrattiEsecutivi(
			contrattiEsecutivi);
	}

	/**
	 * Deletes the contratti esecutivi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ContrattiEsecutiviLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contrattiEsecutiviPK the primary key of the contratti esecutivi
	 * @return the contratti esecutivi that was removed
	 * @throws PortalException if a contratti esecutivi with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.ContrattiEsecutivi deleteContrattiEsecutivi(
			servicebuilder.service.persistence.ContrattiEsecutiviPK
				contrattiEsecutiviPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contrattiEsecutiviLocalService.deleteContrattiEsecutivi(
			contrattiEsecutiviPK);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contrattiEsecutiviLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _contrattiEsecutiviLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _contrattiEsecutiviLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _contrattiEsecutiviLocalService.dynamicQuery();
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

		return _contrattiEsecutiviLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.ContrattiEsecutiviModelImpl</code>.
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

		return _contrattiEsecutiviLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.ContrattiEsecutiviModelImpl</code>.
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

		return _contrattiEsecutiviLocalService.dynamicQuery(
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

		return _contrattiEsecutiviLocalService.dynamicQueryCount(dynamicQuery);
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

		return _contrattiEsecutiviLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public servicebuilder.model.ContrattiEsecutivi fetchContrattiEsecutivi(
		servicebuilder.service.persistence.ContrattiEsecutiviPK
			contrattiEsecutiviPK) {

		return _contrattiEsecutiviLocalService.fetchContrattiEsecutivi(
			contrattiEsecutiviPK);
	}

	/**
	 * Returns the contratti esecutivi with the primary key.
	 *
	 * @param contrattiEsecutiviPK the primary key of the contratti esecutivi
	 * @return the contratti esecutivi
	 * @throws PortalException if a contratti esecutivi with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.ContrattiEsecutivi getContrattiEsecutivi(
			servicebuilder.service.persistence.ContrattiEsecutiviPK
				contrattiEsecutiviPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contrattiEsecutiviLocalService.getContrattiEsecutivi(
			contrattiEsecutiviPK);
	}

	/**
	 * Returns a range of all the contratti esecutivis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.ContrattiEsecutiviModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contratti esecutivis
	 * @param end the upper bound of the range of contratti esecutivis (not inclusive)
	 * @return the range of contratti esecutivis
	 */
	@Override
	public java.util.List<servicebuilder.model.ContrattiEsecutivi>
		getContrattiEsecutivis(int start, int end) {

		return _contrattiEsecutiviLocalService.getContrattiEsecutivis(
			start, end);
	}

	/**
	 * Returns the number of contratti esecutivis.
	 *
	 * @return the number of contratti esecutivis
	 */
	@Override
	public int getContrattiEsecutivisCount() {
		return _contrattiEsecutiviLocalService.getContrattiEsecutivisCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _contrattiEsecutiviLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contrattiEsecutiviLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the contratti esecutivi in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ContrattiEsecutiviLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contrattiEsecutivi the contratti esecutivi
	 * @return the contratti esecutivi that was updated
	 */
	@Override
	public servicebuilder.model.ContrattiEsecutivi updateContrattiEsecutivi(
		servicebuilder.model.ContrattiEsecutivi contrattiEsecutivi) {

		return _contrattiEsecutiviLocalService.updateContrattiEsecutivi(
			contrattiEsecutivi);
	}

	@Override
	public ContrattiEsecutiviLocalService getWrappedService() {
		return _contrattiEsecutiviLocalService;
	}

	@Override
	public void setWrappedService(
		ContrattiEsecutiviLocalService contrattiEsecutiviLocalService) {

		_contrattiEsecutiviLocalService = contrattiEsecutiviLocalService;
	}

	private ContrattiEsecutiviLocalService _contrattiEsecutiviLocalService;

}