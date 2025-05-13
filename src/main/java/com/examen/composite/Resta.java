package com.examen.composite;

public class Resta extends ExpresionBinaria{


    Resta(Expresion izquierda, Expresion derecha) {
     super(izquierda, derecha);
    }

    @Override
    public double getValor() {
        return this.izquierda.getValor() - this.derecha.getValor();
    }
}
