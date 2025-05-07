package com.examen.funcional.entities;

public class Empleado {
    String name;
    int edad;

    public Empleado(String name, int edad){
        this.edad = edad;
        this.name = name;
    }

    public int getEdad(){
        return this.edad;
    }
}
