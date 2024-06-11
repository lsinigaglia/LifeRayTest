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
 * This class is a wrapper for {@link AccordoQuadro}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccordoQuadro
 * @generated
 */
public class AccordoQuadroWrapper
	extends BaseModelWrapper<AccordoQuadro>
	implements AccordoQuadro, ModelWrapper<AccordoQuadro> {

	public AccordoQuadroWrapper(AccordoQuadro accordoQuadro) {
		super(accordoQuadro);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id_AccordoQuadro", getId_AccordoQuadro());
		attributes.put("CodiceAccordo", getCodiceAccordo());
		attributes.put("FK_documenti", getFK_documenti());
		attributes.put("Descrizione", getDescrizione());
		attributes.put("DataInizioValidita", getDataInizioValidita());
		attributes.put("DataFineValidita", getDataFineValidita());
		attributes.put("ImportoComplessivo", getImportoComplessivo());
		attributes.put("userIns", getUserIns());
		attributes.put("userAgg", getUserAgg());
		attributes.put("dataIns", getDataIns());
		attributes.put("dataAgg", getDataAgg());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id_AccordoQuadro = (Long)attributes.get("Id_AccordoQuadro");

		if (Id_AccordoQuadro != null) {
			setId_AccordoQuadro(Id_AccordoQuadro);
		}

		String CodiceAccordo = (String)attributes.get("CodiceAccordo");

		if (CodiceAccordo != null) {
			setCodiceAccordo(CodiceAccordo);
		}

		Long FK_documenti = (Long)attributes.get("FK_documenti");

		if (FK_documenti != null) {
			setFK_documenti(FK_documenti);
		}

		String Descrizione = (String)attributes.get("Descrizione");

		if (Descrizione != null) {
			setDescrizione(Descrizione);
		}

		Date DataInizioValidita = (Date)attributes.get("DataInizioValidita");

		if (DataInizioValidita != null) {
			setDataInizioValidita(DataInizioValidita);
		}

		Date DataFineValidita = (Date)attributes.get("DataFineValidita");

		if (DataFineValidita != null) {
			setDataFineValidita(DataFineValidita);
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
	public AccordoQuadro cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the codice accordo of this accordo quadro.
	 *
	 * @return the codice accordo of this accordo quadro
	 */
	@Override
	public String getCodiceAccordo() {
		return model.getCodiceAccordo();
	}

	/**
	 * Returns the data agg of this accordo quadro.
	 *
	 * @return the data agg of this accordo quadro
	 */
	@Override
	public Date getDataAgg() {
		return model.getDataAgg();
	}

	/**
	 * Returns the data fine validita of this accordo quadro.
	 *
	 * @return the data fine validita of this accordo quadro
	 */
	@Override
	public Date getDataFineValidita() {
		return model.getDataFineValidita();
	}

	/**
	 * Returns the data inizio validita of this accordo quadro.
	 *
	 * @return the data inizio validita of this accordo quadro
	 */
	@Override
	public Date getDataInizioValidita() {
		return model.getDataInizioValidita();
	}

	/**
	 * Returns the data ins of this accordo quadro.
	 *
	 * @return the data ins of this accordo quadro
	 */
	@Override
	public Date getDataIns() {
		return model.getDataIns();
	}

	/**
	 * Returns the descrizione of this accordo quadro.
	 *
	 * @return the descrizione of this accordo quadro
	 */
	@Override
	public String getDescrizione() {
		return model.getDescrizione();
	}

	/**
	 * Returns the fk_documenti of this accordo quadro.
	 *
	 * @return the fk_documenti of this accordo quadro
	 */
	@Override
	public long getFK_documenti() {
		return model.getFK_documenti();
	}

	/**
	 * Returns the id_ accordo quadro of this accordo quadro.
	 *
	 * @return the id_ accordo quadro of this accordo quadro
	 */
	@Override
	public long getId_AccordoQuadro() {
		return model.getId_AccordoQuadro();
	}

	/**
	 * Returns the importo complessivo of this accordo quadro.
	 *
	 * @return the importo complessivo of this accordo quadro
	 */
	@Override
	public Double getImportoComplessivo() {
		return model.getImportoComplessivo();
	}

	/**
	 * Returns the primary key of this accordo quadro.
	 *
	 * @return the primary key of this accordo quadro
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user agg of this accordo quadro.
	 *
	 * @return the user agg of this accordo quadro
	 */
	@Override
	public String getUserAgg() {
		return model.getUserAgg();
	}

	/**
	 * Returns the user ins of this accordo quadro.
	 *
	 * @return the user ins of this accordo quadro
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
	 * Sets the codice accordo of this accordo quadro.
	 *
	 * @param CodiceAccordo the codice accordo of this accordo quadro
	 */
	@Override
	public void setCodiceAccordo(String CodiceAccordo) {
		model.setCodiceAccordo(CodiceAccordo);
	}

	/**
	 * Sets the data agg of this accordo quadro.
	 *
	 * @param dataAgg the data agg of this accordo quadro
	 */
	@Override
	public void setDataAgg(Date dataAgg) {
		model.setDataAgg(dataAgg);
	}

	/**
	 * Sets the data fine validita of this accordo quadro.
	 *
	 * @param DataFineValidita the data fine validita of this accordo quadro
	 */
	@Override
	public void setDataFineValidita(Date DataFineValidita) {
		model.setDataFineValidita(DataFineValidita);
	}

	/**
	 * Sets the data inizio validita of this accordo quadro.
	 *
	 * @param DataInizioValidita the data inizio validita of this accordo quadro
	 */
	@Override
	public void setDataInizioValidita(Date DataInizioValidita) {
		model.setDataInizioValidita(DataInizioValidita);
	}

	/**
	 * Sets the data ins of this accordo quadro.
	 *
	 * @param dataIns the data ins of this accordo quadro
	 */
	@Override
	public void setDataIns(Date dataIns) {
		model.setDataIns(dataIns);
	}

	/**
	 * Sets the descrizione of this accordo quadro.
	 *
	 * @param Descrizione the descrizione of this accordo quadro
	 */
	@Override
	public void setDescrizione(String Descrizione) {
		model.setDescrizione(Descrizione);
	}

	/**
	 * Sets the fk_documenti of this accordo quadro.
	 *
	 * @param FK_documenti the fk_documenti of this accordo quadro
	 */
	@Override
	public void setFK_documenti(long FK_documenti) {
		model.setFK_documenti(FK_documenti);
	}

	/**
	 * Sets the id_ accordo quadro of this accordo quadro.
	 *
	 * @param Id_AccordoQuadro the id_ accordo quadro of this accordo quadro
	 */
	@Override
	public void setId_AccordoQuadro(long Id_AccordoQuadro) {
		model.setId_AccordoQuadro(Id_AccordoQuadro);
	}

	/**
	 * Sets the importo complessivo of this accordo quadro.
	 *
	 * @param ImportoComplessivo the importo complessivo of this accordo quadro
	 */
	@Override
	public void setImportoComplessivo(Double ImportoComplessivo) {
		model.setImportoComplessivo(ImportoComplessivo);
	}

	/**
	 * Sets the primary key of this accordo quadro.
	 *
	 * @param primaryKey the primary key of this accordo quadro
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user agg of this accordo quadro.
	 *
	 * @param userAgg the user agg of this accordo quadro
	 */
	@Override
	public void setUserAgg(String userAgg) {
		model.setUserAgg(userAgg);
	}

	/**
	 * Sets the user ins of this accordo quadro.
	 *
	 * @param userIns the user ins of this accordo quadro
	 */
	@Override
	public void setUserIns(String userIns) {
		model.setUserIns(userIns);
	}

	@Override
	protected AccordoQuadroWrapper wrap(AccordoQuadro accordoQuadro) {
		return new AccordoQuadroWrapper(accordoQuadro);
	}

}