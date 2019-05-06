/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import builder.Member;
import dao.MemberDao;
import entities.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import util.DBConnection;

/**
 *
 * @author taint
 */
public class MemberDaoImpl implements MemberDao{

    
    
    public String passwordEncoder(String pass) {
    String hashedPassword = "";
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    hashedPassword = passwordEncoder.encode(pass);
    return hashedPassword;
    }
    
    
    @Override
    public boolean addMember(Member member) {
         Connection conn = null;
        Statement st = null;
          
        try {
            int idCustomer = insertCustomer(member);
            conn = DBConnection.createConnection();
            st = conn.createStatement();
            String query = "INSERT into phone (CustomerId,Phone) values ('"+idCustomer+"','"+member.getPhone()+"')";
            String query1 = "INSERT into address (CustomerId,City) values ('"+idCustomer+"','"+member.getAddress()+"')";
            st.executeUpdate(query);
            st.executeUpdate(query1);
            return true;
        } catch (SQLException ex) {
            System.out.println("Loi insert phone or address");
        } 
   
      return false;
    }
    
    // method insert account -> get idaccount , insert full name -> get insert full name -> insert customer have id account , id full name, phone , mail , address

//    @Override
//    public Member getMemberByName(String username) {
//        Connection conn = null;
//        Statement st = null;
//        Member member = null;
//        ResultSet resultSet = null; 
//        try {
//            int idCustomer = insertCustomer(member);
//            conn = DBConnection.createConnection();
//            st = conn.createStatement();
//            String query = "Select * from customer where AccountUsername ='"+username+"'";
//     
//            resultSet = st.executeQuery(query);
//            while(resultSet.next()){
//            member.get()
//            return member;
//            }
//        } catch (SQLException ex) {
//            System.out.println("Loi insert phone or address");
//        } 
//   
//      return member;
//    }

    @Override
    public ArrayList<Member> getAllMember() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteMember(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateMember(Member member) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String insertAccount(Member member) {
        Connection conn = null;
        Statement st = null;
        int Enabled = 1;
        String password = passwordEncoder(member.getPassword());
        
        AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
        boolean checkAccountIsExist = accountDaoImpl.checkAccountIsExist(member.getUserName());
        if(!checkAccountIsExist){
        try {
            conn = DBConnection.createConnection();
            st = conn.createStatement();
            System.out.println(member.getUserName()+"-"+password);
            String query = "INSERT INTO account(Username,Password,Enabled) values ('"+member.getUserName()+"','"+password+"','1');" ;
            String query1 = "INSERT INTO account_roles(username,role) values ('"+member.getUserName()+"','ROLE_USER');" ;
//            String getIdAccount = "SELECT LAST_INSERT_ID()";  
//            st.executeUpdate(query);
            st.executeUpdate(query);
            st.executeUpdate(query1);
            System.out.println(query);
            System.out.println("them user : "+member.getUserName()+" thanh cong!");
            return member.getUserName();
        } catch (SQLException ex) {
            System.out.println("loi insert account");
        } 
        return null;
        } else {
            System.out.println("Account da ton tai");
            return null;
        }
    }

    private int insertFullName(Member member) {
        
         Connection conn = null;
         Statement st = null;
         int id = 0;
         try {
            conn = DBConnection.createConnection();
            String query = "INSERT INTO fullname(Firstname,Lastname) values ('"+member.getFirstName()+"','"+member.getLastName()+"')";
            PreparedStatement statement = conn.prepareStatement(query,
                                      Statement.RETURN_GENERATED_KEYS);
  
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
            id = rs.getInt(1);
            System.out.println("Inserted ID -" + id); // display inserted record
             } 
             System.out.println(query);
             System.out.println("id full name la : "+id);
            return id;
        } catch (SQLException ex) {
             System.out.println("loi insert full name");
        } 
        return id;
    }

    private int insertCustomer(Member member) {
       Connection conn = null;
         Statement st = null;
         int id = 0;
         String username = insertAccount(member);
         int idFullName = insertFullName(member);
         try {
            conn = DBConnection.createConnection();
            String query = "INSERT INTO customer (FullNameID,AccountUserName,email) values ('"+idFullName+"','"+username+"','"+member.getEmail()+"')";
            PreparedStatement statement = conn.prepareStatement(query,
                                      Statement.RETURN_GENERATED_KEYS);
  
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
            id = rs.getInt(1);
            System.out.println("Inserted ID -" + id); // display inserted record
             } 
             System.out.println(query);
             System.out.println("id customer la : "+id);
            return id;
        } catch (SQLException ex) {
             System.out.println("loi insert customer ");
        } 
        return id;
    }

   
    
}
