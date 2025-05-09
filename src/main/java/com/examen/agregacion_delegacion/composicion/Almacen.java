package com.examen.agregacion_delegacion.composicion;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    String nombre;
    List<Cuenta> cuentas = new ArrayList<>();
    List<Cliente> clientes;

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
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

    void setClientes(List<Cliente> listaDEClientes){this.clientes = listaDEClientes;}
}
