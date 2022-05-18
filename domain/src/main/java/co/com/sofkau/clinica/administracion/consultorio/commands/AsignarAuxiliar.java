package co.com.sofkau.clinica.administracion.consultorio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.clinica.administracion.consultorio.values.AuxiliarId;
import co.com.sofkau.clinica.administracion.consultorio.values.Nombre;
import co.com.sofkau.clinica.administracion.consultorio.values.Telefono;

public class AsignarAuxiliar extends Command {

    private final AuxiliarId auxiliarId;
    private final Nombre nombre;

    private final Telefono telefono;

    public AsignarAuxiliar(AuxiliarId auxiliarId, Nombre nombre, Telefono telefono) {
        this.auxiliarId = auxiliarId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public AuxiliarId getAuxiliarId() {
        return auxiliarId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono(){
        return telefono;
    }
}
