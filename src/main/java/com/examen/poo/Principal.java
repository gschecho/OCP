package com.examen.poo;

public class Principal {
    public static void main(String[] args) {
        Pato pat1 = new Pato();
        Pato pat2 = new Pato();

        pat1.nombre = "Lucas";
        pat1.edad = 4;

        pat2.nombre = "Lucas";
        pat2.edad = 4;


        //
        System.out.println(pat1.equals(pat2));

    }
}
