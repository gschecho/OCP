package com.examen.Herencia;

public class Principal {


    public static void main(String[] args) {

        Pato pato1 = new Pato("Lucas", 4);
        pato1.volar();

        System.out.println(pato1.nombre);
        System.out.println(pato1.edad);

        System.out.println(pato1);

        Aguila aguila1= new Aguila("America", 25);
        aguila1.volar();

        System.out.println(aguila1.nombre);
        System.out.println(aguila1.edad);

        System.out.println(aguila1.toString());
    }
}
