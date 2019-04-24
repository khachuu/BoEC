package dao;//LoginDao.javapackage com.login.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import entities.Account;
import entities.AccountRoles;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import sessionbean.AccountFacade;
import sessionbean.AccountRolesFacade;
import util.DBConnection;

public class LoginDao {
   public String passwordEncoder(String pass) {
    String hashedPassword = "";
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    hashedPassword = passwordEncoder.encode(pass);
    return hashedPassword;
  }
   
   public boolean isHasUser(String username, String pass) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DBConnection.createConnection();
            st = conn.createStatement();
            String query = "SELECT * FROM account "
                    + " WHERE username = '" + username + "' "
                    + " AND password = '" + pass + "' ";
            return st.executeQuery(query).next();
        } catch (SQLException ex) {
        } 
        return false;
    }
  public String authenticateUser(Account account)
  {
    String userName = account.getUsername();
    String password = account.getPassword();
    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;
    String userNameDB = "";
    String passwordDB = "";
    String roleDB = "";
    
    //dây là cái để check pass 
//    boolean match = BCrypt.checkpw(password, hash);
//    String pass = userName+""+password;
//      System.out.println(passwordEncoder(password));
    try
    {
      con = DBConnection.createConnection();
      statement = con.createStatement();
            String sql = "select acc.Username, acc.Password, accr.role from account as acc, account_roles as accr where acc.Username = accr.username and acc.Username ='"+userName+"'";
//      String sql = "select acc.Username, acc.Password, accr.role from account as acc, account_roles as accr where acc.Username = accr.username and acc.Username ='"+userName+"' and acc.Password ='"+password+"'";
//      String sql = "select acc.Username, acc.Password, accr.role from account as acc, account_roles as accr where acc.Username = accr.username and acc.Username ='"+userName+"' and acc.Password ='"+passwordEncoder(pass)+"'";
      resultSet = statement.executeQuery(sql);
      while(resultSet.next())
      {
        userNameDB = resultSet.getString("Username");
        passwordDB = resultSet.getString("Password");
        roleDB = resultSet.getString("role");
//          System.out.println(userNameDB+"-"+roleDB+"-"+passwordDB);
        if(userName.equals(userNameDB) && roleDB.equals("ROLE_ADMIN") && BCrypt.checkpw(password, passwordDB) )
          return "Admin_Role";
        else if(userName.equals(userNameDB) && roleDB.equals("ROLE_USER") && BCrypt.checkpw(password, passwordDB))
          return "User_Role";
        
      }
    }
    catch(SQLException e)
    {
      e.printStackTrace();
    }
    return "Invalid user credentials";
  }
    public String authenticateUser1(Account account)
  {
   
    String userName = account.getUsername();
    String password = account.getPassword();
    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;
    String userNameDB = "";
    String passwordDB = "";
    String roleDB = "";
//    String pass = userName+""+password;
//      System.out.println(passwordEncoder(password));
    try
    {
      con = DBConnection.createConnection();
      statement = con.createStatement();
      String sql = "select acc.Username, acc.Password, accr.role from account as acc, account_roles as accr where acc.Username = accr.username and acc.Username ='"+userName+"' and acc.Password ='"+password+"'";
//      String sql = "select acc.Username, acc.Password, accr.role from account as acc, account_roles as accr where acc.Username = accr.username and acc.Username ='"+userName+"' and acc.Password ='"+passwordEncoder(pass)+"'";
      resultSet = statement.executeQuery(sql);
      while(resultSet.next())
      {
        userNameDB = resultSet.getString("Username");
        passwordDB = resultSet.getString("Password");
        roleDB = resultSet.getString("role");
//          System.out.println(userNameDB+"-"+roleDB+"-"+passwordDB);
        if(userName.equals(userNameDB) && roleDB.equals("ROLE_ADMIN"))
          return "Admin_Role";
        else if(userName.equals(userNameDB) && roleDB.equals("ROLE_USER"))
          return "User_Role";
        
      }
    }
    catch(SQLException e)
    {
      e.printStackTrace();
    }
    return "Invalid user credentials";
  }
  
  
}
