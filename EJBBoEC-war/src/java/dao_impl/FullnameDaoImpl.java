/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import dao.FullnameDao;
import entities.Address;
import entities.Fullname;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.DBConnection;

/**
 *
 * @author taint
 */
public class FullnameDaoImpl implements FullnameDao{

    @Override
       public Fullname getFullNameById(int id) {
        Connection conn = null;
        Statement st = null;
//        Address address = null;
        ResultSet resultSet = null; 
      
        try {
            conn = DBConnection.createConnection();
            st = conn.createStatement();
            String query = "SELECT Firstname,Lastname FROM fullname WHERE ID = '" + id + "' ";
            resultSet = st.executeQuery(query);
            while(resultSet.next()){
                Fullname fullname = new Fullname();
                fullname.setFirstname(resultSet.getString("Firstname"));
                fullname.setLastname(resultSet.getString("Lastname"));
            return fullname;
            }
        } catch (SQLException ex) {
            System.out.println("loi lay full name tu customerid?");
        } 
        return null;
    }
    
}
