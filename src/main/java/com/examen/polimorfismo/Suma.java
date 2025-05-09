package com.examen.polimorfismo;

public class Suma extends Operacion{

    public Suma(int x, int y) {
        super(x, y);
    }

    @Override
    int ejecutar(){
        return x+y;
    }


}
