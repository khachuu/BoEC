/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Electronic;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author taint
 */
@Stateless
public class ElectronicFacade extends AbstractFacade<Electronic> implements ElectronicFacadeLocal {

    @PersistenceContext(unitName = "EJBBoEC-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ElectronicFacade() {
        super(Electronic.class);
    }
    
}
