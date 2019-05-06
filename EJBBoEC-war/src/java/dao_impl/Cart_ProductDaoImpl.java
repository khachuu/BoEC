/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import dao.Cart_ProductDao;
import entities.Cart;
import entities.Cart_Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.DBConnection;

/**
 *
 * @author taint
 */
public class Cart_ProductDaoImpl implements Cart_ProductDao{

    @Override
    public void addProductToCart(int idCart, int idProduct, int amount) {
         Connection conn = null;
         Statement st = null;
         int id = 0;
         try {
            conn = DBConnection.createConnection();
 
            st = conn.createStatement();
            String query = "INSERT INTO cart_product (cartId,productId,amountOfProduct) values ('"+idCart+"','"+idProduct+"','"+amount+"')";
            
            st.executeUpdate(query);
             System.out.println(query);
             
       
        } catch (SQLException ex) {
             System.out.println("loi them product vao cart new");
        } 
       
    }

    @Override
    public void deleteProduct(int idCart, int idProduct) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkProductInCart(int idCart, int idProduct) {
        Connection conn = null;
         Statement st = null;
         try {
            conn = DBConnection.createConnection();
 
            st = conn.createStatement();
             System.out.println(idCart+"--"+idProduct);
            String query = "Select cartId,productId,amountOfProduct from cart_product where cartId ='"+idCart+"' and productId ='"+idProduct+"'";
            
            ResultSet resultSet = st.executeQuery(query);
            int count = 0;
             while (resultSet.next()) {
             count++;
             } 
            if(count > 0 ) return true;
             
       
        } catch (SQLException ex) {
             System.out.println("loi kiem tra mat hang dac co trong cart");
        } 
         return false;
    }

    @Override
    public void update(int idCart, int idProduct, int amount) {
         Connection conn = null;
         Statement st = null;
//         amount = 2;
         try {
            conn = DBConnection.createConnection();
 
            st = conn.createStatement();
            String query = "UPDATE cart_product SET amountOfProduct = '"+amount+"' WHERE cartId ='"+idCart+"' and productId ='"+idProduct+"'" ;
            
            st.executeUpdate(query);
         
            
             
       
        } catch (SQLException ex) {
             System.out.println("loi cap nhat mat hang da co trong cart");
        } 
        
    }

//    @Override
//    public ArrayList<Cart_Product> getListIdProductByIdCart(int idCart) {
//        ArrayList<Integer> al = new ArrayList<>();
//         Connection conn = null;
//         Statement st = null;
//         try {
//            conn = DBConnection.createConnection();
// 
//            st = conn.createStatement();
//   
//            String query = "Select cartId,productId,amountOfProduct from cart_product where cartId ='"+idCart+"'";
//            
//            ResultSet resultSet = st.executeQuery(query);
//            int count = 0;
//             while (resultSet.next()) {
//             count++;
//             } 
//            if(count > 0 ) return true;
//             
//       
//        } catch (SQLException ex) {
//             System.out.println("loi kiem tra mat hang dac co trong cart");
//        } 
//         return false;
//    }

    @Override
    public ArrayList<Cart_Product> getListCartProductByIdCart(int idCart) {
         ArrayList<Cart_Product> al = new ArrayList<>();
         Connection conn = null;
         Statement st = null;
         try {
            conn = DBConnection.createConnection();
 
            st = conn.createStatement();
   
            String query = "Select cartId,productId,amountOfProduct from cart_product where cartId ='"+idCart+"'";
            
            ResultSet resultSet = st.executeQuery(query);
            while(resultSet.next()){
                Cart_Product cart_Product = new Cart_Product();
                cart_Product.setCartId(resultSet.getInt("cartId"));
                cart_Product.setProductId(resultSet.getInt("productId"));
                cart_Product.setAmount(resultSet.getInt("amountOfProduct"));
                al.add(cart_Product);
            }
            return al;
             
       
        } catch (SQLException ex) {
             System.out.println("loi kiem tra mat hang dac co trong cart");
        } 
         return al;
    }

    @Override
    public void deleteProductInCart(int idCart, int idProduct) {
        Connection conn = null;
         Statement st = null;
         try {
            conn = DBConnection.createConnection();
 
            st = conn.createStatement();
   
            String query = "delete * from cart_product where cartId ='"+idCart+"' and productId ='"+idProduct+"'";
            
            st.executeQuery(query);
    
          
             
       
        } catch (SQLException ex) {
             System.out.println("loi xoa 1 cac mat hang dac co trong cart");
        } 
        
    }

    @Override
    public void deleteAllProductInCartThenPay(int idCart) {
         Connection conn = null;
         Statement st = null;
         try {
            conn = DBConnection.createConnection();
 
            st = conn.createStatement();
   
            String query = "delete * from cart_product where cartId ='"+idCart+"'";
            
            st.executeQuery(query);
    
          
             
       
        } catch (SQLException ex) {
             System.out.println("loi xoa tat ca cac mat hang dac co trong cart sau khi order xong");
        } 
    }
    
}
