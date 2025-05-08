package com.examen.poo;

public class Pato extends Object{

    //Atributos
    String nombre;
    int edad;
    //Constructores
    //comportamiento Método

    @Override
    public boolean equals(Object obj){

        Pato other = (Pato) obj;
        if(nombre.equals(other.nombre))
            return true;
        else
            return false;
    }
}
