package com.examen.composite;

public abstract class ExpresionBinaria implements Expresion {

    protected Expresion derecha;
    protected Expresion izquierda;


    public ExpresionBinaria(Expresion izquierda, Expresion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }
}
