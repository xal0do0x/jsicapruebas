package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.DetalleContrato;
import com.project.jsica.ejb.entidades.Servicio;
import com.project.jsica.ejb.entidades.Sucursal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, Long> id;
    public static volatile SingularAttribute<Area, String> nombre;
    public static volatile ListAttribute<Area, Servicio> servicioList;
    public static volatile SingularAttribute<Area, Sucursal> sucursalId;
    public static volatile SingularAttribute<Area, String> descripcion;
    public static volatile ListAttribute<Area, DetalleContrato> detalleContratoList;

}