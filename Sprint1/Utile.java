package etu1776.framework.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;


public class Utile extends HttpServlet {


protected String getMethod(HttpServletRequest req) throws ServletException {
   
        String u = req.getRequestURI();
        String[] methode = u.split("/");
        String reps = methode[methode.length -1];

return reps;


    

}


}