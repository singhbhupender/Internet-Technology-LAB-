<%-- 
    Document   : reverse
    Created on : Oct 24, 2017, 4:45:10 PM
    Author     : bsc3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String info= request.getParameter("string");
            int limit=info.length();
           for (int i=limit;i>0;i--)
           {
            out.println(info.charAt(i));}
           %>
    </body>
</html>
