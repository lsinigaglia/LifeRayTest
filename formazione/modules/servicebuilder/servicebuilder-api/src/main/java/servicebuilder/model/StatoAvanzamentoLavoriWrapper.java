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
 * This class is a wrapper for {@link StatoAvanzamentoLavori}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StatoAvanzamentoLavori
 * @generated
 */
public class StatoAvanzamentoLavoriWrapper
	extends BaseModelWrapper<StatoAvanzamentoLavori>
	implements ModelWrapper<StatoAvanzamentoLavori>, StatoAvanzamentoLavori {

	public StatoAvanzamentoLavoriWrapper(
		StatoAvanzamentoLavori statoAvanzamentoLavori) {

		super(statoAvanzamentoLavori);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id_SAL", getId_SAL());
		attributes.put("FK_documenti", getFK_documenti());
		attributes.put("CodiceSAL", getCodiceSAL());
		attributes.put("Descrizione", getDescrizione());
		attributes.put("Stato", getStato());
		attributes.put("DataStato", getDataStato());
		attributes.put("MeseAnnoRiferimento", getMeseAnnoRiferimento());
		attributes.put("ImportoComplessivo", getImportoComplessivo());
		attributes.put("userIns", getUserIns());
		attributes.put("userAgg", getUserAgg());
		attributes.put("dataIns", getDataIns());
		attributes.put("dataAgg", getDataAgg());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id_SAL = (Long)attributes.get("Id_SAL");

		if (Id_SAL != null) {
			setId_SAL(Id_SAL);
		}

		Long FK_documenti = (Long)attributes.get("FK_documenti");

		if (FK_documenti != null) {
			setFK_documenti(FK_documenti);
		}

		String CodiceSAL = (String)attributes.get("CodiceSAL");

		if (CodiceSAL != null) {
			setCodiceSAL(CodiceSAL);
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

		String MeseAnnoRiferimento = (String)attributes.get(
			"MeseAnnoRiferimento");

		if (MeseAnnoRiferimento != null) {
			setMeseAnnoRiferimento(MeseAnnoRiferimento);
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
	public StatoAvanzamentoLavori cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the codice sal of this stato avanzamento lavori.
	 *
	 * @return the codice sal of this stato avanzamento lavori
	 */
	@Override
	public String getCodiceSAL() {
		return model.getCodiceSAL();
	}

	/**
	 * Returns the data agg of this stato avanzamento lavori.
	 *
	 * @return the data agg of this stato avanzamento lavori
	 */
	@Override
	public Date getDataAgg() {
		return model.getDataAgg();
	}

	/**
	 * Returns the data ins of this stato avanzamento lavori.
	 *
	 * @return the data ins of this stato avanzamento lavori
	 */
	@Override
	public Date getDataIns() {
		return model.getDataIns();
	}

	/**
	 * Returns the data stato of this stato avanzamento lavori.
	 *
	 * @return the data stato of this stato avanzamento lavori
	 */
	@Override
	public Date getDataStato() {
		return model.getDataStato();
	}

	/**
	 * Returns the descrizione of this stato avanzamento lavori.
	 *
	 * @return the descrizione of this stato avanzamento lavori
	 */
	@Override
	public String getDescrizione() {
		return model.getDescrizione();
	}

	/**
	 * Returns the fk_documenti of this stato avanzamento lavori.
	 *
	 * @return the fk_documenti of this stato avanzamento lavori
	 */
	@Override
	public long getFK_documenti() {
		return model.getFK_documenti();
	}

	/**
	 * Returns the id_sal of this stato avanzamento lavori.
	 *
	 * @return the id_sal of this stato avanzamento lavori
	 */
	@Override
	public long getId_SAL() {
		return model.getId_SAL();
	}

	/**
	 * Returns the importo complessivo of this stato avanzamento lavori.
	 *
	 * @return the importo complessivo of this stato avanzamento lavori
	 */
	@Override
	public Double getImportoComplessivo() {
		return model.getImportoComplessivo();
	}

	/**
	 * Returns the mese anno riferimento of this stato avanzamento lavori.
	 *
	 * @return the mese anno riferimento of this stato avanzamento lavori
	 */
	@Override
	public String getMeseAnnoRiferimento() {
		return model.getMeseAnnoRiferimento();
	}

	/**
	 * Returns the primary key of this stato avanzamento lavori.
	 *
	 * @return the primary key of this stato avanzamento lavori
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the stato of this stato avanzamento lavori.
	 *
	 * @return the stato of this stato avanzamento lavori
	 */
	@Override
	public String getStato() {
		return model.getStato();
	}

	/**
	 * Returns the user agg of this stato avanzamento lavori.
	 *
	 * @return the user agg of this stato avanzamento lavori
	 */
	@Override
	public String getUserAgg() {
		return model.getUserAgg();
	}

	/**
	 * Returns the user ins of this stato avanzamento lavori.
	 *
	 * @return the user ins of this stato avanzamento lavori
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
	 * Sets the codice sal of this stato avanzamento lavori.
	 *
	 * @param CodiceSAL the codice sal of this stato avanzamento lavori
	 */
	@Override
	public void setCodiceSAL(String CodiceSAL) {
		model.setCodiceSAL(CodiceSAL);
	}

	/**
	 * Sets the data agg of this stato avanzamento lavori.
	 *
	 * @param dataAgg the data agg of this stato avanzamento lavori
	 */
	@Override
	public void setDataAgg(Date dataAgg) {
		model.setDataAgg(dataAgg);
	}

	/**
	 * Sets the data ins of this stato avanzamento lavori.
	 *
	 * @param dataIns the data ins of this stato avanzamento lavori
	 */
	@Override
	public void setDataIns(Date dataIns) {
		model.setDataIns(dataIns);
	}

	/**
	 * Sets the data stato of this stato avanzamento lavori.
	 *
	 * @param DataStato the data stato of this stato avanzamento lavori
	 */
	@Override
	public void setDataStato(Date DataStato) {
		model.setDataStato(DataStato);
	}

	/**
	 * Sets the descrizione of this stato avanzamento lavori.
	 *
	 * @param Descrizione the descrizione of this stato avanzamento lavori
	 */
	@Override
	public void setDescrizione(String Descrizione) {
		model.setDescrizione(Descrizione);
	}

	/**
	 * Sets the fk_documenti of this stato avanzamento lavori.
	 *
	 * @param FK_documenti the fk_documenti of this stato avanzamento lavori
	 */
	@Override
	public void setFK_documenti(long FK_documenti) {
		model.setFK_documenti(FK_documenti);
	}

	/**
	 * Sets the id_sal of this stato avanzamento lavori.
	 *
	 * @param Id_SAL the id_sal of this stato avanzamento lavori
	 */
	@Override
	public void setId_SAL(long Id_SAL) {
		model.setId_SAL(Id_SAL);
	}

	/**
	 * Sets the importo complessivo of this stato avanzamento lavori.
	 *
	 * @param ImportoComplessivo the importo complessivo of this stato avanzamento lavori
	 */
	@Override
	public void setImportoComplessivo(Double ImportoComplessivo) {
		model.setImportoComplessivo(ImportoComplessivo);
	}

	/**
	 * Sets the mese anno riferimento of this stato avanzamento lavori.
	 *
	 * @param MeseAnnoRiferimento the mese anno riferimento of this stato avanzamento lavori
	 */
	@Override
	public void setMeseAnnoRiferimento(String MeseAnnoRiferimento) {
		model.setMeseAnnoRiferimento(MeseAnnoRiferimento);
	}

	/**
	 * Sets the primary key of this stato avanzamento lavori.
	 *
	 * @param primaryKey the primary key of this stato avanzamento lavori
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the stato of this stato avanzamento lavori.
	 *
	 * @param Stato the stato of this stato avanzamento lavori
	 */
	@Override
	public void setStato(String Stato) {
		model.setStato(Stato);
	}

	/**
	 * Sets the user agg of this stato avanzamento lavori.
	 *
	 * @param userAgg the user agg of this stato avanzamento lavori
	 */
	@Override
	public void setUserAgg(String userAgg) {
		model.setUserAgg(userAgg);
	}

	/**
	 * Sets the user ins of this stato avanzamento lavori.
	 *
	 * @param userIns the user ins of this stato avanzamento lavori
	 */
	@Override
	public void setUserIns(String userIns) {
		model.setUserIns(userIns);
	}

	@Override
	protected StatoAvanzamentoLavoriWrapper wrap(
		StatoAvanzamentoLavori statoAvanzamentoLavori) {

		return new StatoAvanzamentoLavoriWrapper(statoAvanzamentoLavori);
	}

}