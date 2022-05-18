package co.com.sofkau.clinica.administracion.archivo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.archivo.values.Nombre;

public class ArchivoCreado extends DomainEvent{

    private final Nombre nombre;

    public ArchivoCreado(Nombre nombre) {
        super("co.com.sofkau.clinica.administracion.archivo.ArchivoCreado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
