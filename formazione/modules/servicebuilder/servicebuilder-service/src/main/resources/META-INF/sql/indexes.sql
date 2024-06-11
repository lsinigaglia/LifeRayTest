create index IX_B7209EFD on AQ_AttiDiAdesione (FK_accordoQuadro);

create index IX_15D509EB on AQ_PianiDiLavoroObiettivo (FK_progettiFabbisogni);

create index IX_37F3EA93 on AQ_PianiFabbisogni (FK_attiDiAdesione);

create index IX_CAFFF9C0 on AQ_ProgettiFabbisogni (FK_pianiFabbisogni);