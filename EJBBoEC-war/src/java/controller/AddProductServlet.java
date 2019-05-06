/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao_impl.AddressDaoImpl;
import dao_impl.CartDaoImpl;
import dao_impl.Cart_ProductDaoImpl;
import dao_impl.CustomerDaoImpl;
import dao_impl.FullnameDaoImpl;
import dao_impl.PhoneDaoImpl;
import entities.Address;
import entities.Cart;
import entities.Customer;
import entities.Fullname;
import entities.Phone;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddProductServlet extends HttpServlet{
      private static final long serialVersionUID = 1L;

    public AddProductServlet() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
      HttpSession session = request.getSession();
      CartDaoImpl cartDaoImpl = new CartDaoImpl();
      Cart_ProductDaoImpl cart_ProductDaoImpl = new Cart_ProductDaoImpl();
      String id = request.getParameter("idProduct");
      String amount = request.getParameter("amount");
       try
    {
      int idCart =    (int) session.getAttribute("idCart");
      if(idCart == 0){
      Cart cart = new Cart();
      cart = cartDaoImpl.createCart();
      int idCart1 = cart.getId();
      session.setAttribute("idCart", idCart1);
      
      }
      int idProduct = Integer.parseInt(id);
      int amountNew = Integer.parseInt(amount);
      boolean check = cart_ProductDaoImpl.checkProductInCart(idCart, idProduct);
      if(check){
          System.out.println("can update vi trong cart da co product nnay roi");
          cart_ProductDaoImpl.update(idCart, idProduct,amountNew);
      
      }else {
      
        System.out.println("tao moi vi chua cos");
        System.out.println("id san pham la :" +idProduct);
        cart_ProductDaoImpl.addProductToCart(idCart, idProduct, amountNew);
      }
        request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
  } catch(Exception ex){
      ex.printStackTrace();
  }
  
 
}
       
  
}
