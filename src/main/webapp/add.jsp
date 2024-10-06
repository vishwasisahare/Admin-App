<%-- 
    Document   : Addition
    Created on : 04-Mar-2022, 6:31:00 PM
    Author     : ayush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Addition !</h1>
        
        <form action="CalController">
            <input type="hidden" name="action" value="add">
            Number1 : <input type="number" name="n1"><br>
             Number2 : <input type="number" name="n2"><br>
             <input type="submit" value="add"><br> 
             <h2><%=request.getParameter("ans") %></h2>
            
        </form>
    </body>
</html>
