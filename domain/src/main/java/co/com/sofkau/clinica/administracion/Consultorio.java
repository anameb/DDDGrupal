package co.com.sofkau.clinica.administracion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.events.ConsultorioCreado;
import co.com.sofkau.clinica.administracion.values.*;

import java.util.List;

public class Consultorio extends AggregateEvent<ConsultorioId> {
    protected Medico medico;
    protected Auxiliar auxiliar;
    protected PacienteId pacienteId;
    public Consultorio(ConsultorioId consultorioId, Medico medico, Auxiliar auxiliar, PacienteId pacienteId) {
        super(consultorioId);
        appendChange(new ConsultorioCreado(medico, auxiliar, pacienteId)).apply();
        subscribe(new ConsultorioEventChange(this));
    }

    private Consultorio(ConsultorioId consultorioId){
        super(consultorioId);
        subscribe(new ConsultorioEventChange(this));
    }

    public static Consultorio from(ConsultorioId consultorioId, List<DomainEvent> events){
        var consultorio = new Consultorio(consultorioId);
        events.forEach(consultorio::applyEvent);
        return consultorio;
    }
    public void asignarMedico(Nombre nombre, Especialidad especialidad){
        var medicoId = new MedicoId();
        appendChange(new MedicoAsignado(medicoId, nombre, especialidad));
    }

    public Medico medico() {
        return medico;
    }

    public Auxiliar auxiliar() {
        return auxiliar;
    }

    public PacienteId pacienteId() {
        return pacienteId;
    }
}
