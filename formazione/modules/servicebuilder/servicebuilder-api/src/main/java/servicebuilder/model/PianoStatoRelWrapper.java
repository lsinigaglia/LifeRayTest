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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PianoStatoRel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PianoStatoRel
 * @generated
 */
public class PianoStatoRelWrapper
	extends BaseModelWrapper<PianoStatoRel>
	implements ModelWrapper<PianoStatoRel>, PianoStatoRel {

	public PianoStatoRelWrapper(PianoStatoRel pianoStatoRel) {
		super(pianoStatoRel);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id_Relazione", getId_Relazione());
		attributes.put("Id_PianodiLavoro", getId_PianodiLavoro());
		attributes.put("Id_SAL", getId_SAL());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id_Relazione = (Long)attributes.get("Id_Relazione");

		if (Id_Relazione != null) {
			setId_Relazione(Id_Relazione);
		}

		Long Id_PianodiLavoro = (Long)attributes.get("Id_PianodiLavoro");

		if (Id_PianodiLavoro != null) {
			setId_PianodiLavoro(Id_PianodiLavoro);
		}

		Long Id_SAL = (Long)attributes.get("Id_SAL");

		if (Id_SAL != null) {
			setId_SAL(Id_SAL);
		}
	}

	@Override
	public PianoStatoRel cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the id_ pianodi lavoro of this piano stato rel.
	 *
	 * @return the id_ pianodi lavoro of this piano stato rel
	 */
	@Override
	public long getId_PianodiLavoro() {
		return model.getId_PianodiLavoro();
	}

	/**
	 * Returns the id_ relazione of this piano stato rel.
	 *
	 * @return the id_ relazione of this piano stato rel
	 */
	@Override
	public long getId_Relazione() {
		return model.getId_Relazione();
	}

	/**
	 * Returns the id_sal of this piano stato rel.
	 *
	 * @return the id_sal of this piano stato rel
	 */
	@Override
	public long getId_SAL() {
		return model.getId_SAL();
	}

	/**
	 * Returns the primary key of this piano stato rel.
	 *
	 * @return the primary key of this piano stato rel
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the id_ pianodi lavoro of this piano stato rel.
	 *
	 * @param Id_PianodiLavoro the id_ pianodi lavoro of this piano stato rel
	 */
	@Override
	public void setId_PianodiLavoro(long Id_PianodiLavoro) {
		model.setId_PianodiLavoro(Id_PianodiLavoro);
	}

	/**
	 * Sets the id_ relazione of this piano stato rel.
	 *
	 * @param Id_Relazione the id_ relazione of this piano stato rel
	 */
	@Override
	public void setId_Relazione(long Id_Relazione) {
		model.setId_Relazione(Id_Relazione);
	}

	/**
	 * Sets the id_sal of this piano stato rel.
	 *
	 * @param Id_SAL the id_sal of this piano stato rel
	 */
	@Override
	public void setId_SAL(long Id_SAL) {
		model.setId_SAL(Id_SAL);
	}

	/**
	 * Sets the primary key of this piano stato rel.
	 *
	 * @param primaryKey the primary key of this piano stato rel
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected PianoStatoRelWrapper wrap(PianoStatoRel pianoStatoRel) {
		return new PianoStatoRelWrapper(pianoStatoRel);
	}

}