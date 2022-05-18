package co.com.sofkau.clinica.administracion.consultorio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.clinica.administracion.consultorio.values.ConsultorioId;
import co.com.sofkau.clinica.administracion.consultorio.values.MedicoId;
import co.com.sofkau.clinica.administracion.consultorio.values.Telefono;

public class CambiarTelefonoMedico extends Command {

    private final MedicoId medicoId;
    private final Telefono telefono;
    private final ConsultorioId consultorioId;

    public CambiarTelefonoMedico(ConsultorioId consultorioId, MedicoId medicoId, Telefono telefono){
        this.consultorioId = consultorioId;
        this.medicoId = medicoId;
        this.telefono = telefono;
    }

    public MedicoId getMedicoId() {
        return medicoId;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public ConsultorioId getConsultorioId() {
        return consultorioId;
    }
}
