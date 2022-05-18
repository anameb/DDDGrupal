package co.com.sofkau.clinica.administracion.atencion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Autorizacion implements ValueObject<String> {
    private final String descripcion;

    public Autorizacion(String value) {
        this.descripcion = Objects.requireNonNull(value);;
    }

    @Override
    public String value() {
        return descripcion;
    }
}
