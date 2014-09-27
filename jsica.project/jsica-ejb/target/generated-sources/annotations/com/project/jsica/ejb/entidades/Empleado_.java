package com.project.jsica.ejb.entidades;

import com.project.jsica.ejb.entidades.CambioTurno;
import com.project.jsica.ejb.entidades.DetalleContrato;
import com.project.jsica.ejb.entidades.Empleado;
import com.project.jsica.ejb.entidades.EmpleadoHorario;
import com.project.jsica.ejb.entidades.EmpleadoPermiso;
import com.project.jsica.ejb.entidades.Falta;
import com.project.jsica.ejb.entidades.FichaGeneralEmpleado;
import com.project.jsica.ejb.entidades.FichaLaboralEmpleado;
import com.project.jsica.ejb.entidades.GrupoHorario;
import com.project.jsica.ejb.entidades.Papeleta;
import com.project.jsica.ejb.entidades.RegistroAsistencia;
import com.project.jsica.ejb.entidades.Servicio;
import com.project.jsica.ejb.entidades.Suspension;
import com.project.jsica.ejb.entidades.Usuario;
import com.project.jsica.ejb.entidades.Vacacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-27T10:02:34")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile ListAttribute<Empleado, Empleado> empleadoList;
    public static volatile ListAttribute<Empleado, Papeleta> papeletaList2;
    public static volatile SingularAttribute<Empleado, String> docIdentidad;
    public static volatile SingularAttribute<Empleado, String> situacionTrabajador;
    public static volatile SingularAttribute<Empleado, Character> sexo;
    public static volatile ListAttribute<Empleado, Papeleta> papeletaList1;
    public static volatile ListAttribute<Empleado, CambioTurno> cambioTurnoList;
    public static volatile SingularAttribute<Empleado, GrupoHorario> grupoHorarioId;
    public static volatile SingularAttribute<Empleado, Date> fechaNacimiento;
    public static volatile ListAttribute<Empleado, Papeleta> papeletaList;
    public static volatile SingularAttribute<Empleado, Long> id;
    public static volatile ListAttribute<Empleado, CambioTurno> cambioTurnoList2;
    public static volatile SingularAttribute<Empleado, String> nombres;
    public static volatile ListAttribute<Empleado, CambioTurno> cambioTurnoList3;
    public static volatile ListAttribute<Empleado, RegistroAsistencia> registroAsistenciaList;
    public static volatile ListAttribute<Empleado, DetalleContrato> detalleContratoList;
    public static volatile SingularAttribute<Empleado, Empleado> empleadoId;
    public static volatile SingularAttribute<Empleado, String> apellidos;
    public static volatile ListAttribute<Empleado, Suspension> suspensionList;
    public static volatile SingularAttribute<Empleado, Servicio> servicioId;
    public static volatile ListAttribute<Empleado, FichaGeneralEmpleado> fichaGeneralEmpleadoList;
    public static volatile ListAttribute<Empleado, Vacacion> vacacionList;
    public static volatile ListAttribute<Empleado, EmpleadoHorario> empleadoHorarioList;
    public static volatile ListAttribute<Empleado, Falta> faltaList;
    public static volatile ListAttribute<Empleado, Usuario> usuarioList;
    public static volatile SingularAttribute<Empleado, String> foto;
    public static volatile ListAttribute<Empleado, EmpleadoPermiso> empleadoPermisoList;
    public static volatile ListAttribute<Empleado, FichaLaboralEmpleado> fichaLaboralEmpleadoList;

}