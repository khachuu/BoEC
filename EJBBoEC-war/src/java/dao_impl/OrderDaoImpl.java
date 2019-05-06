/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import dao.OrderDao;
import entities.Cart;
import entities.Order1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBConnection;

/**
 *
 * @author taint
 */
public class OrderDaoImpl implements OrderDao{

    @Override
    public void AddOrder(Order1 order1) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DBConnection.createConnection();
            st = conn.createStatement();
            String query = "INSERT INTO order1 (PaymentMethodId,CustomerId,CartId,ShippingId,Discount) values ('"+order1.getPaymentMethodId()+"','"+order1.getCustomerId()+"','"+order1.getCartId()+"','"+order1.getShippingId()+"','"+order1.getDiscount()+"') ";
            st.executeUpdate(query);
            System.out.println(query);
        
               
           
             } catch (SQLException ex) { 
                 ex.printStackTrace();
            System.out.println("Loi insert Oder");
      
             }
    }
    
}
