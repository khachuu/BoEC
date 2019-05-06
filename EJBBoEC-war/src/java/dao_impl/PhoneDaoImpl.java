/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import dao.PhoneDao;
import entities.Customer;
import entities.Phone;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.DBConnection;

/**
 *
 * @author taint
 */
public class PhoneDaoImpl implements PhoneDao{

    @Override
    public Phone getPhoneByCustomerId(int id) {
        Connection conn = null;
        Statement st = null;
//        Phone phone = null;
        ResultSet resultSet = null; 
      
        try {
            conn = DBConnection.createConnection();
            st = conn.createStatement();
            String query = "SELECT * FROM phone WHERE CustomerId = '" + id + "' ";
            resultSet = st.executeQuery(query);
            while(resultSet.next()){
                Phone phone = new Phone();
                phone.setPhone(resultSet.getString("Phone"));
            return phone;
            }
        } catch (SQLException ex) {
            System.out.println("loi lay phone tu customerid?");
        } 
        return null;
    }
    
}
