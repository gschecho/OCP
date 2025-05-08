package com.examen.singleton;

public class Conexion {

    private String nombre;
    static int contdor;

    Conexion(String nombre){
        this.nombre = nombre;
        contdor++;
    }
}
