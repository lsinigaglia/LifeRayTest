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
 * The table class for the &quot;AQ_StatoAvanzamentoLavori&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see StatoAvanzamentoLavori
 * @generated
 */
public class StatoAvanzamentoLavoriTable
	extends BaseTable<StatoAvanzamentoLavoriTable> {

	public static final StatoAvanzamentoLavoriTable INSTANCE =
		new StatoAvanzamentoLavoriTable();

	public final Column<StatoAvanzamentoLavoriTable, Long> Id_SAL =
		createColumn("Id_SAL", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<StatoAvanzamentoLavoriTable, Long> FK_documenti =
		createColumn(
			"FK_documenti", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<StatoAvanzamentoLavoriTable, String> CodiceSAL =
		createColumn(
			"CodiceSAL", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StatoAvanzamentoLavoriTable, String> Descrizione =
		createColumn(
			"Descrizione", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StatoAvanzamentoLavoriTable, String> Stato =
		createColumn("Stato", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StatoAvanzamentoLavoriTable, Date> DataStato =
		createColumn(
			"DataStato", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<StatoAvanzamentoLavoriTable, String>
		MeseAnnoRiferimento = createColumn(
			"MeseAnnoRiferimento", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<StatoAvanzamentoLavoriTable, Double>
		ImportoComplessivo = createColumn(
			"ImportoComplessivo", Double.class, Types.DOUBLE,
			Column.FLAG_DEFAULT);
	public final Column<StatoAvanzamentoLavoriTable, String> userIns =
		createColumn(
			"userIns", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StatoAvanzamentoLavoriTable, String> userAgg =
		createColumn(
			"userAgg", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StatoAvanzamentoLavoriTable, Date> dataIns =
		createColumn(
			"dataIns", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<StatoAvanzamentoLavoriTable, Date> dataAgg =
		createColumn(
			"dataAgg", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private StatoAvanzamentoLavoriTable() {
		super("AQ_StatoAvanzamentoLavori", StatoAvanzamentoLavoriTable::new);
	}

}