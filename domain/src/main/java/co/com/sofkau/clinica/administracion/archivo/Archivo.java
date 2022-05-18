package co.com.sofkau.clinica.administracion.archivo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.clinica.administracion.archivo.values.ArchivoId;

import java.util.Set;

public class Archivo extends AggregateEvent<ArchivoId>{
    protected Set<Historia> historias;

    protected Set<Inventario> inventarios;

    public Archivo(ArchivoId entityId) {
        super(entityId);
    }
}
