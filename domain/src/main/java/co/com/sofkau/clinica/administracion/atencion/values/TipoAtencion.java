package co.com.sofkau.clinica.administracion.atencion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoAtencion implements ValueObject<TipoAtencion.Tipos> {
    private final Tipos value;

    public TipoAtencion(Tipos value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Tipos value() {
        return value;
    }

    public enum Tipos {
        VALORACION, PROCEDIMIENTO, URGENCIA
    }
}
