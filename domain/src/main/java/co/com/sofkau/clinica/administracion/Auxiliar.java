package co.com.sofkau.clinica.administracion;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.values.AuxiliarId;
import co.com.sofkau.clinica.administracion.values.Nombre;

public class Auxiliar extends Entity<AuxiliarId> {

    protected Nombre nombre;

    public Auxiliar(AuxiliarId auxiliarId, Nombre nombre) {
        super(auxiliarId);
        this.nombre = nombre;
    }
}
