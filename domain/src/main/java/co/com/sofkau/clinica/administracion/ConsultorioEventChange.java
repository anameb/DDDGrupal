package co.com.sofkau.clinica.administracion;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.clinica.administracion.events.ConsultorioCreado;
import co.com.sofkau.clinica.administracion.events.MedicoAsignado;

public class ConsultorioEventChange extends EventChange {
    public ConsultorioEventChange(Consultorio consultorio) {
        apply((ConsultorioCreado event)->{
            consultorio.medico = event.getMedico();
            consultorio.auxiliar = event.getAuxiliar();
            consultorio.pacienteId = event.getPacienteId();
        });

        apply((MedicoAsignado event) -> {
            var medicoId = event.getMedicoId();
            var medico = new Medico(medicoId, event.getNombre(), event.getEspecialidad());
            consultorio.medico = medico;
        });
    }
}
