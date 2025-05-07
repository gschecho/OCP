package com.examen.funcional;

import com.examen.funcional.entities.Empleado;
import com.examen.funcional.interfaces.PredicadoEmpleado;

import java.util.ArrayList;
import java.util.List;

public class Tema_Lambdas {


    public static void main(String[] args) {



        List<Empleado> listaEmpleados= new ArrayList<>();

        listaEmpleados.add(new Empleado("José", 21));
        listaEmpleados.add(new Empleado("Armando", 18));

        System.out.println(listaEmpleados.get(0).getEdad());

        PredicadoEmpleado i = atributo -> atributo.getEdad() > 20;

        boolean resultado =  i.probar(listaEmpleados.get(0));

        System.out.println(resultado);



    }


}
