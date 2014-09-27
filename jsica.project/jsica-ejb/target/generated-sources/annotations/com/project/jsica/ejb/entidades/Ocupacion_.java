package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Contrato;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Ocupacion.class)
public class Ocupacion_ { 

    public static volatile SingularAttribute<Ocupacion, Long> id;
    public static volatile SingularAttribute<Ocupacion, String> nombre;
    public static volatile ListAttribute<Ocupacion, Contrato> contratoList;
    public static volatile SingularAttribute<Ocupacion, String> descripcion;

}