package co.com.sofkau.clinica.administracion.atencion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.archivo.values.Fecha;
import co.com.sofkau.clinica.administracion.atencion.values.Autorizacion;
import co.com.sofkau.clinica.administracion.atencion.values.CitaId;
import co.com.sofkau.clinica.administracion.atencion.values.TipoAtencion;

public class CitaCreada extends DomainEvent {

    private final CitaId citaId;
    private final Fecha fecha;
    private final Autorizacion autorizacion;
    private final TipoAtencion tipoAtencion;

    public CitaCreada (CitaId citaId, Fecha fecha, Autorizacion autorizacion, TipoAtencion tipoAtencion) {
        super("co.com.sofkau.clinica.administracion.atencion.events.CitaCreada");
        this.citaId = citaId;
        this.fecha = fecha;
        this.autorizacion = autorizacion;
        this.tipoAtencion = tipoAtencion;
    }


    public CitaId getCitaId() {
        return citaId;
    }

    public Autorizacion getAutorizacion() {
        return autorizacion;
    }

    public TipoAtencion getTipoAtencion() {
        return tipoAtencion;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
