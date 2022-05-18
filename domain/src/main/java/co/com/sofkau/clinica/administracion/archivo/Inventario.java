package co.com.sofkau.clinica.administracion.archivo;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.archivo.values.Evolucion;
import co.com.sofkau.clinica.administracion.archivo.values.HistoriaId;
import co.com.sofkau.clinica.administracion.archivo.values.Insumo;
import co.com.sofkau.clinica.administracion.archivo.values.InventarioId;

import java.util.Set;

public class Inventario extends Entity<InventarioId> {

    protected Set<Insumo> insumos;
    private Inventario inventario;

    public Inventario(InventarioId entityId, Set<Insumo> insumos) {
        super(entityId);
        this.insumos = insumos;
    }

    public void crearInventario(Inventario inventario){
        //TODO: validaciones
        this.inventario = inventario;
    }
}
