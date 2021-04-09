package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@PersistenceCapable
public class Equipo {

    @PrimaryKey
    @Persistent(valueStrategy= IdGeneratorStrategy.INCREMENT)
    long id_equipo=0;

    String nombre=null;
    String descripcion=null;
    String privacidad=null;
    Date fec_creacion=null;
    Date fec_disolucion=null;

    @Column(name="id_equipo_padre")
    Equipo equipo_padre;

    @Column(name="id_organizacion")
    Organizacion organizacion;

    @Persistent(mappedBy="equipo_padre")
    Set<Equipo> equipo = new HashSet<Equipo>();

    @Persistent(mappedBy="equipo")
    Set<Proyecto> proyecto = new HashSet<Proyecto>();

    //para la n a m
    @Persistent(mappedBy="equipo")
    Set<Investigador> investigador= new HashSet<Investigador>();

    public Set<Investigador> getInvestigador() { return investigador; }
    public void setInvestigador(Set<Investigador> investigador) { this.investigador = investigador; }

    public Set<Proyecto> getProyecto() { return proyecto; }
    public void setProyecto(Set<Proyecto> proyecto) { this.proyecto = proyecto; }

    public Set<Equipo> getEquipo() { return equipo; }
    public void setEquipo(Set<Equipo> equipo) { this.equipo = equipo; }

    public long getId_equipo() { return id_equipo; }
    public void setId_equipo(long id_equipo) { this.id_equipo = id_equipo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getPrivacidad() { return privacidad; }
    public void setPrivacidad(String privacidad) { this.privacidad = privacidad; }

    public Date getFec_creacion() { return fec_creacion; }
    public void setFec_creacion(Date fec_creacion) { this.fec_creacion = fec_creacion; }

    public Date getFec_disolucion() { return fec_disolucion; }
    public void setFec_disolucion(Date fec_disolucion) { this.fec_disolucion = fec_disolucion; }

    public Organizacion getOrganizacion() { return organizacion; }
    public void setOrganizacion(Organizacion organizacion) { this.organizacion = organizacion; }



    public Equipo(String nombre, String descripcion, String privacidad, Date fec_creacion, Date fec_disolucion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.privacidad = privacidad;
        this.fec_creacion = fec_creacion;
        this.fec_disolucion = fec_disolucion;
    }
}

