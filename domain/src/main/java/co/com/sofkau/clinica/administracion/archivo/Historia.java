package co.com.sofkau.clinica.administracion.archivo;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.archivo.values.Evolucion;
import co.com.sofkau.clinica.administracion.archivo.values.Fecha;
import co.com.sofkau.clinica.administracion.archivo.values.HistoriaId;

public class Historia extends Entity<HistoriaId> {

    protected Evolucion evolucion;
    protected Fecha fecha;

    public Historia(HistoriaId entityId, Evolucion evolucion,Fecha fecha) {
        super(entityId);
        this.evolucion = evolucion;
        this.fecha = fecha;

    }

    public void agregarEvolucion(Evolucion evolucion){
        //TODO: validaciones
        this.evolucion = evolucion;
    }

}
