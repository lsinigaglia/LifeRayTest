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

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

import servicebuilder.model.ProgettiFabbisogni;

/**
 * Provides the local service utility for ProgettiFabbisogni. This utility wraps
 * <code>servicebuilder.service.impl.ProgettiFabbisogniLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ProgettiFabbisogniLocalService
 * @generated
 */
public class ProgettiFabbisogniLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>servicebuilder.service.impl.ProgettiFabbisogniLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static ProgettiFabbisogni addProgettiFabbisogni(
		ProgettiFabbisogni progettiFabbisogni) {

		return getService().addProgettiFabbisogni(progettiFabbisogni);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new progetti fabbisogni with the primary key. Does not add the progetti fabbisogni to the database.
	 *
	 * @param Id_ProgettiFabbisogni the primary key for the new progetti fabbisogni
	 * @return the new progetti fabbisogni
	 */
	public static ProgettiFabbisogni createProgettiFabbisogni(
		long Id_ProgettiFabbisogni) {

		return getService().createProgettiFabbisogni(Id_ProgettiFabbisogni);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static ProgettiFabbisogni deleteProgettiFabbisogni(
			long Id_ProgettiFabbisogni)
		throws PortalException {

		return getService().deleteProgettiFabbisogni(Id_ProgettiFabbisogni);
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
	public static ProgettiFabbisogni deleteProgettiFabbisogni(
		ProgettiFabbisogni progettiFabbisogni) {

		return getService().deleteProgettiFabbisogni(progettiFabbisogni);
	}

	public static ProgettiFabbisogni deleteProgettiFabbisogniWithChildren(
			long id)
		throws PortalException {

		return getService().deleteProgettiFabbisogniWithChildren(id);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ProgettiFabbisogni fetchProgettiFabbisogni(
		long Id_ProgettiFabbisogni) {

		return getService().fetchProgettiFabbisogni(Id_ProgettiFabbisogni);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the progetti fabbisogni with the primary key.
	 *
	 * @param Id_ProgettiFabbisogni the primary key of the progetti fabbisogni
	 * @return the progetti fabbisogni
	 * @throws PortalException if a progetti fabbisogni with the primary key could not be found
	 */
	public static ProgettiFabbisogni getProgettiFabbisogni(
			long Id_ProgettiFabbisogni)
		throws PortalException {

		return getService().getProgettiFabbisogni(Id_ProgettiFabbisogni);
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
	public static List<ProgettiFabbisogni> getProgettiFabbisognis(
		int start, int end) {

		return getService().getProgettiFabbisognis(start, end);
	}

	/**
	 * Returns the number of progetti fabbisognis.
	 *
	 * @return the number of progetti fabbisognis
	 */
	public static int getProgettiFabbisognisCount() {
		return getService().getProgettiFabbisognisCount();
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
	public static ProgettiFabbisogni updateProgettiFabbisogni(
		ProgettiFabbisogni progettiFabbisogni) {

		return getService().updateProgettiFabbisogni(progettiFabbisogni);
	}

	public static ProgettiFabbisogniLocalService getService() {
		return _service;
	}

	private static volatile ProgettiFabbisogniLocalService _service;

}