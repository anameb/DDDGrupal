package co.com.sofkau.clinica.administracion.atencion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.atencion.Atencion;
import co.com.sofkau.clinica.administracion.atencion.Cita;
import co.com.sofkau.clinica.administracion.atencion.Paciente;
import co.com.sofkau.clinica.administracion.atencion.values.AtencionId;

public class AtencionCreado extends DomainEvent {

    private final AtencionId atencionId;
    private final Paciente paciente;
    private final Cita cita;

    public AtencionCreado(AtencionId atencionId, Paciente paciente, Cita cita) {
        super("co.com.sofkau.clinica.administracion.atencion.events.AtencionCreado");
        this.atencionId = atencionId;
        this.paciente = paciente;
        this.cita = cita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Cita getCita() {
        return cita;
    }

    public AtencionId getAtencionId() { return atencionId; }
}
