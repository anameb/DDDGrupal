package co.com.sofkau.clinica.administracion.atencion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.clinica.administracion.atencion.values.AtencionId;
import co.com.sofkau.clinica.administracion.atencion.values.PacienteId;
import co.com.sofkau.clinica.administracion.atencion.values.Telefono;

public class CambiarTelefonoPaciente extends Command {

    private final PacienteId pacienteId;
    private final Telefono telefono;
    private final AtencionId atencionId;

    public CambiarTelefonoPaciente(PacienteId pacienteId, Telefono telefono, AtencionId atencionId) {
        this.pacienteId = pacienteId;
        this.telefono = telefono;
        this.atencionId = atencionId;
    }

    public PacienteId getPacienteId() {
        return pacienteId;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public AtencionId getAtencionId() {
        return atencionId;
    }
}
