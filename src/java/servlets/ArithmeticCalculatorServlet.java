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
public class ArithmeticCalculatorServlet extends HttpServlet 
{
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
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
         String one = request.getParameter("one");
         double oneR = Double.parseDouble(one);
         
         String two = request.getParameter("two");
         double twoR = Double.parseDouble(two);
         
         double last;
         String X;
         
         if(request.getParameter("plus")!=null)
         {
             last= oneR+twoR; 
             X = Double.toString(last); 
             request.setAttribute("ans", X);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
           return;
         }
         
         if(request.getParameter("minus")!=null)
         {
             last= oneR-twoR; 
             X = Double.toString(last); 
             request.setAttribute("ans", X);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
           return;
         }
           
         if(request.getParameter("mul")!=null)
         {
             last= oneR*twoR; 
             X = Double.toString(last); 
             request.setAttribute("ans", X);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
           return;
         }
         
         if(request.getParameter("mod")!=null)
         {
             last= oneR%twoR; 
             X = Double.toString(last); 
             request.setAttribute("ans", X);
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
           return;
         }
         
    }

}
