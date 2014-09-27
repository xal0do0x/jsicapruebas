package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.DetalleHorario;
import com.project.jsica.ejb.entidades.Empleado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(CambioTurno.class)
public class CambioTurno_ { 

    public static volatile SingularAttribute<CambioTurno, Long> id;
    public static volatile SingularAttribute<CambioTurno, DetalleHorario> detalleHorarioReemplazo;
    public static volatile SingularAttribute<CambioTurno, Date> horaPedido;
    public static volatile SingularAttribute<CambioTurno, Empleado> jefeInmediatoId;
    public static volatile SingularAttribute<CambioTurno, Date> fechaPedido;
    public static volatile SingularAttribute<CambioTurno, Empleado> empleado2Id;
    public static volatile SingularAttribute<CambioTurno, DetalleHorario> detalleHorarioOriginal;
    public static volatile SingularAttribute<CambioTurno, Empleado> empleado1Id;

}