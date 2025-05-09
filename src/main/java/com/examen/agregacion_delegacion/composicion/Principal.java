package com.examen.agregacion_delegacion.composicion;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {



        Almacen almacen1  = new Almacen("Centro");

        Cliente cl1 = new Cliente("Arturo");
        Cliente cl2 = new Cliente("Juan");
        Cliente cl3 = new Cliente("Pedro");


        Banco banco1 = new Banco("Santander");

         cl1.banco = new Banco("BBVA");
         cl2.banco = banco1;


        List<Cliente> listaDeClientes= new ArrayList<>();
        listaDeClientes.add(cl1);
        listaDeClientes.add(cl2);
        listaDeClientes.add(cl3);

        almacen1.setClientes(listaDeClientes);

        System.out.println(almacen1.clientes);

       // almacen1 = null;
        System.out.println(almacen1.clientes);

        cl1.realizarPago(100);
        cl2.realizarPago(500000);




    }
}
