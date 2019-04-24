/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Bankpayment;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author taint
 */
@Local
public interface BankpaymentFacadeLocal {

    void create(Bankpayment bankpayment);

    void edit(Bankpayment bankpayment);

    void remove(Bankpayment bankpayment);

    Bankpayment find(Object id);

    List<Bankpayment> findAll();

    List<Bankpayment> findRange(int[] range);

    int count();
    
}
