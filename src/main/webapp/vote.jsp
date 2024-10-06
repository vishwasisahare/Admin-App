<%-- 
    Document   : vote
    Created on : 09-Mar-2022, 3:48:42 PM
    Author     : ayush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Voting System</title>
    </head>
    <body>
        <h1>check voting Eligibility</h1>
        <input type="hidden" name="action" value="vote">
        Enter your age : <input type="number" name="age"><br>
        Nationality :
        <select>
            <option>select country</option>
            <option>USA</option>
            <option>India</option>
            <option>china</option>
            <option>Russia</option>
            <option>koria</option>
        </select>
        <input type="submit" value="check">
    
        
    </body>
</html>
