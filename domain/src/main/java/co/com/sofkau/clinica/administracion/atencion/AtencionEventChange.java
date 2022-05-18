package co.com.sofkau.clinica.administracion.atencion;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.clinica.administracion.atencion.events.AtencionCreado;
import co.com.sofkau.clinica.administracion.atencion.events.CitaCreada;
import co.com.sofkau.clinica.administracion.atencion.events.PacienteCreado;

public class AtencionEventChange  extends EventChange {

    public AtencionEventChange(Atencion atencion) {
        apply((AtencionCreado event) -> {
            atencion.cita = event.getCita();
            atencion.paciente = event.getPaciente();
        });

        apply((PacienteCreado event) -> {
            var pacienteId = event.getPacienteId();
            var paciente = new Paciente(pacienteId, event.getNombre(), event.getTelefono());
            if (!(paciente instanceof Paciente)) {
                throw new IllegalArgumentException("No es un paciente");
            }
            atencion.paciente = paciente;


        });

        apply((CitaCreada event) -> {
            var citaId = event.getCitaId();
            var cita = new Cita(citaId, event.getAutorizacion(),event.getFecha(), event.getTipoAtencion());
            if (!(cita instanceof Cita)) {
                throw new IllegalArgumentException("No es una cita");
            }
            atencion.cita = cita;

        });
    }

}
