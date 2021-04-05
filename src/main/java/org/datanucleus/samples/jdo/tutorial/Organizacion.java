package org.datanucleus.samples.jdo.tutorial;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import java.util.HashSet;
import java.util.Set;

@PersistenceCapable
public class Organizacion
{

    @PrimaryKey
    @Persistent(valueStrategy= IdGeneratorStrategy.INCREMENT)
    long id_organizacion=0;
    String nombre = null;
    String localizacion=null;
    String descripcion=null;
    String tipo=null;

    @Persistent(mappedBy="organizacion")
    Set<Investigador> investigador = new HashSet<Investigador>();

    @Persistent(mappedBy="organizacion")
    Set<Equipo> equipo = new HashSet<Equipo>();

    public long getId_organizacion() { return id_organizacion; }
    public String getNombre() { return nombre; }
    public String getLocalizacion() { return localizacion; }
    public String getDescripcion() { return descripcion; }
    public String getTipo() { return tipo; }
    public Set<Investigador> getInvestigador() { return investigador; }
    public Set<Equipo> getEquipo() { return equipo; }

    public void setId_organizacion(long id_organizacion) { this.id_organizacion = id_organizacion; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setLocalizacion(String localizacion) { this.localizacion = localizacion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setInvestigador(Set<Investigador> investigador) { this.investigador = investigador; }
    public void setEquipo(Set<Equipo> equipo) { this.equipo = equipo; }

    public Organizacion(String nombre, String localizacion, String descripcion, String tipo) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }
}
