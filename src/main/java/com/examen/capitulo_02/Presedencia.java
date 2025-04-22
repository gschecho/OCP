package com.examen.capitulo_02;

public class Presedencia {
    public static void main(String[] args) {


        int ph = 7, vis = 2;


        boolean clear = vis > 1 & ( vis < 9  || ph < 2);
        // Nunca llega a evaluar la segunda parte ya que la primera es false vis no es mayor que 2
        boolean safe  = (vis > 2) && (ph++ > 1);

        boolean tasty = 7 <= --ph;


        System.out.println(clear);

        //----------//
        System.out.println("------------------");
        int pig = (short) 4 ;
        pig = pig++; // Asigna el valor antes del incrmento
        System.out.println(pig);
        pig = ++pig;
        System.out.println(pig);


        pig = ++pig + pig;  // 5 + 5
        pig = pig++ + pig; // 4 + 5


        long goat = (int)2;

       //  goat  = goat - 1.0; //  <<< Da un eror de compilacion  sin el cast
       // double pepit = goat - 1.0;
        goat -= 1.0; // internamente hace un casteo de Double a long -->  goat = (long)(goat + 1.0) sino no compilaria

        //--------------------------------------//
        System.out.println("------------------");

        int a = 2 , b = 4, c = 2;

        System.out.println( a > 2 ? --c : b++); //4
        System.out.println("b: " + b); // 5
        System.out.println(b = (a != c ? a : b++)); //5
        System.out.println("b: " + b ); //5


        System.out.println(a > b ? (b < c ? b : 2 ): 1 );
        System.out.println( a > b ? b < c ? b : 2 : 1 );


        //--------------------
                    //bitewise

                int test = 8;
                var numero = ~ test;


                System.out.println((-1 * test)-1);
                System.out.println(numero);
    }
}
