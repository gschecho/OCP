package com.examen.capitulo_03;

import java.util.ArrayList;
import java.util.List;

public class Flow {
    public static void main(String[] args) {

        // if - while - for





        // switch
        // enum, String, byte, long , int , char,
        // var lo acepta si puede inferir el tipo correcto
        var a = 4;
        switch(a){
            case 4 : System.out.println("4");
            break;
            case 5 : System.out.println("5");
            break;
            default: System.out.println("DEFAULT");
        }

        //SWITCH EXPRESSION
        //JAVA 14 se añaden las , en el case
        //podemos asignarlo, yield es como un return.


        var type = switch(a){
            case 1,2 -> "Snake";
            case 3,4 -> "Turtle";
            case 5,6 -> {
                yield "alligator";
            }
            default -> "Monkey";
        };

        System.out.println(type);




        if(a>2)
            System.out.println(a);
        else System.out.println("menor que 2");


        List lista = new ArrayList<>();
        lista.add(35);
        lista.add(3);
        int array[]= {5,10,5,16,15};
        // for-each
        // Solo pueden pasarse arreglos/ arrays, Collections con la interface iterable (set, List)

        String test = "Hola";
        for(var b: lista){
            System.out.println(b);
            System.out.println(b.getClass());
        }


    }
}
