package co.com.sofkau.clinica.administracion;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.values.PacienteId;

public class ConsultorioCreado extends DomainEvent {
    private final Medico medico;
    private final Auxiliar auxiliar;
    private final PacienteId pacienteId;
    public ConsultorioCreado(Medico medico, Auxiliar auxiliar, PacienteId pacienteId) {
        super("co.com.sofkau.clinica.administracion.ConsultorioCreado");
        this.medico = medico;
        this.auxiliar = auxiliar;
        this.pacienteId = pacienteId;
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
