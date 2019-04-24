/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Homeapplicances;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author taint
 */
@Local
public interface HomeapplicancesFacadeLocal {

    void create(Homeapplicances homeapplicances);

    void edit(Homeapplicances homeapplicances);

    void remove(Homeapplicances homeapplicances);

    Homeapplicances find(Object id);

    List<Homeapplicances> findAll();

    List<Homeapplicances> findRange(int[] range);

    int count();
    
}
