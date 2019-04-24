/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Directorder;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author taint
 */
@Local
public interface DirectorderFacadeLocal {

    void create(Directorder directorder);

    void edit(Directorder directorder);

    void remove(Directorder directorder);

    Directorder find(Object id);

    List<Directorder> findAll();

    List<Directorder> findRange(int[] range);

    int count();
    
}
