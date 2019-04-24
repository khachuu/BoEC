/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.AccountRoles;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author taint
 */
@Local
public interface AccountRolesFacadeLocal {

    void create(AccountRoles accountRoles);

    void edit(AccountRoles accountRoles);

    void remove(AccountRoles accountRoles);

    AccountRoles find(Object id);

    List<AccountRoles> findAll();

    List<AccountRoles> findRange(int[] range);

    int count();
    
}
