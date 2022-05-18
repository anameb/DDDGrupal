package co.com.sofkau.clinica.administracion.atencion;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.archivo.values.Fecha;
import co.com.sofkau.clinica.administracion.atencion.values.Autorizacion;
import co.com.sofkau.clinica.administracion.atencion.values.CitaId;
import co.com.sofkau.clinica.administracion.atencion.values.TipoAtencion;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;

public class Cita extends Entity<CitaId> {
    protected Autorizacion autorizacion;
    protected Fecha fecha;
    protected TipoAtencion tipoAtencion;

    public Cita(CitaId citaId, Autorizacion autorizacion, Fecha fecha, TipoAtencion tipoAtencion) {
        super(citaId);
        this.autorizacion = autorizacion;
        this.fecha = fecha;
        this.tipoAtencion = tipoAtencion;
    }

    public void reagendarCita(Fecha fechaCambiar) {
        LocalDateTime now = LocalDateTime.now();
        if (fechaCambiar.value().hora().isBefore(now)) {
            throw  new IllegalArgumentException("La fecha no es correcta");
        }
        this.fecha = fechaCambiar;
    }




}
