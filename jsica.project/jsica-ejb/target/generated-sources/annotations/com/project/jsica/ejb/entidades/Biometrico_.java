package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.RegistroAsistencia;
import com.project.jsica.ejb.entidades.Sucursal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Biometrico.class)
public class Biometrico_ { 

    public static volatile SingularAttribute<Biometrico, Long> id;
    public static volatile SingularAttribute<Biometrico, String> ipv6;
    public static volatile SingularAttribute<Biometrico, String> ipv4;
    public static volatile SingularAttribute<Biometrico, Sucursal> sucursalId;
    public static volatile SingularAttribute<Biometrico, String> marca;
    public static volatile SingularAttribute<Biometrico, String> modelo;
    public static volatile ListAttribute<Biometrico, RegistroAsistencia> registroAsistenciaList;

}