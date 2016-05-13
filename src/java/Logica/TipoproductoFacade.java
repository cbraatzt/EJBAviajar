/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import entities.Tipoproducto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author huanc
 */
@Stateless
public class TipoproductoFacade extends AbstractFacade<Tipoproducto> implements Logica.TipoproductoFacadeRemote {

    @PersistenceContext(unitName = "EJBAviajarPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoproductoFacade() {
        super(Tipoproducto.class);
    }
    
}
