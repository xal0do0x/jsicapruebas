package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Empleado;
import com.project.jsica.ejb.entidades.EmpleadoPermiso;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Papeleta.class)
public class Papeleta_ { 

    public static volatile SingularAttribute<Papeleta, Long> id;
    public static volatile SingularAttribute<Papeleta, String> codigo;
    public static volatile SingularAttribute<Papeleta, Empleado> empleadoIdempleado;
    public static volatile SingularAttribute<Papeleta, EmpleadoPermiso> empleadoPermisoId;
    public static volatile SingularAttribute<Papeleta, Empleado> empleadoIdjefeInmediato;
    public static volatile SingularAttribute<Papeleta, Empleado> empleadoIdjefePersonal;

}