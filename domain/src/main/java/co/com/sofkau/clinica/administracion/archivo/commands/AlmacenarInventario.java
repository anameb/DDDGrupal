package co.com.sofkau.clinica.administracion.archivo.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.clinica.administracion.archivo.values.ArchivoId;
import co.com.sofkau.clinica.administracion.archivo.values.Insumo;

public class AlmacenarInventario extends Command {

    private final ArchivoId archivoId;
    private final Insumo insumo;


    public AlmacenarInventario(ArchivoId archivoId, Insumo insumo) {
        this.archivoId = archivoId;
        this.insumo = insumo;
    }

    public ArchivoId getArchivoId() {
        return archivoId;
    }

    public Insumo getInsumo() {
        return insumo;
    }
}
