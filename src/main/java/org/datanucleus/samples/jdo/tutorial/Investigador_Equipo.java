package org.datanucleus.samples.jdo.tutorial;
import javax.jdo.annotations.*;
import java.util.Date;

@PersistenceCapable
public class Investigador_Equipo {
    Date fec_in = null;
    Date fec_fin = null;

    @Column(name="id_investigador")
    Investigador investigador;

    @Column(name="id_equpo")
    Equipo equipo;

    public Date getFec_in() { return fec_in; }
    public void setFec_in(Date fec_in) { this.fec_in = fec_in; }

    public Date getFec_fin() { return fec_fin; }
    public void setFec_fin(Date fec_fin) { this.fec_fin = fec_fin; }

    public Investigador getInvestigador() { return investigador; }
    public void setInvestigador(Investigador investigador) { this.investigador = investigador; }

    public Equipo getEquipo() { return equipo; }
    public void setEquipo(Equipo equipo) { this.equipo = equipo; }

    public Investigador_Equipo(Date fec_in, Date fec_fin)
    {
        this.fec_in=fec_in;
        this.fec_fin=fec_fin;
    }
}
