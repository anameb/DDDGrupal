package co.com.sofkau.clinica.administracion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.values.AuxiliarId;
import co.com.sofkau.clinica.administracion.values.Nombre;

public class AuxiliarAsignado extends DomainEvent {

    private final AuxiliarId auxiliarId;
    private final Nombre nombre;

    public AuxiliarAsignado(AuxiliarId auxiliarId, Nombre nombre) {
        super("co.com.sofkau.clinica.administracion.events.MedicoAsignado");
        this.auxiliarId = auxiliarId;
        this.nombre = nombre;
    }

    public AuxiliarId getAuxiliarId() {
        return auxiliarId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}