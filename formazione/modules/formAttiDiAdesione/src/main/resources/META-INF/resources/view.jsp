<%@ include file="/init.jsp" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

<portlet:actionURL var="submitFormURL" name="submitForm" />

<aui:form action="${submitFormURL}" method="post">
<aui:fieldset>
<aui:input name="codiceAttoDiAdesione" label="Codice Atti Di Adesione" />
<aui:input name="codiceAccordo" label="Codice Accordo Correlato" />
<aui:input name="anno" label="Anno" />
<aui:input name="stato" label="Stato" />
<aui:input name="dataStato" label="Data Stato" />
<aui:input name="descrizione" label="Descrizione" />
<aui:input name="importoComplessivo" label="Importo Complessivo" />
<aui:button type="submit" value="Submit" />
</aui:fieldset>
</aui:form>