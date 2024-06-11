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
 * The table class for the &quot;AQ_AccordoQuadro&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccordoQuadro
 * @generated
 */
public class AccordoQuadroTable extends BaseTable<AccordoQuadroTable> {

	public static final AccordoQuadroTable INSTANCE = new AccordoQuadroTable();

	public final Column<AccordoQuadroTable, Long> Id_AccordoQuadro =
		createColumn(
			"Id_AccordoQuadro", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AccordoQuadroTable, String> CodiceAccordo =
		createColumn(
			"CodiceAccordo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccordoQuadroTable, Long> FK_documenti = createColumn(
		"FK_documenti", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccordoQuadroTable, String> Descrizione = createColumn(
		"Descrizione", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccordoQuadroTable, Date> DataInizioValidita =
		createColumn(
			"DataInizioValidita", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AccordoQuadroTable, Date> DataFineValidita =
		createColumn(
			"DataFineValidita", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AccordoQuadroTable, Double> ImportoComplessivo =
		createColumn(
			"ImportoComplessivo", Double.class, Types.DOUBLE,
			Column.FLAG_DEFAULT);
	public final Column<AccordoQuadroTable, String> userIns = createColumn(
		"userIns", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccordoQuadroTable, String> userAgg = createColumn(
		"userAgg", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccordoQuadroTable, Date> dataIns = createColumn(
		"dataIns", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccordoQuadroTable, Date> dataAgg = createColumn(
		"dataAgg", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private AccordoQuadroTable() {
		super("AQ_AccordoQuadro", AccordoQuadroTable::new);
	}

}