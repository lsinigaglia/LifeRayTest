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

import servicebuilder.model.PianiDiLavoroObiettivo;

/**
 * The cache model class for representing PianiDiLavoroObiettivo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PianiDiLavoroObiettivoCacheModel
	implements CacheModel<PianiDiLavoroObiettivo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PianiDiLavoroObiettivoCacheModel)) {
			return false;
		}

		PianiDiLavoroObiettivoCacheModel pianiDiLavoroObiettivoCacheModel =
			(PianiDiLavoroObiettivoCacheModel)object;

		if (Id_PianoDiLavoro ==
				pianiDiLavoroObiettivoCacheModel.Id_PianoDiLavoro) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Id_PianoDiLavoro);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{Id_PianoDiLavoro=");
		sb.append(Id_PianoDiLavoro);
		sb.append(", CodicePianoLavoroObiettivo=");
		sb.append(CodicePianoLavoroObiettivo);
		sb.append(", FK_documenti=");
		sb.append(FK_documenti);
		sb.append(", FK_progettiFabbisogni=");
		sb.append(FK_progettiFabbisogni);
		sb.append(", Descrizione=");
		sb.append(Descrizione);
		sb.append(", DataInizioPiano=");
		sb.append(DataInizioPiano);
		sb.append(", DataFinePiano=");
		sb.append(DataFinePiano);
		sb.append(", ImportoComplessivo=");
		sb.append(ImportoComplessivo);
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
	public PianiDiLavoroObiettivo toEntityModel() {
		PianiDiLavoroObiettivoImpl pianiDiLavoroObiettivoImpl =
			new PianiDiLavoroObiettivoImpl();

		pianiDiLavoroObiettivoImpl.setId_PianoDiLavoro(Id_PianoDiLavoro);

		if (CodicePianoLavoroObiettivo == null) {
			pianiDiLavoroObiettivoImpl.setCodicePianoLavoroObiettivo("");
		}
		else {
			pianiDiLavoroObiettivoImpl.setCodicePianoLavoroObiettivo(
				CodicePianoLavoroObiettivo);
		}

		pianiDiLavoroObiettivoImpl.setFK_documenti(FK_documenti);
		pianiDiLavoroObiettivoImpl.setFK_progettiFabbisogni(
			FK_progettiFabbisogni);

		if (Descrizione == null) {
			pianiDiLavoroObiettivoImpl.setDescrizione("");
		}
		else {
			pianiDiLavoroObiettivoImpl.setDescrizione(Descrizione);
		}

		if (DataInizioPiano == Long.MIN_VALUE) {
			pianiDiLavoroObiettivoImpl.setDataInizioPiano(null);
		}
		else {
			pianiDiLavoroObiettivoImpl.setDataInizioPiano(
				new Date(DataInizioPiano));
		}

		if (DataFinePiano == Long.MIN_VALUE) {
			pianiDiLavoroObiettivoImpl.setDataFinePiano(null);
		}
		else {
			pianiDiLavoroObiettivoImpl.setDataFinePiano(
				new Date(DataFinePiano));
		}

		pianiDiLavoroObiettivoImpl.setImportoComplessivo(ImportoComplessivo);

		if (userIns == null) {
			pianiDiLavoroObiettivoImpl.setUserIns("");
		}
		else {
			pianiDiLavoroObiettivoImpl.setUserIns(userIns);
		}

		if (userAgg == null) {
			pianiDiLavoroObiettivoImpl.setUserAgg("");
		}
		else {
			pianiDiLavoroObiettivoImpl.setUserAgg(userAgg);
		}

		if (dataIns == Long.MIN_VALUE) {
			pianiDiLavoroObiettivoImpl.setDataIns(null);
		}
		else {
			pianiDiLavoroObiettivoImpl.setDataIns(new Date(dataIns));
		}

		if (dataAgg == Long.MIN_VALUE) {
			pianiDiLavoroObiettivoImpl.setDataAgg(null);
		}
		else {
			pianiDiLavoroObiettivoImpl.setDataAgg(new Date(dataAgg));
		}

		pianiDiLavoroObiettivoImpl.resetOriginalValues();

		return pianiDiLavoroObiettivoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id_PianoDiLavoro = objectInput.readLong();
		CodicePianoLavoroObiettivo = objectInput.readUTF();

		FK_documenti = objectInput.readLong();

		FK_progettiFabbisogni = objectInput.readLong();
		Descrizione = objectInput.readUTF();
		DataInizioPiano = objectInput.readLong();
		DataFinePiano = objectInput.readLong();

		ImportoComplessivo = objectInput.readDouble();
		userIns = objectInput.readUTF();
		userAgg = objectInput.readUTF();
		dataIns = objectInput.readLong();
		dataAgg = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(Id_PianoDiLavoro);

		if (CodicePianoLavoroObiettivo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(CodicePianoLavoroObiettivo);
		}

		objectOutput.writeLong(FK_documenti);

		objectOutput.writeLong(FK_progettiFabbisogni);

		if (Descrizione == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Descrizione);
		}

		objectOutput.writeLong(DataInizioPiano);
		objectOutput.writeLong(DataFinePiano);

		objectOutput.writeDouble(ImportoComplessivo);

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

	public long Id_PianoDiLavoro;
	public String CodicePianoLavoroObiettivo;
	public long FK_documenti;
	public long FK_progettiFabbisogni;
	public String Descrizione;
	public long DataInizioPiano;
	public long DataFinePiano;
	public double ImportoComplessivo;
	public String userIns;
	public String userAgg;
	public long dataIns;
	public long dataAgg;

}