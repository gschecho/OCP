package com.examen.capitulo_04;

import java.util.*;

import static java.util.Arrays.*;

public class ArraysClass {
    public static void main(String[] args) {

        int[][] numeros = new int[10][];
        //El primer  array es obligatorio definirlo, los interiores no.
        // el primer elemento es el fijo, los siguientes pueden ser variables.

       // numeros[0][0] = 1;
       // numeros[0][1] = 2;
       // numeros[1][0] = 3;
       // numeros[1][1] = 4;

       // System.out.println(numeros);
        //Esto nos da un null pointer esxception, porque la fila no esta definida.

        //Debemos inicializar cada array dentro de cada fila/columna
        numeros[0]= new int[2];
        numeros[0][0] = 1;
        numeros[0][1] = 2;

        numeros[1]= new int[3];
        numeros[1][0] = 3;
        numeros[1][1] = 4;
        //Tambien podemos iniciar con los elementos que llevara el array
        //numeros[0] = new int[]{1,2,3,4,5};

        System.out.println(numeros);

        System.out.println(Arrays.toString(numeros));



        int[][][] numeros2 = new int[10][0][3];
        System.out.println(numeros2);
        // Compila correctamente aunque no se pueda utilizar.
        // No funciona al asignar un valor porque esta inicializada con 0 espacios en la segunda fila.
        //Out Bound Exception

       // String beans[] = new beans[6];
        //Es incorrecta ya que el array tiene que definir el tipo.

        java.util.Date[] dates[] = new java.util.Date[2][];
        // los corchetes pueden ir en el primer termino, en el segundo o uno en cada como en este caso

        // int[][] types = new int[][];
        // Es incorrecto pot que no se incializa la primera array.


        // Patron factory en la API Time ... sustituyendo la api Date.
        // No hace falta utilizar los new, porque han quitado los constructores.
        // Son métodos estáticos.


        // equals mira el contenido
        // == mira que apunten al mismo contenido
        // intern significa que esta dentro del pool de strings

        var s = " Hello";
        var t = new String(s);

        if(("Hello").equals(s)) System.out.println("uno");
        if(t==s) System.out.println("dos");
        if(t.intern()==s) System.out.println("tres");
        if(t==s) System.out.println("otro dos");
        if("Hello" == s) System.out.println("cuatro");
        if("Hello".intern() == t) System.out.println("cinco");




        int[] arrayEneteros = {1,2,3};
        int[] arrayEneterosB = {1,2,3};

        System.out.println(Arrays.toString(arrayEneteros));

        System.out.println(arrayEneteros.equals(arrayEneterosB));


        String[] array = {"PIG", "pig", "123"};
        String[] array2 = {"PIG", "pig", "124"};


        System.out.println("NO ORDENADO");
        System.out.println(Arrays.binarySearch(array, "PIG")); //1

        System.out.println("ORDENADO");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, "Pippa")); //-3
        System.out.println(Arrays.binarySearch(array, "PIG")); //1
        System.out.println(Arrays.binarySearch(array, "4321")); //-2
        //


        // MISMATCH Y COMPARE
        System.out.println(mismatch(array, array2));


    }
}
