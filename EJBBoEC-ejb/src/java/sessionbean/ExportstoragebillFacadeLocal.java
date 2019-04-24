/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Exportstoragebill;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author taint
 */
@Local
public interface ExportstoragebillFacadeLocal {

    void create(Exportstoragebill exportstoragebill);

    void edit(Exportstoragebill exportstoragebill);

    void remove(Exportstoragebill exportstoragebill);

    Exportstoragebill find(Object id);

    List<Exportstoragebill> findAll();

    List<Exportstoragebill> findRange(int[] range);

    int count();
    
}
