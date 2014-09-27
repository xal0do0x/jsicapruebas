/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.jsica.ejb.dao;

import com.project.jsica.ejb.entidades.DetalleHorario;
import java.util.List;
import java.util.Map;
import javax.ejb.Local;

/**
 *
 * @author RyuujiMD
 */
@Local
public interface DetalleHorarioFacadeLocal {

    void create(DetalleHorario detalleHorario);

    void edit(DetalleHorario detalleHorario);

    void remove(DetalleHorario detalleHorario);

    DetalleHorario find(Object id);

    List<DetalleHorario> findAll();

    List<DetalleHorario> findRange(int[] range);
    
    List<DetalleHorario> search(String namedQuery);
    
    List<DetalleHorario> search(String namedQuery, Map<String, Object> parametros);
    
    List<DetalleHorario> search(String namedQuery, Map<String, Object> parametros, int inicio, int tamanio);

    int count();
    
}
