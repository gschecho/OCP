package com.examen.interfacePolimorfismo;

public class Multiplicacion implements Operacion {

int x;
int y;

    public Multiplicacion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int ejecutar(){
        return x * y;
    }

    @Override
    public String toString() {
        return "Multiplicacion{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
