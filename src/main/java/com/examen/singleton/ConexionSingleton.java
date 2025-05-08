package com.examen.singleton;

public class ConexionSingleton {
    private String nombre;
    static int contador;

    private static ConexionSingleton conexionSingleton;

    private ConexionSingleton(String nombre){
        this.nombre = nombre;
        contador++;
    }

    public static ConexionSingleton getConexion() {
        if (conexionSingleton == null){
            conexionSingleton =  new ConexionSingleton("MySQL");
            return conexionSingleton;
        }
        return conexionSingleton;
    }
}
