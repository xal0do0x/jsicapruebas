package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Contrato;
import com.project.jsica.ejb.entidades.Feriado;
import com.project.jsica.ejb.entidades.Vacacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Anio.class)
public class Anio_ { 

    public static volatile SingularAttribute<Anio, Long> id;
    public static volatile SingularAttribute<Anio, String> anio;
    public static volatile SingularAttribute<Anio, String> nombre;
    public static volatile ListAttribute<Anio, Feriado> feriadoList;
    public static volatile ListAttribute<Anio, Contrato> contratoList;
    public static volatile ListAttribute<Anio, Vacacion> vacacionList;
    public static volatile SingularAttribute<Anio, Boolean> vigente;

}