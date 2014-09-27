package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.DetalleHorario;
import com.project.jsica.ejb.entidades.Servicio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Jornada.class)
public class Jornada_ { 

    public static volatile SingularAttribute<Jornada, String> codigo;
    public static volatile SingularAttribute<Jornada, String> nombre;
    public static volatile ListAttribute<Jornada, DetalleHorario> detalleHorarioList;
    public static volatile SingularAttribute<Jornada, Date> hEntrada;
    public static volatile SingularAttribute<Jornada, Date> hSalida;
    public static volatile SingularAttribute<Jornada, Servicio> servicioId;
    public static volatile SingularAttribute<Jornada, Boolean> asistencial;
    public static volatile SingularAttribute<Jornada, Boolean> flexible;
    public static volatile SingularAttribute<Jornada, Boolean> terminaDiaSiguiente;

}