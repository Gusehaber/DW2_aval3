/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import DAOs.DAOMarca;
import DAOs.DAOProduto;
import Entidades.Marca;
import Entidades.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a1712004
 */
@WebServlet(name = "CadastroProduto", urlPatterns = {"/CadastroProduto"})
public class CadastroProdutoServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            //Integer id = Integer.valueOf(request.getParameter("IDProduto"));
            String nome = request.getParameter("NomeProduto");
            Integer quantidade = Integer.valueOf(request.getParameter("QuantidadeProduto"));
            Float preco = Float.valueOf(request.getParameter("PrecoProduto"));
            Integer idMarca = new Integer(request.getParameter("MarcaProduto"));
            
            DAOProduto daoProduto = new DAOProduto();
            Produto produto = new Produto();
            DAOMarca daoMarca = new DAOMarca();
            
            Marca marca = daoMarca.listByIdMarca(idMarca).get(0);
            
            //produto.setIdProduto(id);
            produto.setNomeProduto(nome);
            produto.setQuantidadeProduto(quantidade);
            produto.setPrecoProduto(preco);
            produto.setImagemProduto("/caminho");
            produto.setMarcaidMarca(marca);
            
            daoProduto.inserir(produto);
            response.sendRedirect(request.getContextPath() + "/produto");

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
