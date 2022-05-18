package co.com.sofkau.clinica.administracion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.clinica.administracion.values.Especialidad;
import co.com.sofkau.clinica.administracion.values.MedicoId;
import co.com.sofkau.clinica.administracion.values.Nombre;

public class AsignarMedico extends Command {

    private final MedicoId medicoId;
    private final Nombre nombre;
    private final Especialidad especialidad;

    public AsignarMedico(MedicoId medicoId, Nombre nombre, Especialidad especialidad) {
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
