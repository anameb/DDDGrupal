package co.com.sofkau.clinica.administracion.archivo.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.clinica.administracion.archivo.values.ArchivoId;
import co.com.sofkau.clinica.administracion.archivo.values.Evolucion;
import co.com.sofkau.clinica.administracion.archivo.values.Fecha;

public class AlmacenarHistoria extends Command {
    private final ArchivoId archivoId;
    private final Evolucion evolucion;
    private final Fecha fecha;


    public AlmacenarHistoria(ArchivoId archivoId, Evolucion evolucion, Fecha fecha) {
        this.archivoId = archivoId;
        this.evolucion = evolucion;
        this.fecha = fecha;
    }

    public ArchivoId getHistoriaId() {
        return archivoId;
    }

    public Evolucion getEvolucion() {
        return evolucion;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
