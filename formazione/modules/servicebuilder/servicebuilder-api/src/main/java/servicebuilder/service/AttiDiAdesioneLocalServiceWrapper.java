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
 * Provides a wrapper for {@link AttiDiAdesioneLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttiDiAdesioneLocalService
 * @generated
 */
public class AttiDiAdesioneLocalServiceWrapper
	implements AttiDiAdesioneLocalService,
			   ServiceWrapper<AttiDiAdesioneLocalService> {

	public AttiDiAdesioneLocalServiceWrapper() {
		this(null);
	}

	public AttiDiAdesioneLocalServiceWrapper(
		AttiDiAdesioneLocalService attiDiAdesioneLocalService) {

		_attiDiAdesioneLocalService = attiDiAdesioneLocalService;
	}

	/**
	 * Adds the atti di adesione to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttiDiAdesioneLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attiDiAdesione the atti di adesione
	 * @return the atti di adesione that was added
	 */
	@Override
	public servicebuilder.model.AttiDiAdesione addAttiDiAdesione(
		servicebuilder.model.AttiDiAdesione attiDiAdesione) {

		return _attiDiAdesioneLocalService.addAttiDiAdesione(attiDiAdesione);
	}

	/**
	 * Creates a new atti di adesione with the primary key. Does not add the atti di adesione to the database.
	 *
	 * @param Id_AttiDiAdesione the primary key for the new atti di adesione
	 * @return the new atti di adesione
	 */
	@Override
	public servicebuilder.model.AttiDiAdesione createAttiDiAdesione(
		long Id_AttiDiAdesione) {

		return _attiDiAdesioneLocalService.createAttiDiAdesione(
			Id_AttiDiAdesione);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attiDiAdesioneLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the atti di adesione from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttiDiAdesioneLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attiDiAdesione the atti di adesione
	 * @return the atti di adesione that was removed
	 */
	@Override
	public servicebuilder.model.AttiDiAdesione deleteAttiDiAdesione(
		servicebuilder.model.AttiDiAdesione attiDiAdesione) {

		return _attiDiAdesioneLocalService.deleteAttiDiAdesione(attiDiAdesione);
	}

	/**
	 * Deletes the atti di adesione with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttiDiAdesioneLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Id_AttiDiAdesione the primary key of the atti di adesione
	 * @return the atti di adesione that was removed
	 * @throws PortalException if a atti di adesione with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.AttiDiAdesione deleteAttiDiAdesione(
			long Id_AttiDiAdesione)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attiDiAdesioneLocalService.deleteAttiDiAdesione(
			Id_AttiDiAdesione);
	}

	@Override
	public servicebuilder.model.AttiDiAdesione deleteAttiDiAdesioneWithChildren(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attiDiAdesioneLocalService.deleteAttiDiAdesioneWithChildren(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attiDiAdesioneLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attiDiAdesioneLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attiDiAdesioneLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attiDiAdesioneLocalService.dynamicQuery();
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

		return _attiDiAdesioneLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.AttiDiAdesioneModelImpl</code>.
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

		return _attiDiAdesioneLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.AttiDiAdesioneModelImpl</code>.
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

		return _attiDiAdesioneLocalService.dynamicQuery(
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

		return _attiDiAdesioneLocalService.dynamicQueryCount(dynamicQuery);
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

		return _attiDiAdesioneLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public servicebuilder.model.AttiDiAdesione fetchAttiDiAdesione(
		long Id_AttiDiAdesione) {

		return _attiDiAdesioneLocalService.fetchAttiDiAdesione(
			Id_AttiDiAdesione);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attiDiAdesioneLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the atti di adesione with the primary key.
	 *
	 * @param Id_AttiDiAdesione the primary key of the atti di adesione
	 * @return the atti di adesione
	 * @throws PortalException if a atti di adesione with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.AttiDiAdesione getAttiDiAdesione(
			long Id_AttiDiAdesione)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attiDiAdesioneLocalService.getAttiDiAdesione(Id_AttiDiAdesione);
	}

	/**
	 * Returns a range of all the atti di adesiones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.AttiDiAdesioneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of atti di adesiones
	 * @param end the upper bound of the range of atti di adesiones (not inclusive)
	 * @return the range of atti di adesiones
	 */
	@Override
	public java.util.List<servicebuilder.model.AttiDiAdesione>
		getAttiDiAdesiones(int start, int end) {

		return _attiDiAdesioneLocalService.getAttiDiAdesiones(start, end);
	}

	/**
	 * Returns the number of atti di adesiones.
	 *
	 * @return the number of atti di adesiones
	 */
	@Override
	public int getAttiDiAdesionesCount() {
		return _attiDiAdesioneLocalService.getAttiDiAdesionesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attiDiAdesioneLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attiDiAdesioneLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attiDiAdesioneLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the atti di adesione in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttiDiAdesioneLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attiDiAdesione the atti di adesione
	 * @return the atti di adesione that was updated
	 */
	@Override
	public servicebuilder.model.AttiDiAdesione updateAttiDiAdesione(
		servicebuilder.model.AttiDiAdesione attiDiAdesione) {

		return _attiDiAdesioneLocalService.updateAttiDiAdesione(attiDiAdesione);
	}

	@Override
	public AttiDiAdesioneLocalService getWrappedService() {
		return _attiDiAdesioneLocalService;
	}

	@Override
	public void setWrappedService(
		AttiDiAdesioneLocalService attiDiAdesioneLocalService) {

		_attiDiAdesioneLocalService = attiDiAdesioneLocalService;
	}

	private AttiDiAdesioneLocalService _attiDiAdesioneLocalService;

}