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
 * The table class for the &quot;AQ_AttiDiAdesione&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttiDiAdesione
 * @generated
 */
public class AttiDiAdesioneTable extends BaseTable<AttiDiAdesioneTable> {

	public static final AttiDiAdesioneTable INSTANCE =
		new AttiDiAdesioneTable();

	public final Column<AttiDiAdesioneTable, Long> Id_AttiDiAdesione =
		createColumn(
			"Id_AttiDiAdesione", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AttiDiAdesioneTable, String> CodiceAttoDiAdesione =
		createColumn(
			"CodiceAttoDiAdesione", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttiDiAdesioneTable, Long> FK_documenti = createColumn(
		"FK_documenti", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttiDiAdesioneTable, Long> FK_accordoQuadro =
		createColumn(
			"FK_accordoQuadro", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttiDiAdesioneTable, Integer> Anno = createColumn(
		"Anno", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<AttiDiAdesioneTable, String> Stato = createColumn(
		"Stato", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttiDiAdesioneTable, Date> DataStato = createColumn(
		"DataStato", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttiDiAdesioneTable, String> Descrizione = createColumn(
		"Descrizione", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttiDiAdesioneTable, Double> ImportoComplessivo =
		createColumn(
			"ImportoComplessivo", Double.class, Types.DOUBLE,
			Column.FLAG_DEFAULT);
	public final Column<AttiDiAdesioneTable, String> userIns = createColumn(
		"userIns", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttiDiAdesioneTable, String> userAgg = createColumn(
		"userAgg", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttiDiAdesioneTable, Date> dataIns = createColumn(
		"dataIns", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttiDiAdesioneTable, Date> dataAgg = createColumn(
		"dataAgg", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private AttiDiAdesioneTable() {
		super("AQ_AttiDiAdesione", AttiDiAdesioneTable::new);
	}

}