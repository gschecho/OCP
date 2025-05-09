package com.examen.interfaceAbsPolimorfismo;

public abstract class OperacionAbs implements Operacion {

    int x;
    int y;

    public OperacionAbs(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){

        return this.getClass().getSimpleName() + " x= "+this.x+" y= "+this.y;
    }
}
