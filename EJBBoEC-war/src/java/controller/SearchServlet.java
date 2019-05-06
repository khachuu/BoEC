/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao_impl.ProductDaoImpl;
import entities.Products;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author taint
 */
public class SearchServlet extends HttpServlet{
      private static final long serialVersionUID = 1L;
      public SearchServlet() {
  }
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
      ProductDaoImpl productDaoImpl = new ProductDaoImpl();
      System.out.println(request.getParameter("searchName"));
      ArrayList<Products> productses = productDaoImpl.searchProductsByName(request.getParameter("searchName"));
      request.setAttribute("productses", productses);
     
      
      request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
  }
  
    
}
