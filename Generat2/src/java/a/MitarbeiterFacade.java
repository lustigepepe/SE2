/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package a;

import generate.Mitarbeiter;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vf
 */
@Stateless
public class MitarbeiterFacade extends AbstractFacade<Mitarbeiter> {
    @PersistenceContext(unitName = "Generat2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MitarbeiterFacade() {
        super(Mitarbeiter.class);
    }
    
}
