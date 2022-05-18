package co.com.sofkau.clinica.administracion.consultorio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.consultorio.values.AuxiliarId;
import co.com.sofkau.clinica.administracion.consultorio.values.Telefono;

public class TelefonoAuxiliarCambiado extends DomainEvent {

    private final AuxiliarId auxiliarId;
    private final Telefono telefono;

    public TelefonoAuxiliarCambiado(AuxiliarId auxiliarId, Telefono telefono) {
        super("co.com.sofkau.clinica.administracion.consultorio.events.TelefonoAuxiliarCambiado");
        this.auxiliarId = auxiliarId;
        this.telefono = telefono;
    }

    public AuxiliarId getAuxiliarId() {
        return auxiliarId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
