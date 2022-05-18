package co.com.sofkau.clinica.administracion.consultorio;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.consultorio.values.AuxiliarId;
import co.com.sofkau.clinica.administracion.consultorio.values.Nombre;

public class Auxiliar extends Entity<AuxiliarId> {

    protected Nombre nombre;

    public Auxiliar(AuxiliarId auxiliarId, Nombre nombre) {
        super(auxiliarId);
        this.nombre = nombre;
    }
}
