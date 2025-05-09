package com.examen.agregacion_delegacion.composicion;

public class Cuenta {
    String clave;

    public Cuenta(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "clave='" + clave + '\'' +
                '}';
    }
}
