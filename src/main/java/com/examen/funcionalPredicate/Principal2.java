package com.examen.funcionalPredicate;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {

    public static void main(String[] args) {

        List<Empleado> listaEmpleados =  new ArrayList<>();

        listaEmpleados.add(  new Empleado("José", 23, 15.000) );
        listaEmpleados.add( new Empleado("Martín", 53, 45.000));
        listaEmpleados.add( new Empleado("Alvaro", 43, 35.000));
        listaEmpleados.add( new Empleado("Perdo", 33, 25.000));

        PredicadoEmpleado p =  x -> x.getEdad() > 30;

        mostrar(listaEmpleados, p);

        System.out.println( "Lambda directa, pasada como parámetro");
        mostrar(listaEmpleados, x -> x.getSueldo()> 30.000);


    }


    static void mostrar(List<Empleado> lista, PredicadoEmpleado p){
        for (Empleado e : lista){
            if(p.probar(e)){
                System.out.println(e);
            }
        }
    }
}
