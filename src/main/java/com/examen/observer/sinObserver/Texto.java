package com.examen.observer.sinObserver;

public class Texto {

    String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    void mostrarTexto(){
        System.out.println("Mostrar: " + texto);
    }
}
