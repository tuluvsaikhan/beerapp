<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Beer Recommendations</title>
</head>
<body>
<p>
<% 
	out.println("JSP PAGE!");
	List<String>styles = (List<String>) request.getAttribute("styles");
	Iterator<String> it = styles.iterator();
	while(it.hasNext()){
	    out.print("<br>try: "+ it.next());
	}
%>
</body>
</html>