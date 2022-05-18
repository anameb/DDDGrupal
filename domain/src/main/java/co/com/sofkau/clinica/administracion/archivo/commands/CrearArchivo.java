package co.com.sofkau.clinica.administracion.archivo.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.clinica.administracion.archivo.values.ArchivoId;
import co.com.sofkau.clinica.administracion.archivo.values.Nombre;

public class CrearArchivo extends Command {

    private final ArchivoId archivoId;

    private final Nombre nombre;

    public CrearArchivo(ArchivoId archivoId, Nombre nombre) {
        this.archivoId = archivoId;
        this.nombre = nombre;
    }

    public ArchivoId getArchivoId() {
        return archivoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
