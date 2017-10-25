<%-- 
    Document   : patternServer
    Created on : Oct 24, 2017, 3:49:14 PM
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
            int num= Integer.parseInt(request.getParameter("num"));
        for (int i=0;i<num;i++)
        {
            out.println("<br>");
            for(int j=1;j<i;j++)
            {
                out.println(j);
            }
        }
        
        %>
    </body>
</html>
