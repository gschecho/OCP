package com.examen.singleton;

public class Principal {
    public static void main(String[] args) {

        Conexion con1 = new Conexion("MySQL");
        Conexion con2 = new Conexion("MySQL");
        Conexion con3 = new Conexion("MySQL");

        System.out.println(Conexion.contdor);

        ConexionSingleton conS1 = ConexionSingleton.getConexion();
        ConexionSingleton conS2 = ConexionSingleton.getConexion();
        ConexionSingleton conS3 = ConexionSingleton.getConexion();

        System.out.println(ConexionSingleton.contador);

    }
}
