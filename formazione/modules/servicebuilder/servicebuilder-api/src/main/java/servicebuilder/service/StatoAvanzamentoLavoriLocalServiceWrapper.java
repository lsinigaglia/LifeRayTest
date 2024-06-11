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
 * Provides a wrapper for {@link StatoAvanzamentoLavoriLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see StatoAvanzamentoLavoriLocalService
 * @generated
 */
public class StatoAvanzamentoLavoriLocalServiceWrapper
	implements ServiceWrapper<StatoAvanzamentoLavoriLocalService>,
			   StatoAvanzamentoLavoriLocalService {

	public StatoAvanzamentoLavoriLocalServiceWrapper() {
		this(null);
	}

	public StatoAvanzamentoLavoriLocalServiceWrapper(
		StatoAvanzamentoLavoriLocalService statoAvanzamentoLavoriLocalService) {

		_statoAvanzamentoLavoriLocalService =
			statoAvanzamentoLavoriLocalService;
	}

	/**
	 * Adds the stato avanzamento lavori to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StatoAvanzamentoLavoriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param statoAvanzamentoLavori the stato avanzamento lavori
	 * @return the stato avanzamento lavori that was added
	 */
	@Override
	public servicebuilder.model.StatoAvanzamentoLavori
		addStatoAvanzamentoLavori(
			servicebuilder.model.StatoAvanzamentoLavori
				statoAvanzamentoLavori) {

		return _statoAvanzamentoLavoriLocalService.addStatoAvanzamentoLavori(
			statoAvanzamentoLavori);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _statoAvanzamentoLavoriLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new stato avanzamento lavori with the primary key. Does not add the stato avanzamento lavori to the database.
	 *
	 * @param Id_SAL the primary key for the new stato avanzamento lavori
	 * @return the new stato avanzamento lavori
	 */
	@Override
	public servicebuilder.model.StatoAvanzamentoLavori
		createStatoAvanzamentoLavori(long Id_SAL) {

		return _statoAvanzamentoLavoriLocalService.createStatoAvanzamentoLavori(
			Id_SAL);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _statoAvanzamentoLavoriLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the stato avanzamento lavori with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StatoAvanzamentoLavoriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Id_SAL the primary key of the stato avanzamento lavori
	 * @return the stato avanzamento lavori that was removed
	 * @throws PortalException if a stato avanzamento lavori with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.StatoAvanzamentoLavori
			deleteStatoAvanzamentoLavori(long Id_SAL)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _statoAvanzamentoLavoriLocalService.deleteStatoAvanzamentoLavori(
			Id_SAL);
	}

	/**
	 * Deletes the stato avanzamento lavori from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StatoAvanzamentoLavoriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param statoAvanzamentoLavori the stato avanzamento lavori
	 * @return the stato avanzamento lavori that was removed
	 */
	@Override
	public servicebuilder.model.StatoAvanzamentoLavori
		deleteStatoAvanzamentoLavori(
			servicebuilder.model.StatoAvanzamentoLavori
				statoAvanzamentoLavori) {

		return _statoAvanzamentoLavoriLocalService.deleteStatoAvanzamentoLavori(
			statoAvanzamentoLavori);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _statoAvanzamentoLavoriLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _statoAvanzamentoLavoriLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _statoAvanzamentoLavoriLocalService.dynamicQuery();
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

		return _statoAvanzamentoLavoriLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.StatoAvanzamentoLavoriModelImpl</code>.
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

		return _statoAvanzamentoLavoriLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.StatoAvanzamentoLavoriModelImpl</code>.
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

		return _statoAvanzamentoLavoriLocalService.dynamicQuery(
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

		return _statoAvanzamentoLavoriLocalService.dynamicQueryCount(
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

		return _statoAvanzamentoLavoriLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public servicebuilder.model.StatoAvanzamentoLavori
		fetchStatoAvanzamentoLavori(long Id_SAL) {

		return _statoAvanzamentoLavoriLocalService.fetchStatoAvanzamentoLavori(
			Id_SAL);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _statoAvanzamentoLavoriLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _statoAvanzamentoLavoriLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _statoAvanzamentoLavoriLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _statoAvanzamentoLavoriLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the stato avanzamento lavori with the primary key.
	 *
	 * @param Id_SAL the primary key of the stato avanzamento lavori
	 * @return the stato avanzamento lavori
	 * @throws PortalException if a stato avanzamento lavori with the primary key could not be found
	 */
	@Override
	public servicebuilder.model.StatoAvanzamentoLavori
			getStatoAvanzamentoLavori(long Id_SAL)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _statoAvanzamentoLavoriLocalService.getStatoAvanzamentoLavori(
			Id_SAL);
	}

	/**
	 * Returns a range of all the stato avanzamento lavoris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>servicebuilder.model.impl.StatoAvanzamentoLavoriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of stato avanzamento lavoris
	 * @param end the upper bound of the range of stato avanzamento lavoris (not inclusive)
	 * @return the range of stato avanzamento lavoris
	 */
	@Override
	public java.util.List<servicebuilder.model.StatoAvanzamentoLavori>
		getStatoAvanzamentoLavoris(int start, int end) {

		return _statoAvanzamentoLavoriLocalService.getStatoAvanzamentoLavoris(
			start, end);
	}

	/**
	 * Returns the number of stato avanzamento lavoris.
	 *
	 * @return the number of stato avanzamento lavoris
	 */
	@Override
	public int getStatoAvanzamentoLavorisCount() {
		return _statoAvanzamentoLavoriLocalService.
			getStatoAvanzamentoLavorisCount();
	}

	/**
	 * Updates the stato avanzamento lavori in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StatoAvanzamentoLavoriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param statoAvanzamentoLavori the stato avanzamento lavori
	 * @return the stato avanzamento lavori that was updated
	 */
	@Override
	public servicebuilder.model.StatoAvanzamentoLavori
		updateStatoAvanzamentoLavori(
			servicebuilder.model.StatoAvanzamentoLavori
				statoAvanzamentoLavori) {

		return _statoAvanzamentoLavoriLocalService.updateStatoAvanzamentoLavori(
			statoAvanzamentoLavori);
	}

	@Override
	public StatoAvanzamentoLavoriLocalService getWrappedService() {
		return _statoAvanzamentoLavoriLocalService;
	}

	@Override
	public void setWrappedService(
		StatoAvanzamentoLavoriLocalService statoAvanzamentoLavoriLocalService) {

		_statoAvanzamentoLavoriLocalService =
			statoAvanzamentoLavoriLocalService;
	}

	private StatoAvanzamentoLavoriLocalService
		_statoAvanzamentoLavoriLocalService;

}