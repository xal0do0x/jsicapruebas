package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Permiso;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(MotivoPermiso.class)
public class MotivoPermiso_ { 

    public static volatile SingularAttribute<MotivoPermiso, String> codigo;
    public static volatile SingularAttribute<MotivoPermiso, String> nombre;
    public static volatile ListAttribute<MotivoPermiso, Permiso> permisoList;
    public static volatile SingularAttribute<MotivoPermiso, String> descripcion;
    public static volatile SingularAttribute<MotivoPermiso, Boolean> conGoce;

}