package com.examen.interfaceAbsPolimorfismo;

import com.examen.interfacePolimorfismo.Operacion;

public class Multiplicacion extends  OperacionAbs implements Operacion {


    public Multiplicacion(int x, int y) {
        super(x, y);
    }

    @Override
    public int ejecutar(){
        return x * y;
    }


}
