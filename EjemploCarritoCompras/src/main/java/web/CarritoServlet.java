/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author PC 4060TI
 */
@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html; charset=UTF-8");
      
        //Crear o recuperar el objeto Http Session
        HttpSession sesion=request.getSession();
        
        //Recuperar la lista de articulos previamente agregados
        List <String> articulos = (List <String>) sesion.getAttribute("articulos");
        
        //Verificar si la lista existe
        if (articulos == null){
            //Inicializar lista
            articulos=new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }
        //Procesar el nuevo articulo
        String articuloNuevo= request.getParameter("articulo");
        
        //Revisar y agreqar el articulo nuevo
        if(articuloNuevo!=null &&!articuloNuevo.trim().equals("")){
            articulos.add(articuloNuevo);
        }
        
        //Imprimir la lista de articulos
        PrintWriter out = response.getWriter();
        out.print("<h1>Lista de Articulos</h1>");
        out.print("<br>");
        for (String articulo : articulos){
            out.print("<li>"+articulo+"</li>");
        }
        
        //Link para volver
        
        out.print("<br>");
        out.print("<a href='/EjemploCarritoCompras'>Regresar al Inicio</a>");
        out.close();
    }
}
