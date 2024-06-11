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

import servicebuilder.model.Documenti;

/**
 * The cache model class for representing Documenti in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DocumentiCacheModel
	implements CacheModel<Documenti>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DocumentiCacheModel)) {
			return false;
		}

		DocumentiCacheModel documentiCacheModel = (DocumentiCacheModel)object;

		if (CodiceDocumento.equals(documentiCacheModel.CodiceDocumento)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, CodiceDocumento);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{Id_CodiceDocumenti=");
		sb.append(Id_CodiceDocumenti);
		sb.append(", CodiceDocumento=");
		sb.append(CodiceDocumento);
		sb.append(", NomeFile=");
		sb.append(NomeFile);
		sb.append(", ContenutoFile=");
		sb.append(ContenutoFile);
		sb.append(", Versione=");
		sb.append(Versione);
		sb.append(", DataVersione=");
		sb.append(DataVersione);
		sb.append(", DataCaricamento=");
		sb.append(DataCaricamento);
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
	public Documenti toEntityModel() {
		DocumentiImpl documentiImpl = new DocumentiImpl();

		documentiImpl.setId_CodiceDocumenti(Id_CodiceDocumenti);

		if (CodiceDocumento == null) {
			documentiImpl.setCodiceDocumento("");
		}
		else {
			documentiImpl.setCodiceDocumento(CodiceDocumento);
		}

		if (NomeFile == null) {
			documentiImpl.setNomeFile("");
		}
		else {
			documentiImpl.setNomeFile(NomeFile);
		}

		if (ContenutoFile == null) {
			documentiImpl.setContenutoFile("");
		}
		else {
			documentiImpl.setContenutoFile(ContenutoFile);
		}

		if (Versione == null) {
			documentiImpl.setVersione("");
		}
		else {
			documentiImpl.setVersione(Versione);
		}

		if (DataVersione == Long.MIN_VALUE) {
			documentiImpl.setDataVersione(null);
		}
		else {
			documentiImpl.setDataVersione(new Date(DataVersione));
		}

		if (DataCaricamento == Long.MIN_VALUE) {
			documentiImpl.setDataCaricamento(null);
		}
		else {
			documentiImpl.setDataCaricamento(new Date(DataCaricamento));
		}

		if (userIns == null) {
			documentiImpl.setUserIns("");
		}
		else {
			documentiImpl.setUserIns(userIns);
		}

		if (userAgg == null) {
			documentiImpl.setUserAgg("");
		}
		else {
			documentiImpl.setUserAgg(userAgg);
		}

		if (dataIns == Long.MIN_VALUE) {
			documentiImpl.setDataIns(null);
		}
		else {
			documentiImpl.setDataIns(new Date(dataIns));
		}

		if (dataAgg == Long.MIN_VALUE) {
			documentiImpl.setDataAgg(null);
		}
		else {
			documentiImpl.setDataAgg(new Date(dataAgg));
		}

		documentiImpl.resetOriginalValues();

		return documentiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id_CodiceDocumenti = objectInput.readLong();
		CodiceDocumento = objectInput.readUTF();
		NomeFile = objectInput.readUTF();
		ContenutoFile = objectInput.readUTF();
		Versione = objectInput.readUTF();
		DataVersione = objectInput.readLong();
		DataCaricamento = objectInput.readLong();
		userIns = objectInput.readUTF();
		userAgg = objectInput.readUTF();
		dataIns = objectInput.readLong();
		dataAgg = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(Id_CodiceDocumenti);

		if (CodiceDocumento == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(CodiceDocumento);
		}

		if (NomeFile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(NomeFile);
		}

		if (ContenutoFile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ContenutoFile);
		}

		if (Versione == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Versione);
		}

		objectOutput.writeLong(DataVersione);
		objectOutput.writeLong(DataCaricamento);

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

	public long Id_CodiceDocumenti;
	public String CodiceDocumento;
	public String NomeFile;
	public String ContenutoFile;
	public String Versione;
	public long DataVersione;
	public long DataCaricamento;
	public String userIns;
	public String userAgg;
	public long dataIns;
	public long dataAgg;

}