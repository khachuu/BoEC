/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import dao.CartDao;
import entities.Address;
import entities.Cart;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.DBConnection;

/**
 *
 * @author taint
 */
public class CartDaoImpl implements CartDao{

    @Override
    public Cart createCart() {

         Connection conn = null;
         Statement st = null;
         int id = 0;
         try {
            conn = DBConnection.createConnection();
            String query = "INSERT INTO cart (Numbers) values ('0')";
            PreparedStatement statement = conn.prepareStatement(query,
                                      Statement.RETURN_GENERATED_KEYS);
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                Cart cart = new Cart();
            
            id = rs.getInt(1);
            System.out.println("Inserted ID -" + id); // display inserted record
            cart.setId(id);
            cart.setNumbers(0);
               
            return cart;
             } 
       
        } catch (SQLException ex) {
             System.out.println("loi tao cart new");
        } 
        return null;
    
}

    @Override
    public boolean checkCartIsExist(int id) {
       Connection conn = null;
         Statement st = null;
         boolean rs = false;

         try {
            conn = DBConnection.createConnection();
            String query = "Select Id  from cart where EXISTS Id = '"+id+"'";
            String query1 = "Select COUNT(*)  from cart where  Id = '"+id+"'";
            rs = st.execute(query);
            ResultSet rs1 = st.executeQuery(query1);
            
            return rs;
       
        } catch (SQLException ex) {
             System.out.println("loi check id cart");
        } 
        return rs;
    
    }

    @Override
    public int checkNumberOfProductInCart(int id) {
        Connection conn = null;
         Statement st = null;
         int number = 0;

         try {
            conn = DBConnection.createConnection();
            String query = "Select Numbers from cart where Id = '"+id+"'";
         
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
               
               number = rs.getInt("Id");
               return number;
             } 
       
        } catch (SQLException ex) {
             System.out.println("loi lay so luong san pham trong cart");
        } 
        return number;
    }
}