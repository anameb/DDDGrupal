package co.com.sofkau.clinica.administracion.atencion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.clinica.administracion.atencion.events.AtencionCreado;
import co.com.sofkau.clinica.administracion.atencion.values.AtencionId;

public class Atencion extends AggregateEvent<AtencionId> {
    protected Paciente paciente;
    protected Cita cita;

    public Atencion(AtencionId atencionId, Paciente paciente, Cita cita) {
        super(atencionId);
        appendChange(new AtencionCreado(paciente, cita)).apply();
        subscribe(new AtencionEventChange(this));
    }
}
