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

package servicebuilder.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AttiDiAdesione service. Represents a row in the &quot;AQ_AttiDiAdesione&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AttiDiAdesioneModel
 * @generated
 */
@ImplementationClassName("servicebuilder.model.impl.AttiDiAdesioneImpl")
@ProviderType
public interface AttiDiAdesione extends AttiDiAdesioneModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>servicebuilder.model.impl.AttiDiAdesioneImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AttiDiAdesione, Long>
		ID__ATTI_DI_ADESIONE_ACCESSOR = new Accessor<AttiDiAdesione, Long>() {

			@Override
			public Long get(AttiDiAdesione attiDiAdesione) {
				return attiDiAdesione.getId_AttiDiAdesione();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AttiDiAdesione> getTypeClass() {
				return AttiDiAdesione.class;
			}

		};

}