package com.examen.observer.conObserver.observadores;

import com.examen.observer.conObserver.subject.Subject;

public class Gif extends Observer {

    String nombreGif;

    public Gif(String nombreGif, Subject subject) {
        super(subject);
        this.nombreGif = nombreGif;
    }

    public void moverGif(){
        System.out.println("Moviendo gif: " + nombreGif);
    }

    @Override
    public void update() {
        moverGif();
    }
}
