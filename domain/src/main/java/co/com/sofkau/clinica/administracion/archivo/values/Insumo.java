package co.com.sofkau.clinica.administracion.archivo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Insumo  implements ValueObject<String> {

    private final String value;
    public Insumo(String value) {
        //TODO: validacions
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
