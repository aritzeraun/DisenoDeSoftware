package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@PersistenceCapable
public class Proyecto {

    @PrimaryKey
    @Persistent(valueStrategy= IdGeneratorStrategy.INCREMENT)
    long id_proyecto=0;

    String nombre=null;
    String descripcion=null;
    String estado=null;
    Date fec_comienzo=null;
    Date fec_ultEdicion=null;

    @Column(name="id_equipo")
    Equipo equipo;

    @Column(name="id_tematica")
    Tematica tematica;

    @Persistent(mappedBy="proyecto")
    Set<Avance> avance = new HashSet<Avance>();

    public Set<Avance> getAvance() { return avance; }
    public void setAvance(Set<Avance> avance) { this.avance = avance; }

    public long getId_proyecto() { return id_proyecto; }
    public void setId_proyecto(long id_proyecto) { this.id_proyecto = id_proyecto; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Date getFec_comienzo() { return fec_comienzo; }
    public void setFec_comienzo(Date fec_comienzo) { this.fec_comienzo = fec_comienzo; }

    public Date getFec_ultEdicion() { return fec_ultEdicion; }
    public void setFec_ultEdicion(Date fec_ultEdicion) { this.fec_ultEdicion = fec_ultEdicion; }

    public Equipo getEquipo() { return equipo; }
    public void setEquipo(Equipo equipo) { this.equipo = equipo; }

    public Tematica getTematica() { return tematica; }
    public void setTematica(Tematica tematica) { this.tematica = tematica; }

    public Proyecto(String nombre, String descripcion, String estado, Date fec_comienzo, Date fec_ultEdicion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fec_comienzo=fec_comienzo;
        this.fec_ultEdicion=fec_ultEdicion;
    }
}
