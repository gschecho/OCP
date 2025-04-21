package com.examen;

public class Bloques {

    //Anónimo
    {
        System.out.println("bloque");
    }

    //Anónimo estático
    static{
        System.out.println("bloque estático");
    }

    public static void main(String[] args) {
        //Bloques bloques = new Bloques();
        System.out.println( "Main");

        int numero = 10;
        String bloque = """
                ***
                texto 
                ***
                """;

        String bloqueViejo = " ${}";
    }

    //Anónimo
    {
        System.out.println("bloque 2");
    }


}
