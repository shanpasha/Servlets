<%@page import="org.apache.jasper.tagplugins.jstl.core.Out"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>Welcome JSP Servar Page</h1>
<h3>1.Expression Element</h3>
<h2><%= new Date () %></h2>
<h2><%= new Date () %></h2>
<h3>scriptlet</h3>




<h3>2.Declaration element</h3>
<%!

int adition(int a,int b){
int c=a+b;
	return c;
	
}

%>

<h2> addition <%=out.print(adition(25, 9))%></h2>


</body>
</html>