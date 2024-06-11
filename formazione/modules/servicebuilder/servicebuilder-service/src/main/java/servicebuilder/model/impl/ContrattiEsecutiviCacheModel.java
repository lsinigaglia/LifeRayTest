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

import servicebuilder.model.ContrattiEsecutivi;

import servicebuilder.service.persistence.ContrattiEsecutiviPK;

/**
 * The cache model class for representing ContrattiEsecutivi in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ContrattiEsecutiviCacheModel
	implements CacheModel<ContrattiEsecutivi>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ContrattiEsecutiviCacheModel)) {
			return false;
		}

		ContrattiEsecutiviCacheModel contrattiEsecutiviCacheModel =
			(ContrattiEsecutiviCacheModel)object;

		if (contrattiEsecutiviPK.equals(
				contrattiEsecutiviCacheModel.contrattiEsecutiviPK)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, contrattiEsecutiviPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{CodiceContratto=");
		sb.append(CodiceContratto);
		sb.append(", Id_ContrattiEsecutivi=");
		sb.append(Id_ContrattiEsecutivi);
		sb.append(", FK_documenti=");
		sb.append(FK_documenti);
		sb.append(", FK_progettiFabbisogni=");
		sb.append(FK_progettiFabbisogni);
		sb.append(", Descrizione=");
		sb.append(Descrizione);
		sb.append(", Stato=");
		sb.append(Stato);
		sb.append(", DataStato=");
		sb.append(DataStato);
		sb.append(", DataInizioContratto=");
		sb.append(DataInizioContratto);
		sb.append(", DataFineContratto=");
		sb.append(DataFineContratto);
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
	public ContrattiEsecutivi toEntityModel() {
		ContrattiEsecutiviImpl contrattiEsecutiviImpl =
			new ContrattiEsecutiviImpl();

		if (CodiceContratto == null) {
			contrattiEsecutiviImpl.setCodiceContratto("");
		}
		else {
			contrattiEsecutiviImpl.setCodiceContratto(CodiceContratto);
		}

		contrattiEsecutiviImpl.setId_ContrattiEsecutivi(Id_ContrattiEsecutivi);
		contrattiEsecutiviImpl.setFK_documenti(FK_documenti);
		contrattiEsecutiviImpl.setFK_progettiFabbisogni(FK_progettiFabbisogni);

		if (Descrizione == null) {
			contrattiEsecutiviImpl.setDescrizione("");
		}
		else {
			contrattiEsecutiviImpl.setDescrizione(Descrizione);
		}

		if (Stato == null) {
			contrattiEsecutiviImpl.setStato("");
		}
		else {
			contrattiEsecutiviImpl.setStato(Stato);
		}

		if (DataStato == Long.MIN_VALUE) {
			contrattiEsecutiviImpl.setDataStato(null);
		}
		else {
			contrattiEsecutiviImpl.setDataStato(new Date(DataStato));
		}

		if (DataInizioContratto == Long.MIN_VALUE) {
			contrattiEsecutiviImpl.setDataInizioContratto(null);
		}
		else {
			contrattiEsecutiviImpl.setDataInizioContratto(
				new Date(DataInizioContratto));
		}

		if (DataFineContratto == Long.MIN_VALUE) {
			contrattiEsecutiviImpl.setDataFineContratto(null);
		}
		else {
			contrattiEsecutiviImpl.setDataFineContratto(
				new Date(DataFineContratto));
		}

		contrattiEsecutiviImpl.setImportoComplessivo(ImportoComplessivo);

		if (userIns == null) {
			contrattiEsecutiviImpl.setUserIns("");
		}
		else {
			contrattiEsecutiviImpl.setUserIns(userIns);
		}

		if (userAgg == null) {
			contrattiEsecutiviImpl.setUserAgg("");
		}
		else {
			contrattiEsecutiviImpl.setUserAgg(userAgg);
		}

		if (dataIns == Long.MIN_VALUE) {
			contrattiEsecutiviImpl.setDataIns(null);
		}
		else {
			contrattiEsecutiviImpl.setDataIns(new Date(dataIns));
		}

		if (dataAgg == Long.MIN_VALUE) {
			contrattiEsecutiviImpl.setDataAgg(null);
		}
		else {
			contrattiEsecutiviImpl.setDataAgg(new Date(dataAgg));
		}

		contrattiEsecutiviImpl.resetOriginalValues();

		return contrattiEsecutiviImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		CodiceContratto = objectInput.readUTF();

		Id_ContrattiEsecutivi = objectInput.readLong();

		FK_documenti = objectInput.readLong();

		FK_progettiFabbisogni = objectInput.readLong();
		Descrizione = objectInput.readUTF();
		Stato = objectInput.readUTF();
		DataStato = objectInput.readLong();
		DataInizioContratto = objectInput.readLong();
		DataFineContratto = objectInput.readLong();

		ImportoComplessivo = objectInput.readDouble();
		userIns = objectInput.readUTF();
		userAgg = objectInput.readUTF();
		dataIns = objectInput.readLong();
		dataAgg = objectInput.readLong();

		contrattiEsecutiviPK = new ContrattiEsecutiviPK(
			CodiceContratto, Id_ContrattiEsecutivi);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (CodiceContratto == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(CodiceContratto);
		}

		objectOutput.writeLong(Id_ContrattiEsecutivi);

		objectOutput.writeLong(FK_documenti);

		objectOutput.writeLong(FK_progettiFabbisogni);

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
		objectOutput.writeLong(DataInizioContratto);
		objectOutput.writeLong(DataFineContratto);

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

	public String CodiceContratto;
	public long Id_ContrattiEsecutivi;
	public long FK_documenti;
	public long FK_progettiFabbisogni;
	public String Descrizione;
	public String Stato;
	public long DataStato;
	public long DataInizioContratto;
	public long DataFineContratto;
	public double ImportoComplessivo;
	public String userIns;
	public String userAgg;
	public long dataIns;
	public long dataAgg;
	public transient ContrattiEsecutiviPK contrattiEsecutiviPK;

}