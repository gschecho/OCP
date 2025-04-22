package com.examen.capitulo_02;

public class Casteo {


static long addCandy(double fruit, float vegetables){
    return (int) (fruit + vegetables);
}

    public static void main(String[] args) {



        double fruit = 10;
        float vegetables = 10;

        //resultado long
        System.out.println((int) fruit + vegetables);

        // resultado int
        System.out.println((int)(fruit + vegetables));

        //Un long entra en el Double
        System.out.println(addCandy((long)(int)(short) fruit , vegetables));



        System.out.println();
    }
}
