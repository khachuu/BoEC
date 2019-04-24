/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Electronic;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author taint
 */
@Local
public interface ElectronicFacadeLocal {

    void create(Electronic electronic);

    void edit(Electronic electronic);

    void remove(Electronic electronic);

    Electronic find(Object id);

    List<Electronic> findAll();

    List<Electronic> findRange(int[] range);

    int count();
    
}
