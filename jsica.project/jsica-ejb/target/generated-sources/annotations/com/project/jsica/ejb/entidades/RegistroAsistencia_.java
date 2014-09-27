package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Biometrico;
import com.project.jsica.ejb.entidades.DetalleHorario;
import com.project.jsica.ejb.entidades.Empleado;
import com.project.jsica.ejb.entidades.Permiso;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(RegistroAsistencia.class)
public class RegistroAsistencia_ { 

    public static volatile SingularAttribute<RegistroAsistencia, Long> id;
    public static volatile SingularAttribute<RegistroAsistencia, DetalleHorario> turnoReemplazo;
    public static volatile SingularAttribute<RegistroAsistencia, Date> hora;
    public static volatile SingularAttribute<RegistroAsistencia, Empleado> empleadoId;
    public static volatile SingularAttribute<RegistroAsistencia, DetalleHorario> turnoOriginal;
    public static volatile SingularAttribute<RegistroAsistencia, Date> fecha;
    public static volatile SingularAttribute<RegistroAsistencia, String> tipo;
    public static volatile SingularAttribute<RegistroAsistencia, Boolean> eOS;
    public static volatile SingularAttribute<RegistroAsistencia, Permiso> permisoId;
    public static volatile SingularAttribute<RegistroAsistencia, Biometrico> biometricoId;

}