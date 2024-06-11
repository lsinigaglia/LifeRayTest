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

import servicebuilder.model.PianoStatoRel;

/**
 * The cache model class for representing PianoStatoRel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PianoStatoRelCacheModel
	implements CacheModel<PianoStatoRel>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PianoStatoRelCacheModel)) {
			return false;
		}

		PianoStatoRelCacheModel pianoStatoRelCacheModel =
			(PianoStatoRelCacheModel)object;

		if (Id_Relazione == pianoStatoRelCacheModel.Id_Relazione) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Id_Relazione);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{Id_Relazione=");
		sb.append(Id_Relazione);
		sb.append(", Id_PianodiLavoro=");
		sb.append(Id_PianodiLavoro);
		sb.append(", Id_SAL=");
		sb.append(Id_SAL);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PianoStatoRel toEntityModel() {
		PianoStatoRelImpl pianoStatoRelImpl = new PianoStatoRelImpl();

		pianoStatoRelImpl.setId_Relazione(Id_Relazione);
		pianoStatoRelImpl.setId_PianodiLavoro(Id_PianodiLavoro);
		pianoStatoRelImpl.setId_SAL(Id_SAL);

		pianoStatoRelImpl.resetOriginalValues();

		return pianoStatoRelImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id_Relazione = objectInput.readLong();

		Id_PianodiLavoro = objectInput.readLong();

		Id_SAL = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(Id_Relazione);

		objectOutput.writeLong(Id_PianodiLavoro);

		objectOutput.writeLong(Id_SAL);
	}

	public long Id_Relazione;
	public long Id_PianodiLavoro;
	public long Id_SAL;

}