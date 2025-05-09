package com.examen.strategy;

public abstract class Ave{

    String Nombre;

    //Delega en la interface ComportamientoVolar los

    ComportamientoVolar cv;


    public Ave(String nombre) {
        Nombre = nombre;
    }

    void volar(){
        cv.ejecutaVuelo();
 };

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "Nombre='" + Nombre + '\'' +
                '}';
    }
}
