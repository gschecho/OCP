package com.examen.decoratorAbiertoCerrado;

public class Principal {
    public static void main(String[] args) {

        Component laptopSinAccesorios = new Laptop();
        mostrarInfo(laptopSinAccesorios);


        Component laptopConAccesorio =  new Enfriador(new Laptop());
        mostrarInfo(laptopConAccesorio);

        // Se anidan los componentes.
        Component laptopConTodosAccesorio =  new Mesa(new Enfriador(new Laptop()));
        mostrarInfo(laptopConAccesorio);



    }


    static void mostrarInfo(Component component){

        System.out.println(component.getNombrePrecio());
        System.out.println("Costo total: " + component.getCostoTotal());
        System.out.println("----------------------------------------------");
    }
}
