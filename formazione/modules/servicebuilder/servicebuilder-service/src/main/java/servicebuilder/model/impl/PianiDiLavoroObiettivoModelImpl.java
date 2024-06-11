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
import com.liferay.portal.kernel.util.GetterUtil;
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

import servicebuilder.model.PianiDiLavoroObiettivo;
import servicebuilder.model.PianiDiLavoroObiettivoModel;

/**
 * The base model implementation for the PianiDiLavoroObiettivo service. Represents a row in the &quot;AQ_PianiDiLavoroObiettivo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>PianiDiLavoroObiettivoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PianiDiLavoroObiettivoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianiDiLavoroObiettivoImpl
 * @generated
 */
public class PianiDiLavoroObiettivoModelImpl
	extends BaseModelImpl<PianiDiLavoroObiettivo>
	implements PianiDiLavoroObiettivoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a piani di lavoro obiettivo model instance should use the <code>PianiDiLavoroObiettivo</code> interface instead.
	 */
	public static final String TABLE_NAME = "AQ_PianiDiLavoroObiettivo";

	public static final Object[][] TABLE_COLUMNS = {
		{"Id_PianoDiLavoro", Types.BIGINT},
		{"CodicePianoLavoroObiettivo", Types.VARCHAR},
		{"FK_documenti", Types.BIGINT}, {"FK_progettiFabbisogni", Types.BIGINT},
		{"Descrizione", Types.VARCHAR}, {"DataInizioPiano", Types.TIMESTAMP},
		{"DataFinePiano", Types.TIMESTAMP},
		{"ImportoComplessivo", Types.DOUBLE}, {"userIns", Types.VARCHAR},
		{"userAgg", Types.VARCHAR}, {"dataIns", Types.TIMESTAMP},
		{"dataAgg", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("Id_PianoDiLavoro", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("CodicePianoLavoroObiettivo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("FK_documenti", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("FK_progettiFabbisogni", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("Descrizione", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("DataInizioPiano", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("DataFinePiano", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("ImportoComplessivo", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("userIns", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("userAgg", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dataIns", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("dataAgg", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table AQ_PianiDiLavoroObiettivo (Id_PianoDiLavoro LONG not null primary key,CodicePianoLavoroObiettivo VARCHAR(75) null,FK_documenti LONG,FK_progettiFabbisogni LONG,Descrizione VARCHAR(75) null,DataInizioPiano DATE null,DataFinePiano DATE null,ImportoComplessivo DOUBLE,userIns VARCHAR(75) null,userAgg VARCHAR(75) null,dataIns DATE null,dataAgg DATE null)";

	public static final String TABLE_SQL_DROP =
		"drop table AQ_PianiDiLavoroObiettivo";

	public static final String ORDER_BY_JPQL =
		" ORDER BY pianiDiLavoroObiettivo.Id_PianoDiLavoro ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY AQ_PianiDiLavoroObiettivo.Id_PianoDiLavoro ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long FK_PROGETTIFABBISOGNI_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ID_PIANODILAVORO_COLUMN_BITMASK = 2L;

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

	public PianiDiLavoroObiettivoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _Id_PianoDiLavoro;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId_PianoDiLavoro(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Id_PianoDiLavoro;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return PianiDiLavoroObiettivo.class;
	}

	@Override
	public String getModelClassName() {
		return PianiDiLavoroObiettivo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<PianiDiLavoroObiettivo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<PianiDiLavoroObiettivo, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PianiDiLavoroObiettivo, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((PianiDiLavoroObiettivo)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<PianiDiLavoroObiettivo, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<PianiDiLavoroObiettivo, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(PianiDiLavoroObiettivo)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<PianiDiLavoroObiettivo, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<PianiDiLavoroObiettivo, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<PianiDiLavoroObiettivo, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<PianiDiLavoroObiettivo, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<PianiDiLavoroObiettivo, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String, Function<PianiDiLavoroObiettivo, Object>>();
		Map<String, BiConsumer<PianiDiLavoroObiettivo, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap
					<String, BiConsumer<PianiDiLavoroObiettivo, ?>>();

		attributeGetterFunctions.put(
			"Id_PianoDiLavoro", PianiDiLavoroObiettivo::getId_PianoDiLavoro);
		attributeSetterBiConsumers.put(
			"Id_PianoDiLavoro",
			(BiConsumer<PianiDiLavoroObiettivo, Long>)
				PianiDiLavoroObiettivo::setId_PianoDiLavoro);
		attributeGetterFunctions.put(
			"CodicePianoLavoroObiettivo",
			PianiDiLavoroObiettivo::getCodicePianoLavoroObiettivo);
		attributeSetterBiConsumers.put(
			"CodicePianoLavoroObiettivo",
			(BiConsumer<PianiDiLavoroObiettivo, String>)
				PianiDiLavoroObiettivo::setCodicePianoLavoroObiettivo);
		attributeGetterFunctions.put(
			"FK_documenti", PianiDiLavoroObiettivo::getFK_documenti);
		attributeSetterBiConsumers.put(
			"FK_documenti",
			(BiConsumer<PianiDiLavoroObiettivo, Long>)
				PianiDiLavoroObiettivo::setFK_documenti);
		attributeGetterFunctions.put(
			"FK_progettiFabbisogni",
			PianiDiLavoroObiettivo::getFK_progettiFabbisogni);
		attributeSetterBiConsumers.put(
			"FK_progettiFabbisogni",
			(BiConsumer<PianiDiLavoroObiettivo, Long>)
				PianiDiLavoroObiettivo::setFK_progettiFabbisogni);
		attributeGetterFunctions.put(
			"Descrizione", PianiDiLavoroObiettivo::getDescrizione);
		attributeSetterBiConsumers.put(
			"Descrizione",
			(BiConsumer<PianiDiLavoroObiettivo, String>)
				PianiDiLavoroObiettivo::setDescrizione);
		attributeGetterFunctions.put(
			"DataInizioPiano", PianiDiLavoroObiettivo::getDataInizioPiano);
		attributeSetterBiConsumers.put(
			"DataInizioPiano",
			(BiConsumer<PianiDiLavoroObiettivo, Date>)
				PianiDiLavoroObiettivo::setDataInizioPiano);
		attributeGetterFunctions.put(
			"DataFinePiano", PianiDiLavoroObiettivo::getDataFinePiano);
		attributeSetterBiConsumers.put(
			"DataFinePiano",
			(BiConsumer<PianiDiLavoroObiettivo, Date>)
				PianiDiLavoroObiettivo::setDataFinePiano);
		attributeGetterFunctions.put(
			"ImportoComplessivo",
			PianiDiLavoroObiettivo::getImportoComplessivo);
		attributeSetterBiConsumers.put(
			"ImportoComplessivo",
			(BiConsumer<PianiDiLavoroObiettivo, Double>)
				PianiDiLavoroObiettivo::setImportoComplessivo);
		attributeGetterFunctions.put(
			"userIns", PianiDiLavoroObiettivo::getUserIns);
		attributeSetterBiConsumers.put(
			"userIns",
			(BiConsumer<PianiDiLavoroObiettivo, String>)
				PianiDiLavoroObiettivo::setUserIns);
		attributeGetterFunctions.put(
			"userAgg", PianiDiLavoroObiettivo::getUserAgg);
		attributeSetterBiConsumers.put(
			"userAgg",
			(BiConsumer<PianiDiLavoroObiettivo, String>)
				PianiDiLavoroObiettivo::setUserAgg);
		attributeGetterFunctions.put(
			"dataIns", PianiDiLavoroObiettivo::getDataIns);
		attributeSetterBiConsumers.put(
			"dataIns",
			(BiConsumer<PianiDiLavoroObiettivo, Date>)
				PianiDiLavoroObiettivo::setDataIns);
		attributeGetterFunctions.put(
			"dataAgg", PianiDiLavoroObiettivo::getDataAgg);
		attributeSetterBiConsumers.put(
			"dataAgg",
			(BiConsumer<PianiDiLavoroObiettivo, Date>)
				PianiDiLavoroObiettivo::setDataAgg);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public long getId_PianoDiLavoro() {
		return _Id_PianoDiLavoro;
	}

	@Override
	public void setId_PianoDiLavoro(long Id_PianoDiLavoro) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_Id_PianoDiLavoro = Id_PianoDiLavoro;
	}

	@Override
	public String getCodicePianoLavoroObiettivo() {
		if (_CodicePianoLavoroObiettivo == null) {
			return "";
		}
		else {
			return _CodicePianoLavoroObiettivo;
		}
	}

	@Override
	public void setCodicePianoLavoroObiettivo(
		String CodicePianoLavoroObiettivo) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_CodicePianoLavoroObiettivo = CodicePianoLavoroObiettivo;
	}

	@Override
	public long getFK_documenti() {
		return _FK_documenti;
	}

	@Override
	public void setFK_documenti(long FK_documenti) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_FK_documenti = FK_documenti;
	}

	@Override
	public long getFK_progettiFabbisogni() {
		return _FK_progettiFabbisogni;
	}

	@Override
	public void setFK_progettiFabbisogni(long FK_progettiFabbisogni) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_FK_progettiFabbisogni = FK_progettiFabbisogni;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalFK_progettiFabbisogni() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("FK_progettiFabbisogni"));
	}

	@Override
	public String getDescrizione() {
		if (_Descrizione == null) {
			return "";
		}
		else {
			return _Descrizione;
		}
	}

	@Override
	public void setDescrizione(String Descrizione) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_Descrizione = Descrizione;
	}

	@Override
	public Date getDataInizioPiano() {
		return _DataInizioPiano;
	}

	@Override
	public void setDataInizioPiano(Date DataInizioPiano) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_DataInizioPiano = DataInizioPiano;
	}

	@Override
	public Date getDataFinePiano() {
		return _DataFinePiano;
	}

	@Override
	public void setDataFinePiano(Date DataFinePiano) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_DataFinePiano = DataFinePiano;
	}

	@Override
	public Double getImportoComplessivo() {
		return _ImportoComplessivo;
	}

	@Override
	public void setImportoComplessivo(Double ImportoComplessivo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_ImportoComplessivo = ImportoComplessivo;
	}

	@Override
	public String getUserIns() {
		if (_userIns == null) {
			return "";
		}
		else {
			return _userIns;
		}
	}

	@Override
	public void setUserIns(String userIns) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userIns = userIns;
	}

	@Override
	public String getUserAgg() {
		if (_userAgg == null) {
			return "";
		}
		else {
			return _userAgg;
		}
	}

	@Override
	public void setUserAgg(String userAgg) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userAgg = userAgg;
	}

	@Override
	public Date getDataIns() {
		return _dataIns;
	}

	@Override
	public void setDataIns(Date dataIns) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dataIns = dataIns;
	}

	@Override
	public Date getDataAgg() {
		return _dataAgg;
	}

	@Override
	public void setDataAgg(Date dataAgg) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dataAgg = dataAgg;
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
			0, PianiDiLavoroObiettivo.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public PianiDiLavoroObiettivo toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, PianiDiLavoroObiettivo>
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
		PianiDiLavoroObiettivoImpl pianiDiLavoroObiettivoImpl =
			new PianiDiLavoroObiettivoImpl();

		pianiDiLavoroObiettivoImpl.setId_PianoDiLavoro(getId_PianoDiLavoro());
		pianiDiLavoroObiettivoImpl.setCodicePianoLavoroObiettivo(
			getCodicePianoLavoroObiettivo());
		pianiDiLavoroObiettivoImpl.setFK_documenti(getFK_documenti());
		pianiDiLavoroObiettivoImpl.setFK_progettiFabbisogni(
			getFK_progettiFabbisogni());
		pianiDiLavoroObiettivoImpl.setDescrizione(getDescrizione());
		pianiDiLavoroObiettivoImpl.setDataInizioPiano(getDataInizioPiano());
		pianiDiLavoroObiettivoImpl.setDataFinePiano(getDataFinePiano());
		pianiDiLavoroObiettivoImpl.setImportoComplessivo(
			getImportoComplessivo());
		pianiDiLavoroObiettivoImpl.setUserIns(getUserIns());
		pianiDiLavoroObiettivoImpl.setUserAgg(getUserAgg());
		pianiDiLavoroObiettivoImpl.setDataIns(getDataIns());
		pianiDiLavoroObiettivoImpl.setDataAgg(getDataAgg());

		pianiDiLavoroObiettivoImpl.resetOriginalValues();

		return pianiDiLavoroObiettivoImpl;
	}

	@Override
	public PianiDiLavoroObiettivo cloneWithOriginalValues() {
		PianiDiLavoroObiettivoImpl pianiDiLavoroObiettivoImpl =
			new PianiDiLavoroObiettivoImpl();

		pianiDiLavoroObiettivoImpl.setId_PianoDiLavoro(
			this.<Long>getColumnOriginalValue("Id_PianoDiLavoro"));
		pianiDiLavoroObiettivoImpl.setCodicePianoLavoroObiettivo(
			this.<String>getColumnOriginalValue("CodicePianoLavoroObiettivo"));
		pianiDiLavoroObiettivoImpl.setFK_documenti(
			this.<Long>getColumnOriginalValue("FK_documenti"));
		pianiDiLavoroObiettivoImpl.setFK_progettiFabbisogni(
			this.<Long>getColumnOriginalValue("FK_progettiFabbisogni"));
		pianiDiLavoroObiettivoImpl.setDescrizione(
			this.<String>getColumnOriginalValue("Descrizione"));
		pianiDiLavoroObiettivoImpl.setDataInizioPiano(
			this.<Date>getColumnOriginalValue("DataInizioPiano"));
		pianiDiLavoroObiettivoImpl.setDataFinePiano(
			this.<Date>getColumnOriginalValue("DataFinePiano"));
		pianiDiLavoroObiettivoImpl.setImportoComplessivo(
			this.<Double>getColumnOriginalValue("ImportoComplessivo"));
		pianiDiLavoroObiettivoImpl.setUserIns(
			this.<String>getColumnOriginalValue("userIns"));
		pianiDiLavoroObiettivoImpl.setUserAgg(
			this.<String>getColumnOriginalValue("userAgg"));
		pianiDiLavoroObiettivoImpl.setDataIns(
			this.<Date>getColumnOriginalValue("dataIns"));
		pianiDiLavoroObiettivoImpl.setDataAgg(
			this.<Date>getColumnOriginalValue("dataAgg"));

		return pianiDiLavoroObiettivoImpl;
	}

	@Override
	public int compareTo(PianiDiLavoroObiettivo pianiDiLavoroObiettivo) {
		long primaryKey = pianiDiLavoroObiettivo.getPrimaryKey();

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

		if (!(object instanceof PianiDiLavoroObiettivo)) {
			return false;
		}

		PianiDiLavoroObiettivo pianiDiLavoroObiettivo =
			(PianiDiLavoroObiettivo)object;

		long primaryKey = pianiDiLavoroObiettivo.getPrimaryKey();

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
	public CacheModel<PianiDiLavoroObiettivo> toCacheModel() {
		PianiDiLavoroObiettivoCacheModel pianiDiLavoroObiettivoCacheModel =
			new PianiDiLavoroObiettivoCacheModel();

		pianiDiLavoroObiettivoCacheModel.Id_PianoDiLavoro =
			getId_PianoDiLavoro();

		pianiDiLavoroObiettivoCacheModel.CodicePianoLavoroObiettivo =
			getCodicePianoLavoroObiettivo();

		String CodicePianoLavoroObiettivo =
			pianiDiLavoroObiettivoCacheModel.CodicePianoLavoroObiettivo;

		if ((CodicePianoLavoroObiettivo != null) &&
			(CodicePianoLavoroObiettivo.length() == 0)) {

			pianiDiLavoroObiettivoCacheModel.CodicePianoLavoroObiettivo = null;
		}

		pianiDiLavoroObiettivoCacheModel.FK_documenti = getFK_documenti();

		pianiDiLavoroObiettivoCacheModel.FK_progettiFabbisogni =
			getFK_progettiFabbisogni();

		pianiDiLavoroObiettivoCacheModel.Descrizione = getDescrizione();

		String Descrizione = pianiDiLavoroObiettivoCacheModel.Descrizione;

		if ((Descrizione != null) && (Descrizione.length() == 0)) {
			pianiDiLavoroObiettivoCacheModel.Descrizione = null;
		}

		Date DataInizioPiano = getDataInizioPiano();

		if (DataInizioPiano != null) {
			pianiDiLavoroObiettivoCacheModel.DataInizioPiano =
				DataInizioPiano.getTime();
		}
		else {
			pianiDiLavoroObiettivoCacheModel.DataInizioPiano = Long.MIN_VALUE;
		}

		Date DataFinePiano = getDataFinePiano();

		if (DataFinePiano != null) {
			pianiDiLavoroObiettivoCacheModel.DataFinePiano =
				DataFinePiano.getTime();
		}
		else {
			pianiDiLavoroObiettivoCacheModel.DataFinePiano = Long.MIN_VALUE;
		}

		Double ImportoComplessivo = getImportoComplessivo();

		if (ImportoComplessivo != null) {
			pianiDiLavoroObiettivoCacheModel.ImportoComplessivo =
				ImportoComplessivo;
		}

		pianiDiLavoroObiettivoCacheModel.userIns = getUserIns();

		String userIns = pianiDiLavoroObiettivoCacheModel.userIns;

		if ((userIns != null) && (userIns.length() == 0)) {
			pianiDiLavoroObiettivoCacheModel.userIns = null;
		}

		pianiDiLavoroObiettivoCacheModel.userAgg = getUserAgg();

		String userAgg = pianiDiLavoroObiettivoCacheModel.userAgg;

		if ((userAgg != null) && (userAgg.length() == 0)) {
			pianiDiLavoroObiettivoCacheModel.userAgg = null;
		}

		Date dataIns = getDataIns();

		if (dataIns != null) {
			pianiDiLavoroObiettivoCacheModel.dataIns = dataIns.getTime();
		}
		else {
			pianiDiLavoroObiettivoCacheModel.dataIns = Long.MIN_VALUE;
		}

		Date dataAgg = getDataAgg();

		if (dataAgg != null) {
			pianiDiLavoroObiettivoCacheModel.dataAgg = dataAgg.getTime();
		}
		else {
			pianiDiLavoroObiettivoCacheModel.dataAgg = Long.MIN_VALUE;
		}

		return pianiDiLavoroObiettivoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<PianiDiLavoroObiettivo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<PianiDiLavoroObiettivo, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PianiDiLavoroObiettivo, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(PianiDiLavoroObiettivo)this);

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
		Map<String, Function<PianiDiLavoroObiettivo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<PianiDiLavoroObiettivo, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PianiDiLavoroObiettivo, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(
				attributeGetterFunction.apply((PianiDiLavoroObiettivo)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, PianiDiLavoroObiettivo>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					PianiDiLavoroObiettivo.class, ModelWrapper.class);

	}

	private long _Id_PianoDiLavoro;
	private String _CodicePianoLavoroObiettivo;
	private long _FK_documenti;
	private long _FK_progettiFabbisogni;
	private String _Descrizione;
	private Date _DataInizioPiano;
	private Date _DataFinePiano;
	private Double _ImportoComplessivo;
	private String _userIns;
	private String _userAgg;
	private Date _dataIns;
	private Date _dataAgg;

	public <T> T getColumnValue(String columnName) {
		Function<PianiDiLavoroObiettivo, Object> function =
			_attributeGetterFunctions.get(columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((PianiDiLavoroObiettivo)this);
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

		_columnOriginalValues.put("Id_PianoDiLavoro", _Id_PianoDiLavoro);
		_columnOriginalValues.put(
			"CodicePianoLavoroObiettivo", _CodicePianoLavoroObiettivo);
		_columnOriginalValues.put("FK_documenti", _FK_documenti);
		_columnOriginalValues.put(
			"FK_progettiFabbisogni", _FK_progettiFabbisogni);
		_columnOriginalValues.put("Descrizione", _Descrizione);
		_columnOriginalValues.put("DataInizioPiano", _DataInizioPiano);
		_columnOriginalValues.put("DataFinePiano", _DataFinePiano);
		_columnOriginalValues.put("ImportoComplessivo", _ImportoComplessivo);
		_columnOriginalValues.put("userIns", _userIns);
		_columnOriginalValues.put("userAgg", _userAgg);
		_columnOriginalValues.put("dataIns", _dataIns);
		_columnOriginalValues.put("dataAgg", _dataAgg);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("Id_PianoDiLavoro", 1L);

		columnBitmasks.put("CodicePianoLavoroObiettivo", 2L);

		columnBitmasks.put("FK_documenti", 4L);

		columnBitmasks.put("FK_progettiFabbisogni", 8L);

		columnBitmasks.put("Descrizione", 16L);

		columnBitmasks.put("DataInizioPiano", 32L);

		columnBitmasks.put("DataFinePiano", 64L);

		columnBitmasks.put("ImportoComplessivo", 128L);

		columnBitmasks.put("userIns", 256L);

		columnBitmasks.put("userAgg", 512L);

		columnBitmasks.put("dataIns", 1024L);

		columnBitmasks.put("dataAgg", 2048L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private PianiDiLavoroObiettivo _escapedModel;

}