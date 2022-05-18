package co.com.sofkau.clinica.administracion.atencion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.consultorio.values.Nombre;
import co.com.sofkau.clinica.administracion.atencion.values.PacienteId;
import co.com.sofkau.clinica.administracion.atencion.values.Telefono;

public class PacienteCreado extends DomainEvent {

    private final PacienteId pacienteId;
    private final Nombre nombre;
    private final Telefono telefono;

    public PacienteCreado(PacienteId pacienteId, Nombre nombre, Telefono telefono) {
        super("co.com.sofkau.clinica.administracion.atencion.events.PacienteCreado");
        this.pacienteId = pacienteId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public PacienteId getPacienteId() {
        return pacienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
