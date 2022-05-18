package co.com.sofkau.clinica.administracion.consultorio;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.clinica.administracion.consultorio.events.AuxiliarAsignado;
import co.com.sofkau.clinica.administracion.consultorio.events.ConsultorioCreado;
import co.com.sofkau.clinica.administracion.consultorio.events.MedicoAsignado;
import co.com.sofkau.clinica.administracion.consultorio.events.TelefonoMedicoCambiado;
import co.com.sofkau.clinica.administracion.consultorio.values.Telefono;

public class ConsultorioEventChange extends EventChange {
    public ConsultorioEventChange(Consultorio consultorio) {
        apply((ConsultorioCreado event)->{
            consultorio.medico = event.getMedico();
            consultorio.auxiliar = event.getAuxiliar();
            consultorio.pacienteId = event.getPacienteId();
        });

        apply((MedicoAsignado event) -> {
            var medicoId = event.getMedicoId();
            var medico = new Medico(medicoId, event.getNombre(), event.getTelefono(), event.getEspecialidad());
            consultorio.medico = medico;
        });

        apply((AuxiliarAsignado event)->{
            var auxiliarId = event.getAuxiliarId();
            var auxiliar = new Auxiliar(auxiliarId, event.getNombre(), event.getTelefono());
            consultorio.auxiliar = auxiliar;
        });

        apply((TelefonoMedicoCambiado event) -> {
            var telefono = event.getTelefono();
            consultorio.medico.cambiarTelefono(telefono);
        });
    }
}
