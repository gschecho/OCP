package com.examen.strategy;

public class Aguila extends Ave {

    String nombre;

    public Aguila(String nombre) {
        super(nombre);
        cv = new SiVolar();
    }

}
