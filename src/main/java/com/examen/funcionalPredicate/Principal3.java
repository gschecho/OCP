package com.examen.funcionalPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Principal3 {

    public static void main(String[] args) {


        List<Empleado> listaEmpleados =  new ArrayList<>();

        listaEmpleados.add(  new Empleado("José", 23, 15.000) );
        listaEmpleados.add( new Empleado("Martín", 53, 45.000));
        listaEmpleados.add( new Empleado("Alvaro", 43, 35.000));
        listaEmpleados.add( new Empleado("Perdo", 33, 25.000));

        Predicado<Empleado> p = x-> x.getSueldo()> 30.00;
        Predicado<Empleado> p2 = x-> x.getEdad() > 30;
        Predicado<Empleado> np = Predicado.negate(p);

        Predicado<Empleado> and = Predicado.and(p, p2);

        mostrar(listaEmpleados, and);

        System.out.println("-----------------------------------------\n");
        mostrar(listaEmpleados, p);

        System.out.println( "Lambda directa, pasada como parámetro");
        mostrar(listaEmpleados, x -> x.getSueldo()> 30.000);

        //TEST

        System.out.println("Estárico");

        //Para el metodo estático solo necesitamos importar la interface
        Predicado.probarstatic();

        //Para el método default necesitamos una instancia
        p.probarDefault();


        //Regresar una lambda, función de orden superior
        Predicado<Empleado> pr = Predicado.returnPredicate();


        System.out.println("Regresa lo contrario de p");
        mostrar(listaEmpleados, Predicado.negate(p));




    }

// Predicate de la api de java

    static void mostrar(List<Empleado> lista, Predicado<Empleado> p){
        for (Empleado e : lista){
            if(p.probar(e)){
                System.out.println(e);
            }
        }
    }
}
