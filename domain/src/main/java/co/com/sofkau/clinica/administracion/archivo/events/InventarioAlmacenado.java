package co.com.sofkau.clinica.administracion.archivo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.clinica.administracion.archivo.values.Insumo;
import co.com.sofkau.clinica.administracion.archivo.values.InventarioId;

public class InventarioAlmacenado extends DomainEvent {

    private final InventarioId inventarioId;
    private final Insumo insumo;

    public InventarioAlmacenado(InventarioId inventarioId, Insumo insumo) {
        super("co.com.sofkau.clinica.InventarioAlmacenada");
        this.inventarioId = inventarioId;
        this.insumo = insumo;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }

    public Insumo getInsumo() {
        return insumo;
    }
}
