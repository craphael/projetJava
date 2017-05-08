/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctrl;

import bd.bd;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.MessageDor;


public class Enregistrer extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String p=request.getParameter("pseudo");
        String m=request.getParameter("message");
            
        //Enregistrement
        if(p.equals("") || m.equals("")){
            if(p.equals("") && m.equals("")){
                request.setAttribute("msg_erreur","Enregistrement non effectué, il manque le pseudo et le message");
            }
            else{
                if(p.equals("") ){
                    request.setAttribute("msg_erreur","Enregistrement non effectué, il manque le pseudo");
                }
                else{
                    if(m.equals("") )
                        request.setAttribute("msg_erreur","Enregistrement non effectué, il manque le message");    
                }  
            }
            RequestDispatcher rs = request.getRequestDispatcher("Saisir");
            rs.forward(request,response);
        }
        else{
            //Construction d'un objet métier
            MessageDor mo=new MessageDor(p,m);
            out.println("<!DOCTYPE html>");

            try{
            bd.enregistrer(mo);

            // Chainage
            request.setAttribute("msg_info", "Enregistrement bien effectué !");
            RequestDispatcher rd = request.getRequestDispatcher("Saisir");
            rd.forward(request, response);
            }
            catch(SQLException ex)
            { 
                // Chainage
                request.setAttribute("msg_erreur","ERREUR -" + ex.getMessage());
                RequestDispatcher rd = request.getRequestDispatcher("Saisir");
                rd.forward(request, response);
                }   
        }
        }
        


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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
