package com.examen.composicion;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    String nombre;
    List<Cuenta> cuentas = new ArrayList<>();

    public Almacen(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    void setCuenta(List<Cuenta> listaDeCuentas){
      this.cuentas = listaDeCuentas;
    }
}
