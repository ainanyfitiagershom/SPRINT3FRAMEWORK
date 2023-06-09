package etu1776.framework.servlet;
import java.sql.SQLException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import etu1776.framework.*;

public class FrontServlet extends HttpServlet 
{
    HashMap<String,Mapping> mappingUrls = new HashMap<>();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                try {
                    response.setContentType("text/plain");
                    PrintWriter out = response.getWriter();
                    Utile u = new Utile();
                    ServletContext context= getServletContext();
                    String path= u.getPath(request); //Premiere methode
                    System.out.println(path);
                    String meth = u.getMethode(request); // Deuxieme methode  
                    System.out.println(meth);
                    out.println(meth);            
                    mappingUrls= u.getHashmap( mappingUrls,context);
                    u.printHM(mappingUrls);
                    Mapping map = u.getMap(mappingUrls, meth);
                    out.println( "Key : "+meth );
                    out.println( map.getClassName() + " | " + map.getMethod());
                    ModeleView view= u.get_View(meth, mappingUrls);
                    String page = view.getView();
                    RequestDispatcher disp = request.getRequestDispatcher(page);
                    disp.forward(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                    // TODO: handle exception
                }
               

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        processRequest(request,response);
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        

    }
}
