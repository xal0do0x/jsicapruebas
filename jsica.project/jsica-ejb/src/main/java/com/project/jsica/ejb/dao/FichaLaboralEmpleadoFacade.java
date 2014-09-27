/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.jsica.ejb.dao;

import com.project.jsica.ejb.entidades.FichaLaboralEmpleado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author RyuujiMD
 */
@Stateless
public class FichaLaboralEmpleadoFacade extends AbstractFacade<FichaLaboralEmpleado> implements FichaLaboralEmpleadoFacadeLocal {
    @PersistenceContext(unitName = jsica_PU)
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FichaLaboralEmpleadoFacade() {
        super(FichaLaboralEmpleado.class);
    }
    
}
