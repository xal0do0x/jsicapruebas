package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Empleado;
import com.project.jsica.ejb.entidades.TipoEmpleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(FichaLaboralEmpleado.class)
public class FichaLaboralEmpleado_ { 

    public static volatile SingularAttribute<FichaLaboralEmpleado, Long> id;
    public static volatile SingularAttribute<FichaLaboralEmpleado, String> codigoTrabajador;
    public static volatile SingularAttribute<FichaLaboralEmpleado, TipoEmpleado> tipoEmpleadoId;
    public static volatile SingularAttribute<FichaLaboralEmpleado, Empleado> empleadoId;

}