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
 * The table class for the &quot;AQ_ContrattiEsecutivi&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ContrattiEsecutivi
 * @generated
 */
public class ContrattiEsecutiviTable
	extends BaseTable<ContrattiEsecutiviTable> {

	public static final ContrattiEsecutiviTable INSTANCE =
		new ContrattiEsecutiviTable();

	public final Column<ContrattiEsecutiviTable, String> CodiceContratto =
		createColumn(
			"CodiceContratto", String.class, Types.VARCHAR,
			Column.FLAG_PRIMARY);
	public final Column<ContrattiEsecutiviTable, Long> Id_ContrattiEsecutivi =
		createColumn(
			"Id_ContrattiEsecutivi", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ContrattiEsecutiviTable, Long> FK_documenti =
		createColumn(
			"FK_documenti", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ContrattiEsecutiviTable, Long> FK_progettiFabbisogni =
		createColumn(
			"FK_progettiFabbisogni", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<ContrattiEsecutiviTable, String> Descrizione =
		createColumn(
			"Descrizione", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ContrattiEsecutiviTable, String> Stato = createColumn(
		"Stato", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ContrattiEsecutiviTable, Date> DataStato = createColumn(
		"DataStato", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ContrattiEsecutiviTable, Date> DataInizioContratto =
		createColumn(
			"DataInizioContratto", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<ContrattiEsecutiviTable, Date> DataFineContratto =
		createColumn(
			"DataFineContratto", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<ContrattiEsecutiviTable, Double> ImportoComplessivo =
		createColumn(
			"ImportoComplessivo", Double.class, Types.DOUBLE,
			Column.FLAG_DEFAULT);
	public final Column<ContrattiEsecutiviTable, String> userIns = createColumn(
		"userIns", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ContrattiEsecutiviTable, String> userAgg = createColumn(
		"userAgg", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ContrattiEsecutiviTable, Date> dataIns = createColumn(
		"dataIns", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ContrattiEsecutiviTable, Date> dataAgg = createColumn(
		"dataAgg", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private ContrattiEsecutiviTable() {
		super("AQ_ContrattiEsecutivi", ContrattiEsecutiviTable::new);
	}

}