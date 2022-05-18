package co.com.sofkau.clinica.administracion.consultorio.commands;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.consultorio.commands.values.AuxiliarId;
import co.com.sofkau.clinica.administracion.consultorio.commands.values.Nombre;

public class Auxiliar extends Entity<AuxiliarId> {

    protected Nombre nombre;

    public Auxiliar(AuxiliarId auxiliarId, Nombre nombre) {
        super(auxiliarId);
        this.nombre = nombre;
    }
}
