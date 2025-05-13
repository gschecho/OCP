package com.examen.composite;

public class Suma extends ExpresionBinaria{

    Suma(Expresion izquierda, Expresion derecha) {
        super(izquierda,derecha);

    }

    @Override
    public double getValor() {
        return this.izquierda.getValor() + this.derecha.getValor();
    }
}
