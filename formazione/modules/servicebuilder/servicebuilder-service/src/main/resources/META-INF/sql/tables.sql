create table AQ_AccordoQuadro (
	Id_AccordoQuadro LONG not null primary key,
	CodiceAccordo VARCHAR(75) null,
	FK_documenti LONG,
	Descrizione VARCHAR(75) null,
	DataInizioValidita DATE null,
	DataFineValidita DATE null,
	ImportoComplessivo DOUBLE,
	userIns VARCHAR(75) null,
	userAgg VARCHAR(75) null,
	dataIns DATE null,
	dataAgg DATE null
);

create table AQ_AttiDiAdesione (
	Id_AttiDiAdesione LONG not null primary key,
	CodiceAttoDiAdesione VARCHAR(75) null,
	FK_documenti LONG,
	FK_accordoQuadro LONG,
	Anno INTEGER,
	Stato VARCHAR(75) null,
	DataStato DATE null,
	Descrizione VARCHAR(75) null,
	ImportoComplessivo DOUBLE,
	userIns VARCHAR(75) null,
	userAgg VARCHAR(75) null,
	dataIns DATE null,
	dataAgg DATE null
);

create table AQ_ContrattiEsecutivi (
	CodiceContratto VARCHAR(75) not null,
	Id_ContrattiEsecutivi LONG not null,
	FK_documenti LONG,
	FK_progettiFabbisogni LONG,
	Descrizione VARCHAR(75) null,
	Stato VARCHAR(75) null,
	DataStato DATE null,
	DataInizioContratto DATE null,
	DataFineContratto DATE null,
	ImportoComplessivo DOUBLE,
	userIns VARCHAR(75) null,
	userAgg VARCHAR(75) null,
	dataIns DATE null,
	dataAgg DATE null,
	primary key (CodiceContratto, Id_ContrattiEsecutivi)
);

create table AQ_Documenti (
	Id_CodiceDocumenti LONG,
	CodiceDocumento VARCHAR(75) not null primary key,
	NomeFile VARCHAR(75) null,
	ContenutoFile VARCHAR(75) null,
	Versione VARCHAR(75) null,
	DataVersione DATE null,
	DataCaricamento DATE null,
	userIns VARCHAR(75) null,
	userAgg VARCHAR(75) null,
	dataIns DATE null,
	dataAgg DATE null
);

create table AQ_PianiDeiRischi (
	Id_PianiDeiRischi LONG not null primary key,
	CodicePianoDeiRischi VARCHAR(75) null,
	FK_documenti LONG,
	FK_accordoQuadro LONG,
	Descrizione VARCHAR(75) null,
	DataInizioPiano DATE null,
	DataFinePiano DATE null,
	userIns VARCHAR(75) null,
	userAgg VARCHAR(75) null,
	dataIns DATE null,
	dataAgg DATE null
);

create table AQ_PianiDiLavoroObiettivo (
	Id_PianoDiLavoro LONG not null primary key,
	CodicePianoLavoroObiettivo VARCHAR(75) null,
	FK_documenti LONG,
	FK_progettiFabbisogni LONG,
	Descrizione VARCHAR(75) null,
	DataInizioPiano DATE null,
	DataFinePiano DATE null,
	ImportoComplessivo DOUBLE,
	userIns VARCHAR(75) null,
	userAgg VARCHAR(75) null,
	dataIns DATE null,
	dataAgg DATE null
);

create table AQ_PianiDiQualita (
	Id_PianiDiQualita LONG not null primary key,
	CodicePianoDiQualita VARCHAR(75) null,
	FK_documenti LONG,
	FK_accordoQuadro LONG,
	Descrizione VARCHAR(75) null,
	DataInizioPiano DATE null,
	DataFinePiano DATE null,
	userIns VARCHAR(75) null,
	userAgg VARCHAR(75) null,
	dataIns DATE null,
	dataAgg DATE null
);

create table AQ_PianiFabbisogni (
	Id_PianiFabbisogni LONG not null primary key,
	CodicePianoFabbisogno VARCHAR(75) null,
	FK_documenti LONG,
	FK_attiDiAdesione LONG,
	Descrizione VARCHAR(75) null,
	Stato VARCHAR(75) null,
	DataStato DATE null,
	DataInizioFabbisogni DATE null,
	DataFineFabbisogni DATE null,
	userIns VARCHAR(75) null,
	userAgg VARCHAR(75) null,
	dataIns DATE null,
	dataAgg DATE null
);

create table AQ_PianiSubentro (
	Id_PianiSubentro LONG not null primary key,
	CodicePianiDiSubentro VARCHAR(75) null,
	FK_documenti LONG,
	FK_accordoQuadro LONG,
	Descrizione VARCHAR(75) null,
	DataInizioPiano DATE null,
	DataFinePiano DATE null,
	userIns VARCHAR(75) null,
	userAgg VARCHAR(75) null,
	dataIns DATE null,
	dataAgg DATE null
);

create table AQ_PianoStatoRel (
	Id_Relazione LONG not null primary key,
	Id_PianodiLavoro LONG,
	Id_SAL LONG
);

create table AQ_ProgettiFabbisogni (
	Id_ProgettiFabbisogni LONG not null primary key,
	CodiceFabbisogni VARCHAR(75) null,
	FK_documenti LONG,
	FK_progettiFabbisogni LONG,
	FK_pianiFabbisogni LONG,
	Stato VARCHAR(75) null,
	DataStato DATE null,
	Descrizione VARCHAR(75) null,
	DataScadenza DATE null,
	ImportoComplessivo DOUBLE,
	DataInizioPiano DATE null,
	DataFinePiano DATE null,
	userIns VARCHAR(75) null,
	userAgg VARCHAR(75) null,
	dataIns DATE null,
	dataAgg DATE null
);

create table AQ_StatoAvanzamentoLavori (
	Id_SAL LONG not null primary key,
	FK_documenti LONG,
	CodiceSAL VARCHAR(75) null,
	Descrizione VARCHAR(75) null,
	Stato VARCHAR(75) null,
	DataStato DATE null,
	MeseAnnoRiferimento VARCHAR(75) null,
	ImportoComplessivo DOUBLE,
	userIns VARCHAR(75) null,
	userAgg VARCHAR(75) null,
	dataIns DATE null,
	dataAgg DATE null
);