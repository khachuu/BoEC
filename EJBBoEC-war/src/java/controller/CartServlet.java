/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import builder.Member;
import dao.FullnameDao;
import dao_impl.AddressDaoImpl;
import dao_impl.CartDaoImpl;
import dao_impl.Cart_ProductDaoImpl;
import dao_impl.CustomerDaoImpl;
import dao_impl.FullnameDaoImpl;
import dao_impl.MemberDaoImpl;
import dao_impl.PhoneDaoImpl;
import dao_impl.ProductDaoImpl;
import entities.Address;
import entities.Cart;
import entities.Cart_Product;
import entities.Customer;
import entities.Fullname;
import entities.Phone;
import entities.Products;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author taint
 */
public class CartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public CartServlet() {
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
      HttpSession session = request.getSession();
      
      
       try
    {
        
      String username = (String) session.getAttribute("userName");
      int idCart =    (int) session.getAttribute("idCart");
//      System.out.println(idCart);
//      MemberDaoImpl memberDaoImpl = new MemberDaoImpl();
      AddressDaoImpl addressDaoImpl = new AddressDaoImpl();
      PhoneDaoImpl phoneDaoImpl = new PhoneDaoImpl();
      FullnameDaoImpl daoImpl = new FullnameDaoImpl();
      CartDaoImpl cartDaoImpl = new CartDaoImpl();
      CustomerDaoImpl customerDaoImpl = new CustomerDaoImpl();
      Cart_ProductDaoImpl cart_ProductDaoImpl = new Cart_ProductDaoImpl();
      ProductDaoImpl daoImpl1 = new ProductDaoImpl();
      Customer customer = customerDaoImpl.getCustomerByName(username);
      
      ArrayList<Cart_Product> al = cart_ProductDaoImpl.getListCartProductByIdCart(idCart);
      ArrayList<Products> productses = new ArrayList<>();
      ArrayList<Integer> amounts = new ArrayList<>();
      for(int i = 0 ; i < al.size(); i++){
        Products products = new Products();
        int idProduct = al.get(i).getProductId();
        int amount = al.get(i).getAmount();
        products = daoImpl1.getProductsById(idProduct);
        System.out.println(al.get(i).getProductId());
        amounts.add(amount);
        productses.add(products);
      }
      
      request.setAttribute("productses", productses);
      request.setAttribute("amounts", amounts);
      
//      for(Products products:productses){
//          System.out.println(products.getName());
//      }
//      
      if(idCart == 0){
      Cart cart = new Cart();
      cart = cartDaoImpl.createCart();
      int idCart1 = cart.getId();
      session.setAttribute("idCart", idCart1);
      }
          
      int idCustomer = customer.getId();
      int idFullName = customer.getFullNameID();
      Fullname fullname = daoImpl.getFullNameById(customer.getFullNameID());
      String firstName =  fullname.getFirstname();
      String lastName = fullname.getLastname();
     
      
      Phone phone = phoneDaoImpl.getPhoneByCustomerId(idCustomer);
      Address address = addressDaoImpl.getAddressByCustomerId(idCustomer);
      String phoneNumber =  phone.getPhone();
      String addressDetail = address.getCity();
      session.setAttribute("firstName", firstName);
      session.setAttribute("lastName", lastName);
      session.setAttribute("phoneNumber", phoneNumber);
      session.setAttribute("address", addressDetail);
      
//      System.out.println("id cart la : "+idCart);
      System.out.println(idCustomer+":"+firstName+"-"+lastName+"-"+phoneNumber+"-"+addressDetail);
      request.getRequestDispatcher("giohang-thanhtoan.jsp").forward(request, response);
      // create new cart if cart is not exist 
      // show cart if cart have had product
      
  } catch(Exception ex){
      ex.printStackTrace();
  }
  
 
}
       
  }
