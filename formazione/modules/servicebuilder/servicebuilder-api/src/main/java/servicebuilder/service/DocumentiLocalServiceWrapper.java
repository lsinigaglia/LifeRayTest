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
 * Provides a wrapper for {@link DocumentiLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DocumentiLocalService
 * @generated
 */
public class DocumentiLocalServiceWrapper
	implements DocumentiLocalService, ServiceWrapper<DocumentiLocalService> {

	public DocumentiLocalServiceWrapper() {
		this(null);
	}

	public DocumentiLocalServiceWrapper(
		DocumentiLocalService documentiLocalService) {

		_documentiLocalService = documentiLocalService;
	}

	/**
	 * Adds the documenti to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DocumentiLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param documenti the documenti
	 * @return the documenti that was added
	 */
	@Override
	public servicebuilder.model.Documenti addDocumenti(
		servicebuilder.model.Documenti documenti) {

		return _documentiLocalService.addDocumenti(documenti);
	}

	/**
	 * Creates a new documenti with the primary key. Does not add the documenti to the database.
	 *
	 * @param CodiceDocumento the primary key for the new documenti
	 * @return the new documenti
	 */
	@Override
	public servicebuilder.model.Documenti createDocumenti(
		String CodiceDocumento) {

		return _documentiLocalService.createDocumenti(CodiceDocumento);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentiLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the documenti from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DocumentiLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param documenti the documenti
	 * @return the documenti that was removed
	 */
	@Override
	public servicebuilder.model.Documenti deleteDocumenti(
		servicebuilder.model.Documenti documenti) {

		return _documentiLocalService.deleteDocumenti(documenti);
	}

	/**
	 * Deletes the documenti with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DocumentiLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param CodiceDocumento the primary key of the documenti
	 * @return the documenti that was removed
	 * @throws PortalException if a documenti with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.Documenti deleteDocumenti(
			String CodiceDocumento)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentiLocalService.deleteDocumenti(CodiceDocumento);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentiLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _documentiLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _documentiLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _documentiLocalService.dynamicQuery();
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

		return _documentiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.DocumentiModelImpl</code>.
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

		return _documentiLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.DocumentiModelImpl</code>.
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

		return _documentiLocalService.dynamicQuery(
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

		return _documentiLocalService.dynamicQueryCount(dynamicQuery);
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

		return _documentiLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public servicebuilder.model.Documenti fetchDocumenti(
		String CodiceDocumento) {

		return _documentiLocalService.fetchDocumenti(CodiceDocumento);
	}

	/**
	 * Returns the documenti with the primary key.
	 *
	 * @param CodiceDocumento the primary key of the documenti
	 * @return the documenti
	 * @throws PortalException if a documenti with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.Documenti getDocumenti(String CodiceDocumento)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentiLocalService.getDocumenti(CodiceDocumento);
	}

	/**
	 * Returns a range of all the documentis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.DocumentiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documentis
	 * @param end the upper bound of the range of documentis (not inclusive)
	 * @return the range of documentis
	 */
	@Override
	public java.util.List<servicebuilder.model.Documenti> getDocumentis(
		int start, int end) {

		return _documentiLocalService.getDocumentis(start, end);
	}

	/**
	 * Returns the number of documentis.
	 *
	 * @return the number of documentis
	 */
	@Override
	public int getDocumentisCount() {
		return _documentiLocalService.getDocumentisCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _documentiLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the documenti in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DocumentiLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param documenti the documenti
	 * @return the documenti that was updated
	 */
	@Override
	public servicebuilder.model.Documenti updateDocumenti(
		servicebuilder.model.Documenti documenti) {

		return _documentiLocalService.updateDocumenti(documenti);
	}

	@Override
	public DocumentiLocalService getWrappedService() {
		return _documentiLocalService;
	}

	@Override
	public void setWrappedService(DocumentiLocalService documentiLocalService) {
		_documentiLocalService = documentiLocalService;
	}

	private DocumentiLocalService _documentiLocalService;

}