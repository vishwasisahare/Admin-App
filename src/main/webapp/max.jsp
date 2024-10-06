<%-- 
    Document   : max
    Created on : 08-Mar-2022, 5:36:08 PM
    Author     : ayush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>max</title>
    </head>
    <body>
        <h1>Enter two no. to check max</h1>
        <form action="MyController">
            <input type="hidden" name="action" value="max">
            no1 : <input type="number" name="num1" value="enter any no">
            no2 : <input type="number" name="num2" value="enter any no">
            <input type="submit" value="check">
        </form>
        ${param.ans}
    </body>
</html>
