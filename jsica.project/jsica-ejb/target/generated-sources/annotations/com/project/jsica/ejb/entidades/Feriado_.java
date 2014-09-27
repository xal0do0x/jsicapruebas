package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Anio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Feriado.class)
public class Feriado_ { 

    public static volatile SingularAttribute<Feriado, String> nombre;
    public static volatile SingularAttribute<Feriado, Anio> anioId;
    public static volatile SingularAttribute<Feriado, Long> idferiados;
    public static volatile SingularAttribute<Feriado, Date> fechaFin;
    public static volatile SingularAttribute<Feriado, Date> fechaInicio;

}