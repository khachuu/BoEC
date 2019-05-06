/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import dao.AddressDao;
import entities.Address;
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
public class AddressDaoImpl implements AddressDao{
       @Override
       public Address getAddressByCustomerId(int id) {
        Connection conn = null;
        Statement st = null;
//        Address address = null;
        ResultSet resultSet = null; 
      
        try {
            conn = DBConnection.createConnection();
            st = conn.createStatement();
            String query = "SELECT * FROM address WHERE CustomerId = '" + id + "' ";
            resultSet = st.executeQuery(query);
            while(resultSet.next()){
                Address address = new Address();
                address.setCity(resultSet.getString("City"));
            return address;
            }
        } catch (SQLException ex) {
            System.out.println("loi lay address tu customerid?");
        } 
        return null;
    }
}
