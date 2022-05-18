package co.com.sofkau.clinica.administracion.archivo.values;

import co.com.sofka.domain.generic.Identity;

public class HistoriaId extends Identity {
    public HistoriaId(String id){
        super(id);
    }
    public static HistoriaId of(String id) {
        return new HistoriaId(id);
    }

    public HistoriaId() {
    }
}
