package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Empleado;
import com.project.jsica.ejb.entidades.GrupoHorario;
import com.project.jsica.ejb.entidades.Horario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(EmpleadoHorario.class)
public class EmpleadoHorario_ { 

    public static volatile SingularAttribute<EmpleadoHorario, Long> id;
    public static volatile SingularAttribute<EmpleadoHorario, Empleado> empleadoId;
    public static volatile SingularAttribute<EmpleadoHorario, Date> fecha;
    public static volatile SingularAttribute<EmpleadoHorario, Horario> horarioId;
    public static volatile SingularAttribute<EmpleadoHorario, GrupoHorario> grupoHorarioId;
    public static volatile SingularAttribute<EmpleadoHorario, Boolean> porGrupo;

}