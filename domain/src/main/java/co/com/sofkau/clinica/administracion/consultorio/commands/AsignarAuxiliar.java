package co.com.sofkau.clinica.administracion.consultorio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.clinica.administracion.consultorio.values.AuxiliarId;
import co.com.sofkau.clinica.administracion.consultorio.values.Nombre;

public class AsignarAuxiliar extends Command {

    private final AuxiliarId auxiliarId;
    private final Nombre nombre;

    public AsignarAuxiliar(AuxiliarId auxiliarId, Nombre nombre) {
        this.auxiliarId = auxiliarId;
        this.nombre = nombre;
    }

    public AuxiliarId getAuxiliarId() {
        return auxiliarId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
