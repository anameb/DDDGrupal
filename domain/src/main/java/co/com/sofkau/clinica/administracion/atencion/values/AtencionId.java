package co.com.sofkau.clinica.administracion.atencion.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofkau.clinica.administracion.atencion.Atencion;
import co.com.sofkau.clinica.administracion.consultorio.values.ConsultorioId;

public class AtencionId extends Identity {

    public AtencionId(String id){
        super(id);
    }

    public static AtencionId of(String id){
        return new AtencionId(id);
    }
}
