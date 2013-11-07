<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jspf" %>
	<br>
	<em>Here starts contact.jsp</em> <br> <br>
	Contact us at: ${initParam.mainEmail}
	<jsp:include page="footer.jspf"></jsp:include>
</body>
</html>