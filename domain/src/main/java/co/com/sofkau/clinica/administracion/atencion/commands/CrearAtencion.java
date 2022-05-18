package co.com.sofkau.clinica.administracion.atencion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.clinica.administracion.atencion.Cita;
import co.com.sofkau.clinica.administracion.atencion.Paciente;
import co.com.sofkau.clinica.administracion.atencion.values.AtencionId;

public class CrearAtencion extends Command {
    private final AtencionId atencionId;
    private final Paciente paciente;
    private final Cita cita;

    public CrearAtencion(AtencionId atencionId, Paciente paciente, Cita cita) {
        this.atencionId = atencionId;
        this.paciente = paciente;
        this.cita = cita;
    }

    public AtencionId getAtencionId() {
        return atencionId;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Cita getCita() {
        return cita;
    }
}
