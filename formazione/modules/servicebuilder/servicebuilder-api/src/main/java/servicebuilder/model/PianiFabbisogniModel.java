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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the PianiFabbisogni service. Represents a row in the &quot;AQ_PianiFabbisogni&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>servicebuilder.model.impl.PianiFabbisogniModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>servicebuilder.model.impl.PianiFabbisogniImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianiFabbisogni
 * @generated
 */
@ProviderType
public interface PianiFabbisogniModel extends BaseModel<PianiFabbisogni> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a piani fabbisogni model instance should use the {@link PianiFabbisogni} interface instead.
	 */

	/**
	 * Returns the primary key of this piani fabbisogni.
	 *
	 * @return the primary key of this piani fabbisogni
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this piani fabbisogni.
	 *
	 * @param primaryKey the primary key of this piani fabbisogni
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the id_ piani fabbisogni of this piani fabbisogni.
	 *
	 * @return the id_ piani fabbisogni of this piani fabbisogni
	 */
	public long getId_PianiFabbisogni();

	/**
	 * Sets the id_ piani fabbisogni of this piani fabbisogni.
	 *
	 * @param Id_PianiFabbisogni the id_ piani fabbisogni of this piani fabbisogni
	 */
	public void setId_PianiFabbisogni(long Id_PianiFabbisogni);

	/**
	 * Returns the codice piano fabbisogno of this piani fabbisogni.
	 *
	 * @return the codice piano fabbisogno of this piani fabbisogni
	 */
	@AutoEscape
	public String getCodicePianoFabbisogno();

	/**
	 * Sets the codice piano fabbisogno of this piani fabbisogni.
	 *
	 * @param CodicePianoFabbisogno the codice piano fabbisogno of this piani fabbisogni
	 */
	public void setCodicePianoFabbisogno(String CodicePianoFabbisogno);

	/**
	 * Returns the fk_documenti of this piani fabbisogni.
	 *
	 * @return the fk_documenti of this piani fabbisogni
	 */
	public long getFK_documenti();

	/**
	 * Sets the fk_documenti of this piani fabbisogni.
	 *
	 * @param FK_documenti the fk_documenti of this piani fabbisogni
	 */
	public void setFK_documenti(long FK_documenti);

	/**
	 * Returns the fk_atti di adesione of this piani fabbisogni.
	 *
	 * @return the fk_atti di adesione of this piani fabbisogni
	 */
	public long getFK_attiDiAdesione();

	/**
	 * Sets the fk_atti di adesione of this piani fabbisogni.
	 *
	 * @param FK_attiDiAdesione the fk_atti di adesione of this piani fabbisogni
	 */
	public void setFK_attiDiAdesione(long FK_attiDiAdesione);

	/**
	 * Returns the descrizione of this piani fabbisogni.
	 *
	 * @return the descrizione of this piani fabbisogni
	 */
	@AutoEscape
	public String getDescrizione();

	/**
	 * Sets the descrizione of this piani fabbisogni.
	 *
	 * @param Descrizione the descrizione of this piani fabbisogni
	 */
	public void setDescrizione(String Descrizione);

	/**
	 * Returns the stato of this piani fabbisogni.
	 *
	 * @return the stato of this piani fabbisogni
	 */
	@AutoEscape
	public String getStato();

	/**
	 * Sets the stato of this piani fabbisogni.
	 *
	 * @param Stato the stato of this piani fabbisogni
	 */
	public void setStato(String Stato);

	/**
	 * Returns the data stato of this piani fabbisogni.
	 *
	 * @return the data stato of this piani fabbisogni
	 */
	public Date getDataStato();

	/**
	 * Sets the data stato of this piani fabbisogni.
	 *
	 * @param DataStato the data stato of this piani fabbisogni
	 */
	public void setDataStato(Date DataStato);

	/**
	 * Returns the data inizio fabbisogni of this piani fabbisogni.
	 *
	 * @return the data inizio fabbisogni of this piani fabbisogni
	 */
	public Date getDataInizioFabbisogni();

	/**
	 * Sets the data inizio fabbisogni of this piani fabbisogni.
	 *
	 * @param DataInizioFabbisogni the data inizio fabbisogni of this piani fabbisogni
	 */
	public void setDataInizioFabbisogni(Date DataInizioFabbisogni);

	/**
	 * Returns the data fine fabbisogni of this piani fabbisogni.
	 *
	 * @return the data fine fabbisogni of this piani fabbisogni
	 */
	public Date getDataFineFabbisogni();

	/**
	 * Sets the data fine fabbisogni of this piani fabbisogni.
	 *
	 * @param DataFineFabbisogni the data fine fabbisogni of this piani fabbisogni
	 */
	public void setDataFineFabbisogni(Date DataFineFabbisogni);

	/**
	 * Returns the user ins of this piani fabbisogni.
	 *
	 * @return the user ins of this piani fabbisogni
	 */
	@AutoEscape
	public String getUserIns();

	/**
	 * Sets the user ins of this piani fabbisogni.
	 *
	 * @param userIns the user ins of this piani fabbisogni
	 */
	public void setUserIns(String userIns);

	/**
	 * Returns the user agg of this piani fabbisogni.
	 *
	 * @return the user agg of this piani fabbisogni
	 */
	@AutoEscape
	public String getUserAgg();

	/**
	 * Sets the user agg of this piani fabbisogni.
	 *
	 * @param userAgg the user agg of this piani fabbisogni
	 */
	public void setUserAgg(String userAgg);

	/**
	 * Returns the data ins of this piani fabbisogni.
	 *
	 * @return the data ins of this piani fabbisogni
	 */
	public Date getDataIns();

	/**
	 * Sets the data ins of this piani fabbisogni.
	 *
	 * @param dataIns the data ins of this piani fabbisogni
	 */
	public void setDataIns(Date dataIns);

	/**
	 * Returns the data agg of this piani fabbisogni.
	 *
	 * @return the data agg of this piani fabbisogni
	 */
	public Date getDataAgg();

	/**
	 * Sets the data agg of this piani fabbisogni.
	 *
	 * @param dataAgg the data agg of this piani fabbisogni
	 */
	public void setDataAgg(Date dataAgg);

	@Override
	public PianiFabbisogni cloneWithOriginalValues();

}