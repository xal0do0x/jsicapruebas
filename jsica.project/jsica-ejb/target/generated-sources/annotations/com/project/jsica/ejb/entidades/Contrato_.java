package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.Anio;
import com.project.jsica.ejb.entidades.CondicionLaboral;
import com.project.jsica.ejb.entidades.DetalleContrato;
import com.project.jsica.ejb.entidades.Ocupacion;
import com.project.jsica.ejb.entidades.RegimenLaboral;
import com.project.jsica.ejb.entidades.TipoContrato;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Contrato.class)
public class Contrato_ { 

    public static volatile SingularAttribute<Contrato, Long> id;
    public static volatile SingularAttribute<Contrato, String> codigo;
    public static volatile SingularAttribute<Contrato, CondicionLaboral> condicionLaboralId;
    public static volatile SingularAttribute<Contrato, Double> sueldoBasico;
    public static volatile SingularAttribute<Contrato, RegimenLaboral> regimenLaboralId;
    public static volatile SingularAttribute<Contrato, Anio> anioId;
    public static volatile SingularAttribute<Contrato, Ocupacion> ocupacionId;
    public static volatile SingularAttribute<Contrato, TipoContrato> tipoContratoId;
    public static volatile SingularAttribute<Contrato, Date> fechaFin;
    public static volatile ListAttribute<Contrato, DetalleContrato> detalleContratoList;
    public static volatile SingularAttribute<Contrato, Date> fechaInicio;

}