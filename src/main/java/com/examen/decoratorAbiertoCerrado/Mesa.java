package com.examen.decoratorAbiertoCerrado;

public class Mesa extends Decorator{

    public Mesa(Component component) {
        super(component);
        nombreAccesorio = "Mesa de Bambú";
        precioAccesorio = 150.000;
    }
}
