
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author camanrofo
 */
@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html; charset=UTF-8");
        HttpSession sesion = request.getSession();
        String titulo = null;
        
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        if (contadorVisitas ==null){
            contadorVisitas=1;
            titulo = "Bienvenido por primera vez";
        }
        else{
            contadorVisitas++;
            titulo="Bienvenido nuevamente";
        }
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        PrintWriter out =response.getWriter();
        out.print("No. accesos al recurso: "+contadorVisitas);
        out.print("<br/>");
        out.print("ID de la sesion: "+sesion.getId());
        out.close();
    }
    
}
