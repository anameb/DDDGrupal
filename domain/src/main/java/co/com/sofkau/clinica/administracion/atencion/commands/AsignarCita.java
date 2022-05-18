package co.com.sofkau.clinica.administracion.atencion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.clinica.administracion.archivo.values.Fecha;
import co.com.sofkau.clinica.administracion.atencion.Cita;
import co.com.sofkau.clinica.administracion.atencion.values.Autorizacion;
import co.com.sofkau.clinica.administracion.atencion.values.CitaId;
import co.com.sofkau.clinica.administracion.atencion.values.TipoAtencion;

public class AsignarCita extends Command {

    private final CitaId citaId;
    private final Autorizacion autorizacion;
    private final Fecha fecha;
    private final TipoAtencion tipoAtencion;

    public AsignarCita(CitaId citaId, Autorizacion autorizacion, Fecha fecha, TipoAtencion tipoAtencion) {
        this.citaId = citaId;
        this.autorizacion = autorizacion;
        this.fecha = fecha;
        this.tipoAtencion = tipoAtencion;
    }

    public CitaId getCitaId() {
        return citaId;
    }

    public Autorizacion getAutorizacion() {
        return autorizacion;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public TipoAtencion getTipoAtencion() {
        return tipoAtencion;
    }
}
