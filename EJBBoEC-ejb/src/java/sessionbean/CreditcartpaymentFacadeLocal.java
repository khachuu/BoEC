/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Creditcartpayment;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author taint
 */
@Local
public interface CreditcartpaymentFacadeLocal {

    void create(Creditcartpayment creditcartpayment);

    void edit(Creditcartpayment creditcartpayment);

    void remove(Creditcartpayment creditcartpayment);

    Creditcartpayment find(Object id);

    List<Creditcartpayment> findAll();

    List<Creditcartpayment> findRange(int[] range);

    int count();
    
}
