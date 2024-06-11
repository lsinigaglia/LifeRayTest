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
 * The table class for the &quot;AQ_ProgettiFabbisogni&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ProgettiFabbisogni
 * @generated
 */
public class ProgettiFabbisogniTable
	extends BaseTable<ProgettiFabbisogniTable> {

	public static final ProgettiFabbisogniTable INSTANCE =
		new ProgettiFabbisogniTable();

	public final Column<ProgettiFabbisogniTable, Long> Id_ProgettiFabbisogni =
		createColumn(
			"Id_ProgettiFabbisogni", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ProgettiFabbisogniTable, String> CodiceFabbisogni =
		createColumn(
			"CodiceFabbisogni", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ProgettiFabbisogniTable, Long> FK_documenti =
		createColumn(
			"FK_documenti", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProgettiFabbisogniTable, Long> FK_progettiFabbisogni =
		createColumn(
			"FK_progettiFabbisogni", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<ProgettiFabbisogniTable, Long> FK_pianiFabbisogni =
		createColumn(
			"FK_pianiFabbisogni", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<ProgettiFabbisogniTable, String> Stato = createColumn(
		"Stato", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProgettiFabbisogniTable, Date> DataStato = createColumn(
		"DataStato", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ProgettiFabbisogniTable, String> Descrizione =
		createColumn(
			"Descrizione", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProgettiFabbisogniTable, Date> DataScadenza =
		createColumn(
			"DataScadenza", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ProgettiFabbisogniTable, Double> ImportoComplessivo =
		createColumn(
			"ImportoComplessivo", Double.class, Types.DOUBLE,
			Column.FLAG_DEFAULT);
	public final Column<ProgettiFabbisogniTable, Date> DataInizioPiano =
		createColumn(
			"DataInizioPiano", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<ProgettiFabbisogniTable, Date> DataFinePiano =
		createColumn(
			"DataFinePiano", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ProgettiFabbisogniTable, String> userIns = createColumn(
		"userIns", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProgettiFabbisogniTable, String> userAgg = createColumn(
		"userAgg", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProgettiFabbisogniTable, Date> dataIns = createColumn(
		"dataIns", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ProgettiFabbisogniTable, Date> dataAgg = createColumn(
		"dataAgg", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private ProgettiFabbisogniTable() {
		super("AQ_ProgettiFabbisogni", ProgettiFabbisogniTable::new);
	}

}