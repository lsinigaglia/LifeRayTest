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

package servicebuilder.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;AQ_PianoStatoRel&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PianoStatoRel
 * @generated
 */
public class PianoStatoRelTable extends BaseTable<PianoStatoRelTable> {

	public static final PianoStatoRelTable INSTANCE = new PianoStatoRelTable();

	public final Column<PianoStatoRelTable, Long> Id_Relazione = createColumn(
		"Id_Relazione", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PianoStatoRelTable, Long> Id_PianodiLavoro =
		createColumn(
			"Id_PianodiLavoro", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PianoStatoRelTable, Long> Id_SAL = createColumn(
		"Id_SAL", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private PianoStatoRelTable() {
		super("AQ_PianoStatoRel", PianoStatoRelTable::new);
	}

}