package com.examen.Herencia;

public class Ave {
    String nombre;
    int edad;

    void volar(){
        System.out.println("No puedo volar");
    };

    Ave(String nombre, int edad){
        this.edad = edad;
        this.nombre = nombre;
    }
}
