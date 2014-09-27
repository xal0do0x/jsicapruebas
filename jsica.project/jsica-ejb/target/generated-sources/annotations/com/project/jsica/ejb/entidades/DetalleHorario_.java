package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.CambioTurno;
import com.project.jsica.ejb.entidades.Horario;
import com.project.jsica.ejb.entidades.Jornada;
import com.project.jsica.ejb.entidades.RegistroAsistencia;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(DetalleHorario.class)
public class DetalleHorario_ { 

    public static volatile SingularAttribute<DetalleHorario, Long> id;
    public static volatile ListAttribute<DetalleHorario, CambioTurno> cambioTurnoList1;
    public static volatile SingularAttribute<DetalleHorario, Jornada> jornadaCodigo;
    public static volatile SingularAttribute<DetalleHorario, Date> fecha;
    public static volatile ListAttribute<DetalleHorario, RegistroAsistencia> registroList;
    public static volatile ListAttribute<DetalleHorario, RegistroAsistencia> registroList1;
    public static volatile SingularAttribute<DetalleHorario, Horario> horarioId;
    public static volatile ListAttribute<DetalleHorario, CambioTurno> cambioTurnoList;

}