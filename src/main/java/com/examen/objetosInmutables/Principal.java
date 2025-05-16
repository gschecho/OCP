package com.examen.objetosInmutables;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<String> listaComida = new ArrayList<>();
        listaComida.add("Maiz");
        listaComida.add("Semillas");

        Inmutable   pato = new Inmutable("Pepe", 10, listaComida);

        System.out.println(pato.getComidaPreferida());

        // Si no añadimos en el constructor que cree una nueva Lista al sermutable las colecciones podríamos añadir elementos no deseados.

        listaComida.add("Morros");
        System.out.println(pato.getComidaPreferida());
    }
}
