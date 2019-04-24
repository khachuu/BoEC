/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Account;
import entities.AccountRoles;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author taint
 */
@Stateless
public class AccountRolesFacade extends AbstractFacade<AccountRoles> implements AccountRolesFacadeLocal {

    @PersistenceContext(unitName = "EJBBoEC-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountRolesFacade() {
        super(AccountRoles.class);
    }

      
//    public AccountRoles findAccountByUserNameAndPassword(String userName, String password) throws SQLException{
//        
//         AccountRoles accountRoles = null;
//         AccountFacade accountFacade = new AccountFacade();
//         Account account = accountFacade.findAccountByUserNameAndPassword(userName, password);
//         Query query = em.createQuery("Select * from account where Username = '"+account.getUsername()+"' ");
//         accountRoles = (AccountRoles) query.getSingleResult();
//         if(accountRoles != null){
//             return accountRoles;
//         }else return null;
//    }     
    
}
