package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Empleado;
import com.project.jsica.ejb.entidades.EmpleadoHorario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(GrupoHorario.class)
public class GrupoHorario_ { 

    public static volatile SingularAttribute<GrupoHorario, Long> id;
    public static volatile SingularAttribute<GrupoHorario, String> nombre;
    public static volatile ListAttribute<GrupoHorario, Empleado> empleadoList;
    public static volatile ListAttribute<GrupoHorario, EmpleadoHorario> empleadoHorarioList;

}