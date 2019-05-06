/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import dao.AccountDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import util.DBConnection;

/**
 *
 * @author taint
 */
public class AccountDaoImpl implements AccountDao{

    @Override
    public boolean checkAccountIsExist(String username) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DBConnection.createConnection();
            st = conn.createStatement();
            String query = "SELECT * FROM account WHERE username = '" + username + "' ";
            return st.executeQuery(query).next();
        } catch (SQLException ex) {
            System.out.println("loi check account exist?");
        } 
        return false;
    }
    
}
