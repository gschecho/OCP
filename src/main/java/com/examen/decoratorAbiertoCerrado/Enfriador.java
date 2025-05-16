package com.examen.decoratorAbiertoCerrado;

public class Enfriador extends Decorator{

    public Enfriador(Component component) {
        super(component);
        nombreAccesorio = "Enfriador";
        precioAccesorio = 60.00;
    }


}
