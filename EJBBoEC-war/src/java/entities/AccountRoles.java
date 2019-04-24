/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import util.DBConnection;

/**
 *
 * @author taint
 */
@Entity
@Table(name = "account_roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccountRoles.findAll", query = "SELECT a FROM AccountRoles a")
    , @NamedQuery(name = "AccountRoles.findById", query = "SELECT a FROM AccountRoles a WHERE a.id = :id")
    , @NamedQuery(name = "AccountRoles.findByRole", query = "SELECT a FROM AccountRoles a WHERE a.role = :role")})
public class AccountRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "role")
    private String role;
    @JoinColumn(name = "username", referencedColumnName = "Username")
    @ManyToOne(optional = false)
    private Account username;

    public AccountRoles() {
    }

    public AccountRoles(Integer id) {
        this.id = id;
    }

    public AccountRoles(Integer id, String role) {
        this.id = id;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Account getUsername() {
        return username;
    }

    public void setUsername(Account username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountRoles)) {
            return false;
        }
        AccountRoles other = (AccountRoles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AccountRoles[ id=" + id + " ]";
    }
       
    public Account findAccountByUserName(String userName, String password) throws SQLException {
         Account account = null;
         Connection con = null;
         Statement statement = null;
         ResultSet resultSet = null;
         String userNameDB = "";
         String passwordDB = "";
         String roleDB = "";
//    String pass = userName+""+password;
//      System.out.println(passwordEncoder(password));
    try {
      con = DBConnection.createConnection();
      statement = con.createStatement();
    
      resultSet =  statement.executeQuery("Select * from account where Username = '"+userName+"' and Password = '"+password+"'");
        
//         List<Account> accounts = query.getResultList();
         while(resultSet.next()){
             account.setUsername(resultSet.getString("Username"));
             account.setPassword(resultSet.getString("Password"));
             account.setEnabled(resultSet.getShort("Enable"));
         }
       
             return account;
         
    }catch(Exception ex){
        ex.printStackTrace();
    }
        return account;
    
    
     }
}
