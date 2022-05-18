package co.com.sofkau.clinica.administracion.atencion.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofkau.clinica.administracion.consultorio.values.MedicoId;

public class CitaId extends Identity {

    public CitaId(String id){
        super(id);
    }

    public CitaId() {
    }

    public static CitaId of(String id){
        return new CitaId(id);
    }
}
