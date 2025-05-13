package com.examen.composite;

public class Consonante implements Expresion{

    private double valor;

    public Consonante(double valor) {
        this.valor=valor;
    }

    @Override
    public double getValor() {
        return this.valor;
    }
}
