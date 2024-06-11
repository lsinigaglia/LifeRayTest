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

package servicebuilder.service.persistence;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ContrattiEsecutiviPK
	implements Comparable<ContrattiEsecutiviPK>, Serializable {

	public String CodiceContratto;
	public long Id_ContrattiEsecutivi;

	public ContrattiEsecutiviPK() {
	}

	public ContrattiEsecutiviPK(
		String CodiceContratto, long Id_ContrattiEsecutivi) {

		this.CodiceContratto = CodiceContratto;
		this.Id_ContrattiEsecutivi = Id_ContrattiEsecutivi;
	}

	public String getCodiceContratto() {
		return CodiceContratto;
	}

	public void setCodiceContratto(String CodiceContratto) {
		this.CodiceContratto = CodiceContratto;
	}

	public long getId_ContrattiEsecutivi() {
		return Id_ContrattiEsecutivi;
	}

	public void setId_ContrattiEsecutivi(long Id_ContrattiEsecutivi) {
		this.Id_ContrattiEsecutivi = Id_ContrattiEsecutivi;
	}

	@Override
	public int compareTo(ContrattiEsecutiviPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = CodiceContratto.compareTo(pk.CodiceContratto);

		if (value != 0) {
			return value;
		}

		if (Id_ContrattiEsecutivi < pk.Id_ContrattiEsecutivi) {
			value = -1;
		}
		else if (Id_ContrattiEsecutivi > pk.Id_ContrattiEsecutivi) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ContrattiEsecutiviPK)) {
			return false;
		}

		ContrattiEsecutiviPK pk = (ContrattiEsecutiviPK)object;

		if (CodiceContratto.equals(pk.CodiceContratto) &&
			(Id_ContrattiEsecutivi == pk.Id_ContrattiEsecutivi)) {

			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, CodiceContratto);
		hashCode = HashUtil.hash(hashCode, Id_ContrattiEsecutivi);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("CodiceContratto=");

		sb.append(CodiceContratto);
		sb.append(", Id_ContrattiEsecutivi=");

		sb.append(Id_ContrattiEsecutivi);

		sb.append("}");

		return sb.toString();
	}

}