package com.examen.interfacePolimorfismo;

public class Division implements Operacion{

    int x;
    int y;

    public Division(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int ejecutar() {

        if(y != 0 ){
            return x/y;
        } else{
            System.out.println("No se puede dividir entre 0");
            throw new RuntimeException("No se puede dividir entre 0");
        }}


    @Override
    public String toString() {
        return "Division{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
