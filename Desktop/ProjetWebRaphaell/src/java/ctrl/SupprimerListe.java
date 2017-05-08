/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctrl;

import bd.bd;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SupprimerListe extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

            //suppression des messages
            try{
                //Afichage de la liste des messages
                RequestDispatcher rd=request.getRequestDispatcher("supprimer");
                rd.forward(request, response);

            }
            catch(Exception ex)
            {
                //retour sur la page
                RequestDispatcher rd= request.getRequestDispatcher("supprimer");
                request.setAttribute("msg_erreur",ex.getMessage());
                rd.forward(request, response);
            }

        }
}