package co.com.sofkau.clinica.administracion.atencion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.atencion.Cita;
import co.com.sofkau.clinica.administracion.atencion.Paciente;

public class AtencionCreado extends DomainEvent {
    private Paciente paciente;
    private Cita cita;

    public AtencionCreado(Paciente paciente, Cita cita) {
        super("co.com.sofkau.clinica.administracion.atencion.events.AtencionCreado");
        this.paciente = paciente;
        this.cita = cita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Cita getCita() {
        return cita;
    }
}
