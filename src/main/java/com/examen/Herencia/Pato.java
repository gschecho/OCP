package com.examen.Herencia;

public class Pato extends Ave{

    Pato(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public String toString(){
        return "nombre: "+nombre +" - "+"edad: " + edad;
    }

}
