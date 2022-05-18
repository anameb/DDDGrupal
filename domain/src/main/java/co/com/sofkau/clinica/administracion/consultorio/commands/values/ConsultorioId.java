package co.com.sofkau.clinica.administracion.consultorio.commands.values;

import co.com.sofka.domain.generic.Identity;

public class ConsultorioId extends Identity {

    public ConsultorioId(String id){
        super(id);
    }

    public static ConsultorioId of(String id){
        return new ConsultorioId(id);
    }
}
