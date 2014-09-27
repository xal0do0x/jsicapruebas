/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.jsica.ejb.dao;

import com.project.jsica.ejb.entidades.TCImportacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author RyuujiMD
 */
@Stateless
public class TCImportacionFacade extends AbstractFacade<TCImportacion> implements TCImportacionFacadeLocal {
    @PersistenceContext(unitName = "jsica-postgresql-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TCImportacionFacade() {
        super(TCImportacion.class);
    }
    
}
