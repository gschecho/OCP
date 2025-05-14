package com.examen.observer.sinObserver;

public class Gif {

    String nombreGif;

    public Gif(String nombreGif) {
        this.nombreGif = nombreGif;
    }

    void moverGif(){
        System.out.println("Moviendo gif: " + nombreGif);
    }
}
