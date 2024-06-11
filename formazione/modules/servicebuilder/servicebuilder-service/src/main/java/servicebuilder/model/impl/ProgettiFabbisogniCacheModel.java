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

import servicebuilder.model.ProgettiFabbisogni;

/**
 * The cache model class for representing ProgettiFabbisogni in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ProgettiFabbisogniCacheModel
	implements CacheModel<ProgettiFabbisogni>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProgettiFabbisogniCacheModel)) {
			return false;
		}

		ProgettiFabbisogniCacheModel progettiFabbisogniCacheModel =
			(ProgettiFabbisogniCacheModel)object;

		if (Id_ProgettiFabbisogni ==
				progettiFabbisogniCacheModel.Id_ProgettiFabbisogni) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Id_ProgettiFabbisogni);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{Id_ProgettiFabbisogni=");
		sb.append(Id_ProgettiFabbisogni);
		sb.append(", CodiceFabbisogni=");
		sb.append(CodiceFabbisogni);
		sb.append(", FK_documenti=");
		sb.append(FK_documenti);
		sb.append(", FK_progettiFabbisogni=");
		sb.append(FK_progettiFabbisogni);
		sb.append(", FK_pianiFabbisogni=");
		sb.append(FK_pianiFabbisogni);
		sb.append(", Stato=");
		sb.append(Stato);
		sb.append(", DataStato=");
		sb.append(DataStato);
		sb.append(", Descrizione=");
		sb.append(Descrizione);
		sb.append(", DataScadenza=");
		sb.append(DataScadenza);
		sb.append(", ImportoComplessivo=");
		sb.append(ImportoComplessivo);
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
	public ProgettiFabbisogni toEntityModel() {
		ProgettiFabbisogniImpl progettiFabbisogniImpl =
			new ProgettiFabbisogniImpl();

		progettiFabbisogniImpl.setId_ProgettiFabbisogni(Id_ProgettiFabbisogni);

		if (CodiceFabbisogni == null) {
			progettiFabbisogniImpl.setCodiceFabbisogni("");
		}
		else {
			progettiFabbisogniImpl.setCodiceFabbisogni(CodiceFabbisogni);
		}

		progettiFabbisogniImpl.setFK_documenti(FK_documenti);
		progettiFabbisogniImpl.setFK_progettiFabbisogni(FK_progettiFabbisogni);
		progettiFabbisogniImpl.setFK_pianiFabbisogni(FK_pianiFabbisogni);

		if (Stato == null) {
			progettiFabbisogniImpl.setStato("");
		}
		else {
			progettiFabbisogniImpl.setStato(Stato);
		}

		if (DataStato == Long.MIN_VALUE) {
			progettiFabbisogniImpl.setDataStato(null);
		}
		else {
			progettiFabbisogniImpl.setDataStato(new Date(DataStato));
		}

		if (Descrizione == null) {
			progettiFabbisogniImpl.setDescrizione("");
		}
		else {
			progettiFabbisogniImpl.setDescrizione(Descrizione);
		}

		if (DataScadenza == Long.MIN_VALUE) {
			progettiFabbisogniImpl.setDataScadenza(null);
		}
		else {
			progettiFabbisogniImpl.setDataScadenza(new Date(DataScadenza));
		}

		progettiFabbisogniImpl.setImportoComplessivo(ImportoComplessivo);

		if (DataInizioPiano == Long.MIN_VALUE) {
			progettiFabbisogniImpl.setDataInizioPiano(null);
		}
		else {
			progettiFabbisogniImpl.setDataInizioPiano(
				new Date(DataInizioPiano));
		}

		if (DataFinePiano == Long.MIN_VALUE) {
			progettiFabbisogniImpl.setDataFinePiano(null);
		}
		else {
			progettiFabbisogniImpl.setDataFinePiano(new Date(DataFinePiano));
		}

		if (userIns == null) {
			progettiFabbisogniImpl.setUserIns("");
		}
		else {
			progettiFabbisogniImpl.setUserIns(userIns);
		}

		if (userAgg == null) {
			progettiFabbisogniImpl.setUserAgg("");
		}
		else {
			progettiFabbisogniImpl.setUserAgg(userAgg);
		}

		if (dataIns == Long.MIN_VALUE) {
			progettiFabbisogniImpl.setDataIns(null);
		}
		else {
			progettiFabbisogniImpl.setDataIns(new Date(dataIns));
		}

		if (dataAgg == Long.MIN_VALUE) {
			progettiFabbisogniImpl.setDataAgg(null);
		}
		else {
			progettiFabbisogniImpl.setDataAgg(new Date(dataAgg));
		}

		progettiFabbisogniImpl.resetOriginalValues();

		return progettiFabbisogniImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id_ProgettiFabbisogni = objectInput.readLong();
		CodiceFabbisogni = objectInput.readUTF();

		FK_documenti = objectInput.readLong();

		FK_progettiFabbisogni = objectInput.readLong();

		FK_pianiFabbisogni = objectInput.readLong();
		Stato = objectInput.readUTF();
		DataStato = objectInput.readLong();
		Descrizione = objectInput.readUTF();
		DataScadenza = objectInput.readLong();

		ImportoComplessivo = objectInput.readDouble();
		DataInizioPiano = objectInput.readLong();
		DataFinePiano = objectInput.readLong();
		userIns = objectInput.readUTF();
		userAgg = objectInput.readUTF();
		dataIns = objectInput.readLong();
		dataAgg = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(Id_ProgettiFabbisogni);

		if (CodiceFabbisogni == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(CodiceFabbisogni);
		}

		objectOutput.writeLong(FK_documenti);

		objectOutput.writeLong(FK_progettiFabbisogni);

		objectOutput.writeLong(FK_pianiFabbisogni);

		if (Stato == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Stato);
		}

		objectOutput.writeLong(DataStato);

		if (Descrizione == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Descrizione);
		}

		objectOutput.writeLong(DataScadenza);

		objectOutput.writeDouble(ImportoComplessivo);
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

	public long Id_ProgettiFabbisogni;
	public String CodiceFabbisogni;
	public long FK_documenti;
	public long FK_progettiFabbisogni;
	public long FK_pianiFabbisogni;
	public String Stato;
	public long DataStato;
	public String Descrizione;
	public long DataScadenza;
	public double ImportoComplessivo;
	public long DataInizioPiano;
	public long DataFinePiano;
	public String userIns;
	public String userAgg;
	public long dataIns;
	public long dataAgg;

}