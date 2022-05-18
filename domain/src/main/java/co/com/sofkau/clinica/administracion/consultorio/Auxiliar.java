package co.com.sofkau.clinica.administracion.consultorio;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.consultorio.values.AuxiliarId;
import co.com.sofkau.clinica.administracion.consultorio.values.Nombre;
import co.com.sofkau.clinica.administracion.consultorio.values.Telefono;

public class Auxiliar extends Entity<AuxiliarId> {

    protected Nombre nombre;

    protected Telefono telefono;

    public Auxiliar(AuxiliarId auxiliarId, Nombre nombre, Telefono telefono) {
        super(auxiliarId);
        this.nombre = nombre;
        this.telefono = telefono;
    }
}
