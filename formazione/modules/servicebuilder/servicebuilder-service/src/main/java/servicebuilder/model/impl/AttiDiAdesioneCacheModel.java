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

import servicebuilder.model.AttiDiAdesione;

/**
 * The cache model class for representing AttiDiAdesione in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttiDiAdesioneCacheModel
	implements CacheModel<AttiDiAdesione>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttiDiAdesioneCacheModel)) {
			return false;
		}

		AttiDiAdesioneCacheModel attiDiAdesioneCacheModel =
			(AttiDiAdesioneCacheModel)object;

		if (Id_AttiDiAdesione == attiDiAdesioneCacheModel.Id_AttiDiAdesione) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Id_AttiDiAdesione);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{Id_AttiDiAdesione=");
		sb.append(Id_AttiDiAdesione);
		sb.append(", CodiceAttoDiAdesione=");
		sb.append(CodiceAttoDiAdesione);
		sb.append(", FK_documenti=");
		sb.append(FK_documenti);
		sb.append(", FK_accordoQuadro=");
		sb.append(FK_accordoQuadro);
		sb.append(", Anno=");
		sb.append(Anno);
		sb.append(", Stato=");
		sb.append(Stato);
		sb.append(", DataStato=");
		sb.append(DataStato);
		sb.append(", Descrizione=");
		sb.append(Descrizione);
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
	public AttiDiAdesione toEntityModel() {
		AttiDiAdesioneImpl attiDiAdesioneImpl = new AttiDiAdesioneImpl();

		attiDiAdesioneImpl.setId_AttiDiAdesione(Id_AttiDiAdesione);

		if (CodiceAttoDiAdesione == null) {
			attiDiAdesioneImpl.setCodiceAttoDiAdesione("");
		}
		else {
			attiDiAdesioneImpl.setCodiceAttoDiAdesione(CodiceAttoDiAdesione);
		}

		attiDiAdesioneImpl.setFK_documenti(FK_documenti);
		attiDiAdesioneImpl.setFK_accordoQuadro(FK_accordoQuadro);
		attiDiAdesioneImpl.setAnno(Anno);

		if (Stato == null) {
			attiDiAdesioneImpl.setStato("");
		}
		else {
			attiDiAdesioneImpl.setStato(Stato);
		}

		if (DataStato == Long.MIN_VALUE) {
			attiDiAdesioneImpl.setDataStato(null);
		}
		else {
			attiDiAdesioneImpl.setDataStato(new Date(DataStato));
		}

		if (Descrizione == null) {
			attiDiAdesioneImpl.setDescrizione("");
		}
		else {
			attiDiAdesioneImpl.setDescrizione(Descrizione);
		}

		attiDiAdesioneImpl.setImportoComplessivo(ImportoComplessivo);

		if (userIns == null) {
			attiDiAdesioneImpl.setUserIns("");
		}
		else {
			attiDiAdesioneImpl.setUserIns(userIns);
		}

		if (userAgg == null) {
			attiDiAdesioneImpl.setUserAgg("");
		}
		else {
			attiDiAdesioneImpl.setUserAgg(userAgg);
		}

		if (dataIns == Long.MIN_VALUE) {
			attiDiAdesioneImpl.setDataIns(null);
		}
		else {
			attiDiAdesioneImpl.setDataIns(new Date(dataIns));
		}

		if (dataAgg == Long.MIN_VALUE) {
			attiDiAdesioneImpl.setDataAgg(null);
		}
		else {
			attiDiAdesioneImpl.setDataAgg(new Date(dataAgg));
		}

		attiDiAdesioneImpl.resetOriginalValues();

		return attiDiAdesioneImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id_AttiDiAdesione = objectInput.readLong();
		CodiceAttoDiAdesione = objectInput.readUTF();

		FK_documenti = objectInput.readLong();

		FK_accordoQuadro = objectInput.readLong();

		Anno = objectInput.readInt();
		Stato = objectInput.readUTF();
		DataStato = objectInput.readLong();
		Descrizione = objectInput.readUTF();

		ImportoComplessivo = objectInput.readDouble();
		userIns = objectInput.readUTF();
		userAgg = objectInput.readUTF();
		dataIns = objectInput.readLong();
		dataAgg = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(Id_AttiDiAdesione);

		if (CodiceAttoDiAdesione == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(CodiceAttoDiAdesione);
		}

		objectOutput.writeLong(FK_documenti);

		objectOutput.writeLong(FK_accordoQuadro);

		objectOutput.writeInt(Anno);

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

	public long Id_AttiDiAdesione;
	public String CodiceAttoDiAdesione;
	public long FK_documenti;
	public long FK_accordoQuadro;
	public int Anno;
	public String Stato;
	public long DataStato;
	public String Descrizione;
	public double ImportoComplessivo;
	public String userIns;
	public String userAgg;
	public long dataIns;
	public long dataAgg;

}