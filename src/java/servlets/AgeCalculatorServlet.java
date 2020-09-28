/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 783856
 */
public class AgeCalculatorServlet extends HttpServlet {

    /**

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {   
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
            
      String age = request.getParameter("age");
      String message;
      try
      {
      int test = Integer.parseInt(age);
      } 
      catch (NumberFormatException e)
      {
           message = "You must enter a number";
       if(age == null || age.equals(""))
      {
        message = "You must give your current age";
      }
           request.setAttribute("show", message);
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
           return;
      }
     
         int pull = Integer.parseInt(age);
         pull++;
         
        message = "Your next birthday will be "+pull;
        request.setAttribute("show", message);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    }

}
