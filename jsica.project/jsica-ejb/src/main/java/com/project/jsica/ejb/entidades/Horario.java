/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.jsica.ejb.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author RyuujiMD
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horario.findAll", query = "SELECT h FROM Horario h"),
    @NamedQuery(name = "Horario.findById", query = "SELECT h FROM Horario h WHERE h.id = :id"),
    @NamedQuery(name = "Horario.findByNombre", query = "SELECT h FROM Horario h WHERE h.nombre = :nombre"),
    @NamedQuery(name = "Horario.findByDescripcion", query = "SELECT h FROM Horario h WHERE h.descripcion = :descripcion"),
    @NamedQuery(name = "Horario.findByLunes", query = "SELECT h FROM Horario h WHERE h.lunes = :lunes"),
    @NamedQuery(name = "Horario.findByMartes", query = "SELECT h FROM Horario h WHERE h.martes = :martes"),
    @NamedQuery(name = "Horario.findByMiercoles", query = "SELECT h FROM Horario h WHERE h.miercoles = :miercoles"),
    @NamedQuery(name = "Horario.findByJueves", query = "SELECT h FROM Horario h WHERE h.jueves = :jueves"),
    @NamedQuery(name = "Horario.findByViernes", query = "SELECT h FROM Horario h WHERE h.viernes = :viernes"),
    @NamedQuery(name = "Horario.findBySabado", query = "SELECT h FROM Horario h WHERE h.sabado = :sabado"),
    @NamedQuery(name = "Horario.findByDomingo", query = "SELECT h FROM Horario h WHERE h.domingo = :domingo"),
    @NamedQuery(name = "Horario.findByFecha", query = "SELECT h FROM Horario h WHERE h.fecha = :fecha"),
    @NamedQuery(name = "Horario.findByPorFecha", query = "SELECT h FROM Horario h WHERE h.porFecha = :porFecha")})
public class Horario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String nombre;
    @Size(max = 255)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    private boolean lunes;
    @Basic(optional = false)
    @NotNull
    private boolean martes;
    @Basic(optional = false)
    @NotNull
    private boolean miercoles;
    @Basic(optional = false)
    @NotNull
    private boolean jueves;
    @Basic(optional = false)
    @NotNull
    private boolean viernes;
    @Basic(optional = false)
    @NotNull
    private boolean sabado;
    @Basic(optional = false)
    @NotNull
    private boolean domingo;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "por_fecha")
    private boolean porFecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "horarioId")
    private List<DetalleHorario> detalleHorarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "horarioId")
    private List<EmpleadoHorario> empleadoHorarioList;

    public Horario() {
    }

    public Horario(Long id) {
        this.id = id;
    }

    public Horario(Long id, String nombre, boolean lunes, boolean martes, boolean miercoles, boolean jueves, boolean viernes, boolean sabado, boolean domingo, boolean porFecha) {
        this.id = id;
        this.nombre = nombre;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.domingo = domingo;
        this.porFecha = porFecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion.toUpperCase();
    }

    public boolean getLunes() {
        return lunes;
    }

    public void setLunes(boolean lunes) {
        this.lunes = lunes;
    }

    public boolean getMartes() {
        return martes;
    }

    public void setMartes(boolean martes) {
        this.martes = martes;
    }

    public boolean getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(boolean miercoles) {
        this.miercoles = miercoles;
    }

    public boolean getJueves() {
        return jueves;
    }

    public void setJueves(boolean jueves) {
        this.jueves = jueves;
    }

    public boolean getViernes() {
        return viernes;
    }

    public void setViernes(boolean viernes) {
        this.viernes = viernes;
    }

    public boolean getSabado() {
        return sabado;
    }

    public void setSabado(boolean sabado) {
        this.sabado = sabado;
    }

    public boolean getDomingo() {
        return domingo;
    }

    public void setDomingo(boolean domingo) {
        this.domingo = domingo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean getPorFecha() {
        return porFecha;
    }

    public void setPorFecha(boolean porFecha) {
        this.porFecha = porFecha;
    }
    
    /*Metodos para ingreso de horarios*/
    public DetalleHorario getDetalleHorario(){
        return this.detalleHorarioList.get(0);
    }
    
    @XmlTransient
    public List<DetalleHorario> getDetalleHorarioList() {
        return detalleHorarioList;
    }

    public void setDetalleHorarioList(List<DetalleHorario> detalleHorarioList) {
        this.detalleHorarioList = detalleHorarioList;
    }

    @XmlTransient
    public List<EmpleadoHorario> getEmpleadoHorarioList() {
        return empleadoHorarioList;
    }

    public void setEmpleadoHorarioList(List<EmpleadoHorario> empleadoHorarioList) {
        this.empleadoHorarioList = empleadoHorarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horario)) {
            return false;
        }
        Horario other = (Horario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.project.jsica.ejb.entidades.Horario[ id=" + id + " ]";
    }
    
}
