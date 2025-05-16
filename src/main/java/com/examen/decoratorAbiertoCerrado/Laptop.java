package com.examen.decoratorAbiertoCerrado;

public class Laptop implements Component{

    @Override
    public String getNombrePrecio() {
        return "Laptop: " + getCostoTotal();
    }

    @Override
    public double getCostoTotal() {
        return 400;
    }
}
