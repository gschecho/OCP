package com.examen.inyeccionDependencias.constructor.setter;

public class Becario {

    private String nombre;


   private Pc myPc;


    public Becario(String nombre, Pc myPc) {
        this.nombre = nombre;
        this.myPc = myPc;
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
