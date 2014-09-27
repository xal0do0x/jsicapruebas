package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.FichaGeneralEmpleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Ubigeo.class)
public class Ubigeo_ { 

    public static volatile SingularAttribute<Ubigeo, String> codigo;
    public static volatile SingularAttribute<Ubigeo, String> pais;
    public static volatile SingularAttribute<Ubigeo, String> departamento;
    public static volatile SingularAttribute<Ubigeo, String> distrito;
    public static volatile ListAttribute<Ubigeo, FichaGeneralEmpleado> fichaGeneralEmpleadoList;
    public static volatile SingularAttribute<Ubigeo, String> provincia;

}