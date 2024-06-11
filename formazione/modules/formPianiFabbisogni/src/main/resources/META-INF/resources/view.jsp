<%@ include file="/init.jsp" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

<portlet:actionURL var="submitFormURL" name="submitForm" />

<aui:form action="${submitFormURL}" method="post">
<aui:fieldset>
<aui:input name="codicePianoFabbisogni" label="Codice Piani Fabbisogni" />
<aui:input name="codiceAttoDiAdesione" label="Codice Atti Di Adesione Correlato" />
<aui:input name="descrizione" label="Descrizione" />
<aui:input name="stato" label="Stato" />
<aui:input name="dataStato" label="Data Stato" />
<aui:input name="dataInizioFabbisogni" label="Data Inizio Fabbisogni" />
<aui:input name="dataFineFabbisogni" label="Data Fine Fabbisogni" />
<aui:button type="submit" value="Submit" />
</aui:fieldset>
</aui:form>