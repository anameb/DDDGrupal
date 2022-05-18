package co.com.sofkau.clinica.administracion.archivo;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.clinica.administracion.archivo.events.HistoriaAlmacenada;

import java.util.HashSet;

public class ArchivoEventChange extends EventChange {

    public ArchivoEventChange(Archivo archivo) {
        apply((HistoriaAlmacenada event) ->{
            archivo.historias = new HashSet<>();
            archivo.inventarios = new HashSet<>();
        });
    }
}
