package co.com.sofkau.clinica.administracion.archivo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.archivo.values.Evolucion;
import co.com.sofkau.clinica.administracion.archivo.values.Fecha;
import co.com.sofkau.clinica.administracion.archivo.values.HistoriaId;

public class HistoriaAlmacenada extends DomainEvent {

    private final HistoriaId historiaId;
    private final Evolucion evolucion;
    private final Fecha fecha;

    public HistoriaAlmacenada(HistoriaId historiaId, Evolucion evolucion, Fecha fecha) {
        super("co.com.sofkau.clinica.HistoriaAlmacenada");
        this.historiaId = historiaId;
        this.evolucion = evolucion;
        this.fecha = fecha;
    }

    public HistoriaId getHistoriaId() {
        return historiaId;
    }

    public Evolucion getEvolucion() {
        return evolucion;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
