package com.project.jsica.ejb.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Bitacora.class)
public class Bitacora_ { 

    public static volatile SingularAttribute<Bitacora, Long> id;
    public static volatile SingularAttribute<Bitacora, Date> hora;
    public static volatile SingularAttribute<Bitacora, Date> fecha;
    public static volatile SingularAttribute<Bitacora, String> usuario;
    public static volatile SingularAttribute<Bitacora, String> valorAnt;
    public static volatile SingularAttribute<Bitacora, String> valorAct;
    public static volatile SingularAttribute<Bitacora, String> accion;
    public static volatile SingularAttribute<Bitacora, String> ipCliente;
    public static volatile SingularAttribute<Bitacora, String> tabla;
    public static volatile SingularAttribute<Bitacora, String> columna;

}