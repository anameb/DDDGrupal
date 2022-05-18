package co.com.sofkau.clinica.administracion.consultorio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.consultorio.values.Especialidad;
import co.com.sofkau.clinica.administracion.consultorio.values.MedicoId;
import co.com.sofkau.clinica.administracion.consultorio.values.Nombre;
import co.com.sofkau.clinica.administracion.consultorio.values.Telefono;

public class MedicoAsignado extends DomainEvent {
    private final MedicoId medicoId;
    private final Nombre nombre;
    private final Telefono telefono;
    private final Especialidad especialidad;

    public MedicoAsignado(MedicoId medicoId, Nombre nombre, Telefono telefono, Especialidad especialidad) {
        super("co.com.sofkau.clinica.administracion.events.MedicoAsignado");
        this.medicoId = medicoId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public MedicoId getMedicoId() {
        return medicoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono(){
        return telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }
}
