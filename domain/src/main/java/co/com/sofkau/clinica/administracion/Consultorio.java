package co.com.sofkau.clinica.administracion;

import co.com.sofka.domain.generic.AggregateEvent;

public class Consultorio extends AggregateEvent<ConsultorioId> {
    protected Medico medico;
    protected Auxiliar auxiliar;
    protected PacienteId pacienteId;
    public Consultorio(ConsultorioId consultorioId, Medico medico) {
        super(consultorioId);
    }
}
