package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Area;
import com.project.jsica.ejb.entidades.Biometrico;
import com.project.jsica.ejb.entidades.Sucursal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Sucursal.class)
public class Sucursal_ { 

    public static volatile SingularAttribute<Sucursal, Long> id;
    public static volatile SingularAttribute<Sucursal, String> nombre;
    public static volatile SingularAttribute<Sucursal, Sucursal> principalId;
    public static volatile ListAttribute<Sucursal, Biometrico> biometricoList;
    public static volatile SingularAttribute<Sucursal, String> descripcion;
    public static volatile ListAttribute<Sucursal, Area> areaList;
    public static volatile ListAttribute<Sucursal, Sucursal> sucursalList;

}