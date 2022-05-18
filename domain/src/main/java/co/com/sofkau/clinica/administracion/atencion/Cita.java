package co.com.sofkau.clinica.administracion.atencion;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.atencion.values.Autorizacion;
import co.com.sofkau.clinica.administracion.atencion.values.CitaId;
import co.com.sofkau.clinica.administracion.atencion.values.TipoAtencion;

public class Cita extends Entity<CitaId> {
    protected Autorizacion autorizacion;
    //protected Fecha fecha;
    protected TipoAtencion tipoAtencion;

    public Cita(CitaId citaId, Autorizacion autorizacion,/* Fecha fecha,*/ TipoAtencion tipoAtencion) {
        super(citaId);
        this.autorizacion = autorizacion;
        /*this.fecha = fecha;*/
        this.tipoAtencion = tipoAtencion;
    }

}
