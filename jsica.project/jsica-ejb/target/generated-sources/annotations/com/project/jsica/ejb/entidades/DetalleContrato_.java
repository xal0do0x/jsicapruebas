package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Area;
import com.project.jsica.ejb.entidades.Contrato;
import com.project.jsica.ejb.entidades.Empleado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(DetalleContrato.class)
public class DetalleContrato_ { 

    public static volatile SingularAttribute<DetalleContrato, Long> id;
    public static volatile SingularAttribute<DetalleContrato, Empleado> empleadoId;
    public static volatile SingularAttribute<DetalleContrato, Date> fFin;
    public static volatile SingularAttribute<DetalleContrato, Date> fInicio;
    public static volatile SingularAttribute<DetalleContrato, Contrato> contratoId;
    public static volatile SingularAttribute<DetalleContrato, Area> areaId;

}