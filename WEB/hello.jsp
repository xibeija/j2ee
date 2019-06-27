<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	import="java.util.*"%>

你好 JSP

<br>

<%=new Date().toLocaleString()%>

<%-- <%@include file="footer.jsp" %>
<jsp:include page="footer.jsp" />
 --%>
 
 
<jsp:include page="footer.jsp">
    <jsp:param  name="year" value="2017" />
</jsp:include>