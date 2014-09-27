package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Empleado;
import com.project.jsica.ejb.entidades.NivelEducativo;
import com.project.jsica.ejb.entidades.Ubigeo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(FichaGeneralEmpleado.class)
public class FichaGeneralEmpleado_ { 

    public static volatile SingularAttribute<FichaGeneralEmpleado, Long> id;
    public static volatile SingularAttribute<FichaGeneralEmpleado, String> direccion;
    public static volatile SingularAttribute<FichaGeneralEmpleado, Empleado> empleadoId;
    public static volatile SingularAttribute<FichaGeneralEmpleado, String> direccionTipoZona;
    public static volatile SingularAttribute<FichaGeneralEmpleado, String> direccionTipoVia;
    public static volatile SingularAttribute<FichaGeneralEmpleado, String> estadoCivil;
    public static volatile SingularAttribute<FichaGeneralEmpleado, String> email;
    public static volatile SingularAttribute<FichaGeneralEmpleado, NivelEducativo> nivelEducativoId;
    public static volatile SingularAttribute<FichaGeneralEmpleado, String> telefonoFijo;
    public static volatile SingularAttribute<FichaGeneralEmpleado, String> telefonoCelular;
    public static volatile SingularAttribute<FichaGeneralEmpleado, Ubigeo> ubigeoCodigo;

}