package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Area;
import com.project.jsica.ejb.entidades.Empleado;
import com.project.jsica.ejb.entidades.Jornada;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile SingularAttribute<Servicio, Long> id;
    public static volatile SingularAttribute<Servicio, String> nombre;
    public static volatile ListAttribute<Servicio, Empleado> empleadoList;
    public static volatile SingularAttribute<Servicio, String> descripcion;
    public static volatile ListAttribute<Servicio, Jornada> jornadaList;
    public static volatile SingularAttribute<Servicio, Area> areaId;

}