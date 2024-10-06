<%-- 
    Document   : cal
    Created on : 07-Mar-2022, 6:00:13 PM
    Author     : ayush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My calculator</title>
    </head>
    <body>
        <h1>My calculator!</h1>
        <form action="MathController">
            no 1: <<input type="number" name="n1" placeholder="Enter your no">
            <br> no 2: <<input type="number" name="n2" placeholder="Enter your no">
            <br> <select name="operator">
                <option value="+"> + </option>
                <option value="-"> - </option>
                 <option value="*"> * </option>
                  <option value="/"> / </option>
                   <option value="mod"> % </option>
                
            </select>
            <br>
            <input type="submit" value="calculate">
            
        </form>
        <h2><%= (request.getParameter("msg") == null ) ? "" :request.getParameter("msg")%></h2>
    </body>
</html>
