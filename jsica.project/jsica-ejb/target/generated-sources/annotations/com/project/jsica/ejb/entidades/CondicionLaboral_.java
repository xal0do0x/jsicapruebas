package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Contrato;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(CondicionLaboral.class)
public class CondicionLaboral_ { 

    public static volatile SingularAttribute<CondicionLaboral, Long> id;
    public static volatile SingularAttribute<CondicionLaboral, String> codigo;
    public static volatile SingularAttribute<CondicionLaboral, String> nombre;
    public static volatile ListAttribute<CondicionLaboral, Contrato> contratoList;

}