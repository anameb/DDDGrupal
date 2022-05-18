package co.com.sofkau.clinica.administracion.atencion;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.atencion.values.PacienteId;
import co.com.sofkau.clinica.administracion.atencion.values.Telefono;
import co.com.sofkau.clinica.administracion.consultorio.values.Nombre;

public class Paciente extends Entity<PacienteId> {
    protected Nombre nombre;
    protected Telefono telefono;

    public Paciente(PacienteId pacienteId, Nombre nombre, Telefono telefono) {
        super(pacienteId);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void cambiarTelefono(Telefono telefono) {
        if (telefono.value().length() != 10 || telefono == this.telefono) {
            throw new IllegalArgumentException("No es un número telefónico que pueda cambiarse");
        }
        this.telefono = telefono;
    }
}
