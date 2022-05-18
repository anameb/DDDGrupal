package co.com.sofkau.clinica.administracion.consultorio.commands.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.consultorio.commands.values.Especialidad;
import co.com.sofkau.clinica.administracion.consultorio.commands.values.MedicoId;
import co.com.sofkau.clinica.administracion.consultorio.commands.values.Nombre;

public class MedicoAsignado extends DomainEvent {
    private final MedicoId medicoId;
    private final Nombre nombre;
    private final Especialidad especialidad;

    public MedicoAsignado(MedicoId medicoId, Nombre nombre, Especialidad especialidad) {
        super("co.com.sofkau.clinica.administracion.events.MedicoAsignado");
        this.medicoId = medicoId;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public MedicoId getMedicoId() {
        return medicoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }
}
