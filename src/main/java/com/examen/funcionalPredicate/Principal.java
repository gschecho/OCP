package com.examen.funcionalPredicate;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<Empleado> listaEmpleados =  new ArrayList<>();

        listaEmpleados.add(  new Empleado("José", 23, 15.000) );
        listaEmpleados.add( new Empleado("Martín", 53, 45.000));
                listaEmpleados.add( new Empleado("Alvaro", 43, 35.000));
                        listaEmpleados.add( new Empleado("Perdo", 33, 25.000));

        System.out.println(listaEmpleados);


        //Empleados mayores de 30
        // CLASE ANONIMA
        PredicadoEmpleado predicadoEmpleado = new PredicadoEmpleado() {
            @Override
            public boolean probar(Empleado e) {
                return e.getEdad() > 30;
            }
        };
        boolean resultado = predicadoEmpleado.probar(listaEmpleados.get(1));
        System.out.println(resultado);


        System.out.println("--------------------LAMBDA ---------------------");
        //CODIGO CONVERTIFO EN LAMBDA

        PredicadoEmpleado predicadoEmpleadoLambda = (e)-> e.getEdad() > 40;
        boolean resultado1 = predicadoEmpleadoLambda.probar(listaEmpleados.get(1));
        System.out.println(resultado1);

        System.out.println("--------------------LAMBDA ---------------------");

        for(Empleado e : listaEmpleados){
            if( predicadoEmpleadoLambda.probar(e)){
                System.out.println(e.getNombre() + " es mayor de 40");
            }else {
                System.out.println(e.getNombre() + " no es mayor de 40 ");
                    }


    }
    }
    }

