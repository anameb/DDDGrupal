package co.com.sofkau.clinica.administracion.consultorio;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.consultorio.values.Especialidad;
import co.com.sofkau.clinica.administracion.consultorio.values.MedicoId;
import co.com.sofkau.clinica.administracion.consultorio.values.Nombre;
import co.com.sofkau.clinica.administracion.consultorio.values.Telefono;

public class Medico extends Entity<MedicoId> {
    protected Nombre nombre;
    protected Telefono telefono;
    protected Especialidad especialidad;

    public Medico(MedicoId medicoId, Nombre nombre, Telefono telefono, Especialidad especialidad) {
        super(medicoId);
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public void cambiarTelefono(Telefono telefono){
        this.telefono = telefono;
    }
}
