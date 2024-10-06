<%-- 
    Document   : EvenOdd
    Created on : 08-Mar-2022, 4:25:25 PM
    Author     : ayush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EvenOdd</title>
    </head>
    <body>
        <h1>EvenOdd!</h1>
        <form  action="EvenOddController">
           
            no : <<input type="number" name="no" placeholder="Enter your number">
            <br>
            <a href="EvenOdd.jsp"></a>
             <input type="submit" value="check">
        </form>
         <h2><%= (request.getParameter("msg") == null ) ? "" :request.getParameter("msg")%></h2>
        
    </body>
</html>
