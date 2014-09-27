package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.FichaGeneralEmpleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(NivelEducativo.class)
public class NivelEducativo_ { 

    public static volatile SingularAttribute<NivelEducativo, Integer> id;
    public static volatile SingularAttribute<NivelEducativo, String> nombre;
    public static volatile ListAttribute<NivelEducativo, FichaGeneralEmpleado> fichaGeneralEmpleadoList;

}