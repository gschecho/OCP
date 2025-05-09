package com.examen.polimorfismo;

public class Resta extends Operacion{

    public Resta(int x, int y) {
        super(x, y);
    }

    @Override
    int ejecutar(){
        return x - y;
    }


}
