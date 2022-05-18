package co.com.sofkau.clinica.administracion.atencion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.clinica.administracion.atencion.Paciente;
import co.com.sofkau.clinica.administracion.atencion.values.Telefono;
import co.com.sofkau.clinica.administracion.consultorio.values.Nombre;
import co.com.sofkau.clinica.administracion.atencion.values.PacienteId;

public class AsignarPaciente extends Command {

    private final PacienteId pacienteId;
    private final Nombre nombre;
    private final Telefono telefono;

    public AsignarPaciente(PacienteId pacienteId, Nombre nombre, Telefono telefono) {
        this.pacienteId = pacienteId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public PacienteId getPacienteId() {
        return pacienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
