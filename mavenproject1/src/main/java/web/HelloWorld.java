package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class HelloWorld extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        
        String user =request.getParameter("user");
        String password = request.getParameter("Password");
        
        System.out.println("user = " + user);
        System.out.println("password = " + password);
        
        PrintWriter out = response.getWriter();
        out.println("User= "+user);
        out.println("password = " + password);
    }
}
