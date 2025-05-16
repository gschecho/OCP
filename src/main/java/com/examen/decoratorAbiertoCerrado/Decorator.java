package com.examen.decoratorAbiertoCerrado;

public class Decorator implements Component{

    //Asociado un component
    Component component;
    String nombreAccesorio;
    double precioAccesorio;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public String getNombrePrecio() {
        return component.getNombrePrecio() + "\n" + nombreAccesorio + ": " + precioAccesorio;
    }

    @Override
    public double getCostoTotal() {
        return component.getCostoTotal() + precioAccesorio;
    }
}
