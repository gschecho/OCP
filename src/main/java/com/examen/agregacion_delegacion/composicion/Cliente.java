package com.examen.agregacion_delegacion.composicion;

public class Cliente {

    String nombre;
    Banco banco;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    // DELEGACION AL BANCO EL PAGO
    void realizarPago(double cantidad){
       boolean resultado = banco.pagar(cantidad);
        System.out.println("pago: " + resultado);
    }
}
