/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.jsica.ejb.dao;

import com.project.jsica.ejb.entidades.EmpleadoPermiso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author RyuujiMD
 */
@Stateless
public class EmpleadoPermisoFacade extends AbstractFacade<EmpleadoPermiso> implements EmpleadoPermisoFacadeLocal {
    @PersistenceContext(unitName = jsica_PU)
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpleadoPermisoFacade() {
        super(EmpleadoPermiso.class);
    }
    
}
