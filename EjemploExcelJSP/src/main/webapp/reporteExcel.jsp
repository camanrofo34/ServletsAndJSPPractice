<%-- 
    Document   : reporteExcel
    Created on : Oct 28, 2023, 4:17:52?PM
    Author     : PC 4060TI
--%>
<%@page errorPage="WEB-INF/ManejoErrores.jsp" %>
<%@page import="utilerias.conversiones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" %>
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "inline;filename="+nombreArchivo);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <br/>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>1. Fundamentos de Java</td>
                <td>Aprenderemos la sintaxis basica de Java</td>
                <td><%=conversiones.format("500")%></td>
            </tr>
            <tr>
                <td>2. Programacion con Java</td>
                <td>Practica orientada a objetos</td>
                <td><%=conversiones.format(new Date())%></td>
            </tr>
        </table>
    </body>
</html>
