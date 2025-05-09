package com.examen.composicion;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {


        Almacen almacen1 = new Almacen("Centro");

        Cuenta cuenta1 = new Cuenta("hola");
        Cuenta cuenta2 = new Cuenta("mundo");
        Cuenta cuenta3 = new Cuenta("cuenta");

        List<Cuenta> listaDeCuentas = new ArrayList<>();
        listaDeCuentas.add(cuenta1);
        listaDeCuentas.add(cuenta2);
        listaDeCuentas.add(cuenta3);

        almacen1.setCuenta(listaDeCuentas);
        System.out.println(almacen1.cuentas);


    }
}
