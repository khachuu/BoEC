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
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Query;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import util.DBConnection;

/** 

 *
 * @author taint
 */
@Entity
@Table(name = "account")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a")
    , @NamedQuery(name = "Account.findByUsername", query = "SELECT a FROM Account a WHERE a.username = :username")
    , @NamedQuery(name = "Account.findByPassword", query = "SELECT a FROM Account a WHERE a.password = :password")
    , @NamedQuery(name = "Account.findByEnabled", query = "SELECT a FROM Account a WHERE a.enabled = :enabled")})
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Enabled")
    private short enabled;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "username")
    private Collection<AccountRoles> accountRolesCollection;

    public Account() {
    }

    public Account(String username) {
        this.username = username;
    }

    public Account(String username, String password, short enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public short getEnabled() {
        return enabled;
    }

    public void setEnabled(short enabled) {
        this.enabled = enabled;
    }

    @XmlTransient
    public Collection<AccountRoles> getAccountRolesCollection() {
        return accountRolesCollection;
    }

    public void setAccountRolesCollection(Collection<AccountRoles> accountRolesCollection) {
        this.accountRolesCollection = accountRolesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Account[ username=" + username + " ]";
    }
    
    
    public Account findAccountByUserNameAndPassword(String userName, String password) throws SQLException {
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
