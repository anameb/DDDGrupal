package co.com.sofkau.clinica.administracion.atencion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.atencion.values.PacienteId;
import co.com.sofkau.clinica.administracion.atencion.values.Telefono;

public class TelefonoPacienteCambiado extends DomainEvent {
    private final PacienteId pacienteId;
    private final Telefono telefono;

    public TelefonoPacienteCambiado(PacienteId pacienteId, Telefono telefono) {
        super("co.com.sofkau.clinica.administracion.atencion.events.TelefonoPacienteCambiado");
        this.pacienteId = pacienteId;
        this.telefono = telefono;
    }

    public PacienteId getPacienteId() {
        return pacienteId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
