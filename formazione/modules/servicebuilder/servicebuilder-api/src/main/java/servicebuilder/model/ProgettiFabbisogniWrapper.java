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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ProgettiFabbisogni}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProgettiFabbisogni
 * @generated
 */
public class ProgettiFabbisogniWrapper
	extends BaseModelWrapper<ProgettiFabbisogni>
	implements ModelWrapper<ProgettiFabbisogni>, ProgettiFabbisogni {

	public ProgettiFabbisogniWrapper(ProgettiFabbisogni progettiFabbisogni) {
		super(progettiFabbisogni);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id_ProgettiFabbisogni", getId_ProgettiFabbisogni());
		attributes.put("CodiceFabbisogni", getCodiceFabbisogni());
		attributes.put("FK_documenti", getFK_documenti());
		attributes.put("FK_progettiFabbisogni", getFK_progettiFabbisogni());
		attributes.put("FK_pianiFabbisogni", getFK_pianiFabbisogni());
		attributes.put("Stato", getStato());
		attributes.put("DataStato", getDataStato());
		attributes.put("Descrizione", getDescrizione());
		attributes.put("DataScadenza", getDataScadenza());
		attributes.put("ImportoComplessivo", getImportoComplessivo());
		attributes.put("DataInizioPiano", getDataInizioPiano());
		attributes.put("DataFinePiano", getDataFinePiano());
		attributes.put("userIns", getUserIns());
		attributes.put("userAgg", getUserAgg());
		attributes.put("dataIns", getDataIns());
		attributes.put("dataAgg", getDataAgg());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id_ProgettiFabbisogni = (Long)attributes.get(
			"Id_ProgettiFabbisogni");

		if (Id_ProgettiFabbisogni != null) {
			setId_ProgettiFabbisogni(Id_ProgettiFabbisogni);
		}

		String CodiceFabbisogni = (String)attributes.get("CodiceFabbisogni");

		if (CodiceFabbisogni != null) {
			setCodiceFabbisogni(CodiceFabbisogni);
		}

		Long FK_documenti = (Long)attributes.get("FK_documenti");

		if (FK_documenti != null) {
			setFK_documenti(FK_documenti);
		}

		Long FK_progettiFabbisogni = (Long)attributes.get(
			"FK_progettiFabbisogni");

		if (FK_progettiFabbisogni != null) {
			setFK_progettiFabbisogni(FK_progettiFabbisogni);
		}

		Long FK_pianiFabbisogni = (Long)attributes.get("FK_pianiFabbisogni");

		if (FK_pianiFabbisogni != null) {
			setFK_pianiFabbisogni(FK_pianiFabbisogni);
		}

		String Stato = (String)attributes.get("Stato");

		if (Stato != null) {
			setStato(Stato);
		}

		Date DataStato = (Date)attributes.get("DataStato");

		if (DataStato != null) {
			setDataStato(DataStato);
		}

		String Descrizione = (String)attributes.get("Descrizione");

		if (Descrizione != null) {
			setDescrizione(Descrizione);
		}

		Date DataScadenza = (Date)attributes.get("DataScadenza");

		if (DataScadenza != null) {
			setDataScadenza(DataScadenza);
		}

		Double ImportoComplessivo = (Double)attributes.get(
			"ImportoComplessivo");

		if (ImportoComplessivo != null) {
			setImportoComplessivo(ImportoComplessivo);
		}

		Date DataInizioPiano = (Date)attributes.get("DataInizioPiano");

		if (DataInizioPiano != null) {
			setDataInizioPiano(DataInizioPiano);
		}

		Date DataFinePiano = (Date)attributes.get("DataFinePiano");

		if (DataFinePiano != null) {
			setDataFinePiano(DataFinePiano);
		}

		String userIns = (String)attributes.get("userIns");

		if (userIns != null) {
			setUserIns(userIns);
		}

		String userAgg = (String)attributes.get("userAgg");

		if (userAgg != null) {
			setUserAgg(userAgg);
		}

		Date dataIns = (Date)attributes.get("dataIns");

		if (dataIns != null) {
			setDataIns(dataIns);
		}

		Date dataAgg = (Date)attributes.get("dataAgg");

		if (dataAgg != null) {
			setDataAgg(dataAgg);
		}
	}

	@Override
	public ProgettiFabbisogni cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the codice fabbisogni of this progetti fabbisogni.
	 *
	 * @return the codice fabbisogni of this progetti fabbisogni
	 */
	@Override
	public String getCodiceFabbisogni() {
		return model.getCodiceFabbisogni();
	}

	/**
	 * Returns the data agg of this progetti fabbisogni.
	 *
	 * @return the data agg of this progetti fabbisogni
	 */
	@Override
	public Date getDataAgg() {
		return model.getDataAgg();
	}

	/**
	 * Returns the data fine piano of this progetti fabbisogni.
	 *
	 * @return the data fine piano of this progetti fabbisogni
	 */
	@Override
	public Date getDataFinePiano() {
		return model.getDataFinePiano();
	}

	/**
	 * Returns the data inizio piano of this progetti fabbisogni.
	 *
	 * @return the data inizio piano of this progetti fabbisogni
	 */
	@Override
	public Date getDataInizioPiano() {
		return model.getDataInizioPiano();
	}

	/**
	 * Returns the data ins of this progetti fabbisogni.
	 *
	 * @return the data ins of this progetti fabbisogni
	 */
	@Override
	public Date getDataIns() {
		return model.getDataIns();
	}

	/**
	 * Returns the data scadenza of this progetti fabbisogni.
	 *
	 * @return the data scadenza of this progetti fabbisogni
	 */
	@Override
	public Date getDataScadenza() {
		return model.getDataScadenza();
	}

	/**
	 * Returns the data stato of this progetti fabbisogni.
	 *
	 * @return the data stato of this progetti fabbisogni
	 */
	@Override
	public Date getDataStato() {
		return model.getDataStato();
	}

	/**
	 * Returns the descrizione of this progetti fabbisogni.
	 *
	 * @return the descrizione of this progetti fabbisogni
	 */
	@Override
	public String getDescrizione() {
		return model.getDescrizione();
	}

	/**
	 * Returns the fk_documenti of this progetti fabbisogni.
	 *
	 * @return the fk_documenti of this progetti fabbisogni
	 */
	@Override
	public long getFK_documenti() {
		return model.getFK_documenti();
	}

	/**
	 * Returns the fk_piani fabbisogni of this progetti fabbisogni.
	 *
	 * @return the fk_piani fabbisogni of this progetti fabbisogni
	 */
	@Override
	public long getFK_pianiFabbisogni() {
		return model.getFK_pianiFabbisogni();
	}

	/**
	 * Returns the fk_progetti fabbisogni of this progetti fabbisogni.
	 *
	 * @return the fk_progetti fabbisogni of this progetti fabbisogni
	 */
	@Override
	public long getFK_progettiFabbisogni() {
		return model.getFK_progettiFabbisogni();
	}

	/**
	 * Returns the id_ progetti fabbisogni of this progetti fabbisogni.
	 *
	 * @return the id_ progetti fabbisogni of this progetti fabbisogni
	 */
	@Override
	public long getId_ProgettiFabbisogni() {
		return model.getId_ProgettiFabbisogni();
	}

	/**
	 * Returns the importo complessivo of this progetti fabbisogni.
	 *
	 * @return the importo complessivo of this progetti fabbisogni
	 */
	@Override
	public Double getImportoComplessivo() {
		return model.getImportoComplessivo();
	}

	/**
	 * Returns the primary key of this progetti fabbisogni.
	 *
	 * @return the primary key of this progetti fabbisogni
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the stato of this progetti fabbisogni.
	 *
	 * @return the stato of this progetti fabbisogni
	 */
	@Override
	public String getStato() {
		return model.getStato();
	}

	/**
	 * Returns the user agg of this progetti fabbisogni.
	 *
	 * @return the user agg of this progetti fabbisogni
	 */
	@Override
	public String getUserAgg() {
		return model.getUserAgg();
	}

	/**
	 * Returns the user ins of this progetti fabbisogni.
	 *
	 * @return the user ins of this progetti fabbisogni
	 */
	@Override
	public String getUserIns() {
		return model.getUserIns();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the codice fabbisogni of this progetti fabbisogni.
	 *
	 * @param CodiceFabbisogni the codice fabbisogni of this progetti fabbisogni
	 */
	@Override
	public void setCodiceFabbisogni(String CodiceFabbisogni) {
		model.setCodiceFabbisogni(CodiceFabbisogni);
	}

	/**
	 * Sets the data agg of this progetti fabbisogni.
	 *
	 * @param dataAgg the data agg of this progetti fabbisogni
	 */
	@Override
	public void setDataAgg(Date dataAgg) {
		model.setDataAgg(dataAgg);
	}

	/**
	 * Sets the data fine piano of this progetti fabbisogni.
	 *
	 * @param DataFinePiano the data fine piano of this progetti fabbisogni
	 */
	@Override
	public void setDataFinePiano(Date DataFinePiano) {
		model.setDataFinePiano(DataFinePiano);
	}

	/**
	 * Sets the data inizio piano of this progetti fabbisogni.
	 *
	 * @param DataInizioPiano the data inizio piano of this progetti fabbisogni
	 */
	@Override
	public void setDataInizioPiano(Date DataInizioPiano) {
		model.setDataInizioPiano(DataInizioPiano);
	}

	/**
	 * Sets the data ins of this progetti fabbisogni.
	 *
	 * @param dataIns the data ins of this progetti fabbisogni
	 */
	@Override
	public void setDataIns(Date dataIns) {
		model.setDataIns(dataIns);
	}

	/**
	 * Sets the data scadenza of this progetti fabbisogni.
	 *
	 * @param DataScadenza the data scadenza of this progetti fabbisogni
	 */
	@Override
	public void setDataScadenza(Date DataScadenza) {
		model.setDataScadenza(DataScadenza);
	}

	/**
	 * Sets the data stato of this progetti fabbisogni.
	 *
	 * @param DataStato the data stato of this progetti fabbisogni
	 */
	@Override
	public void setDataStato(Date DataStato) {
		model.setDataStato(DataStato);
	}

	/**
	 * Sets the descrizione of this progetti fabbisogni.
	 *
	 * @param Descrizione the descrizione of this progetti fabbisogni
	 */
	@Override
	public void setDescrizione(String Descrizione) {
		model.setDescrizione(Descrizione);
	}

	/**
	 * Sets the fk_documenti of this progetti fabbisogni.
	 *
	 * @param FK_documenti the fk_documenti of this progetti fabbisogni
	 */
	@Override
	public void setFK_documenti(long FK_documenti) {
		model.setFK_documenti(FK_documenti);
	}

	/**
	 * Sets the fk_piani fabbisogni of this progetti fabbisogni.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni of this progetti fabbisogni
	 */
	@Override
	public void setFK_pianiFabbisogni(long FK_pianiFabbisogni) {
		model.setFK_pianiFabbisogni(FK_pianiFabbisogni);
	}

	/**
	 * Sets the fk_progetti fabbisogni of this progetti fabbisogni.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni of this progetti fabbisogni
	 */
	@Override
	public void setFK_progettiFabbisogni(long FK_progettiFabbisogni) {
		model.setFK_progettiFabbisogni(FK_progettiFabbisogni);
	}

	/**
	 * Sets the id_ progetti fabbisogni of this progetti fabbisogni.
	 *
	 * @param Id_ProgettiFabbisogni the id_ progetti fabbisogni of this progetti fabbisogni
	 */
	@Override
	public void setId_ProgettiFabbisogni(long Id_ProgettiFabbisogni) {
		model.setId_ProgettiFabbisogni(Id_ProgettiFabbisogni);
	}

	/**
	 * Sets the importo complessivo of this progetti fabbisogni.
	 *
	 * @param ImportoComplessivo the importo complessivo of this progetti fabbisogni
	 */
	@Override
	public void setImportoComplessivo(Double ImportoComplessivo) {
		model.setImportoComplessivo(ImportoComplessivo);
	}

	/**
	 * Sets the primary key of this progetti fabbisogni.
	 *
	 * @param primaryKey the primary key of this progetti fabbisogni
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the stato of this progetti fabbisogni.
	 *
	 * @param Stato the stato of this progetti fabbisogni
	 */
	@Override
	public void setStato(String Stato) {
		model.setStato(Stato);
	}

	/**
	 * Sets the user agg of this progetti fabbisogni.
	 *
	 * @param userAgg the user agg of this progetti fabbisogni
	 */
	@Override
	public void setUserAgg(String userAgg) {
		model.setUserAgg(userAgg);
	}

	/**
	 * Sets the user ins of this progetti fabbisogni.
	 *
	 * @param userIns the user ins of this progetti fabbisogni
	 */
	@Override
	public void setUserIns(String userIns) {
		model.setUserIns(userIns);
	}

	@Override
	protected ProgettiFabbisogniWrapper wrap(
		ProgettiFabbisogni progettiFabbisogni) {

		return new ProgettiFabbisogniWrapper(progettiFabbisogni);
	}

}