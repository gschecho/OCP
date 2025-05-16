package com.examen.inyeccionDependencias.variable;

public class Becario {

    private String nombre;

    // Definiendo la abstracción PC evita tener que saber e implementar que pc tiene
    Pc myPc;

    //Para cambiar a otra pc debemos ir clase a clase cambiando el pc
    //Esto lo soluciona el patron de inyección de depensencias.

    public Becario(String nombre) {
        this.nombre = nombre;
    }


    void encenderPc(){
        System.out.println(nombre);
        // Ya no debe crear la pc
        myPc.encender();
    }
}
