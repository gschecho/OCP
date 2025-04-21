package com.examen;



public class Main {
    public static void main(String[] args) {

        Apuntes apuntes = new Apuntes("Gonzalo");
        System.out.println(apuntes.nombre.concat( " el loco"));

        StringBuilder string = new StringBuilder("Gonzalo");
        string.append(" es un crack");
        System.out.println(string);

        string.setCharAt(1,'e');
        System.out.println(string);

        string.reverse();
        System.out.println(string);

        System.gc();

        var myObject = new Object(){
            //var x = "hola";
            int y = 3;
        };
        System.out.println("My object: " + myObject);
        System.out.println(myObject);



    }
}