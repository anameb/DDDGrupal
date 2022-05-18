package co.com.sofkau.clinica.administracion.archivo.values;

import co.com.sofka.domain.generic.Identity;

public class ArchivoId extends Identity {
    public ArchivoId(String id){
        super(id);
    }
    public static ArchivoId of(String id) {
        return new ArchivoId(id);
    }
}

