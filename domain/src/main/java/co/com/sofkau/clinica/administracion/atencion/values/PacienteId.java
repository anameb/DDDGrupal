package co.com.sofkau.clinica.administracion.atencion.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofkau.clinica.administracion.consultorio.values.MedicoId;

public class PacienteId extends Identity {
    public PacienteId(String id){
        super(id);
    }

    public PacienteId() {
    }

    public static PacienteId of(String id){
        return new PacienteId(id);
    }
}
