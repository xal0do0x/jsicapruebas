package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Empleado;
import com.project.jsica.ejb.entidades.Papeleta;
import com.project.jsica.ejb.entidades.Permiso;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(EmpleadoPermiso.class)
public class EmpleadoPermiso_ { 

    public static volatile SingularAttribute<EmpleadoPermiso, Long> id;
    public static volatile ListAttribute<EmpleadoPermiso, Papeleta> papeletaList;
    public static volatile SingularAttribute<EmpleadoPermiso, Empleado> empleadoId;
    public static volatile SingularAttribute<EmpleadoPermiso, Permiso> permisoId;

}