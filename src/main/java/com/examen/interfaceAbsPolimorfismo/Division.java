package com.examen.interfaceAbsPolimorfismo;

import com.examen.interfacePolimorfismo.Operacion;

public class Division extends OperacionAbs implements Operacion {

    public Division(int x, int y) {
        super(x, y);
    }

    @Override
    public int ejecutar() {

        if(y != 0 ){
            return x/y;
        } else{
            System.out.println("No se puede dividir entre 0");
            throw new RuntimeException("No se puede dividir entre 0");
        }}

}
