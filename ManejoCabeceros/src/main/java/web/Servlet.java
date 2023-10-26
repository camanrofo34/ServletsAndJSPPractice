package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author PC 4060TI
 */
@WebServlet("/ServletHead")
public class Servlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;chatset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Header</title>");
        out.println("</head>");  
        out.println("<body>");  
        out.println("<h1>Headers HTTP");  
        out.println("Metodo HTTP: "+metodoHttp);  
        out.println("</body>");  
        out.println("</html>");  
        out.close();
    }
}
