package co.com.sofkau.clinica.administracion.archivo.values;

import co.com.sofka.domain.generic.ValueObject;

public class Evolucion implements ValueObject<String> {
    private final String value;

    public Evolucion(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}

