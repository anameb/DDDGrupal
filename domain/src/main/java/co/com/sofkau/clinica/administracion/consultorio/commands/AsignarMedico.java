package co.com.sofkau.clinica.administracion.consultorio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.clinica.administracion.consultorio.values.Especialidad;
import co.com.sofkau.clinica.administracion.consultorio.values.MedicoId;
import co.com.sofkau.clinica.administracion.consultorio.values.Nombre;
import co.com.sofkau.clinica.administracion.consultorio.values.Telefono;

public class AsignarMedico extends Command {

    private final MedicoId medicoId;
    private final Nombre nombre;
    private final Telefono telefono;
    private final Especialidad especialidad;

    public AsignarMedico(MedicoId medicoId, Nombre nombre, Telefono telefono, Especialidad especialidad) {
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
