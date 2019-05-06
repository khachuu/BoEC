/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao_impl.Cart_ProductDaoImpl;
import dao_impl.OrderDaoImpl;
import entities.Order1;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author taint
 */
public class PaymentServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public PaymentServlet() {
    }
    
   
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
      HttpSession session = request.getSession();
        Cart_ProductDaoImpl cart_ProductDaoImpl = new Cart_ProductDaoImpl();
        OrderDaoImpl daoImpl = new OrderDaoImpl();
        int idCustomer = (int) session.getAttribute("idCustomer");
        int idCart = (int) session.getAttribute("idCart");
        
        System.out.println(idCustomer+"---"+idCart);
        Order1 order1 = new Order1();
        order1.setPaymentMethodId(1);
        order1.setCustomerId(idCustomer);
        order1.setShippingId(1);
        order1.setCartId(idCart);
//        order1.setDiscount("");
        daoImpl.AddOrder(order1);
        cart_ProductDaoImpl.deleteAllProductInCartThenPay(idCart);
        String msg = "Đặt hàng thành công! ";
        request.setAttribute("msg", msg);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/giohang-thanhtoan.jsp");
        requestDispatcher.forward(request, response);
        
        try {
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
