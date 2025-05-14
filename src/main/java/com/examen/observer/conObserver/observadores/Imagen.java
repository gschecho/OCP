package com.examen.observer.conObserver.observadores;

import com.examen.observer.conObserver.subject.Subject;

public class Imagen extends Observer {

    String nombreImg;

    public Imagen(String nombreImg, Subject subject) {

        super(subject);
        this.nombreImg = nombreImg;
    }

    public void mostrarImagen(){
        System.out.println("Mostrar imagen: " + nombreImg);
    }

    @Override
    public void update() {
        mostrarImagen();
    }
}
