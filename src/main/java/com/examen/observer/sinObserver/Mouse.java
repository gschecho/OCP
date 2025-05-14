package com.examen.observer.sinObserver;

public class Mouse {

    Texto txt;
    Imagen img;
    Gif gif;

     void click () {
         System.out.println("mouse click");
         txt.mostrarTexto();
         img.mostrarImagen();
         gif.moverGif();

     }
}

