package co.com.sofkau.clinica.administracion.atencion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.archivo.values.Fecha;
import co.com.sofkau.clinica.administracion.atencion.events.AtencionCreado;
import co.com.sofkau.clinica.administracion.atencion.events.CitaCreada;
import co.com.sofkau.clinica.administracion.atencion.events.PacienteCreado;
import co.com.sofkau.clinica.administracion.atencion.events.TelefonoPacienteCambiado;
import co.com.sofkau.clinica.administracion.atencion.values.*;
import co.com.sofkau.clinica.administracion.consultorio.ConsultorioEventChange;
import co.com.sofkau.clinica.administracion.consultorio.values.Nombre;

import java.util.List;

public class Atencion extends AggregateEvent<AtencionId> {
    protected Paciente paciente;
    protected Cita cita;

    public Atencion(AtencionId atencionId, Paciente paciente, Cita cita) {
        super(atencionId);
        appendChange(new AtencionCreado(atencionId, paciente, cita)).apply();
        subscribe(new AtencionEventChange(this));
    }

    private Atencion(AtencionId atencionId) {
        super(atencionId);
        subscribe(new AtencionEventChange(this));
    }

    public static Atencion from(AtencionId atencionId, List<DomainEvent> events) {
        var atencion = new Atencion(atencionId);
        events.forEach(atencion::applyEvent);
        return atencion;
    }

    public void asignarCita(Autorizacion autorizacion, Fecha fecha, TipoAtencion tipoAtencion) {
        var citaId = new CitaId();
        appendChange(new CitaCreada(citaId, fecha,autorizacion,  tipoAtencion));
    }

    public void asignarPaciente(Nombre nombre, Telefono telefono) {
        var pacienteId = new PacienteId();
        appendChange(new PacienteCreado(pacienteId, nombre, telefono));
    }

    public void cambiarTelefonoPaciente(PacienteId pacienteId, Telefono telefono){
        appendChange(new TelefonoPacienteCambiado(pacienteId, telefono)).apply();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Cita getCita() {
        return cita;
    }
}
