package com.project.jsica.ejb.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Logs.class)
public class Logs_ { 

    public static volatile SingularAttribute<Logs, Long> id;
    public static volatile SingularAttribute<Logs, String> message;
    public static volatile SingularAttribute<Logs, Date> hora;
    public static volatile SingularAttribute<Logs, String> level;
    public static volatile SingularAttribute<Logs, String> userId;
    public static volatile SingularAttribute<Logs, Date> dated;
    public static volatile SingularAttribute<Logs, String> logger;

}