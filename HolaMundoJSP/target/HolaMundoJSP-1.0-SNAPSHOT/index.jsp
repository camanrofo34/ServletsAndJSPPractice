<%-- 
    Document   : index
    Created on : Oct 26, 2023, 7:08:49 AM
    Author     : PC 4060TI
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola Mundo JSPs</title>
    </head>
    <body>
        <h1>Hola Mundo JSPs</h1>
        <ul>
            <li><% out.print("HolaMundo con Scriplets"); %></li>
            <li>${"Hola mundo con expression language(el)"}</li>
            <li><%= "Hello World con Expresiones"%></li>
            <li><c:out value="HolaMundo con JSTL" /></li>
        </ul>

    </body>
</html>
