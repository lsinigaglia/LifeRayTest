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
 * The table class for the &quot;AQ_Documenti&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Documenti
 * @generated
 */
public class DocumentiTable extends BaseTable<DocumentiTable> {

	public static final DocumentiTable INSTANCE = new DocumentiTable();

	public final Column<DocumentiTable, Long> Id_CodiceDocumenti = createColumn(
		"Id_CodiceDocumenti", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DocumentiTable, String> CodiceDocumento = createColumn(
		"CodiceDocumento", String.class, Types.VARCHAR, Column.FLAG_PRIMARY);
	public final Column<DocumentiTable, String> NomeFile = createColumn(
		"NomeFile", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DocumentiTable, String> ContenutoFile = createColumn(
		"ContenutoFile", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DocumentiTable, String> Versione = createColumn(
		"Versione", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DocumentiTable, Date> DataVersione = createColumn(
		"DataVersione", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DocumentiTable, Date> DataCaricamento = createColumn(
		"DataCaricamento", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DocumentiTable, String> userIns = createColumn(
		"userIns", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DocumentiTable, String> userAgg = createColumn(
		"userAgg", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DocumentiTable, Date> dataIns = createColumn(
		"dataIns", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DocumentiTable, Date> dataAgg = createColumn(
		"dataAgg", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private DocumentiTable() {
		super("AQ_Documenti", DocumentiTable::new);
	}

}