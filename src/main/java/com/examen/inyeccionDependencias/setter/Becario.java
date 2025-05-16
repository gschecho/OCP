package com.examen.inyeccionDependencias.setter;

public class Becario {

    private String nombre;

    // Definiendo la abstracción PC evita tener que saber e implementar que pc tiene
   private  Pc myPc;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pc getMyPc() {
        return myPc;
    }

    public void setMyPc(Pc myPc) {
        this.myPc = myPc;
    }
}
