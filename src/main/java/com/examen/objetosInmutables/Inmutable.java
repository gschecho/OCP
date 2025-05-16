package com.examen.objetosInmutables;

import java.util.ArrayList;
import java.util.List;

//agregando final a la clase, no puede ser heredada
public final class Inmutable {

    //1. Todas las propiedades con private y final
    private final String nombre;
    private final int edad;

    private final List<String> comidaPreferida;

    // 2. Constructor para asignar valores
    public  Inmutable(String nombre, int edad, List<String> comidaPreferida) {
        this.nombre = nombre;
        this.edad = edad;
        // 4 . No permitir que las referencias de los objetos inmutables puedan ser modificadas o accedidas directamente
        // Creamos una nueva array lista para que no se pueda modificar, en caso que modifiquen el array que nos pasaron.
        this.comidaPreferida = new ArrayList<>(comidaPreferida);
    }


    //3 .No deben haber setters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public List<String> getComidaPreferida() {
        return new ArrayList<>(comidaPreferida);
    }




    //No permitir que los metodos sean sobreescritos definir la clase como final.
// Agregando final al método no puede ser sobreescrito
public final void comer() {
    System.out.println(nombre + " está comiendo.");
}
}
