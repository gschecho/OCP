package com.examen.strategy;

public class Pinguino extends Ave{
    String nombre;


    public Pinguino(String nombre) {
        super(nombre);
        cv = new NoVolar();

    }

}
