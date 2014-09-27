package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Anio;
import com.project.jsica.ejb.entidades.Empleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Vacacion.class)
public class Vacacion_ { 

    public static volatile SingularAttribute<Vacacion, Empleado> empleadoId;
    public static volatile SingularAttribute<Vacacion, Long> idvacaciones;
    public static volatile SingularAttribute<Vacacion, Anio> anioId;
    public static volatile SingularAttribute<Vacacion, Integer> diasRestantes;

}