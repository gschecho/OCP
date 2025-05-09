package com.examen.interfaceAbsPolimorfismo;

import com.examen.interfacePolimorfismo.Operacion;

public class Resta extends OperacionAbs implements Operacion {

    public Resta(int x, int y) {
        super(x, y);
    }

    @Override
    public int ejecutar(){
        return x - y;
    }

}
