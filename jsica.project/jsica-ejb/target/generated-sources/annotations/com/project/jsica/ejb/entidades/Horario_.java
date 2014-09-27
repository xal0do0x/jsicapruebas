package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.DetalleHorario;
import com.project.jsica.ejb.entidades.EmpleadoHorario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Horario.class)
public class Horario_ { 

    public static volatile SingularAttribute<Horario, Boolean> jueves;
    public static volatile SingularAttribute<Horario, Date> fecha;
    public static volatile SingularAttribute<Horario, Boolean> lunes;
    public static volatile SingularAttribute<Horario, Boolean> porFecha;
    public static volatile SingularAttribute<Horario, String> descripcion;
    public static volatile SingularAttribute<Horario, Boolean> domingo;
    public static volatile ListAttribute<Horario, EmpleadoHorario> empleadoHorarioList;
    public static volatile SingularAttribute<Horario, Boolean> martes;
    public static volatile SingularAttribute<Horario, Long> id;
    public static volatile SingularAttribute<Horario, String> nombre;
    public static volatile SingularAttribute<Horario, Boolean> sabado;
    public static volatile ListAttribute<Horario, DetalleHorario> detalleHorarioList;
    public static volatile SingularAttribute<Horario, Boolean> viernes;
    public static volatile SingularAttribute<Horario, Boolean> miercoles;

}