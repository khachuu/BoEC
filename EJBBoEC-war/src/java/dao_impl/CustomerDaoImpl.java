/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import builder.Member;
import dao.CustomerDao;
import entities.Customer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.DBConnection;

/**
 *
 * @author taint
 */
public class CustomerDaoImpl implements CustomerDao{
    
    @Override
    public Customer getCustomerByName(String username) {
        Connection conn = null;
        Statement st = null;
//        Customer customer = null;
//        ResultSet resultSet = null; 
        try {
          
            conn = DBConnection.createConnection();
            st = conn.createStatement();
            String query = "Select FullNameID,Id,email from customer where AccountUsername ='"+username+"'";
            
            ResultSet resultSet = st.executeQuery(query);
            while(resultSet.next()){
            Customer customer = new Customer();
            customer.setFullNameID(resultSet.getInt("FullNameID"));
            customer.setId(resultSet.getInt("Id"));
            customer.setEmail(resultSet.getString("email"));
                    
            return customer;
            }
        } catch (SQLException ex) {
            System.out.println("Loi insert phone or address");
        } 
   
      return null;
    }
}
