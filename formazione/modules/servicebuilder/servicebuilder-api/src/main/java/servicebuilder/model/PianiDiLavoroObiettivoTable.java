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

import java.util.Date;

/**
 * The table class for the &quot;AQ_PianiDiLavoroObiettivo&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PianiDiLavoroObiettivo
 * @generated
 */
public class PianiDiLavoroObiettivoTable
	extends BaseTable<PianiDiLavoroObiettivoTable> {

	public static final PianiDiLavoroObiettivoTable INSTANCE =
		new PianiDiLavoroObiettivoTable();

	public final Column<PianiDiLavoroObiettivoTable, Long> Id_PianoDiLavoro =
		createColumn(
			"Id_PianoDiLavoro", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PianiDiLavoroObiettivoTable, String>
		CodicePianoLavoroObiettivo = createColumn(
			"CodicePianoLavoroObiettivo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PianiDiLavoroObiettivoTable, Long> FK_documenti =
		createColumn(
			"FK_documenti", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PianiDiLavoroObiettivoTable, Long>
		FK_progettiFabbisogni = createColumn(
			"FK_progettiFabbisogni", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<PianiDiLavoroObiettivoTable, String> Descrizione =
		createColumn(
			"Descrizione", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PianiDiLavoroObiettivoTable, Date> DataInizioPiano =
		createColumn(
			"DataInizioPiano", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<PianiDiLavoroObiettivoTable, Date> DataFinePiano =
		createColumn(
			"DataFinePiano", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PianiDiLavoroObiettivoTable, Double>
		ImportoComplessivo = createColumn(
			"ImportoComplessivo", Double.class, Types.DOUBLE,
			Column.FLAG_DEFAULT);
	public final Column<PianiDiLavoroObiettivoTable, String> userIns =
		createColumn(
			"userIns", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PianiDiLavoroObiettivoTable, String> userAgg =
		createColumn(
			"userAgg", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PianiDiLavoroObiettivoTable, Date> dataIns =
		createColumn(
			"dataIns", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PianiDiLavoroObiettivoTable, Date> dataAgg =
		createColumn(
			"dataAgg", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private PianiDiLavoroObiettivoTable() {
		super("AQ_PianiDiLavoroObiettivo", PianiDiLavoroObiettivoTable::new);
	}

}