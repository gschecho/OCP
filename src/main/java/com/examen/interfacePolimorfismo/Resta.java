package com.examen.interfacePolimorfismo;

public class Resta implements Operacion {

    int x;
    int y;

    public Resta(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int ejecutar(){
        return x - y;
    }


    @Override
    public String toString() {
        return "Resta{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
