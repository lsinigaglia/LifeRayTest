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
 * The table class for the &quot;AQ_PianiFabbisogni&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PianiFabbisogni
 * @generated
 */
public class PianiFabbisogniTable extends BaseTable<PianiFabbisogniTable> {

	public static final PianiFabbisogniTable INSTANCE =
		new PianiFabbisogniTable();

	public final Column<PianiFabbisogniTable, Long> Id_PianiFabbisogni =
		createColumn(
			"Id_PianiFabbisogni", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PianiFabbisogniTable, String> CodicePianoFabbisogno =
		createColumn(
			"CodicePianoFabbisogno", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PianiFabbisogniTable, Long> FK_documenti = createColumn(
		"FK_documenti", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PianiFabbisogniTable, Long> FK_attiDiAdesione =
		createColumn(
			"FK_attiDiAdesione", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PianiFabbisogniTable, String> Descrizione =
		createColumn(
			"Descrizione", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PianiFabbisogniTable, String> Stato = createColumn(
		"Stato", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PianiFabbisogniTable, Date> DataStato = createColumn(
		"DataStato", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PianiFabbisogniTable, Date> DataInizioFabbisogni =
		createColumn(
			"DataInizioFabbisogni", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<PianiFabbisogniTable, Date> DataFineFabbisogni =
		createColumn(
			"DataFineFabbisogni", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<PianiFabbisogniTable, String> userIns = createColumn(
		"userIns", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PianiFabbisogniTable, String> userAgg = createColumn(
		"userAgg", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PianiFabbisogniTable, Date> dataIns = createColumn(
		"dataIns", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PianiFabbisogniTable, Date> dataAgg = createColumn(
		"dataAgg", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private PianiFabbisogniTable() {
		super("AQ_PianiFabbisogni", PianiFabbisogniTable::new);
	}

}