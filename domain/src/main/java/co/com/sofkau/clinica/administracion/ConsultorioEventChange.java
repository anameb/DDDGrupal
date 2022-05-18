package co.com.sofkau.clinica.administracion;

import co.com.sofka.domain.generic.EventChange;

public class ConsultorioEventChange extends EventChange {
    public ConsultorioEventChange(Consultorio consultorio) {
        apply((ConsultorioCreado event)->{
            consultorio.medico = event.getMedico();
            consultorio.auxiliar = event.getAuxiliar();
            consultorio.pacienteId = event.getPacienteId();
        });
    }
}
