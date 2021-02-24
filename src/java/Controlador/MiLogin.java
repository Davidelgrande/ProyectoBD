/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.dao.loginDAO;
import Modelo.dto.AdminDTO;
import Modelo.dto.loginDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class MiLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Indica la accion a ejecutar
        String accion = request.getParameter("accion");

        Facade2 obj_f = new Facade2();
        loginDTO oblogin = new loginDTO(); 
        
        switch (accion) {
            case "valida_sesion":
                String correo = request.getParameter("txt_correo");
                String clave = request.getParameter("txt_clave");
                System.out.println("clave= "+clave);
                AdminDTO usu = new AdminDTO();
                oblogin.setCorreo(correo);
                oblogin.setClave(clave);
                usu = obj_f.validarLogin(usu);
                 
                if (usu != null) {
                    System.out.println("Usuario existe");
                    HttpSession login = request.getSession();
                       
                    
                    login.setAttribute("usu_login", usu);
                    System.out.println("sesion id= " + login.getId());
                    request.getRequestDispatcher("AdminP.jsp").forward(request, response);
                    break;
                   
                    

                } else {
                    System.out.println("Usuario o contraseña invalida");
                    request.getRequestDispatcher("ErrorLogin.jsp").forward(request, response);
                }
                break;

            case "salir":
                HttpSession login=request.getSession();
                login.invalidate();
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
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