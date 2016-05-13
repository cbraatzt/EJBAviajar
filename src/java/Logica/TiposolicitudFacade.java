/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import entities.Tiposolicitud;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author huanc
 */
@Stateless
public class TiposolicitudFacade extends AbstractFacade<Tiposolicitud> implements Logica.TiposolicitudFacadeRemote {

    @PersistenceContext(unitName = "EJBAviajarPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TiposolicitudFacade() {
        super(Tiposolicitud.class);
    }
    
}
