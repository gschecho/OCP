package com.examen.interfacesFuncionales.funcionesDemo;

import com.examen.interfacesFuncionales.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DemoConsumer {
    public static void main(String[] args) {

        // Pasa un parametro
        // No devuelve nada
        Consumer<String> con1 = y -> System.out.println(y);
        con1.accept("Hola Mundo");

        Consumer<Empleado> con2 = z -> System.out.println(z);
        con2.accept(new Empleado("Amancio",53,55000));

        System.out.println("------------------------------------------------");

        List<com.examen.funcionalPredicate.Empleado> listaEmpleados =  new ArrayList<>();

        listaEmpleados.add(  new com.examen.funcionalPredicate.Empleado("José", 23, 15.000) );
        listaEmpleados.add( new com.examen.funcionalPredicate.Empleado("Martín", 53, 45.000));
        listaEmpleados.add( new com.examen.funcionalPredicate.Empleado("Alvaro", 43, 35.000));
        listaEmpleados.add( new com.examen.funcionalPredicate.Empleado("Perdo", 33, 25.000));

        //forEach recibe un consumer.
        listaEmpleados.forEach(x -> System.out.println(x));

    }
}
