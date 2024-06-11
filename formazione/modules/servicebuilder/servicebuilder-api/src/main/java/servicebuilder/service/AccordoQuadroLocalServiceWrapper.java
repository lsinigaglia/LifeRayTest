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
 * Provides a wrapper for {@link AccordoQuadroLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccordoQuadroLocalService
 * @generated
 */
public class AccordoQuadroLocalServiceWrapper
	implements AccordoQuadroLocalService,
			   ServiceWrapper<AccordoQuadroLocalService> {

	public AccordoQuadroLocalServiceWrapper() {
		this(null);
	}

	public AccordoQuadroLocalServiceWrapper(
		AccordoQuadroLocalService accordoQuadroLocalService) {

		_accordoQuadroLocalService = accordoQuadroLocalService;
	}

	/**
	 * Adds the accordo quadro to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccordoQuadroLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accordoQuadro the accordo quadro
	 * @return the accordo quadro that was added
	 */
	@Override
	public servicebuilder.model.AccordoQuadro addAccordoQuadro(
		servicebuilder.model.AccordoQuadro accordoQuadro) {

		return _accordoQuadroLocalService.addAccordoQuadro(accordoQuadro);
	}

	/**
	 * Creates a new accordo quadro with the primary key. Does not add the accordo quadro to the database.
	 *
	 * @param Id_AccordoQuadro the primary key for the new accordo quadro
	 * @return the new accordo quadro
	 */
	@Override
	public servicebuilder.model.AccordoQuadro createAccordoQuadro(
		long Id_AccordoQuadro) {

		return _accordoQuadroLocalService.createAccordoQuadro(Id_AccordoQuadro);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accordoQuadroLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the accordo quadro from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccordoQuadroLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accordoQuadro the accordo quadro
	 * @return the accordo quadro that was removed
	 */
	@Override
	public servicebuilder.model.AccordoQuadro deleteAccordoQuadro(
		servicebuilder.model.AccordoQuadro accordoQuadro) {

		return _accordoQuadroLocalService.deleteAccordoQuadro(accordoQuadro);
	}

	/**
	 * Deletes the accordo quadro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccordoQuadroLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Id_AccordoQuadro the primary key of the accordo quadro
	 * @return the accordo quadro that was removed
	 * @throws PortalException if a accordo quadro with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.AccordoQuadro deleteAccordoQuadro(
			long Id_AccordoQuadro)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accordoQuadroLocalService.deleteAccordoQuadro(Id_AccordoQuadro);
	}

	@Override
	public servicebuilder.model.AccordoQuadro deleteAccordoQuadroWithChildren(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accordoQuadroLocalService.deleteAccordoQuadroWithChildren(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accordoQuadroLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accordoQuadroLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accordoQuadroLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accordoQuadroLocalService.dynamicQuery();
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

		return _accordoQuadroLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.AccordoQuadroModelImpl</code>.
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

		return _accordoQuadroLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.AccordoQuadroModelImpl</code>.
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

		return _accordoQuadroLocalService.dynamicQuery(
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

		return _accordoQuadroLocalService.dynamicQueryCount(dynamicQuery);
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

		return _accordoQuadroLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public servicebuilder.model.AccordoQuadro fetchAccordoQuadro(
		long Id_AccordoQuadro) {

		return _accordoQuadroLocalService.fetchAccordoQuadro(Id_AccordoQuadro);
	}

	/**
	 * Returns the accordo quadro with the primary key.
	 *
	 * @param Id_AccordoQuadro the primary key of the accordo quadro
	 * @return the accordo quadro
	 * @throws PortalException if a accordo quadro with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.AccordoQuadro getAccordoQuadro(
			long Id_AccordoQuadro)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accordoQuadroLocalService.getAccordoQuadro(Id_AccordoQuadro);
	}

	/**
	 * Returns a range of all the accordo quadros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.AccordoQuadroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of accordo quadros
	 * @param end the upper bound of the range of accordo quadros (not inclusive)
	 * @return the range of accordo quadros
	 */
	@Override
	public java.util.List<servicebuilder.model.AccordoQuadro> getAccordoQuadros(
		int start, int end) {

		return _accordoQuadroLocalService.getAccordoQuadros(start, end);
	}

	/**
	 * Returns the number of accordo quadros.
	 *
	 * @return the number of accordo quadros
	 */
	@Override
	public int getAccordoQuadrosCount() {
		return _accordoQuadroLocalService.getAccordoQuadrosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accordoQuadroLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accordoQuadroLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accordoQuadroLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accordoQuadroLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List<servicebuilder.model.AccordoQuadro>
			searchAccordoQuadros(String keywords)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _accordoQuadroLocalService.searchAccordoQuadros(keywords);
	}

	/**
	 * Updates the accordo quadro in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccordoQuadroLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accordoQuadro the accordo quadro
	 * @return the accordo quadro that was updated
	 */
	@Override
	public servicebuilder.model.AccordoQuadro updateAccordoQuadro(
		servicebuilder.model.AccordoQuadro accordoQuadro) {

		return _accordoQuadroLocalService.updateAccordoQuadro(accordoQuadro);
	}

	@Override
	public AccordoQuadroLocalService getWrappedService() {
		return _accordoQuadroLocalService;
	}

	@Override
	public void setWrappedService(
		AccordoQuadroLocalService accordoQuadroLocalService) {

		_accordoQuadroLocalService = accordoQuadroLocalService;
	}

	private AccordoQuadroLocalService _accordoQuadroLocalService;

}