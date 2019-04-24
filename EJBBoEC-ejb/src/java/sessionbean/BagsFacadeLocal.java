/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Bags;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author taint
 */
@Local
public interface BagsFacadeLocal {

    void create(Bags bags);

    void edit(Bags bags);

    void remove(Bags bags);

    Bags find(Object id);

    List<Bags> findAll();

    List<Bags> findRange(int[] range);

    int count();
    
}
