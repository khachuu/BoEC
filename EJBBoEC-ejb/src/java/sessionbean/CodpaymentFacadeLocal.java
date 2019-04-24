/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Codpayment;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author taint
 */
@Local
public interface CodpaymentFacadeLocal {

    void create(Codpayment codpayment);

    void edit(Codpayment codpayment);

    void remove(Codpayment codpayment);

    Codpayment find(Object id);

    List<Codpayment> findAll();

    List<Codpayment> findRange(int[] range);

    int count();
    
}
