package com.examen.composite;

public class Multi extends ExpresionBinaria{

    Multi(Expresion izquierda, Expresion derecha) {
    super(izquierda, derecha);
    }

    @Override
    public double getValor() {
        return this.izquierda.getValor() * this.derecha.getValor();
    }
}
