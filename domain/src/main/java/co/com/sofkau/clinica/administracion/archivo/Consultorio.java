package co.com.sofkau.clinica.administracion.archivo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.clinica.administracion.archivo.values.PacienteId;

public class Consultorio extends AggregateEvent<ConsultorioId> {
    protected Medico medico;
    protected Auxiliar auxiliar;
    protected PacienteId pacienteId;
    public Consultorio(ConsultorioId consultorioId, Medico medico, Auxiliar auxiliar, PacienteId pacienteId) {
        super(consultorioId);
        appendChange(new ConsultorioCreado(medico, auxiliar, pacienteId)).apply();
    }
}
