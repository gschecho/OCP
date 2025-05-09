package com.examen.strategy;

import java.io.PipedInputStream;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        ComportamientoVolar cv1 =new SiVolar();
        ComportamientoVolar cv2 =new NoVolar();
        ComportamientoVolar cv3 =new AleatorioVolar();


Pato pato  = new Pato("Lucas");
pato.cv = cv3;
Pinguino pinguino = new Pinguino("Pingu");
        Aguila aguila = new Aguila("Real");


        List<Ave> aves = new ArrayList<>();
        aves.add(pato);
        aves.add(aguila);
        aves.add(pinguino);

        for(Ave ave : aves ){
           aplicaVuelo(ave);

        }


        //CAMBIAMOS EL COMPORTAMIENTO EN TIEMPO DE EJECUCION

        aguila.cv = cv2;

        System.out.println("---------------- CAMBIO DE COMPORTAMIENTO ----------------");
            aplicaVuelo(aguila);

    }

    static void aplicaVuelo(Ave ave){
        System.out.println(ave);
        ave.volar();
    }

}
