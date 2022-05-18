package co.com.sofkau.clinica.administracion.archivo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.clinica.administracion.archivo.events.ArchivoCreado;
import co.com.sofkau.clinica.administracion.archivo.events.HistoriaAlmacenada;
import co.com.sofkau.clinica.administracion.archivo.values.*;

import java.util.Set;

public class Archivo extends AggregateEvent<ArchivoId>{

    protected Nombre nombre;
    protected Set<Historia> historias;

    protected Set<Inventario> inventarios;

    public Archivo(ArchivoId entityId, Nombre nombre) {
        super(entityId);
        appendChange(new ArchivoCreado(nombre)).apply();
        subscribe(new ArchivoEventChange(this));
    }

    public Archivo(ArchivoId entityId) {
        super(entityId);
        subscribe(new ArchivoEventChange(this));
    }

    public void AlmacenarHistoria(Evolucion evolucion, Fecha fecha){
        var historiaId = new HistoriaId();
        appendChange(new HistoriaAlmacenada(historiaId, evolucion, fecha)).apply();
    }

    public Nombre nombre(){
        return nombre;
    }
}
