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
 * This class is a wrapper for {@link AttiDiAdesione}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttiDiAdesione
 * @generated
 */
public class AttiDiAdesioneWrapper
	extends BaseModelWrapper<AttiDiAdesione>
	implements AttiDiAdesione, ModelWrapper<AttiDiAdesione> {

	public AttiDiAdesioneWrapper(AttiDiAdesione attiDiAdesione) {
		super(attiDiAdesione);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id_AttiDiAdesione", getId_AttiDiAdesione());
		attributes.put("CodiceAttoDiAdesione", getCodiceAttoDiAdesione());
		attributes.put("FK_documenti", getFK_documenti());
		attributes.put("FK_accordoQuadro", getFK_accordoQuadro());
		attributes.put("Anno", getAnno());
		attributes.put("Stato", getStato());
		attributes.put("DataStato", getDataStato());
		attributes.put("Descrizione", getDescrizione());
		attributes.put("ImportoComplessivo", getImportoComplessivo());
		attributes.put("userIns", getUserIns());
		attributes.put("userAgg", getUserAgg());
		attributes.put("dataIns", getDataIns());
		attributes.put("dataAgg", getDataAgg());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id_AttiDiAdesione = (Long)attributes.get("Id_AttiDiAdesione");

		if (Id_AttiDiAdesione != null) {
			setId_AttiDiAdesione(Id_AttiDiAdesione);
		}

		String CodiceAttoDiAdesione = (String)attributes.get(
			"CodiceAttoDiAdesione");

		if (CodiceAttoDiAdesione != null) {
			setCodiceAttoDiAdesione(CodiceAttoDiAdesione);
		}

		Long FK_documenti = (Long)attributes.get("FK_documenti");

		if (FK_documenti != null) {
			setFK_documenti(FK_documenti);
		}

		Long FK_accordoQuadro = (Long)attributes.get("FK_accordoQuadro");

		if (FK_accordoQuadro != null) {
			setFK_accordoQuadro(FK_accordoQuadro);
		}

		Integer Anno = (Integer)attributes.get("Anno");

		if (Anno != null) {
			setAnno(Anno);
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
	public AttiDiAdesione cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the anno of this atti di adesione.
	 *
	 * @return the anno of this atti di adesione
	 */
	@Override
	public Integer getAnno() {
		return model.getAnno();
	}

	/**
	 * Returns the codice atto di adesione of this atti di adesione.
	 *
	 * @return the codice atto di adesione of this atti di adesione
	 */
	@Override
	public String getCodiceAttoDiAdesione() {
		return model.getCodiceAttoDiAdesione();
	}

	/**
	 * Returns the data agg of this atti di adesione.
	 *
	 * @return the data agg of this atti di adesione
	 */
	@Override
	public Date getDataAgg() {
		return model.getDataAgg();
	}

	/**
	 * Returns the data ins of this atti di adesione.
	 *
	 * @return the data ins of this atti di adesione
	 */
	@Override
	public Date getDataIns() {
		return model.getDataIns();
	}

	/**
	 * Returns the data stato of this atti di adesione.
	 *
	 * @return the data stato of this atti di adesione
	 */
	@Override
	public Date getDataStato() {
		return model.getDataStato();
	}

	/**
	 * Returns the descrizione of this atti di adesione.
	 *
	 * @return the descrizione of this atti di adesione
	 */
	@Override
	public String getDescrizione() {
		return model.getDescrizione();
	}

	/**
	 * Returns the fk_accordo quadro of this atti di adesione.
	 *
	 * @return the fk_accordo quadro of this atti di adesione
	 */
	@Override
	public long getFK_accordoQuadro() {
		return model.getFK_accordoQuadro();
	}

	/**
	 * Returns the fk_documenti of this atti di adesione.
	 *
	 * @return the fk_documenti of this atti di adesione
	 */
	@Override
	public long getFK_documenti() {
		return model.getFK_documenti();
	}

	/**
	 * Returns the id_ atti di adesione of this atti di adesione.
	 *
	 * @return the id_ atti di adesione of this atti di adesione
	 */
	@Override
	public long getId_AttiDiAdesione() {
		return model.getId_AttiDiAdesione();
	}

	/**
	 * Returns the importo complessivo of this atti di adesione.
	 *
	 * @return the importo complessivo of this atti di adesione
	 */
	@Override
	public Double getImportoComplessivo() {
		return model.getImportoComplessivo();
	}

	/**
	 * Returns the primary key of this atti di adesione.
	 *
	 * @return the primary key of this atti di adesione
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the stato of this atti di adesione.
	 *
	 * @return the stato of this atti di adesione
	 */
	@Override
	public String getStato() {
		return model.getStato();
	}

	/**
	 * Returns the user agg of this atti di adesione.
	 *
	 * @return the user agg of this atti di adesione
	 */
	@Override
	public String getUserAgg() {
		return model.getUserAgg();
	}

	/**
	 * Returns the user ins of this atti di adesione.
	 *
	 * @return the user ins of this atti di adesione
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
	 * Sets the anno of this atti di adesione.
	 *
	 * @param Anno the anno of this atti di adesione
	 */
	@Override
	public void setAnno(Integer Anno) {
		model.setAnno(Anno);
	}

	/**
	 * Sets the codice atto di adesione of this atti di adesione.
	 *
	 * @param CodiceAttoDiAdesione the codice atto di adesione of this atti di adesione
	 */
	@Override
	public void setCodiceAttoDiAdesione(String CodiceAttoDiAdesione) {
		model.setCodiceAttoDiAdesione(CodiceAttoDiAdesione);
	}

	/**
	 * Sets the data agg of this atti di adesione.
	 *
	 * @param dataAgg the data agg of this atti di adesione
	 */
	@Override
	public void setDataAgg(Date dataAgg) {
		model.setDataAgg(dataAgg);
	}

	/**
	 * Sets the data ins of this atti di adesione.
	 *
	 * @param dataIns the data ins of this atti di adesione
	 */
	@Override
	public void setDataIns(Date dataIns) {
		model.setDataIns(dataIns);
	}

	/**
	 * Sets the data stato of this atti di adesione.
	 *
	 * @param DataStato the data stato of this atti di adesione
	 */
	@Override
	public void setDataStato(Date DataStato) {
		model.setDataStato(DataStato);
	}

	/**
	 * Sets the descrizione of this atti di adesione.
	 *
	 * @param Descrizione the descrizione of this atti di adesione
	 */
	@Override
	public void setDescrizione(String Descrizione) {
		model.setDescrizione(Descrizione);
	}

	/**
	 * Sets the fk_accordo quadro of this atti di adesione.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro of this atti di adesione
	 */
	@Override
	public void setFK_accordoQuadro(long FK_accordoQuadro) {
		model.setFK_accordoQuadro(FK_accordoQuadro);
	}

	/**
	 * Sets the fk_documenti of this atti di adesione.
	 *
	 * @param FK_documenti the fk_documenti of this atti di adesione
	 */
	@Override
	public void setFK_documenti(long FK_documenti) {
		model.setFK_documenti(FK_documenti);
	}

	/**
	 * Sets the id_ atti di adesione of this atti di adesione.
	 *
	 * @param Id_AttiDiAdesione the id_ atti di adesione of this atti di adesione
	 */
	@Override
	public void setId_AttiDiAdesione(long Id_AttiDiAdesione) {
		model.setId_AttiDiAdesione(Id_AttiDiAdesione);
	}

	/**
	 * Sets the importo complessivo of this atti di adesione.
	 *
	 * @param ImportoComplessivo the importo complessivo of this atti di adesione
	 */
	@Override
	public void setImportoComplessivo(Double ImportoComplessivo) {
		model.setImportoComplessivo(ImportoComplessivo);
	}

	/**
	 * Sets the primary key of this atti di adesione.
	 *
	 * @param primaryKey the primary key of this atti di adesione
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the stato of this atti di adesione.
	 *
	 * @param Stato the stato of this atti di adesione
	 */
	@Override
	public void setStato(String Stato) {
		model.setStato(Stato);
	}

	/**
	 * Sets the user agg of this atti di adesione.
	 *
	 * @param userAgg the user agg of this atti di adesione
	 */
	@Override
	public void setUserAgg(String userAgg) {
		model.setUserAgg(userAgg);
	}

	/**
	 * Sets the user ins of this atti di adesione.
	 *
	 * @param userIns the user ins of this atti di adesione
	 */
	@Override
	public void setUserIns(String userIns) {
		model.setUserIns(userIns);
	}

	@Override
	protected AttiDiAdesioneWrapper wrap(AttiDiAdesione attiDiAdesione) {
		return new AttiDiAdesioneWrapper(attiDiAdesione);
	}

}