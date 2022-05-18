package co.com.sofkau.clinica.administracion.values;

import co.com.sofka.domain.generic.Identity;

public class AuxiliarId extends Identity {

    public AuxiliarId(String id){
        super(id);
    }

    public AuxiliarId(){
    }

    public static AuxiliarId of(String id){
        return new AuxiliarId(id);
    }
}
