/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Devicetechnoloy;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author taint
 */
@Local
public interface DevicetechnoloyFacadeLocal {

    void create(Devicetechnoloy devicetechnoloy);

    void edit(Devicetechnoloy devicetechnoloy);

    void remove(Devicetechnoloy devicetechnoloy);

    Devicetechnoloy find(Object id);

    List<Devicetechnoloy> findAll();

    List<Devicetechnoloy> findRange(int[] range);

    int count();
    
}
