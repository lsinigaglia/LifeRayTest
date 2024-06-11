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

import servicebuilder.model.StatoAvanzamentoLavori;
import servicebuilder.model.StatoAvanzamentoLavoriModel;

/**
 * The base model implementation for the StatoAvanzamentoLavori service. Represents a row in the &quot;AQ_StatoAvanzamentoLavori&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>StatoAvanzamentoLavoriModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StatoAvanzamentoLavoriImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StatoAvanzamentoLavoriImpl
 * @generated
 */
public class StatoAvanzamentoLavoriModelImpl
	extends BaseModelImpl<StatoAvanzamentoLavori>
	implements StatoAvanzamentoLavoriModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a stato avanzamento lavori model instance should use the <code>StatoAvanzamentoLavori</code> interface instead.
	 */
	public static final String TABLE_NAME = "AQ_StatoAvanzamentoLavori";

	public static final Object[][] TABLE_COLUMNS = {
		{"Id_SAL", Types.BIGINT}, {"FK_documenti", Types.BIGINT},
		{"CodiceSAL", Types.VARCHAR}, {"Descrizione", Types.VARCHAR},
		{"Stato", Types.VARCHAR}, {"DataStato", Types.TIMESTAMP},
		{"MeseAnnoRiferimento", Types.VARCHAR},
		{"ImportoComplessivo", Types.DOUBLE}, {"userIns", Types.VARCHAR},
		{"userAgg", Types.VARCHAR}, {"dataIns", Types.TIMESTAMP},
		{"dataAgg", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("Id_SAL", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("FK_documenti", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("CodiceSAL", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("Descrizione", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("Stato", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("DataStato", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("MeseAnnoRiferimento", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ImportoComplessivo", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("userIns", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("userAgg", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dataIns", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("dataAgg", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table AQ_StatoAvanzamentoLavori (Id_SAL LONG not null primary key,FK_documenti LONG,CodiceSAL VARCHAR(75) null,Descrizione VARCHAR(75) null,Stato VARCHAR(75) null,DataStato DATE null,MeseAnnoRiferimento VARCHAR(75) null,ImportoComplessivo DOUBLE,userIns VARCHAR(75) null,userAgg VARCHAR(75) null,dataIns DATE null,dataAgg DATE null)";

	public static final String TABLE_SQL_DROP =
		"drop table AQ_StatoAvanzamentoLavori";

	public static final String ORDER_BY_JPQL =
		" ORDER BY statoAvanzamentoLavori.Id_SAL ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY AQ_StatoAvanzamentoLavori.Id_SAL ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ID_SAL_COLUMN_BITMASK = 1L;

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

	public StatoAvanzamentoLavoriModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _Id_SAL;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId_SAL(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Id_SAL;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return StatoAvanzamentoLavori.class;
	}

	@Override
	public String getModelClassName() {
		return StatoAvanzamentoLavori.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<StatoAvanzamentoLavori, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<StatoAvanzamentoLavori, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<StatoAvanzamentoLavori, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((StatoAvanzamentoLavori)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<StatoAvanzamentoLavori, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<StatoAvanzamentoLavori, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(StatoAvanzamentoLavori)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<StatoAvanzamentoLavori, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<StatoAvanzamentoLavori, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<StatoAvanzamentoLavori, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<StatoAvanzamentoLavori, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<StatoAvanzamentoLavori, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String, Function<StatoAvanzamentoLavori, Object>>();
		Map<String, BiConsumer<StatoAvanzamentoLavori, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap
					<String, BiConsumer<StatoAvanzamentoLavori, ?>>();

		attributeGetterFunctions.put(
			"Id_SAL", StatoAvanzamentoLavori::getId_SAL);
		attributeSetterBiConsumers.put(
			"Id_SAL",
			(BiConsumer<StatoAvanzamentoLavori, Long>)
				StatoAvanzamentoLavori::setId_SAL);
		attributeGetterFunctions.put(
			"FK_documenti", StatoAvanzamentoLavori::getFK_documenti);
		attributeSetterBiConsumers.put(
			"FK_documenti",
			(BiConsumer<StatoAvanzamentoLavori, Long>)
				StatoAvanzamentoLavori::setFK_documenti);
		attributeGetterFunctions.put(
			"CodiceSAL", StatoAvanzamentoLavori::getCodiceSAL);
		attributeSetterBiConsumers.put(
			"CodiceSAL",
			(BiConsumer<StatoAvanzamentoLavori, String>)
				StatoAvanzamentoLavori::setCodiceSAL);
		attributeGetterFunctions.put(
			"Descrizione", StatoAvanzamentoLavori::getDescrizione);
		attributeSetterBiConsumers.put(
			"Descrizione",
			(BiConsumer<StatoAvanzamentoLavori, String>)
				StatoAvanzamentoLavori::setDescrizione);
		attributeGetterFunctions.put("Stato", StatoAvanzamentoLavori::getStato);
		attributeSetterBiConsumers.put(
			"Stato",
			(BiConsumer<StatoAvanzamentoLavori, String>)
				StatoAvanzamentoLavori::setStato);
		attributeGetterFunctions.put(
			"DataStato", StatoAvanzamentoLavori::getDataStato);
		attributeSetterBiConsumers.put(
			"DataStato",
			(BiConsumer<StatoAvanzamentoLavori, Date>)
				StatoAvanzamentoLavori::setDataStato);
		attributeGetterFunctions.put(
			"MeseAnnoRiferimento",
			StatoAvanzamentoLavori::getMeseAnnoRiferimento);
		attributeSetterBiConsumers.put(
			"MeseAnnoRiferimento",
			(BiConsumer<StatoAvanzamentoLavori, String>)
				StatoAvanzamentoLavori::setMeseAnnoRiferimento);
		attributeGetterFunctions.put(
			"ImportoComplessivo",
			StatoAvanzamentoLavori::getImportoComplessivo);
		attributeSetterBiConsumers.put(
			"ImportoComplessivo",
			(BiConsumer<StatoAvanzamentoLavori, Double>)
				StatoAvanzamentoLavori::setImportoComplessivo);
		attributeGetterFunctions.put(
			"userIns", StatoAvanzamentoLavori::getUserIns);
		attributeSetterBiConsumers.put(
			"userIns",
			(BiConsumer<StatoAvanzamentoLavori, String>)
				StatoAvanzamentoLavori::setUserIns);
		attributeGetterFunctions.put(
			"userAgg", StatoAvanzamentoLavori::getUserAgg);
		attributeSetterBiConsumers.put(
			"userAgg",
			(BiConsumer<StatoAvanzamentoLavori, String>)
				StatoAvanzamentoLavori::setUserAgg);
		attributeGetterFunctions.put(
			"dataIns", StatoAvanzamentoLavori::getDataIns);
		attributeSetterBiConsumers.put(
			"dataIns",
			(BiConsumer<StatoAvanzamentoLavori, Date>)
				StatoAvanzamentoLavori::setDataIns);
		attributeGetterFunctions.put(
			"dataAgg", StatoAvanzamentoLavori::getDataAgg);
		attributeSetterBiConsumers.put(
			"dataAgg",
			(BiConsumer<StatoAvanzamentoLavori, Date>)
				StatoAvanzamentoLavori::setDataAgg);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
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
	public String getCodiceSAL() {
		if (_CodiceSAL == null) {
			return "";
		}
		else {
			return _CodiceSAL;
		}
	}

	@Override
	public void setCodiceSAL(String CodiceSAL) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_CodiceSAL = CodiceSAL;
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
	public String getStato() {
		if (_Stato == null) {
			return "";
		}
		else {
			return _Stato;
		}
	}

	@Override
	public void setStato(String Stato) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_Stato = Stato;
	}

	@Override
	public Date getDataStato() {
		return _DataStato;
	}

	@Override
	public void setDataStato(Date DataStato) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_DataStato = DataStato;
	}

	@Override
	public String getMeseAnnoRiferimento() {
		if (_MeseAnnoRiferimento == null) {
			return "";
		}
		else {
			return _MeseAnnoRiferimento;
		}
	}

	@Override
	public void setMeseAnnoRiferimento(String MeseAnnoRiferimento) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_MeseAnnoRiferimento = MeseAnnoRiferimento;
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
			0, StatoAvanzamentoLavori.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public StatoAvanzamentoLavori toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, StatoAvanzamentoLavori>
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
		StatoAvanzamentoLavoriImpl statoAvanzamentoLavoriImpl =
			new StatoAvanzamentoLavoriImpl();

		statoAvanzamentoLavoriImpl.setId_SAL(getId_SAL());
		statoAvanzamentoLavoriImpl.setFK_documenti(getFK_documenti());
		statoAvanzamentoLavoriImpl.setCodiceSAL(getCodiceSAL());
		statoAvanzamentoLavoriImpl.setDescrizione(getDescrizione());
		statoAvanzamentoLavoriImpl.setStato(getStato());
		statoAvanzamentoLavoriImpl.setDataStato(getDataStato());
		statoAvanzamentoLavoriImpl.setMeseAnnoRiferimento(
			getMeseAnnoRiferimento());
		statoAvanzamentoLavoriImpl.setImportoComplessivo(
			getImportoComplessivo());
		statoAvanzamentoLavoriImpl.setUserIns(getUserIns());
		statoAvanzamentoLavoriImpl.setUserAgg(getUserAgg());
		statoAvanzamentoLavoriImpl.setDataIns(getDataIns());
		statoAvanzamentoLavoriImpl.setDataAgg(getDataAgg());

		statoAvanzamentoLavoriImpl.resetOriginalValues();

		return statoAvanzamentoLavoriImpl;
	}

	@Override
	public StatoAvanzamentoLavori cloneWithOriginalValues() {
		StatoAvanzamentoLavoriImpl statoAvanzamentoLavoriImpl =
			new StatoAvanzamentoLavoriImpl();

		statoAvanzamentoLavoriImpl.setId_SAL(
			this.<Long>getColumnOriginalValue("Id_SAL"));
		statoAvanzamentoLavoriImpl.setFK_documenti(
			this.<Long>getColumnOriginalValue("FK_documenti"));
		statoAvanzamentoLavoriImpl.setCodiceSAL(
			this.<String>getColumnOriginalValue("CodiceSAL"));
		statoAvanzamentoLavoriImpl.setDescrizione(
			this.<String>getColumnOriginalValue("Descrizione"));
		statoAvanzamentoLavoriImpl.setStato(
			this.<String>getColumnOriginalValue("Stato"));
		statoAvanzamentoLavoriImpl.setDataStato(
			this.<Date>getColumnOriginalValue("DataStato"));
		statoAvanzamentoLavoriImpl.setMeseAnnoRiferimento(
			this.<String>getColumnOriginalValue("MeseAnnoRiferimento"));
		statoAvanzamentoLavoriImpl.setImportoComplessivo(
			this.<Double>getColumnOriginalValue("ImportoComplessivo"));
		statoAvanzamentoLavoriImpl.setUserIns(
			this.<String>getColumnOriginalValue("userIns"));
		statoAvanzamentoLavoriImpl.setUserAgg(
			this.<String>getColumnOriginalValue("userAgg"));
		statoAvanzamentoLavoriImpl.setDataIns(
			this.<Date>getColumnOriginalValue("dataIns"));
		statoAvanzamentoLavoriImpl.setDataAgg(
			this.<Date>getColumnOriginalValue("dataAgg"));

		return statoAvanzamentoLavoriImpl;
	}

	@Override
	public int compareTo(StatoAvanzamentoLavori statoAvanzamentoLavori) {
		long primaryKey = statoAvanzamentoLavori.getPrimaryKey();

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

		if (!(object instanceof StatoAvanzamentoLavori)) {
			return false;
		}

		StatoAvanzamentoLavori statoAvanzamentoLavori =
			(StatoAvanzamentoLavori)object;

		long primaryKey = statoAvanzamentoLavori.getPrimaryKey();

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
	public CacheModel<StatoAvanzamentoLavori> toCacheModel() {
		StatoAvanzamentoLavoriCacheModel statoAvanzamentoLavoriCacheModel =
			new StatoAvanzamentoLavoriCacheModel();

		statoAvanzamentoLavoriCacheModel.Id_SAL = getId_SAL();

		statoAvanzamentoLavoriCacheModel.FK_documenti = getFK_documenti();

		statoAvanzamentoLavoriCacheModel.CodiceSAL = getCodiceSAL();

		String CodiceSAL = statoAvanzamentoLavoriCacheModel.CodiceSAL;

		if ((CodiceSAL != null) && (CodiceSAL.length() == 0)) {
			statoAvanzamentoLavoriCacheModel.CodiceSAL = null;
		}

		statoAvanzamentoLavoriCacheModel.Descrizione = getDescrizione();

		String Descrizione = statoAvanzamentoLavoriCacheModel.Descrizione;

		if ((Descrizione != null) && (Descrizione.length() == 0)) {
			statoAvanzamentoLavoriCacheModel.Descrizione = null;
		}

		statoAvanzamentoLavoriCacheModel.Stato = getStato();

		String Stato = statoAvanzamentoLavoriCacheModel.Stato;

		if ((Stato != null) && (Stato.length() == 0)) {
			statoAvanzamentoLavoriCacheModel.Stato = null;
		}

		Date DataStato = getDataStato();

		if (DataStato != null) {
			statoAvanzamentoLavoriCacheModel.DataStato = DataStato.getTime();
		}
		else {
			statoAvanzamentoLavoriCacheModel.DataStato = Long.MIN_VALUE;
		}

		statoAvanzamentoLavoriCacheModel.MeseAnnoRiferimento =
			getMeseAnnoRiferimento();

		String MeseAnnoRiferimento =
			statoAvanzamentoLavoriCacheModel.MeseAnnoRiferimento;

		if ((MeseAnnoRiferimento != null) &&
			(MeseAnnoRiferimento.length() == 0)) {

			statoAvanzamentoLavoriCacheModel.MeseAnnoRiferimento = null;
		}

		Double ImportoComplessivo = getImportoComplessivo();

		if (ImportoComplessivo != null) {
			statoAvanzamentoLavoriCacheModel.ImportoComplessivo =
				ImportoComplessivo;
		}

		statoAvanzamentoLavoriCacheModel.userIns = getUserIns();

		String userIns = statoAvanzamentoLavoriCacheModel.userIns;

		if ((userIns != null) && (userIns.length() == 0)) {
			statoAvanzamentoLavoriCacheModel.userIns = null;
		}

		statoAvanzamentoLavoriCacheModel.userAgg = getUserAgg();

		String userAgg = statoAvanzamentoLavoriCacheModel.userAgg;

		if ((userAgg != null) && (userAgg.length() == 0)) {
			statoAvanzamentoLavoriCacheModel.userAgg = null;
		}

		Date dataIns = getDataIns();

		if (dataIns != null) {
			statoAvanzamentoLavoriCacheModel.dataIns = dataIns.getTime();
		}
		else {
			statoAvanzamentoLavoriCacheModel.dataIns = Long.MIN_VALUE;
		}

		Date dataAgg = getDataAgg();

		if (dataAgg != null) {
			statoAvanzamentoLavoriCacheModel.dataAgg = dataAgg.getTime();
		}
		else {
			statoAvanzamentoLavoriCacheModel.dataAgg = Long.MIN_VALUE;
		}

		return statoAvanzamentoLavoriCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<StatoAvanzamentoLavori, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<StatoAvanzamentoLavori, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<StatoAvanzamentoLavori, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(StatoAvanzamentoLavori)this);

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
		Map<String, Function<StatoAvanzamentoLavori, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<StatoAvanzamentoLavori, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<StatoAvanzamentoLavori, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(
				attributeGetterFunction.apply((StatoAvanzamentoLavori)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, StatoAvanzamentoLavori>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					StatoAvanzamentoLavori.class, ModelWrapper.class);

	}

	private long _Id_SAL;
	private long _FK_documenti;
	private String _CodiceSAL;
	private String _Descrizione;
	private String _Stato;
	private Date _DataStato;
	private String _MeseAnnoRiferimento;
	private Double _ImportoComplessivo;
	private String _userIns;
	private String _userAgg;
	private Date _dataIns;
	private Date _dataAgg;

	public <T> T getColumnValue(String columnName) {
		Function<StatoAvanzamentoLavori, Object> function =
			_attributeGetterFunctions.get(columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((StatoAvanzamentoLavori)this);
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

		_columnOriginalValues.put("Id_SAL", _Id_SAL);
		_columnOriginalValues.put("FK_documenti", _FK_documenti);
		_columnOriginalValues.put("CodiceSAL", _CodiceSAL);
		_columnOriginalValues.put("Descrizione", _Descrizione);
		_columnOriginalValues.put("Stato", _Stato);
		_columnOriginalValues.put("DataStato", _DataStato);
		_columnOriginalValues.put("MeseAnnoRiferimento", _MeseAnnoRiferimento);
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

		columnBitmasks.put("Id_SAL", 1L);

		columnBitmasks.put("FK_documenti", 2L);

		columnBitmasks.put("CodiceSAL", 4L);

		columnBitmasks.put("Descrizione", 8L);

		columnBitmasks.put("Stato", 16L);

		columnBitmasks.put("DataStato", 32L);

		columnBitmasks.put("MeseAnnoRiferimento", 64L);

		columnBitmasks.put("ImportoComplessivo", 128L);

		columnBitmasks.put("userIns", 256L);

		columnBitmasks.put("userAgg", 512L);

		columnBitmasks.put("dataIns", 1024L);

		columnBitmasks.put("dataAgg", 2048L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private StatoAvanzamentoLavori _escapedModel;

}