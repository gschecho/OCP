package com.examen.observer.sinObserver;

import java.awt.*;

public class Principal {
    public static void main(String[] args) {


        // ALTO ACOPLAMIENTO Mouse debe saber el contenido de las demás clases.
        Mouse mouse= new Mouse();
        Texto txt = new Texto("Hola Mundo");
        Imagen img =  new Imagen("imagen.jpg");
        Gif gif = new Gif("nombre.gif");

        mouse.txt = txt;
        mouse.img = img;

        mouse.click();



    }
}
