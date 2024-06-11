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
 * This class is a wrapper for {@link PianiDiLavoroObiettivo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianiDiLavoroObiettivo
 * @generated
 */
public class PianiDiLavoroObiettivoWrapper
	extends BaseModelWrapper<PianiDiLavoroObiettivo>
	implements ModelWrapper<PianiDiLavoroObiettivo>, PianiDiLavoroObiettivo {

	public PianiDiLavoroObiettivoWrapper(
		PianiDiLavoroObiettivo pianiDiLavoroObiettivo) {

		super(pianiDiLavoroObiettivo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id_PianoDiLavoro", getId_PianoDiLavoro());
		attributes.put(
			"CodicePianoLavoroObiettivo", getCodicePianoLavoroObiettivo());
		attributes.put("FK_documenti", getFK_documenti());
		attributes.put("FK_progettiFabbisogni", getFK_progettiFabbisogni());
		attributes.put("Descrizione", getDescrizione());
		attributes.put("DataInizioPiano", getDataInizioPiano());
		attributes.put("DataFinePiano", getDataFinePiano());
		attributes.put("ImportoComplessivo", getImportoComplessivo());
		attributes.put("userIns", getUserIns());
		attributes.put("userAgg", getUserAgg());
		attributes.put("dataIns", getDataIns());
		attributes.put("dataAgg", getDataAgg());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id_PianoDiLavoro = (Long)attributes.get("Id_PianoDiLavoro");

		if (Id_PianoDiLavoro != null) {
			setId_PianoDiLavoro(Id_PianoDiLavoro);
		}

		String CodicePianoLavoroObiettivo = (String)attributes.get(
			"CodicePianoLavoroObiettivo");

		if (CodicePianoLavoroObiettivo != null) {
			setCodicePianoLavoroObiettivo(CodicePianoLavoroObiettivo);
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

		Date DataInizioPiano = (Date)attributes.get("DataInizioPiano");

		if (DataInizioPiano != null) {
			setDataInizioPiano(DataInizioPiano);
		}

		Date DataFinePiano = (Date)attributes.get("DataFinePiano");

		if (DataFinePiano != null) {
			setDataFinePiano(DataFinePiano);
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
	public PianiDiLavoroObiettivo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the codice piano lavoro obiettivo of this piani di lavoro obiettivo.
	 *
	 * @return the codice piano lavoro obiettivo of this piani di lavoro obiettivo
	 */
	@Override
	public String getCodicePianoLavoroObiettivo() {
		return model.getCodicePianoLavoroObiettivo();
	}

	/**
	 * Returns the data agg of this piani di lavoro obiettivo.
	 *
	 * @return the data agg of this piani di lavoro obiettivo
	 */
	@Override
	public Date getDataAgg() {
		return model.getDataAgg();
	}

	/**
	 * Returns the data fine piano of this piani di lavoro obiettivo.
	 *
	 * @return the data fine piano of this piani di lavoro obiettivo
	 */
	@Override
	public Date getDataFinePiano() {
		return model.getDataFinePiano();
	}

	/**
	 * Returns the data inizio piano of this piani di lavoro obiettivo.
	 *
	 * @return the data inizio piano of this piani di lavoro obiettivo
	 */
	@Override
	public Date getDataInizioPiano() {
		return model.getDataInizioPiano();
	}

	/**
	 * Returns the data ins of this piani di lavoro obiettivo.
	 *
	 * @return the data ins of this piani di lavoro obiettivo
	 */
	@Override
	public Date getDataIns() {
		return model.getDataIns();
	}

	/**
	 * Returns the descrizione of this piani di lavoro obiettivo.
	 *
	 * @return the descrizione of this piani di lavoro obiettivo
	 */
	@Override
	public String getDescrizione() {
		return model.getDescrizione();
	}

	/**
	 * Returns the fk_documenti of this piani di lavoro obiettivo.
	 *
	 * @return the fk_documenti of this piani di lavoro obiettivo
	 */
	@Override
	public long getFK_documenti() {
		return model.getFK_documenti();
	}

	/**
	 * Returns the fk_progetti fabbisogni of this piani di lavoro obiettivo.
	 *
	 * @return the fk_progetti fabbisogni of this piani di lavoro obiettivo
	 */
	@Override
	public long getFK_progettiFabbisogni() {
		return model.getFK_progettiFabbisogni();
	}

	/**
	 * Returns the id_ piano di lavoro of this piani di lavoro obiettivo.
	 *
	 * @return the id_ piano di lavoro of this piani di lavoro obiettivo
	 */
	@Override
	public long getId_PianoDiLavoro() {
		return model.getId_PianoDiLavoro();
	}

	/**
	 * Returns the importo complessivo of this piani di lavoro obiettivo.
	 *
	 * @return the importo complessivo of this piani di lavoro obiettivo
	 */
	@Override
	public Double getImportoComplessivo() {
		return model.getImportoComplessivo();
	}

	/**
	 * Returns the primary key of this piani di lavoro obiettivo.
	 *
	 * @return the primary key of this piani di lavoro obiettivo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user agg of this piani di lavoro obiettivo.
	 *
	 * @return the user agg of this piani di lavoro obiettivo
	 */
	@Override
	public String getUserAgg() {
		return model.getUserAgg();
	}

	/**
	 * Returns the user ins of this piani di lavoro obiettivo.
	 *
	 * @return the user ins of this piani di lavoro obiettivo
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
	 * Sets the codice piano lavoro obiettivo of this piani di lavoro obiettivo.
	 *
	 * @param CodicePianoLavoroObiettivo the codice piano lavoro obiettivo of this piani di lavoro obiettivo
	 */
	@Override
	public void setCodicePianoLavoroObiettivo(
		String CodicePianoLavoroObiettivo) {

		model.setCodicePianoLavoroObiettivo(CodicePianoLavoroObiettivo);
	}

	/**
	 * Sets the data agg of this piani di lavoro obiettivo.
	 *
	 * @param dataAgg the data agg of this piani di lavoro obiettivo
	 */
	@Override
	public void setDataAgg(Date dataAgg) {
		model.setDataAgg(dataAgg);
	}

	/**
	 * Sets the data fine piano of this piani di lavoro obiettivo.
	 *
	 * @param DataFinePiano the data fine piano of this piani di lavoro obiettivo
	 */
	@Override
	public void setDataFinePiano(Date DataFinePiano) {
		model.setDataFinePiano(DataFinePiano);
	}

	/**
	 * Sets the data inizio piano of this piani di lavoro obiettivo.
	 *
	 * @param DataInizioPiano the data inizio piano of this piani di lavoro obiettivo
	 */
	@Override
	public void setDataInizioPiano(Date DataInizioPiano) {
		model.setDataInizioPiano(DataInizioPiano);
	}

	/**
	 * Sets the data ins of this piani di lavoro obiettivo.
	 *
	 * @param dataIns the data ins of this piani di lavoro obiettivo
	 */
	@Override
	public void setDataIns(Date dataIns) {
		model.setDataIns(dataIns);
	}

	/**
	 * Sets the descrizione of this piani di lavoro obiettivo.
	 *
	 * @param Descrizione the descrizione of this piani di lavoro obiettivo
	 */
	@Override
	public void setDescrizione(String Descrizione) {
		model.setDescrizione(Descrizione);
	}

	/**
	 * Sets the fk_documenti of this piani di lavoro obiettivo.
	 *
	 * @param FK_documenti the fk_documenti of this piani di lavoro obiettivo
	 */
	@Override
	public void setFK_documenti(long FK_documenti) {
		model.setFK_documenti(FK_documenti);
	}

	/**
	 * Sets the fk_progetti fabbisogni of this piani di lavoro obiettivo.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni of this piani di lavoro obiettivo
	 */
	@Override
	public void setFK_progettiFabbisogni(long FK_progettiFabbisogni) {
		model.setFK_progettiFabbisogni(FK_progettiFabbisogni);
	}

	/**
	 * Sets the id_ piano di lavoro of this piani di lavoro obiettivo.
	 *
	 * @param Id_PianoDiLavoro the id_ piano di lavoro of this piani di lavoro obiettivo
	 */
	@Override
	public void setId_PianoDiLavoro(long Id_PianoDiLavoro) {
		model.setId_PianoDiLavoro(Id_PianoDiLavoro);
	}

	/**
	 * Sets the importo complessivo of this piani di lavoro obiettivo.
	 *
	 * @param ImportoComplessivo the importo complessivo of this piani di lavoro obiettivo
	 */
	@Override
	public void setImportoComplessivo(Double ImportoComplessivo) {
		model.setImportoComplessivo(ImportoComplessivo);
	}

	/**
	 * Sets the primary key of this piani di lavoro obiettivo.
	 *
	 * @param primaryKey the primary key of this piani di lavoro obiettivo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user agg of this piani di lavoro obiettivo.
	 *
	 * @param userAgg the user agg of this piani di lavoro obiettivo
	 */
	@Override
	public void setUserAgg(String userAgg) {
		model.setUserAgg(userAgg);
	}

	/**
	 * Sets the user ins of this piani di lavoro obiettivo.
	 *
	 * @param userIns the user ins of this piani di lavoro obiettivo
	 */
	@Override
	public void setUserIns(String userIns) {
		model.setUserIns(userIns);
	}

	@Override
	protected PianiDiLavoroObiettivoWrapper wrap(
		PianiDiLavoroObiettivo pianiDiLavoroObiettivo) {

		return new PianiDiLavoroObiettivoWrapper(pianiDiLavoroObiettivo);
	}

}