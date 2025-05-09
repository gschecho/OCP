package com.examen.polimorfismo;

public class Multiplicacion extends Operacion{

    public Multiplicacion(int x, int y) {
        super(x, y);
    }

    @Override
    int ejecutar(){
        return x * y;
    }


}
