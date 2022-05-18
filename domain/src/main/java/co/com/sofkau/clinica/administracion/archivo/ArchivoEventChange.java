package co.com.sofkau.clinica.administracion.archivo;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.clinica.administracion.archivo.events.HistoriaAlmacenada;
import co.com.sofkau.clinica.administracion.archivo.events.InventarioAlmacenado;
import co.com.sofkau.clinica.administracion.archivo.values.Insumo;
import co.com.sofkau.clinica.administracion.consultorio.Auxiliar;

import java.util.HashSet;
import java.util.Set;

public class ArchivoEventChange extends EventChange {

    public ArchivoEventChange(Archivo archivo) {
        apply((HistoriaAlmacenada event) ->{
            archivo.historias = new HashSet<>();
            archivo.inventarios = new HashSet<>();
        });

        apply((InventarioAlmacenado event)->{
            var inventarioid = event.getInventarioId();
            var inventario = new Inventario(inventarioid, (Set<Insumo>) event.getInsumo());
            archivo.inventarios = (Set<Inventario>) inventario;
        });
    }
}
