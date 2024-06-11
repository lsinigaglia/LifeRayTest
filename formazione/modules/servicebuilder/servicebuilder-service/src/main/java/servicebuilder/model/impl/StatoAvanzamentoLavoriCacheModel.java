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

import servicebuilder.model.StatoAvanzamentoLavori;

/**
 * The cache model class for representing StatoAvanzamentoLavori in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StatoAvanzamentoLavoriCacheModel
	implements CacheModel<StatoAvanzamentoLavori>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof StatoAvanzamentoLavoriCacheModel)) {
			return false;
		}

		StatoAvanzamentoLavoriCacheModel statoAvanzamentoLavoriCacheModel =
			(StatoAvanzamentoLavoriCacheModel)object;

		if (Id_SAL == statoAvanzamentoLavoriCacheModel.Id_SAL) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Id_SAL);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{Id_SAL=");
		sb.append(Id_SAL);
		sb.append(", FK_documenti=");
		sb.append(FK_documenti);
		sb.append(", CodiceSAL=");
		sb.append(CodiceSAL);
		sb.append(", Descrizione=");
		sb.append(Descrizione);
		sb.append(", Stato=");
		sb.append(Stato);
		sb.append(", DataStato=");
		sb.append(DataStato);
		sb.append(", MeseAnnoRiferimento=");
		sb.append(MeseAnnoRiferimento);
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
	public StatoAvanzamentoLavori toEntityModel() {
		StatoAvanzamentoLavoriImpl statoAvanzamentoLavoriImpl =
			new StatoAvanzamentoLavoriImpl();

		statoAvanzamentoLavoriImpl.setId_SAL(Id_SAL);
		statoAvanzamentoLavoriImpl.setFK_documenti(FK_documenti);

		if (CodiceSAL == null) {
			statoAvanzamentoLavoriImpl.setCodiceSAL("");
		}
		else {
			statoAvanzamentoLavoriImpl.setCodiceSAL(CodiceSAL);
		}

		if (Descrizione == null) {
			statoAvanzamentoLavoriImpl.setDescrizione("");
		}
		else {
			statoAvanzamentoLavoriImpl.setDescrizione(Descrizione);
		}

		if (Stato == null) {
			statoAvanzamentoLavoriImpl.setStato("");
		}
		else {
			statoAvanzamentoLavoriImpl.setStato(Stato);
		}

		if (DataStato == Long.MIN_VALUE) {
			statoAvanzamentoLavoriImpl.setDataStato(null);
		}
		else {
			statoAvanzamentoLavoriImpl.setDataStato(new Date(DataStato));
		}

		if (MeseAnnoRiferimento == null) {
			statoAvanzamentoLavoriImpl.setMeseAnnoRiferimento("");
		}
		else {
			statoAvanzamentoLavoriImpl.setMeseAnnoRiferimento(
				MeseAnnoRiferimento);
		}

		statoAvanzamentoLavoriImpl.setImportoComplessivo(ImportoComplessivo);

		if (userIns == null) {
			statoAvanzamentoLavoriImpl.setUserIns("");
		}
		else {
			statoAvanzamentoLavoriImpl.setUserIns(userIns);
		}

		if (userAgg == null) {
			statoAvanzamentoLavoriImpl.setUserAgg("");
		}
		else {
			statoAvanzamentoLavoriImpl.setUserAgg(userAgg);
		}

		if (dataIns == Long.MIN_VALUE) {
			statoAvanzamentoLavoriImpl.setDataIns(null);
		}
		else {
			statoAvanzamentoLavoriImpl.setDataIns(new Date(dataIns));
		}

		if (dataAgg == Long.MIN_VALUE) {
			statoAvanzamentoLavoriImpl.setDataAgg(null);
		}
		else {
			statoAvanzamentoLavoriImpl.setDataAgg(new Date(dataAgg));
		}

		statoAvanzamentoLavoriImpl.resetOriginalValues();

		return statoAvanzamentoLavoriImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id_SAL = objectInput.readLong();

		FK_documenti = objectInput.readLong();
		CodiceSAL = objectInput.readUTF();
		Descrizione = objectInput.readUTF();
		Stato = objectInput.readUTF();
		DataStato = objectInput.readLong();
		MeseAnnoRiferimento = objectInput.readUTF();

		ImportoComplessivo = objectInput.readDouble();
		userIns = objectInput.readUTF();
		userAgg = objectInput.readUTF();
		dataIns = objectInput.readLong();
		dataAgg = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(Id_SAL);

		objectOutput.writeLong(FK_documenti);

		if (CodiceSAL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(CodiceSAL);
		}

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

		if (MeseAnnoRiferimento == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(MeseAnnoRiferimento);
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

	public long Id_SAL;
	public long FK_documenti;
	public String CodiceSAL;
	public String Descrizione;
	public String Stato;
	public long DataStato;
	public String MeseAnnoRiferimento;
	public double ImportoComplessivo;
	public String userIns;
	public String userAgg;
	public long dataIns;
	public long dataAgg;

}