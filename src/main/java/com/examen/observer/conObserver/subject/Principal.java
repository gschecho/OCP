package com.examen.observer.conObserver.subject;

import com.examen.observer.conObserver.observadores.Gif;
import com.examen.observer.conObserver.observadores.Imagen;
import com.examen.observer.conObserver.observadores.ScrollBar;
import com.examen.observer.conObserver.observadores.Texto;

public class Principal {
    public static void main(String[] args) {


        // AHORA NO TIENE CASI ACOPLAMIENTO MOUSE NO SABE LO QUE TIENEN LOS OBSERVERS
        Mouse mouse= new Mouse();
        Texto txt = new Texto("Hola Mundo", mouse);
        Imagen img =  new Imagen("imagen.jpg", mouse );
        Gif gif = new Gif("nombre.gif", mouse);

        ScrollBar scroll =  new ScrollBar(mouse);


        // MOUSE NO SABE LA CANTIDAD DE OBSERVADORES QUE HAY LE VIENE DADO POR LA CLASE SUBJECT QUE CONTIENE LA LISTA DE LOS MISMOS
        //
/*
        mouse.attach(txt);
        mouse.attach(img);
        mouse.attach(gif);
        mouse.attach(scroll);
        mouse.detach(txt);
        */

        mouse.click();
        mouse.detach(txt);
        mouse.click();

    }
}
