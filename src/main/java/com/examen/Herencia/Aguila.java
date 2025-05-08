package com.examen.Herencia;

public class Aguila extends Ave{

    Aguila(String nombre, int edad){
        super(nombre, edad);
    }


    @Override
    void volar(){
        System.out.println("PUEDO VOLAR");
    }
}
