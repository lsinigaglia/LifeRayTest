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

import servicebuilder.model.PianiFabbisogni;

/**
 * The cache model class for representing PianiFabbisogni in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PianiFabbisogniCacheModel
	implements CacheModel<PianiFabbisogni>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PianiFabbisogniCacheModel)) {
			return false;
		}

		PianiFabbisogniCacheModel pianiFabbisogniCacheModel =
			(PianiFabbisogniCacheModel)object;

		if (Id_PianiFabbisogni ==
				pianiFabbisogniCacheModel.Id_PianiFabbisogni) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Id_PianiFabbisogni);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{Id_PianiFabbisogni=");
		sb.append(Id_PianiFabbisogni);
		sb.append(", CodicePianoFabbisogno=");
		sb.append(CodicePianoFabbisogno);
		sb.append(", FK_documenti=");
		sb.append(FK_documenti);
		sb.append(", FK_attiDiAdesione=");
		sb.append(FK_attiDiAdesione);
		sb.append(", Descrizione=");
		sb.append(Descrizione);
		sb.append(", Stato=");
		sb.append(Stato);
		sb.append(", DataStato=");
		sb.append(DataStato);
		sb.append(", DataInizioFabbisogni=");
		sb.append(DataInizioFabbisogni);
		sb.append(", DataFineFabbisogni=");
		sb.append(DataFineFabbisogni);
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
	public PianiFabbisogni toEntityModel() {
		PianiFabbisogniImpl pianiFabbisogniImpl = new PianiFabbisogniImpl();

		pianiFabbisogniImpl.setId_PianiFabbisogni(Id_PianiFabbisogni);

		if (CodicePianoFabbisogno == null) {
			pianiFabbisogniImpl.setCodicePianoFabbisogno("");
		}
		else {
			pianiFabbisogniImpl.setCodicePianoFabbisogno(CodicePianoFabbisogno);
		}

		pianiFabbisogniImpl.setFK_documenti(FK_documenti);
		pianiFabbisogniImpl.setFK_attiDiAdesione(FK_attiDiAdesione);

		if (Descrizione == null) {
			pianiFabbisogniImpl.setDescrizione("");
		}
		else {
			pianiFabbisogniImpl.setDescrizione(Descrizione);
		}

		if (Stato == null) {
			pianiFabbisogniImpl.setStato("");
		}
		else {
			pianiFabbisogniImpl.setStato(Stato);
		}

		if (DataStato == Long.MIN_VALUE) {
			pianiFabbisogniImpl.setDataStato(null);
		}
		else {
			pianiFabbisogniImpl.setDataStato(new Date(DataStato));
		}

		if (DataInizioFabbisogni == Long.MIN_VALUE) {
			pianiFabbisogniImpl.setDataInizioFabbisogni(null);
		}
		else {
			pianiFabbisogniImpl.setDataInizioFabbisogni(
				new Date(DataInizioFabbisogni));
		}

		if (DataFineFabbisogni == Long.MIN_VALUE) {
			pianiFabbisogniImpl.setDataFineFabbisogni(null);
		}
		else {
			pianiFabbisogniImpl.setDataFineFabbisogni(
				new Date(DataFineFabbisogni));
		}

		if (userIns == null) {
			pianiFabbisogniImpl.setUserIns("");
		}
		else {
			pianiFabbisogniImpl.setUserIns(userIns);
		}

		if (userAgg == null) {
			pianiFabbisogniImpl.setUserAgg("");
		}
		else {
			pianiFabbisogniImpl.setUserAgg(userAgg);
		}

		if (dataIns == Long.MIN_VALUE) {
			pianiFabbisogniImpl.setDataIns(null);
		}
		else {
			pianiFabbisogniImpl.setDataIns(new Date(dataIns));
		}

		if (dataAgg == Long.MIN_VALUE) {
			pianiFabbisogniImpl.setDataAgg(null);
		}
		else {
			pianiFabbisogniImpl.setDataAgg(new Date(dataAgg));
		}

		pianiFabbisogniImpl.resetOriginalValues();

		return pianiFabbisogniImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id_PianiFabbisogni = objectInput.readLong();
		CodicePianoFabbisogno = objectInput.readUTF();

		FK_documenti = objectInput.readLong();

		FK_attiDiAdesione = objectInput.readLong();
		Descrizione = objectInput.readUTF();
		Stato = objectInput.readUTF();
		DataStato = objectInput.readLong();
		DataInizioFabbisogni = objectInput.readLong();
		DataFineFabbisogni = objectInput.readLong();
		userIns = objectInput.readUTF();
		userAgg = objectInput.readUTF();
		dataIns = objectInput.readLong();
		dataAgg = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(Id_PianiFabbisogni);

		if (CodicePianoFabbisogno == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(CodicePianoFabbisogno);
		}

		objectOutput.writeLong(FK_documenti);

		objectOutput.writeLong(FK_attiDiAdesione);

		if (Descrizione == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Descrizione);
		}

		if (Stato == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Stato);
		}

		objectOutput.writeLong(DataStato);
		objectOutput.writeLong(DataInizioFabbisogni);
		objectOutput.writeLong(DataFineFabbisogni);

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

	public long Id_PianiFabbisogni;
	public String CodicePianoFabbisogno;
	public long FK_documenti;
	public long FK_attiDiAdesione;
	public String Descrizione;
	public String Stato;
	public long DataStato;
	public long DataInizioFabbisogni;
	public long DataFineFabbisogni;
	public String userIns;
	public String userAgg;
	public long dataIns;
	public long dataAgg;

}