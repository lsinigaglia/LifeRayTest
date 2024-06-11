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

package servicebuilder.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

import servicebuilder.model.ProgettiFabbisogniTable;
import servicebuilder.model.impl.ProgettiFabbisogniImpl;
import servicebuilder.model.impl.ProgettiFabbisogniModelImpl;

/**
 * The arguments resolver class for retrieving value from ProgettiFabbisogni.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	immediate = true,
	service = {
		ProgettiFabbisogniModelArgumentsResolver.class, ArgumentsResolver.class
	}
)
public class ProgettiFabbisogniModelArgumentsResolver
	implements ArgumentsResolver {

	@Override
	public Object[] getArguments(
		FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
		boolean original) {

		String[] columnNames = finderPath.getColumnNames();

		if ((columnNames == null) || (columnNames.length == 0)) {
			if (baseModel.isNew()) {
				return new Object[0];
			}

			return null;
		}

		ProgettiFabbisogniModelImpl progettiFabbisogniModelImpl =
			(ProgettiFabbisogniModelImpl)baseModel;

		long columnBitmask = progettiFabbisogniModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				progettiFabbisogniModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					progettiFabbisogniModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				progettiFabbisogniModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return ProgettiFabbisogniImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return ProgettiFabbisogniTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		ProgettiFabbisogniModelImpl progettiFabbisogniModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					progettiFabbisogniModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = progettiFabbisogniModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}