package com.examen.interfacesFuncionales.funcionesDemo;

import com.examen.interfacesFuncionales.Empleado;

import java.util.function.Supplier;

public class DemoSupplier {

    public static void main(String[] args) {


        // No pasamos ningun parámetro
        //

        // No pasamos ningun parámetro y devuelve algo
        Supplier<String> sup1 = () -> "Hola mundo";
        String cadena = sup1.get();

        System.out.println(cadena);


        Supplier<Empleado> sup2 = ()-> new Empleado("Raúl", 35, 55000);
        Empleado emp = sup2.get();
        System.out.println(emp);

        Supplier<Double> valorRandom = ()-> Math.random();
        System.out.println(valorRandom.get());


    }
}
