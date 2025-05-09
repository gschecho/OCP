package com.examen.polimorfismo;

public  abstract class Operacion {

    int x;
    int y;

    public Operacion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract int ejecutar();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +"{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
