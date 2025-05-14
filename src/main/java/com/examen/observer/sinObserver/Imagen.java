package com.examen.observer.sinObserver;

public class Imagen {

    String nombreImg;

    public Imagen(String nombreImg) {
        this.nombreImg = nombreImg;
    }

    void mostrarImagen(){
        System.out.println("Mostrar imagen: " + nombreImg);
    }

}
