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
 * The table class for the &quot;AQ_PianiSubentro&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PianiSubentro
 * @generated
 */
public class PianiSubentroTable extends BaseTable<PianiSubentroTable> {

	public static final PianiSubentroTable INSTANCE = new PianiSubentroTable();

	public final Column<PianiSubentroTable, Long> Id_PianiSubentro =
		createColumn(
			"Id_PianiSubentro", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PianiSubentroTable, String> CodicePianiDiSubentro =
		createColumn(
			"CodicePianiDiSubentro", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PianiSubentroTable, Long> FK_documenti = createColumn(
		"FK_documenti", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PianiSubentroTable, Long> FK_accordoQuadro =
		createColumn(
			"FK_accordoQuadro", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PianiSubentroTable, String> Descrizione = createColumn(
		"Descrizione", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PianiSubentroTable, Date> DataInizioPiano =
		createColumn(
			"DataInizioPiano", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<PianiSubentroTable, Date> DataFinePiano = createColumn(
		"DataFinePiano", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PianiSubentroTable, String> userIns = createColumn(
		"userIns", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PianiSubentroTable, String> userAgg = createColumn(
		"userAgg", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PianiSubentroTable, Date> dataIns = createColumn(
		"dataIns", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PianiSubentroTable, Date> dataAgg = createColumn(
		"dataAgg", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private PianiSubentroTable() {
		super("AQ_PianiSubentro", PianiSubentroTable::new);
	}

}