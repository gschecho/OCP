package com.examen.agregacion_delegacion.composicion;

public class Banco {

    String nombre;

    public Banco(String nombre) {
        this.nombre = nombre;
    }

    boolean pagar(double cantidad){
        System.out.println("El banco" + nombre + " realizo el pado de: " + cantidad);
        return true;
    }


}
