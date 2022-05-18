package co.com.sofkau.clinica.administracion.consultorio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.consultorio.values.MedicoId;
import co.com.sofkau.clinica.administracion.consultorio.values.Telefono;

public class TelefonoMedicoCambiado extends DomainEvent {

    private final MedicoId medicoId;
    private final Telefono telefono;
    public TelefonoMedicoCambiado(MedicoId medicoId, Telefono telefono) {
        super("co.com.sofkau.clinica.administracion.consultorio.events.TelefonoMedicoCambiado");
        this.medicoId = medicoId;
        this.telefono = telefono;
    }

    public MedicoId getMedicoId() {
        return medicoId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
