<%@ include file="/init.jsp" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

<portlet:actionURL var="submitFormURL" name="submitForm" />

<aui:form action="${submitFormURL}" method="post">
<aui:fieldset>
<aui:input name="codiceAccordo" label="Codice Accordo" />
<aui:input name="descrizione" label="Descrizione" />
<aui:input name="dataInizioValidita" label="Data Inizio Validità" />
<aui:input name="dataFineValidita" label="Data Fine Validità"  />
<aui:input name="importoComplessivo" label="Importo Complessivo" />
<aui:button type="submit" value="Submit" />
</aui:fieldset>
</aui:form>