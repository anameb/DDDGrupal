package co.com.sofkau.clinica.administracion.consultorio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.clinica.administracion.consultorio.Auxiliar;
import co.com.sofkau.clinica.administracion.consultorio.Medico;
import co.com.sofkau.clinica.administracion.consultorio.values.ConsultorioId;
import co.com.sofkau.clinica.administracion.consultorio.values.PacienteId;

public class CrearConsultorio extends Command {

    private final ConsultorioId consultorioId;
    private final Medico medico;
    private final Auxiliar auxiliar;
    private final PacienteId pacienteId;

    public CrearConsultorio(ConsultorioId consultorioId, Medico medico, Auxiliar auxiliar, PacienteId pacienteId) {
        this.consultorioId = consultorioId;
        this.medico = medico;
        this.auxiliar = auxiliar;
        this.pacienteId = pacienteId;
    }

    public ConsultorioId getConsultorioId() {
        return consultorioId;
    }

    public Medico getMedico() {
        return medico;
    }

    public Auxiliar getAuxiliar() {
        return auxiliar;
    }

    public PacienteId getPacienteId() {
        return pacienteId;
    }
}
