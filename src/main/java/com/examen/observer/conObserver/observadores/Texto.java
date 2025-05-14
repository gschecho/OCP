package com.examen.observer.conObserver.observadores;

import com.examen.observer.conObserver.subject.Subject;

public class Texto extends Observer{

    String texto;

    public Texto(String texto, Subject subject) {

        super(subject);
        this.texto = texto;
    }

    public void mostrarTexto(){
        System.out.println("Mostrar: " + texto);
    }

    @Override
    public void update() {
        mostrarTexto();
    }
}
