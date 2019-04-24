/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Account;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author taint
 */
@Stateless
public class AccountFacade extends AbstractFacade<Account> implements AccountFacadeLocal {

    @PersistenceContext(unitName = "EJBBoEC-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountFacade() {
        super(Account.class);
    }
    
//    public Account findAccountByUserNameAndPassword(String userName, String password) throws SQLException{
////         Account account = new Account();
//         Account account = null;
//         Query query =  em.createQuery("Select * from account where Username = '"+userName+"' and Password = '"+password+"'");
//         account = (Account) query.getSingleResult();
////         List<Account> accounts = query.getResultList();
////         while(resultSet.next()){
////             account.setUsername(resultSet.getString("Username"));
////             account.setPassword(resultSet.getString("Password"));
////             account.setEnabled(resultSet.getShort("Enable"));
////         }
//         if(account != null){
//             return account;
//         }else return null;
//        
//    }
//    
    
    
}
