package com.examen.inyeccionDependencias;

public class Becario {

    private String nombre;

    // Define su propia pc.. alto acoplamiento
    PcWindows myPc;

    //Para cambiar a otra pc debemos ir clase a clase cambiando el pc
    //Esto lo soluciona el patron de inyección de depensencias.

    public Becario(String nombre) {
        this.nombre = nombre;
    }


    void encenderPc(){
        System.out.println(nombre);
        myPc = new PcWindows("Windows 10");
        myPc.encender();
    }
}
