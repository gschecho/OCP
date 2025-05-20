package com.examen.funcionalPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Principal4 {

    public static void main(String[] args) {


        //CON PREDICATE

        List<Empleado> listaEmpleados =  new ArrayList<>();

        listaEmpleados.add(  new Empleado("José", 23, 15.000) );
        listaEmpleados.add( new Empleado("Martín", 53, 45.000));
        listaEmpleados.add( new Empleado("Alvaro", 43, 35.000));
        listaEmpleados.add( new Empleado("Perdo", 33, 25.000));

        Predicate<Empleado> p = x-> x.getSueldo()> 30.00;
        Predicate<Empleado> p2 = x-> x.getEdad() > 30;
        //Predicado<Empleado> np = Predicado.negate(p);

        // DEFAULT
        Predicate<Empleado> np = p.negate();
        mostrar(listaEmpleados, np);
        System.out.println("---------------------------------------");

        Predicate<Empleado> and = p.and(p2);

        mostrar(listaEmpleados, and);

        System.out.println("-----------------------------------------\n");
        mostrar(listaEmpleados, p);

        System.out.println( "Lambda directa, pasada como parámetro");
        mostrar(listaEmpleados, x -> x.getSueldo()> 30.000);


        System.out.println("Regresa lo contrario de p");
          mostrar(listaEmpleados, p.negate());




    }

// Predicate de la api de java

    static void mostrar(List<Empleado> lista, Predicate<Empleado> p){
        for (Empleado e : lista){
            if(p.test(e)){
                System.out.println(e);
            }
        }
    }
}
