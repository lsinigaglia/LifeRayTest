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
 * This class is a wrapper for {@link ContrattiEsecutivi}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContrattiEsecutivi
 * @generated
 */
public class ContrattiEsecutiviWrapper
	extends BaseModelWrapper<ContrattiEsecutivi>
	implements ContrattiEsecutivi, ModelWrapper<ContrattiEsecutivi> {

	public ContrattiEsecutiviWrapper(ContrattiEsecutivi contrattiEsecutivi) {
		super(contrattiEsecutivi);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CodiceContratto", getCodiceContratto());
		attributes.put("Id_ContrattiEsecutivi", getId_ContrattiEsecutivi());
		attributes.put("FK_documenti", getFK_documenti());
		attributes.put("FK_progettiFabbisogni", getFK_progettiFabbisogni());
		attributes.put("Descrizione", getDescrizione());
		attributes.put("Stato", getStato());
		attributes.put("DataStato", getDataStato());
		attributes.put("DataInizioContratto", getDataInizioContratto());
		attributes.put("DataFineContratto", getDataFineContratto());
		attributes.put("ImportoComplessivo", getImportoComplessivo());
		attributes.put("userIns", getUserIns());
		attributes.put("userAgg", getUserAgg());
		attributes.put("dataIns", getDataIns());
		attributes.put("dataAgg", getDataAgg());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String CodiceContratto = (String)attributes.get("CodiceContratto");

		if (CodiceContratto != null) {
			setCodiceContratto(CodiceContratto);
		}

		Long Id_ContrattiEsecutivi = (Long)attributes.get(
			"Id_ContrattiEsecutivi");

		if (Id_ContrattiEsecutivi != null) {
			setId_ContrattiEsecutivi(Id_ContrattiEsecutivi);
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

		String Descrizione = (String)attributes.get("Descrizione");

		if (Descrizione != null) {
			setDescrizione(Descrizione);
		}

		String Stato = (String)attributes.get("Stato");

		if (Stato != null) {
			setStato(Stato);
		}

		Date DataStato = (Date)attributes.get("DataStato");

		if (DataStato != null) {
			setDataStato(DataStato);
		}

		Date DataInizioContratto = (Date)attributes.get("DataInizioContratto");

		if (DataInizioContratto != null) {
			setDataInizioContratto(DataInizioContratto);
		}

		Date DataFineContratto = (Date)attributes.get("DataFineContratto");

		if (DataFineContratto != null) {
			setDataFineContratto(DataFineContratto);
		}

		Double ImportoComplessivo = (Double)attributes.get(
			"ImportoComplessivo");

		if (ImportoComplessivo != null) {
			setImportoComplessivo(ImportoComplessivo);
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
	public ContrattiEsecutivi cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the codice contratto of this contratti esecutivi.
	 *
	 * @return the codice contratto of this contratti esecutivi
	 */
	@Override
	public String getCodiceContratto() {
		return model.getCodiceContratto();
	}

	/**
	 * Returns the data agg of this contratti esecutivi.
	 *
	 * @return the data agg of this contratti esecutivi
	 */
	@Override
	public Date getDataAgg() {
		return model.getDataAgg();
	}

	/**
	 * Returns the data fine contratto of this contratti esecutivi.
	 *
	 * @return the data fine contratto of this contratti esecutivi
	 */
	@Override
	public Date getDataFineContratto() {
		return model.getDataFineContratto();
	}

	/**
	 * Returns the data inizio contratto of this contratti esecutivi.
	 *
	 * @return the data inizio contratto of this contratti esecutivi
	 */
	@Override
	public Date getDataInizioContratto() {
		return model.getDataInizioContratto();
	}

	/**
	 * Returns the data ins of this contratti esecutivi.
	 *
	 * @return the data ins of this contratti esecutivi
	 */
	@Override
	public Date getDataIns() {
		return model.getDataIns();
	}

	/**
	 * Returns the data stato of this contratti esecutivi.
	 *
	 * @return the data stato of this contratti esecutivi
	 */
	@Override
	public Date getDataStato() {
		return model.getDataStato();
	}

	/**
	 * Returns the descrizione of this contratti esecutivi.
	 *
	 * @return the descrizione of this contratti esecutivi
	 */
	@Override
	public String getDescrizione() {
		return model.getDescrizione();
	}

	/**
	 * Returns the fk_documenti of this contratti esecutivi.
	 *
	 * @return the fk_documenti of this contratti esecutivi
	 */
	@Override
	public long getFK_documenti() {
		return model.getFK_documenti();
	}

	/**
	 * Returns the fk_progetti fabbisogni of this contratti esecutivi.
	 *
	 * @return the fk_progetti fabbisogni of this contratti esecutivi
	 */
	@Override
	public long getFK_progettiFabbisogni() {
		return model.getFK_progettiFabbisogni();
	}

	/**
	 * Returns the id_ contratti esecutivi of this contratti esecutivi.
	 *
	 * @return the id_ contratti esecutivi of this contratti esecutivi
	 */
	@Override
	public long getId_ContrattiEsecutivi() {
		return model.getId_ContrattiEsecutivi();
	}

	/**
	 * Returns the importo complessivo of this contratti esecutivi.
	 *
	 * @return the importo complessivo of this contratti esecutivi
	 */
	@Override
	public Double getImportoComplessivo() {
		return model.getImportoComplessivo();
	}

	/**
	 * Returns the primary key of this contratti esecutivi.
	 *
	 * @return the primary key of this contratti esecutivi
	 */
	@Override
	public servicebuilder.service.persistence.ContrattiEsecutiviPK
		getPrimaryKey() {

		return model.getPrimaryKey();
	}

	/**
	 * Returns the stato of this contratti esecutivi.
	 *
	 * @return the stato of this contratti esecutivi
	 */
	@Override
	public String getStato() {
		return model.getStato();
	}

	/**
	 * Returns the user agg of this contratti esecutivi.
	 *
	 * @return the user agg of this contratti esecutivi
	 */
	@Override
	public String getUserAgg() {
		return model.getUserAgg();
	}

	/**
	 * Returns the user ins of this contratti esecutivi.
	 *
	 * @return the user ins of this contratti esecutivi
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
	 * Sets the codice contratto of this contratti esecutivi.
	 *
	 * @param CodiceContratto the codice contratto of this contratti esecutivi
	 */
	@Override
	public void setCodiceContratto(String CodiceContratto) {
		model.setCodiceContratto(CodiceContratto);
	}

	/**
	 * Sets the data agg of this contratti esecutivi.
	 *
	 * @param dataAgg the data agg of this contratti esecutivi
	 */
	@Override
	public void setDataAgg(Date dataAgg) {
		model.setDataAgg(dataAgg);
	}

	/**
	 * Sets the data fine contratto of this contratti esecutivi.
	 *
	 * @param DataFineContratto the data fine contratto of this contratti esecutivi
	 */
	@Override
	public void setDataFineContratto(Date DataFineContratto) {
		model.setDataFineContratto(DataFineContratto);
	}

	/**
	 * Sets the data inizio contratto of this contratti esecutivi.
	 *
	 * @param DataInizioContratto the data inizio contratto of this contratti esecutivi
	 */
	@Override
	public void setDataInizioContratto(Date DataInizioContratto) {
		model.setDataInizioContratto(DataInizioContratto);
	}

	/**
	 * Sets the data ins of this contratti esecutivi.
	 *
	 * @param dataIns the data ins of this contratti esecutivi
	 */
	@Override
	public void setDataIns(Date dataIns) {
		model.setDataIns(dataIns);
	}

	/**
	 * Sets the data stato of this contratti esecutivi.
	 *
	 * @param DataStato the data stato of this contratti esecutivi
	 */
	@Override
	public void setDataStato(Date DataStato) {
		model.setDataStato(DataStato);
	}

	/**
	 * Sets the descrizione of this contratti esecutivi.
	 *
	 * @param Descrizione the descrizione of this contratti esecutivi
	 */
	@Override
	public void setDescrizione(String Descrizione) {
		model.setDescrizione(Descrizione);
	}

	/**
	 * Sets the fk_documenti of this contratti esecutivi.
	 *
	 * @param FK_documenti the fk_documenti of this contratti esecutivi
	 */
	@Override
	public void setFK_documenti(long FK_documenti) {
		model.setFK_documenti(FK_documenti);
	}

	/**
	 * Sets the fk_progetti fabbisogni of this contratti esecutivi.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni of this contratti esecutivi
	 */
	@Override
	public void setFK_progettiFabbisogni(long FK_progettiFabbisogni) {
		model.setFK_progettiFabbisogni(FK_progettiFabbisogni);
	}

	/**
	 * Sets the id_ contratti esecutivi of this contratti esecutivi.
	 *
	 * @param Id_ContrattiEsecutivi the id_ contratti esecutivi of this contratti esecutivi
	 */
	@Override
	public void setId_ContrattiEsecutivi(long Id_ContrattiEsecutivi) {
		model.setId_ContrattiEsecutivi(Id_ContrattiEsecutivi);
	}

	/**
	 * Sets the importo complessivo of this contratti esecutivi.
	 *
	 * @param ImportoComplessivo the importo complessivo of this contratti esecutivi
	 */
	@Override
	public void setImportoComplessivo(Double ImportoComplessivo) {
		model.setImportoComplessivo(ImportoComplessivo);
	}

	/**
	 * Sets the primary key of this contratti esecutivi.
	 *
	 * @param primaryKey the primary key of this contratti esecutivi
	 */
	@Override
	public void setPrimaryKey(
		servicebuilder.service.persistence.ContrattiEsecutiviPK primaryKey) {

		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the stato of this contratti esecutivi.
	 *
	 * @param Stato the stato of this contratti esecutivi
	 */
	@Override
	public void setStato(String Stato) {
		model.setStato(Stato);
	}

	/**
	 * Sets the user agg of this contratti esecutivi.
	 *
	 * @param userAgg the user agg of this contratti esecutivi
	 */
	@Override
	public void setUserAgg(String userAgg) {
		model.setUserAgg(userAgg);
	}

	/**
	 * Sets the user ins of this contratti esecutivi.
	 *
	 * @param userIns the user ins of this contratti esecutivi
	 */
	@Override
	public void setUserIns(String userIns) {
		model.setUserIns(userIns);
	}

	@Override
	protected ContrattiEsecutiviWrapper wrap(
		ContrattiEsecutivi contrattiEsecutivi) {

		return new ContrattiEsecutiviWrapper(contrattiEsecutivi);
	}

}