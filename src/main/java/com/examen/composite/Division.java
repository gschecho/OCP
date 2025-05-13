package com.examen.composite;

public class Division extends ExpresionBinaria{

    Division(Expresion izquierda, Expresion derecha) {

        super(izquierda, derecha);
    }

    @Override
    public double getValor() {
        if(this.izquierda.getValor() > 0 && this.derecha.getValor() >0)
        return this.izquierda.getValor() / this.derecha.getValor();
        else return 0;
    }
}
