package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.EmpleadoPermiso;
import com.project.jsica.ejb.entidades.MotivoPermiso;
import com.project.jsica.ejb.entidades.RegistroAsistencia;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Permiso.class)
public class Permiso_ { 

    public static volatile SingularAttribute<Permiso, Long> id;
    public static volatile SingularAttribute<Permiso, MotivoPermiso> motivoPermisoCodigo;
    public static volatile SingularAttribute<Permiso, Date> horaInicio;
    public static volatile ListAttribute<Permiso, RegistroAsistencia> registroList;
    public static volatile SingularAttribute<Permiso, Date> horaFin;
    public static volatile SingularAttribute<Permiso, String> tipo;
    public static volatile SingularAttribute<Permiso, Boolean> porFecha;
    public static volatile SingularAttribute<Permiso, Date> fechaFin;
    public static volatile SingularAttribute<Permiso, Date> fechaInicio;
    public static volatile ListAttribute<Permiso, EmpleadoPermiso> empleadoPermisoList;

}