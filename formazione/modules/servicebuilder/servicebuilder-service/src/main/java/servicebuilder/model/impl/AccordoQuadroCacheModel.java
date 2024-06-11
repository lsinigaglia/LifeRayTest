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

import servicebuilder.model.AccordoQuadro;

/**
 * The cache model class for representing AccordoQuadro in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccordoQuadroCacheModel
	implements CacheModel<AccordoQuadro>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccordoQuadroCacheModel)) {
			return false;
		}

		AccordoQuadroCacheModel accordoQuadroCacheModel =
			(AccordoQuadroCacheModel)object;

		if (Id_AccordoQuadro == accordoQuadroCacheModel.Id_AccordoQuadro) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Id_AccordoQuadro);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{Id_AccordoQuadro=");
		sb.append(Id_AccordoQuadro);
		sb.append(", CodiceAccordo=");
		sb.append(CodiceAccordo);
		sb.append(", FK_documenti=");
		sb.append(FK_documenti);
		sb.append(", Descrizione=");
		sb.append(Descrizione);
		sb.append(", DataInizioValidita=");
		sb.append(DataInizioValidita);
		sb.append(", DataFineValidita=");
		sb.append(DataFineValidita);
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
	public AccordoQuadro toEntityModel() {
		AccordoQuadroImpl accordoQuadroImpl = new AccordoQuadroImpl();

		accordoQuadroImpl.setId_AccordoQuadro(Id_AccordoQuadro);

		if (CodiceAccordo == null) {
			accordoQuadroImpl.setCodiceAccordo("");
		}
		else {
			accordoQuadroImpl.setCodiceAccordo(CodiceAccordo);
		}

		accordoQuadroImpl.setFK_documenti(FK_documenti);

		if (Descrizione == null) {
			accordoQuadroImpl.setDescrizione("");
		}
		else {
			accordoQuadroImpl.setDescrizione(Descrizione);
		}

		if (DataInizioValidita == Long.MIN_VALUE) {
			accordoQuadroImpl.setDataInizioValidita(null);
		}
		else {
			accordoQuadroImpl.setDataInizioValidita(
				new Date(DataInizioValidita));
		}

		if (DataFineValidita == Long.MIN_VALUE) {
			accordoQuadroImpl.setDataFineValidita(null);
		}
		else {
			accordoQuadroImpl.setDataFineValidita(new Date(DataFineValidita));
		}

		accordoQuadroImpl.setImportoComplessivo(ImportoComplessivo);

		if (userIns == null) {
			accordoQuadroImpl.setUserIns("");
		}
		else {
			accordoQuadroImpl.setUserIns(userIns);
		}

		if (userAgg == null) {
			accordoQuadroImpl.setUserAgg("");
		}
		else {
			accordoQuadroImpl.setUserAgg(userAgg);
		}

		if (dataIns == Long.MIN_VALUE) {
			accordoQuadroImpl.setDataIns(null);
		}
		else {
			accordoQuadroImpl.setDataIns(new Date(dataIns));
		}

		if (dataAgg == Long.MIN_VALUE) {
			accordoQuadroImpl.setDataAgg(null);
		}
		else {
			accordoQuadroImpl.setDataAgg(new Date(dataAgg));
		}

		accordoQuadroImpl.resetOriginalValues();

		return accordoQuadroImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id_AccordoQuadro = objectInput.readLong();
		CodiceAccordo = objectInput.readUTF();

		FK_documenti = objectInput.readLong();
		Descrizione = objectInput.readUTF();
		DataInizioValidita = objectInput.readLong();
		DataFineValidita = objectInput.readLong();

		ImportoComplessivo = objectInput.readDouble();
		userIns = objectInput.readUTF();
		userAgg = objectInput.readUTF();
		dataIns = objectInput.readLong();
		dataAgg = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(Id_AccordoQuadro);

		if (CodiceAccordo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(CodiceAccordo);
		}

		objectOutput.writeLong(FK_documenti);

		if (Descrizione == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Descrizione);
		}

		objectOutput.writeLong(DataInizioValidita);
		objectOutput.writeLong(DataFineValidita);

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

	public long Id_AccordoQuadro;
	public String CodiceAccordo;
	public long FK_documenti;
	public String Descrizione;
	public long DataInizioValidita;
	public long DataFineValidita;
	public double ImportoComplessivo;
	public String userIns;
	public String userAgg;
	public long dataIns;
	public long dataAgg;

}