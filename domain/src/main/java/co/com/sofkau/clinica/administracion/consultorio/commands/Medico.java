package co.com.sofkau.clinica.administracion.consultorio.commands;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.consultorio.commands.values.Especialidad;
import co.com.sofkau.clinica.administracion.consultorio.commands.values.MedicoId;
import co.com.sofkau.clinica.administracion.consultorio.commands.values.Nombre;

public class Medico extends Entity<MedicoId> {
    protected Nombre nombre;
    protected Especialidad especialidad;

    public Medico(MedicoId medicoId, Nombre nombre, Especialidad especialidad) {
        super(medicoId);
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
}
