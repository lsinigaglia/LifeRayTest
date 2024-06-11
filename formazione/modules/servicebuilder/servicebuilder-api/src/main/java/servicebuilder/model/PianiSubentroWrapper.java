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
 * This class is a wrapper for {@link PianiSubentro}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianiSubentro
 * @generated
 */
public class PianiSubentroWrapper
	extends BaseModelWrapper<PianiSubentro>
	implements ModelWrapper<PianiSubentro>, PianiSubentro {

	public PianiSubentroWrapper(PianiSubentro pianiSubentro) {
		super(pianiSubentro);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id_PianiSubentro", getId_PianiSubentro());
		attributes.put("CodicePianiDiSubentro", getCodicePianiDiSubentro());
		attributes.put("FK_documenti", getFK_documenti());
		attributes.put("FK_accordoQuadro", getFK_accordoQuadro());
		attributes.put("Descrizione", getDescrizione());
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
		Long Id_PianiSubentro = (Long)attributes.get("Id_PianiSubentro");

		if (Id_PianiSubentro != null) {
			setId_PianiSubentro(Id_PianiSubentro);
		}

		String CodicePianiDiSubentro = (String)attributes.get(
			"CodicePianiDiSubentro");

		if (CodicePianiDiSubentro != null) {
			setCodicePianiDiSubentro(CodicePianiDiSubentro);
		}

		Long FK_documenti = (Long)attributes.get("FK_documenti");

		if (FK_documenti != null) {
			setFK_documenti(FK_documenti);
		}

		Long FK_accordoQuadro = (Long)attributes.get("FK_accordoQuadro");

		if (FK_accordoQuadro != null) {
			setFK_accordoQuadro(FK_accordoQuadro);
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
	public PianiSubentro cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the codice piani di subentro of this piani subentro.
	 *
	 * @return the codice piani di subentro of this piani subentro
	 */
	@Override
	public String getCodicePianiDiSubentro() {
		return model.getCodicePianiDiSubentro();
	}

	/**
	 * Returns the data agg of this piani subentro.
	 *
	 * @return the data agg of this piani subentro
	 */
	@Override
	public Date getDataAgg() {
		return model.getDataAgg();
	}

	/**
	 * Returns the data fine piano of this piani subentro.
	 *
	 * @return the data fine piano of this piani subentro
	 */
	@Override
	public Date getDataFinePiano() {
		return model.getDataFinePiano();
	}

	/**
	 * Returns the data inizio piano of this piani subentro.
	 *
	 * @return the data inizio piano of this piani subentro
	 */
	@Override
	public Date getDataInizioPiano() {
		return model.getDataInizioPiano();
	}

	/**
	 * Returns the data ins of this piani subentro.
	 *
	 * @return the data ins of this piani subentro
	 */
	@Override
	public Date getDataIns() {
		return model.getDataIns();
	}

	/**
	 * Returns the descrizione of this piani subentro.
	 *
	 * @return the descrizione of this piani subentro
	 */
	@Override
	public String getDescrizione() {
		return model.getDescrizione();
	}

	/**
	 * Returns the fk_accordo quadro of this piani subentro.
	 *
	 * @return the fk_accordo quadro of this piani subentro
	 */
	@Override
	public long getFK_accordoQuadro() {
		return model.getFK_accordoQuadro();
	}

	/**
	 * Returns the fk_documenti of this piani subentro.
	 *
	 * @return the fk_documenti of this piani subentro
	 */
	@Override
	public long getFK_documenti() {
		return model.getFK_documenti();
	}

	/**
	 * Returns the id_ piani subentro of this piani subentro.
	 *
	 * @return the id_ piani subentro of this piani subentro
	 */
	@Override
	public long getId_PianiSubentro() {
		return model.getId_PianiSubentro();
	}

	/**
	 * Returns the primary key of this piani subentro.
	 *
	 * @return the primary key of this piani subentro
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user agg of this piani subentro.
	 *
	 * @return the user agg of this piani subentro
	 */
	@Override
	public String getUserAgg() {
		return model.getUserAgg();
	}

	/**
	 * Returns the user ins of this piani subentro.
	 *
	 * @return the user ins of this piani subentro
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
	 * Sets the codice piani di subentro of this piani subentro.
	 *
	 * @param CodicePianiDiSubentro the codice piani di subentro of this piani subentro
	 */
	@Override
	public void setCodicePianiDiSubentro(String CodicePianiDiSubentro) {
		model.setCodicePianiDiSubentro(CodicePianiDiSubentro);
	}

	/**
	 * Sets the data agg of this piani subentro.
	 *
	 * @param dataAgg the data agg of this piani subentro
	 */
	@Override
	public void setDataAgg(Date dataAgg) {
		model.setDataAgg(dataAgg);
	}

	/**
	 * Sets the data fine piano of this piani subentro.
	 *
	 * @param DataFinePiano the data fine piano of this piani subentro
	 */
	@Override
	public void setDataFinePiano(Date DataFinePiano) {
		model.setDataFinePiano(DataFinePiano);
	}

	/**
	 * Sets the data inizio piano of this piani subentro.
	 *
	 * @param DataInizioPiano the data inizio piano of this piani subentro
	 */
	@Override
	public void setDataInizioPiano(Date DataInizioPiano) {
		model.setDataInizioPiano(DataInizioPiano);
	}

	/**
	 * Sets the data ins of this piani subentro.
	 *
	 * @param dataIns the data ins of this piani subentro
	 */
	@Override
	public void setDataIns(Date dataIns) {
		model.setDataIns(dataIns);
	}

	/**
	 * Sets the descrizione of this piani subentro.
	 *
	 * @param Descrizione the descrizione of this piani subentro
	 */
	@Override
	public void setDescrizione(String Descrizione) {
		model.setDescrizione(Descrizione);
	}

	/**
	 * Sets the fk_accordo quadro of this piani subentro.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro of this piani subentro
	 */
	@Override
	public void setFK_accordoQuadro(long FK_accordoQuadro) {
		model.setFK_accordoQuadro(FK_accordoQuadro);
	}

	/**
	 * Sets the fk_documenti of this piani subentro.
	 *
	 * @param FK_documenti the fk_documenti of this piani subentro
	 */
	@Override
	public void setFK_documenti(long FK_documenti) {
		model.setFK_documenti(FK_documenti);
	}

	/**
	 * Sets the id_ piani subentro of this piani subentro.
	 *
	 * @param Id_PianiSubentro the id_ piani subentro of this piani subentro
	 */
	@Override
	public void setId_PianiSubentro(long Id_PianiSubentro) {
		model.setId_PianiSubentro(Id_PianiSubentro);
	}

	/**
	 * Sets the primary key of this piani subentro.
	 *
	 * @param primaryKey the primary key of this piani subentro
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user agg of this piani subentro.
	 *
	 * @param userAgg the user agg of this piani subentro
	 */
	@Override
	public void setUserAgg(String userAgg) {
		model.setUserAgg(userAgg);
	}

	/**
	 * Sets the user ins of this piani subentro.
	 *
	 * @param userIns the user ins of this piani subentro
	 */
	@Override
	public void setUserIns(String userIns) {
		model.setUserIns(userIns);
	}

	@Override
	protected PianiSubentroWrapper wrap(PianiSubentro pianiSubentro) {
		return new PianiSubentroWrapper(pianiSubentro);
	}

}