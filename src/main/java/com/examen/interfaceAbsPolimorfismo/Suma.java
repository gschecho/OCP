package com.examen.interfaceAbsPolimorfismo;


import com.examen.interfacePolimorfismo.Operacion;

public class Suma extends OperacionAbs implements Operacion {
    public Suma(int x, int y) {
        super(x, y);
    }
    @Override
    public int ejecutar(){
        return x+y;
    }
}
