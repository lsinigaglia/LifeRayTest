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
 * This class is a wrapper for {@link PianiDeiRischi}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianiDeiRischi
 * @generated
 */
public class PianiDeiRischiWrapper
	extends BaseModelWrapper<PianiDeiRischi>
	implements ModelWrapper<PianiDeiRischi>, PianiDeiRischi {

	public PianiDeiRischiWrapper(PianiDeiRischi pianiDeiRischi) {
		super(pianiDeiRischi);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id_PianiDeiRischi", getId_PianiDeiRischi());
		attributes.put("CodicePianoDeiRischi", getCodicePianoDeiRischi());
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
		Long Id_PianiDeiRischi = (Long)attributes.get("Id_PianiDeiRischi");

		if (Id_PianiDeiRischi != null) {
			setId_PianiDeiRischi(Id_PianiDeiRischi);
		}

		String CodicePianoDeiRischi = (String)attributes.get(
			"CodicePianoDeiRischi");

		if (CodicePianoDeiRischi != null) {
			setCodicePianoDeiRischi(CodicePianoDeiRischi);
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
	public PianiDeiRischi cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the codice piano dei rischi of this piani dei rischi.
	 *
	 * @return the codice piano dei rischi of this piani dei rischi
	 */
	@Override
	public String getCodicePianoDeiRischi() {
		return model.getCodicePianoDeiRischi();
	}

	/**
	 * Returns the data agg of this piani dei rischi.
	 *
	 * @return the data agg of this piani dei rischi
	 */
	@Override
	public Date getDataAgg() {
		return model.getDataAgg();
	}

	/**
	 * Returns the data fine piano of this piani dei rischi.
	 *
	 * @return the data fine piano of this piani dei rischi
	 */
	@Override
	public Date getDataFinePiano() {
		return model.getDataFinePiano();
	}

	/**
	 * Returns the data inizio piano of this piani dei rischi.
	 *
	 * @return the data inizio piano of this piani dei rischi
	 */
	@Override
	public Date getDataInizioPiano() {
		return model.getDataInizioPiano();
	}

	/**
	 * Returns the data ins of this piani dei rischi.
	 *
	 * @return the data ins of this piani dei rischi
	 */
	@Override
	public Date getDataIns() {
		return model.getDataIns();
	}

	/**
	 * Returns the descrizione of this piani dei rischi.
	 *
	 * @return the descrizione of this piani dei rischi
	 */
	@Override
	public String getDescrizione() {
		return model.getDescrizione();
	}

	/**
	 * Returns the fk_accordo quadro of this piani dei rischi.
	 *
	 * @return the fk_accordo quadro of this piani dei rischi
	 */
	@Override
	public long getFK_accordoQuadro() {
		return model.getFK_accordoQuadro();
	}

	/**
	 * Returns the fk_documenti of this piani dei rischi.
	 *
	 * @return the fk_documenti of this piani dei rischi
	 */
	@Override
	public long getFK_documenti() {
		return model.getFK_documenti();
	}

	/**
	 * Returns the id_ piani dei rischi of this piani dei rischi.
	 *
	 * @return the id_ piani dei rischi of this piani dei rischi
	 */
	@Override
	public long getId_PianiDeiRischi() {
		return model.getId_PianiDeiRischi();
	}

	/**
	 * Returns the primary key of this piani dei rischi.
	 *
	 * @return the primary key of this piani dei rischi
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user agg of this piani dei rischi.
	 *
	 * @return the user agg of this piani dei rischi
	 */
	@Override
	public String getUserAgg() {
		return model.getUserAgg();
	}

	/**
	 * Returns the user ins of this piani dei rischi.
	 *
	 * @return the user ins of this piani dei rischi
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
	 * Sets the codice piano dei rischi of this piani dei rischi.
	 *
	 * @param CodicePianoDeiRischi the codice piano dei rischi of this piani dei rischi
	 */
	@Override
	public void setCodicePianoDeiRischi(String CodicePianoDeiRischi) {
		model.setCodicePianoDeiRischi(CodicePianoDeiRischi);
	}

	/**
	 * Sets the data agg of this piani dei rischi.
	 *
	 * @param dataAgg the data agg of this piani dei rischi
	 */
	@Override
	public void setDataAgg(Date dataAgg) {
		model.setDataAgg(dataAgg);
	}

	/**
	 * Sets the data fine piano of this piani dei rischi.
	 *
	 * @param DataFinePiano the data fine piano of this piani dei rischi
	 */
	@Override
	public void setDataFinePiano(Date DataFinePiano) {
		model.setDataFinePiano(DataFinePiano);
	}

	/**
	 * Sets the data inizio piano of this piani dei rischi.
	 *
	 * @param DataInizioPiano the data inizio piano of this piani dei rischi
	 */
	@Override
	public void setDataInizioPiano(Date DataInizioPiano) {
		model.setDataInizioPiano(DataInizioPiano);
	}

	/**
	 * Sets the data ins of this piani dei rischi.
	 *
	 * @param dataIns the data ins of this piani dei rischi
	 */
	@Override
	public void setDataIns(Date dataIns) {
		model.setDataIns(dataIns);
	}

	/**
	 * Sets the descrizione of this piani dei rischi.
	 *
	 * @param Descrizione the descrizione of this piani dei rischi
	 */
	@Override
	public void setDescrizione(String Descrizione) {
		model.setDescrizione(Descrizione);
	}

	/**
	 * Sets the fk_accordo quadro of this piani dei rischi.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro of this piani dei rischi
	 */
	@Override
	public void setFK_accordoQuadro(long FK_accordoQuadro) {
		model.setFK_accordoQuadro(FK_accordoQuadro);
	}

	/**
	 * Sets the fk_documenti of this piani dei rischi.
	 *
	 * @param FK_documenti the fk_documenti of this piani dei rischi
	 */
	@Override
	public void setFK_documenti(long FK_documenti) {
		model.setFK_documenti(FK_documenti);
	}

	/**
	 * Sets the id_ piani dei rischi of this piani dei rischi.
	 *
	 * @param Id_PianiDeiRischi the id_ piani dei rischi of this piani dei rischi
	 */
	@Override
	public void setId_PianiDeiRischi(long Id_PianiDeiRischi) {
		model.setId_PianiDeiRischi(Id_PianiDeiRischi);
	}

	/**
	 * Sets the primary key of this piani dei rischi.
	 *
	 * @param primaryKey the primary key of this piani dei rischi
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user agg of this piani dei rischi.
	 *
	 * @param userAgg the user agg of this piani dei rischi
	 */
	@Override
	public void setUserAgg(String userAgg) {
		model.setUserAgg(userAgg);
	}

	/**
	 * Sets the user ins of this piani dei rischi.
	 *
	 * @param userIns the user ins of this piani dei rischi
	 */
	@Override
	public void setUserIns(String userIns) {
		model.setUserIns(userIns);
	}

	@Override
	protected PianiDeiRischiWrapper wrap(PianiDeiRischi pianiDeiRischi) {
		return new PianiDeiRischiWrapper(pianiDeiRischi);
	}

}