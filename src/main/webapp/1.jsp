<%-- 
    Document   : 1
    Created on : 03-Mar-2022, 5:51:47 PM
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
        <%! int a = 20; //declarartion tag
            int b = 20;
        %>
        
        <% //scriplet tag
           int c = a+b ; //local int var
            String name = "vishwasi"; //local string var
        
        %>
        <h1>value of a <%= a %></h1> <!<!-- expression tag -->
        <h1>value of b <%= b %></h1>
        <h1>Add of a and b is <%= c %></h1>
        <h2>my name is <%= name %></h2>
    </body>
</html>
