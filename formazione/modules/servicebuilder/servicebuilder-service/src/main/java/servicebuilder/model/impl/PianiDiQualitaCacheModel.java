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

package servicebuilder.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import servicebuilder.model.PianiDiQualita;

/**
 * The cache model class for representing PianiDiQualita in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PianiDiQualitaCacheModel
	implements CacheModel<PianiDiQualita>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PianiDiQualitaCacheModel)) {
			return false;
		}

		PianiDiQualitaCacheModel pianiDiQualitaCacheModel =
			(PianiDiQualitaCacheModel)object;

		if (Id_PianiDiQualita == pianiDiQualitaCacheModel.Id_PianiDiQualita) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Id_PianiDiQualita);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{Id_PianiDiQualita=");
		sb.append(Id_PianiDiQualita);
		sb.append(", CodicePianoDiQualita=");
		sb.append(CodicePianoDiQualita);
		sb.append(", FK_documenti=");
		sb.append(FK_documenti);
		sb.append(", FK_accordoQuadro=");
		sb.append(FK_accordoQuadro);
		sb.append(", Descrizione=");
		sb.append(Descrizione);
		sb.append(", DataInizioPiano=");
		sb.append(DataInizioPiano);
		sb.append(", DataFinePiano=");
		sb.append(DataFinePiano);
		sb.append(", userIns=");
		sb.append(userIns);
		sb.append(", userAgg=");
		sb.append(userAgg);
		sb.append(", dataIns=");
		sb.append(dataIns);
		sb.append(", dataAgg=");
		sb.append(dataAgg);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PianiDiQualita toEntityModel() {
		PianiDiQualitaImpl pianiDiQualitaImpl = new PianiDiQualitaImpl();

		pianiDiQualitaImpl.setId_PianiDiQualita(Id_PianiDiQualita);

		if (CodicePianoDiQualita == null) {
			pianiDiQualitaImpl.setCodicePianoDiQualita("");
		}
		else {
			pianiDiQualitaImpl.setCodicePianoDiQualita(CodicePianoDiQualita);
		}

		pianiDiQualitaImpl.setFK_documenti(FK_documenti);
		pianiDiQualitaImpl.setFK_accordoQuadro(FK_accordoQuadro);

		if (Descrizione == null) {
			pianiDiQualitaImpl.setDescrizione("");
		}
		else {
			pianiDiQualitaImpl.setDescrizione(Descrizione);
		}

		if (DataInizioPiano == Long.MIN_VALUE) {
			pianiDiQualitaImpl.setDataInizioPiano(null);
		}
		else {
			pianiDiQualitaImpl.setDataInizioPiano(new Date(DataInizioPiano));
		}

		if (DataFinePiano == Long.MIN_VALUE) {
			pianiDiQualitaImpl.setDataFinePiano(null);
		}
		else {
			pianiDiQualitaImpl.setDataFinePiano(new Date(DataFinePiano));
		}

		if (userIns == null) {
			pianiDiQualitaImpl.setUserIns("");
		}
		else {
			pianiDiQualitaImpl.setUserIns(userIns);
		}

		if (userAgg == null) {
			pianiDiQualitaImpl.setUserAgg("");
		}
		else {
			pianiDiQualitaImpl.setUserAgg(userAgg);
		}

		if (dataIns == Long.MIN_VALUE) {
			pianiDiQualitaImpl.setDataIns(null);
		}
		else {
			pianiDiQualitaImpl.setDataIns(new Date(dataIns));
		}

		if (dataAgg == Long.MIN_VALUE) {
			pianiDiQualitaImpl.setDataAgg(null);
		}
		else {
			pianiDiQualitaImpl.setDataAgg(new Date(dataAgg));
		}

		pianiDiQualitaImpl.resetOriginalValues();

		return pianiDiQualitaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id_PianiDiQualita = objectInput.readLong();
		CodicePianoDiQualita = objectInput.readUTF();

		FK_documenti = objectInput.readLong();

		FK_accordoQuadro = objectInput.readLong();
		Descrizione = objectInput.readUTF();
		DataInizioPiano = objectInput.readLong();
		DataFinePiano = objectInput.readLong();
		userIns = objectInput.readUTF();
		userAgg = objectInput.readUTF();
		dataIns = objectInput.readLong();
		dataAgg = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(Id_PianiDiQualita);

		if (CodicePianoDiQualita == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(CodicePianoDiQualita);
		}

		objectOutput.writeLong(FK_documenti);

		objectOutput.writeLong(FK_accordoQuadro);

		if (Descrizione == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Descrizione);
		}

		objectOutput.writeLong(DataInizioPiano);
		objectOutput.writeLong(DataFinePiano);

		if (userIns == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userIns);
		}

		if (userAgg == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userAgg);
		}

		objectOutput.writeLong(dataIns);
		objectOutput.writeLong(dataAgg);
	}

	public long Id_PianiDiQualita;
	public String CodicePianoDiQualita;
	public long FK_documenti;
	public long FK_accordoQuadro;
	public String Descrizione;
	public long DataInizioPiano;
	public long DataFinePiano;
	public String userIns;
	public String userAgg;
	public long dataIns;
	public long dataAgg;

}