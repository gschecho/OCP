package com.examen.strategy;

public class SiVolar implements ComportamientoVolar{

    @Override
    public void ejecutaVuelo() {
        System.out.println("Si puedo volar");
    }
}
