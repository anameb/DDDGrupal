package co.com.sofkau.clinica.administracion.consultorio.values;

import co.com.sofka.domain.generic.Identity;

public class MedicoId extends Identity {

    public MedicoId(String id){
        super(id);
    }

    public MedicoId(){
    }
    public static MedicoId of(String id){
        return new MedicoId(id);
    }
}
