<%@ include file="/init.jsp" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="servicebuilder.model.AccordoQuadro" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="servicebuilder.model.AccordoQuadro" %>
<%@ page import="servicebuilder.service.AccordoQuadroLocalServiceUtil" %>
 
 
<%
  String keywords = ParamUtil.getString(request, "keywords");
  long Id_AccordoQuadro = ParamUtil.getLong(renderRequest, "Id_AccordoQuadro");
%>
 
<liferay-portlet:renderURL varImpl="searchURL">
<portlet:param 
        name="mvcPath" 
        value="/view_search.jsp" />
</liferay-portlet:renderURL>
 
<portlet:renderURL var="viewURL">
<portlet:param 
        name="mvcPath" 
        value="/view.jsp" 
    />
</portlet:renderURL>
<aui:form action="<%= searchURL %>" method="get" name="fm">
<liferay-portlet:renderURLParams varImpl="searchURL" />
 
<liferay-ui:header
    backURL="<%= viewURL.toString() %>"
    title="search"
/>
 
    <div class="search-form">
<span class="aui-search-bar">
<aui:input inlineField="<%= true %>" label="" name="keywords" 
            size="30" title="search-entries" type="text" />
 
            <aui:button type="submit" value="search" />
</span>
</div>
</aui:form>
<%
    List<AccordoQuadro> accordoQuadros = AccordoQuadroLocalServiceUtil.searchAccordoQuadros(keywords);
%>
<liferay-ui:search-container>
<liferay-ui:search-container-results results="<%= accordoQuadros %>" />
 
    <liferay-ui:search-container-row className="servicebuilder.model.AccordoQuadro" modelVar="accordoQuadro">
<liferay-ui:search-container-column-text name="Name" value="<%= accordoQuadro.getCodiceAccordo() %>" />
<liferay-ui:search-container-column-text name="Description" value="<%= accordoQuadro.getDescrizione() %>" />
</liferay-ui:search-container-row>
 
    <liferay-ui:search-iterator />
</liferay-ui:search-container>