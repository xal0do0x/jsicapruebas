package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Contrato;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(RegimenLaboral.class)
public class RegimenLaboral_ { 

    public static volatile SingularAttribute<RegimenLaboral, Integer> id;
    public static volatile SingularAttribute<RegimenLaboral, String> codigo;
    public static volatile SingularAttribute<RegimenLaboral, String> nombre;
    public static volatile ListAttribute<RegimenLaboral, Contrato> contratoList;

}