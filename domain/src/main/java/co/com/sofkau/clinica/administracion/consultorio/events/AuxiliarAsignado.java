package co.com.sofkau.clinica.administracion.consultorio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.consultorio.values.AuxiliarId;
import co.com.sofkau.clinica.administracion.consultorio.values.Nombre;
import co.com.sofkau.clinica.administracion.consultorio.values.Telefono;

public class AuxiliarAsignado extends DomainEvent {

    private final AuxiliarId auxiliarId;
    private final Nombre nombre;

    private final Telefono telefono;

    public AuxiliarAsignado(AuxiliarId auxiliarId, Nombre nombre, Telefono telefono) {
        super("co.com.sofkau.clinica.administracion.events.MedicoAsignado");
        this.auxiliarId = auxiliarId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public AuxiliarId getAuxiliarId() {
        return auxiliarId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono(){
        return telefono;
    }
}
