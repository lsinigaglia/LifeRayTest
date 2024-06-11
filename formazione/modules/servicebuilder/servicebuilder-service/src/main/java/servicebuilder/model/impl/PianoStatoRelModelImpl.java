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

package servicebuilder.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

import servicebuilder.model.PianoStatoRel;
import servicebuilder.model.PianoStatoRelModel;

/**
 * The base model implementation for the PianoStatoRel service. Represents a row in the &quot;AQ_PianoStatoRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>PianoStatoRelModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PianoStatoRelImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianoStatoRelImpl
 * @generated
 */
public class PianoStatoRelModelImpl
	extends BaseModelImpl<PianoStatoRel> implements PianoStatoRelModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a piano stato rel model instance should use the <code>PianoStatoRel</code> interface instead.
	 */
	public static final String TABLE_NAME = "AQ_PianoStatoRel";

	public static final Object[][] TABLE_COLUMNS = {
		{"Id_Relazione", Types.BIGINT}, {"Id_PianodiLavoro", Types.BIGINT},
		{"Id_SAL", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("Id_Relazione", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("Id_PianodiLavoro", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("Id_SAL", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table AQ_PianoStatoRel (Id_Relazione LONG not null primary key,Id_PianodiLavoro LONG,Id_SAL LONG)";

	public static final String TABLE_SQL_DROP = "drop table AQ_PianoStatoRel";

	public static final String ORDER_BY_JPQL =
		" ORDER BY pianoStatoRel.Id_Relazione ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY AQ_PianoStatoRel.Id_Relazione ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ID_RELAZIONE_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public PianoStatoRelModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _Id_Relazione;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId_Relazione(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Id_Relazione;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return PianoStatoRel.class;
	}

	@Override
	public String getModelClassName() {
		return PianoStatoRel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<PianoStatoRel, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<PianoStatoRel, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PianoStatoRel, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((PianoStatoRel)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<PianoStatoRel, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<PianoStatoRel, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(PianoStatoRel)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<PianoStatoRel, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<PianoStatoRel, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<PianoStatoRel, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<PianoStatoRel, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<PianoStatoRel, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<PianoStatoRel, Object>>();
		Map<String, BiConsumer<PianoStatoRel, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<PianoStatoRel, ?>>();

		attributeGetterFunctions.put(
			"Id_Relazione", PianoStatoRel::getId_Relazione);
		attributeSetterBiConsumers.put(
			"Id_Relazione",
			(BiConsumer<PianoStatoRel, Long>)PianoStatoRel::setId_Relazione);
		attributeGetterFunctions.put(
			"Id_PianodiLavoro", PianoStatoRel::getId_PianodiLavoro);
		attributeSetterBiConsumers.put(
			"Id_PianodiLavoro",
			(BiConsumer<PianoStatoRel, Long>)
				PianoStatoRel::setId_PianodiLavoro);
		attributeGetterFunctions.put("Id_SAL", PianoStatoRel::getId_SAL);
		attributeSetterBiConsumers.put(
			"Id_SAL",
			(BiConsumer<PianoStatoRel, Long>)PianoStatoRel::setId_SAL);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public long getId_Relazione() {
		return _Id_Relazione;
	}

	@Override
	public void setId_Relazione(long Id_Relazione) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_Id_Relazione = Id_Relazione;
	}

	@Override
	public long getId_PianodiLavoro() {
		return _Id_PianodiLavoro;
	}

	@Override
	public void setId_PianodiLavoro(long Id_PianodiLavoro) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_Id_PianodiLavoro = Id_PianodiLavoro;
	}

	@Override
	public long getId_SAL() {
		return _Id_SAL;
	}

	@Override
	public void setId_SAL(long Id_SAL) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_Id_SAL = Id_SAL;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, PianoStatoRel.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public PianoStatoRel toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, PianoStatoRel>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PianoStatoRelImpl pianoStatoRelImpl = new PianoStatoRelImpl();

		pianoStatoRelImpl.setId_Relazione(getId_Relazione());
		pianoStatoRelImpl.setId_PianodiLavoro(getId_PianodiLavoro());
		pianoStatoRelImpl.setId_SAL(getId_SAL());

		pianoStatoRelImpl.resetOriginalValues();

		return pianoStatoRelImpl;
	}

	@Override
	public PianoStatoRel cloneWithOriginalValues() {
		PianoStatoRelImpl pianoStatoRelImpl = new PianoStatoRelImpl();

		pianoStatoRelImpl.setId_Relazione(
			this.<Long>getColumnOriginalValue("Id_Relazione"));
		pianoStatoRelImpl.setId_PianodiLavoro(
			this.<Long>getColumnOriginalValue("Id_PianodiLavoro"));
		pianoStatoRelImpl.setId_SAL(
			this.<Long>getColumnOriginalValue("Id_SAL"));

		return pianoStatoRelImpl;
	}

	@Override
	public int compareTo(PianoStatoRel pianoStatoRel) {
		long primaryKey = pianoStatoRel.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PianoStatoRel)) {
			return false;
		}

		PianoStatoRel pianoStatoRel = (PianoStatoRel)object;

		long primaryKey = pianoStatoRel.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<PianoStatoRel> toCacheModel() {
		PianoStatoRelCacheModel pianoStatoRelCacheModel =
			new PianoStatoRelCacheModel();

		pianoStatoRelCacheModel.Id_Relazione = getId_Relazione();

		pianoStatoRelCacheModel.Id_PianodiLavoro = getId_PianodiLavoro();

		pianoStatoRelCacheModel.Id_SAL = getId_SAL();

		return pianoStatoRelCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<PianoStatoRel, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<PianoStatoRel, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PianoStatoRel, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((PianoStatoRel)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<PianoStatoRel, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<PianoStatoRel, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PianoStatoRel, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((PianoStatoRel)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, PianoStatoRel>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					PianoStatoRel.class, ModelWrapper.class);

	}

	private long _Id_Relazione;
	private long _Id_PianodiLavoro;
	private long _Id_SAL;

	public <T> T getColumnValue(String columnName) {
		Function<PianoStatoRel, Object> function =
			_attributeGetterFunctions.get(columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((PianoStatoRel)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("Id_Relazione", _Id_Relazione);
		_columnOriginalValues.put("Id_PianodiLavoro", _Id_PianodiLavoro);
		_columnOriginalValues.put("Id_SAL", _Id_SAL);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("Id_Relazione", 1L);

		columnBitmasks.put("Id_PianodiLavoro", 2L);

		columnBitmasks.put("Id_SAL", 4L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private PianoStatoRel _escapedModel;

}