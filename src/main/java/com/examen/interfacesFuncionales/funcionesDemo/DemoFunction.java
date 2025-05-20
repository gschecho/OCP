package com.examen.interfacesFuncionales.funcionesDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import com.examen.interfacesFuncionales.Empleado;

public class DemoFunction {

    public static void main(String[] args) {

        List<com.examen.funcionalPredicate.Empleado> listaEmpleados =  new ArrayList<>();

        listaEmpleados.add(  new com.examen.funcionalPredicate.Empleado("José", 23, 15.000) );
        listaEmpleados.add( new com.examen.funcionalPredicate.Empleado("Martín", 53, 45.000));
        listaEmpleados.add( new com.examen.funcionalPredicate.Empleado("Alvaro", 43, 35.000));
        listaEmpleados.add( new com.examen.funcionalPredicate.Empleado("Perdo", 33, 25.000));


        //Function
        //Pasamos un T
        //Recivimos un R

        Function<String, Integer> fun1 = y -> y.length();
        int longitud = fun1.apply("Hola Mundo");
        System.out.println(longitud);


        Function<Empleado, String> fun2 = y -> y.getNombre();
        String nombre = fun2.apply(new Empleado("Julio", 23, 35000));
        System.out.println(nombre);


        Function<String, String> fun3 = z -> z  + " Mundo" ;
        System.out.println(fun3.apply("Hola"));

        System.out.println("..............................");

        // Pasa un parametro y devuelve uno del mismo tipo
        UnaryOperator<String> uo1 = z -> z + " Mundo";
        System.out.println(uo1.apply("Hola"));


        UnaryOperator<Empleado> uo2 = x -> { x.setSalario( x.getSalario() *1.10);
            return x;
        };

        //listaEmpleados.replaceAll(uo2);
        listaEmpleados.forEach(x -> System.out.println(x));


    }
}
