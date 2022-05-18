package co.com.sofkau.clinica.administracion.consultorio.commands.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PacienteId implements ValueObject<Integer> {

    private final Integer value;

    public PacienteId(Integer value) {
        this.value = Objects.requireNonNull(value);
    }

    public Integer value() {
        return value;
    }
}
