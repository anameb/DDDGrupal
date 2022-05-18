package co.com.sofkau.clinica.administracion;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.values.MedicoId;

public class Medico extends Entity<MedicoId> {

    public Medico(MedicoId medicoId) {
        super(medicoId);
    }
}
