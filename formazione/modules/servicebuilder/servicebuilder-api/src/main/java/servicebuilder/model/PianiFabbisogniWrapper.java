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
 * This class is a wrapper for {@link PianiFabbisogni}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianiFabbisogni
 * @generated
 */
public class PianiFabbisogniWrapper
	extends BaseModelWrapper<PianiFabbisogni>
	implements ModelWrapper<PianiFabbisogni>, PianiFabbisogni {

	public PianiFabbisogniWrapper(PianiFabbisogni pianiFabbisogni) {
		super(pianiFabbisogni);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id_PianiFabbisogni", getId_PianiFabbisogni());
		attributes.put("CodicePianoFabbisogno", getCodicePianoFabbisogno());
		attributes.put("FK_documenti", getFK_documenti());
		attributes.put("FK_attiDiAdesione", getFK_attiDiAdesione());
		attributes.put("Descrizione", getDescrizione());
		attributes.put("Stato", getStato());
		attributes.put("DataStato", getDataStato());
		attributes.put("DataInizioFabbisogni", getDataInizioFabbisogni());
		attributes.put("DataFineFabbisogni", getDataFineFabbisogni());
		attributes.put("userIns", getUserIns());
		attributes.put("userAgg", getUserAgg());
		attributes.put("dataIns", getDataIns());
		attributes.put("dataAgg", getDataAgg());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id_PianiFabbisogni = (Long)attributes.get("Id_PianiFabbisogni");

		if (Id_PianiFabbisogni != null) {
			setId_PianiFabbisogni(Id_PianiFabbisogni);
		}

		String CodicePianoFabbisogno = (String)attributes.get(
			"CodicePianoFabbisogno");

		if (CodicePianoFabbisogno != null) {
			setCodicePianoFabbisogno(CodicePianoFabbisogno);
		}

		Long FK_documenti = (Long)attributes.get("FK_documenti");

		if (FK_documenti != null) {
			setFK_documenti(FK_documenti);
		}

		Long FK_attiDiAdesione = (Long)attributes.get("FK_attiDiAdesione");

		if (FK_attiDiAdesione != null) {
			setFK_attiDiAdesione(FK_attiDiAdesione);
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

		Date DataInizioFabbisogni = (Date)attributes.get(
			"DataInizioFabbisogni");

		if (DataInizioFabbisogni != null) {
			setDataInizioFabbisogni(DataInizioFabbisogni);
		}

		Date DataFineFabbisogni = (Date)attributes.get("DataFineFabbisogni");

		if (DataFineFabbisogni != null) {
			setDataFineFabbisogni(DataFineFabbisogni);
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
	public PianiFabbisogni cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the codice piano fabbisogno of this piani fabbisogni.
	 *
	 * @return the codice piano fabbisogno of this piani fabbisogni
	 */
	@Override
	public String getCodicePianoFabbisogno() {
		return model.getCodicePianoFabbisogno();
	}

	/**
	 * Returns the data agg of this piani fabbisogni.
	 *
	 * @return the data agg of this piani fabbisogni
	 */
	@Override
	public Date getDataAgg() {
		return model.getDataAgg();
	}

	/**
	 * Returns the data fine fabbisogni of this piani fabbisogni.
	 *
	 * @return the data fine fabbisogni of this piani fabbisogni
	 */
	@Override
	public Date getDataFineFabbisogni() {
		return model.getDataFineFabbisogni();
	}

	/**
	 * Returns the data inizio fabbisogni of this piani fabbisogni.
	 *
	 * @return the data inizio fabbisogni of this piani fabbisogni
	 */
	@Override
	public Date getDataInizioFabbisogni() {
		return model.getDataInizioFabbisogni();
	}

	/**
	 * Returns the data ins of this piani fabbisogni.
	 *
	 * @return the data ins of this piani fabbisogni
	 */
	@Override
	public Date getDataIns() {
		return model.getDataIns();
	}

	/**
	 * Returns the data stato of this piani fabbisogni.
	 *
	 * @return the data stato of this piani fabbisogni
	 */
	@Override
	public Date getDataStato() {
		return model.getDataStato();
	}

	/**
	 * Returns the descrizione of this piani fabbisogni.
	 *
	 * @return the descrizione of this piani fabbisogni
	 */
	@Override
	public String getDescrizione() {
		return model.getDescrizione();
	}

	/**
	 * Returns the fk_atti di adesione of this piani fabbisogni.
	 *
	 * @return the fk_atti di adesione of this piani fabbisogni
	 */
	@Override
	public long getFK_attiDiAdesione() {
		return model.getFK_attiDiAdesione();
	}

	/**
	 * Returns the fk_documenti of this piani fabbisogni.
	 *
	 * @return the fk_documenti of this piani fabbisogni
	 */
	@Override
	public long getFK_documenti() {
		return model.getFK_documenti();
	}

	/**
	 * Returns the id_ piani fabbisogni of this piani fabbisogni.
	 *
	 * @return the id_ piani fabbisogni of this piani fabbisogni
	 */
	@Override
	public long getId_PianiFabbisogni() {
		return model.getId_PianiFabbisogni();
	}

	/**
	 * Returns the primary key of this piani fabbisogni.
	 *
	 * @return the primary key of this piani fabbisogni
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the stato of this piani fabbisogni.
	 *
	 * @return the stato of this piani fabbisogni
	 */
	@Override
	public String getStato() {
		return model.getStato();
	}

	/**
	 * Returns the user agg of this piani fabbisogni.
	 *
	 * @return the user agg of this piani fabbisogni
	 */
	@Override
	public String getUserAgg() {
		return model.getUserAgg();
	}

	/**
	 * Returns the user ins of this piani fabbisogni.
	 *
	 * @return the user ins of this piani fabbisogni
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
	 * Sets the codice piano fabbisogno of this piani fabbisogni.
	 *
	 * @param CodicePianoFabbisogno the codice piano fabbisogno of this piani fabbisogni
	 */
	@Override
	public void setCodicePianoFabbisogno(String CodicePianoFabbisogno) {
		model.setCodicePianoFabbisogno(CodicePianoFabbisogno);
	}

	/**
	 * Sets the data agg of this piani fabbisogni.
	 *
	 * @param dataAgg the data agg of this piani fabbisogni
	 */
	@Override
	public void setDataAgg(Date dataAgg) {
		model.setDataAgg(dataAgg);
	}

	/**
	 * Sets the data fine fabbisogni of this piani fabbisogni.
	 *
	 * @param DataFineFabbisogni the data fine fabbisogni of this piani fabbisogni
	 */
	@Override
	public void setDataFineFabbisogni(Date DataFineFabbisogni) {
		model.setDataFineFabbisogni(DataFineFabbisogni);
	}

	/**
	 * Sets the data inizio fabbisogni of this piani fabbisogni.
	 *
	 * @param DataInizioFabbisogni the data inizio fabbisogni of this piani fabbisogni
	 */
	@Override
	public void setDataInizioFabbisogni(Date DataInizioFabbisogni) {
		model.setDataInizioFabbisogni(DataInizioFabbisogni);
	}

	/**
	 * Sets the data ins of this piani fabbisogni.
	 *
	 * @param dataIns the data ins of this piani fabbisogni
	 */
	@Override
	public void setDataIns(Date dataIns) {
		model.setDataIns(dataIns);
	}

	/**
	 * Sets the data stato of this piani fabbisogni.
	 *
	 * @param DataStato the data stato of this piani fabbisogni
	 */
	@Override
	public void setDataStato(Date DataStato) {
		model.setDataStato(DataStato);
	}

	/**
	 * Sets the descrizione of this piani fabbisogni.
	 *
	 * @param Descrizione the descrizione of this piani fabbisogni
	 */
	@Override
	public void setDescrizione(String Descrizione) {
		model.setDescrizione(Descrizione);
	}

	/**
	 * Sets the fk_atti di adesione of this piani fabbisogni.
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione of this piani fabbisogni
	 */
	@Override
	public void setFK_attiDiAdesione(long FK_attiDiAdesione) {
		model.setFK_attiDiAdesione(FK_attiDiAdesione);
	}

	/**
	 * Sets the fk_documenti of this piani fabbisogni.
	 *
	 * @param FK_documenti the fk_documenti of this piani fabbisogni
	 */
	@Override
	public void setFK_documenti(long FK_documenti) {
		model.setFK_documenti(FK_documenti);
	}

	/**
	 * Sets the id_ piani fabbisogni of this piani fabbisogni.
	 *
	 * @param Id_PianiFabbisogni the id_ piani fabbisogni of this piani fabbisogni
	 */
	@Override
	public void setId_PianiFabbisogni(long Id_PianiFabbisogni) {
		model.setId_PianiFabbisogni(Id_PianiFabbisogni);
	}

	/**
	 * Sets the primary key of this piani fabbisogni.
	 *
	 * @param primaryKey the primary key of this piani fabbisogni
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the stato of this piani fabbisogni.
	 *
	 * @param Stato the stato of this piani fabbisogni
	 */
	@Override
	public void setStato(String Stato) {
		model.setStato(Stato);
	}

	/**
	 * Sets the user agg of this piani fabbisogni.
	 *
	 * @param userAgg the user agg of this piani fabbisogni
	 */
	@Override
	public void setUserAgg(String userAgg) {
		model.setUserAgg(userAgg);
	}

	/**
	 * Sets the user ins of this piani fabbisogni.
	 *
	 * @param userIns the user ins of this piani fabbisogni
	 */
	@Override
	public void setUserIns(String userIns) {
		model.setUserIns(userIns);
	}

	@Override
	protected PianiFabbisogniWrapper wrap(PianiFabbisogni pianiFabbisogni) {
		return new PianiFabbisogniWrapper(pianiFabbisogni);
	}

}