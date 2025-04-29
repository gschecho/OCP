package com.examen.capitulo_04;

public class Strings_StringBuilder {
    public static void main(String[] args) {

       var sb = new StringBuilder();
       sb.append("aaa").insert(1,"bb").insert(4, "ccc");
        //Al ser el DStringBuilder mutable no hace falta agregarlo a la variable de refrencia, aunque funcionaria igual si se hace asi
        //  sb =  sb.append("aaa").insert(1,"bb").insert(4, "ccc");

        // El StringBuilder() no le afecta el final siempre y cuando no se cambie la referncia gracias a su mutabilidad.
        // final no deja cambiar la variable de referencia. por ejemplo no dejaria hacer  sb =  sb.append("aaa").insert(1,"bb").insert(4, "ccc");
        //

        System.out.println(sb);



        var a = "Hello";
        a.concat(" World");

        //AL ser inmutable el String no agregara el concat y no imprimira World
        System.out.println(a);

        // Para imprimir también world osea concatenarlo al Hello debemos añadirlo a la variable de referencia

        a = a.concat(" World");

        System.out.println(a);
    }
}
