package co.com.sofkau.clinica.administracion.consultorio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.clinica.administracion.consultorio.values.AuxiliarId;
import co.com.sofkau.clinica.administracion.consultorio.values.ConsultorioId;
import co.com.sofkau.clinica.administracion.consultorio.values.MedicoId;
import co.com.sofkau.clinica.administracion.consultorio.values.Telefono;

public class CambiarTelefonoAuxiliar extends Command {

    private final AuxiliarId auxiliarId;
    private final Telefono telefono;
    private final ConsultorioId consultorioId;

    public CambiarTelefonoAuxiliar(AuxiliarId auxiliarId, Telefono telefono, ConsultorioId consultorioId) {
        this.auxiliarId = auxiliarId;
        this.telefono = telefono;
        this.consultorioId = consultorioId;
    }

    public AuxiliarId getAuxiliarId() {
        return auxiliarId;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public ConsultorioId getConsultorioId() {
        return consultorioId;
    }
}
