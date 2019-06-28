<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	pageContext.setAttribute("name", "gareen");
%>

<%=pageContext.getAttribute("name")%> --%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%
    request.setAttribute("name","gareen");
%>
  
<%=request.getAttribute("name")%>