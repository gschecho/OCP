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


        var string = "12345";
        var sb2 = new StringBuilder("12345");

        string = string.replace("1", "8");
        System.out.println(string);
        sb2.replace(2,5, "8");
        System.out.println(sb2);
        sb2.replace(2,5, "A").charAt(2);
        System.out.println(sb2);
        System.out.println(string.replace("123", "8").charAt(4));
        System.out.println(string.length());





        //
        var numbers = "012345678";
        numbers = numbers.indent(1);
        System.out.println(numbers);
        numbers = numbers.stripLeading();
        System.out.println(numbers);

        numbers = numbers.substring(1,3);
        System.out.println(numbers);

       //numbers = numbers.substring(7,7); // EXCEPCION
        System.out.println(numbers);

        numbers = numbers.substring(2);
        System.out.println(numbers);


    }
}
