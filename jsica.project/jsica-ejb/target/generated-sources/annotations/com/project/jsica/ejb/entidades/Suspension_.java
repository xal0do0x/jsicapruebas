package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Empleado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Suspension.class)
public class Suspension_ { 

    public static volatile SingularAttribute<Suspension, Long> id;
    public static volatile SingularAttribute<Suspension, String> motivo;
    public static volatile SingularAttribute<Suspension, Empleado> empleadoIdempleado;
    public static volatile SingularAttribute<Suspension, Date> fechaFin;
    public static volatile SingularAttribute<Suspension, Date> fechaInicio;

}