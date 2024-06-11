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
 * The table class for the &quot;AQ_PianiDiQualita&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PianiDiQualita
 * @generated
 */
public class PianiDiQualitaTable extends BaseTable<PianiDiQualitaTable> {

	public static final PianiDiQualitaTable INSTANCE =
		new PianiDiQualitaTable();

	public final Column<PianiDiQualitaTable, Long> Id_PianiDiQualita =
		createColumn(
			"Id_PianiDiQualita", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PianiDiQualitaTable, String> CodicePianoDiQualita =
		createColumn(
			"CodicePianoDiQualita", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PianiDiQualitaTable, Long> FK_documenti = createColumn(
		"FK_documenti", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PianiDiQualitaTable, Long> FK_accordoQuadro =
		createColumn(
			"FK_accordoQuadro", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PianiDiQualitaTable, String> Descrizione = createColumn(
		"Descrizione", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PianiDiQualitaTable, Date> DataInizioPiano =
		createColumn(
			"DataInizioPiano", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<PianiDiQualitaTable, Date> DataFinePiano = createColumn(
		"DataFinePiano", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PianiDiQualitaTable, String> userIns = createColumn(
		"userIns", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PianiDiQualitaTable, String> userAgg = createColumn(
		"userAgg", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PianiDiQualitaTable, Date> dataIns = createColumn(
		"dataIns", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PianiDiQualitaTable, Date> dataAgg = createColumn(
		"dataAgg", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private PianiDiQualitaTable() {
		super("AQ_PianiDiQualita", PianiDiQualitaTable::new);
	}

}