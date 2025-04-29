package com.examen.capitulo_04;

import java.util.Arrays;

public class MathApi {

    public static void main(String[] args) {

        // Math esta en el paquete java.lang -> todos los paquetes pertenecientes a java lang estan incluidos automaticamente.
        double one = Math.pow(1, 2); //pow regresa un double

        // int two =  Math.round(1,0); // round regresa un long
        double  two =  Math.round(1.0);
        // float three = Math.random(); // random regresa un double
        double three = Math.random();

        var doubles= new double[] {one, two, three};


        Arrays.stream(doubles).forEach(System.out::println);
    }
}
