package com.examen.interfaceAbsPolimorfismo;


import com.examen.interfacePolimorfismo.Operacion;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        com.examen.interfacePolimorfismo.Operacion op1 = new Suma(8,4);
        com.examen.interfacePolimorfismo.Operacion op2 = new Resta(8,4);
        com.examen.interfacePolimorfismo.Operacion op3 = new Multiplicacion(8,4);
        com.examen.interfacePolimorfismo.Operacion op4 = new Division(8,3);

        List<com.examen.interfacePolimorfismo.Operacion> operaciones = new ArrayList<>();

        operaciones.add(op1);
        operaciones.add(op2);
        operaciones.add(op3);
        operaciones.add(op4);

        for(Operacion op: operaciones ){
            System.out.println(op);
            System.out.println(op.ejecutar());
        }

    }
}
