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
 * This class is a wrapper for {@link Documenti}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Documenti
 * @generated
 */
public class DocumentiWrapper
	extends BaseModelWrapper<Documenti>
	implements Documenti, ModelWrapper<Documenti> {

	public DocumentiWrapper(Documenti documenti) {
		super(documenti);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id_CodiceDocumenti", getId_CodiceDocumenti());
		attributes.put("CodiceDocumento", getCodiceDocumento());
		attributes.put("NomeFile", getNomeFile());
		attributes.put("ContenutoFile", getContenutoFile());
		attributes.put("Versione", getVersione());
		attributes.put("DataVersione", getDataVersione());
		attributes.put("DataCaricamento", getDataCaricamento());
		attributes.put("userIns", getUserIns());
		attributes.put("userAgg", getUserAgg());
		attributes.put("dataIns", getDataIns());
		attributes.put("dataAgg", getDataAgg());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id_CodiceDocumenti = (Long)attributes.get("Id_CodiceDocumenti");

		if (Id_CodiceDocumenti != null) {
			setId_CodiceDocumenti(Id_CodiceDocumenti);
		}

		String CodiceDocumento = (String)attributes.get("CodiceDocumento");

		if (CodiceDocumento != null) {
			setCodiceDocumento(CodiceDocumento);
		}

		String NomeFile = (String)attributes.get("NomeFile");

		if (NomeFile != null) {
			setNomeFile(NomeFile);
		}

		String ContenutoFile = (String)attributes.get("ContenutoFile");

		if (ContenutoFile != null) {
			setContenutoFile(ContenutoFile);
		}

		String Versione = (String)attributes.get("Versione");

		if (Versione != null) {
			setVersione(Versione);
		}

		Date DataVersione = (Date)attributes.get("DataVersione");

		if (DataVersione != null) {
			setDataVersione(DataVersione);
		}

		Date DataCaricamento = (Date)attributes.get("DataCaricamento");

		if (DataCaricamento != null) {
			setDataCaricamento(DataCaricamento);
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
	public Documenti cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the codice documento of this documenti.
	 *
	 * @return the codice documento of this documenti
	 */
	@Override
	public String getCodiceDocumento() {
		return model.getCodiceDocumento();
	}

	/**
	 * Returns the contenuto file of this documenti.
	 *
	 * @return the contenuto file of this documenti
	 */
	@Override
	public String getContenutoFile() {
		return model.getContenutoFile();
	}

	/**
	 * Returns the data agg of this documenti.
	 *
	 * @return the data agg of this documenti
	 */
	@Override
	public Date getDataAgg() {
		return model.getDataAgg();
	}

	/**
	 * Returns the data caricamento of this documenti.
	 *
	 * @return the data caricamento of this documenti
	 */
	@Override
	public Date getDataCaricamento() {
		return model.getDataCaricamento();
	}

	/**
	 * Returns the data ins of this documenti.
	 *
	 * @return the data ins of this documenti
	 */
	@Override
	public Date getDataIns() {
		return model.getDataIns();
	}

	/**
	 * Returns the data versione of this documenti.
	 *
	 * @return the data versione of this documenti
	 */
	@Override
	public Date getDataVersione() {
		return model.getDataVersione();
	}

	/**
	 * Returns the id_ codice documenti of this documenti.
	 *
	 * @return the id_ codice documenti of this documenti
	 */
	@Override
	public long getId_CodiceDocumenti() {
		return model.getId_CodiceDocumenti();
	}

	/**
	 * Returns the nome file of this documenti.
	 *
	 * @return the nome file of this documenti
	 */
	@Override
	public String getNomeFile() {
		return model.getNomeFile();
	}

	/**
	 * Returns the primary key of this documenti.
	 *
	 * @return the primary key of this documenti
	 */
	@Override
	public String getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user agg of this documenti.
	 *
	 * @return the user agg of this documenti
	 */
	@Override
	public String getUserAgg() {
		return model.getUserAgg();
	}

	/**
	 * Returns the user ins of this documenti.
	 *
	 * @return the user ins of this documenti
	 */
	@Override
	public String getUserIns() {
		return model.getUserIns();
	}

	/**
	 * Returns the versione of this documenti.
	 *
	 * @return the versione of this documenti
	 */
	@Override
	public String getVersione() {
		return model.getVersione();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the codice documento of this documenti.
	 *
	 * @param CodiceDocumento the codice documento of this documenti
	 */
	@Override
	public void setCodiceDocumento(String CodiceDocumento) {
		model.setCodiceDocumento(CodiceDocumento);
	}

	/**
	 * Sets the contenuto file of this documenti.
	 *
	 * @param ContenutoFile the contenuto file of this documenti
	 */
	@Override
	public void setContenutoFile(String ContenutoFile) {
		model.setContenutoFile(ContenutoFile);
	}

	/**
	 * Sets the data agg of this documenti.
	 *
	 * @param dataAgg the data agg of this documenti
	 */
	@Override
	public void setDataAgg(Date dataAgg) {
		model.setDataAgg(dataAgg);
	}

	/**
	 * Sets the data caricamento of this documenti.
	 *
	 * @param DataCaricamento the data caricamento of this documenti
	 */
	@Override
	public void setDataCaricamento(Date DataCaricamento) {
		model.setDataCaricamento(DataCaricamento);
	}

	/**
	 * Sets the data ins of this documenti.
	 *
	 * @param dataIns the data ins of this documenti
	 */
	@Override
	public void setDataIns(Date dataIns) {
		model.setDataIns(dataIns);
	}

	/**
	 * Sets the data versione of this documenti.
	 *
	 * @param DataVersione the data versione of this documenti
	 */
	@Override
	public void setDataVersione(Date DataVersione) {
		model.setDataVersione(DataVersione);
	}

	/**
	 * Sets the id_ codice documenti of this documenti.
	 *
	 * @param Id_CodiceDocumenti the id_ codice documenti of this documenti
	 */
	@Override
	public void setId_CodiceDocumenti(long Id_CodiceDocumenti) {
		model.setId_CodiceDocumenti(Id_CodiceDocumenti);
	}

	/**
	 * Sets the nome file of this documenti.
	 *
	 * @param NomeFile the nome file of this documenti
	 */
	@Override
	public void setNomeFile(String NomeFile) {
		model.setNomeFile(NomeFile);
	}

	/**
	 * Sets the primary key of this documenti.
	 *
	 * @param primaryKey the primary key of this documenti
	 */
	@Override
	public void setPrimaryKey(String primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user agg of this documenti.
	 *
	 * @param userAgg the user agg of this documenti
	 */
	@Override
	public void setUserAgg(String userAgg) {
		model.setUserAgg(userAgg);
	}

	/**
	 * Sets the user ins of this documenti.
	 *
	 * @param userIns the user ins of this documenti
	 */
	@Override
	public void setUserIns(String userIns) {
		model.setUserIns(userIns);
	}

	/**
	 * Sets the versione of this documenti.
	 *
	 * @param Versione the versione of this documenti
	 */
	@Override
	public void setVersione(String Versione) {
		model.setVersione(Versione);
	}

	@Override
	protected DocumentiWrapper wrap(Documenti documenti) {
		return new DocumentiWrapper(documenti);
	}

}