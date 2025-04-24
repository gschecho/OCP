package com.examen.capitulo_03;

public class PatternMatching {


    //JAVA 8
    void printTypeA(Object o){
        if(o instanceof Integer){
            double b =((Integer)o).doubleValue();
            System.out.println("integer: " + b);
        }
    }
    //JAVA 17
    void printTypeB(Object o){
        if(o instanceof Integer data){ //--> Al saber que es integer se le da un nuevo nombre por ejemplo data
            System.out.println("integer: " );
            System.out.println( data.intValue());
            double b =data.doubleValue();
            System.out.println("Double: " + b);
            System.out.println();
        }
        if(o instanceof String data){
            System.out.println("String: " + data);
        }
        else if (o instanceof Integer data && data < 10){
            System.out.println();
        }

    }




    public static void main(String[] args) {

        //
        PatternMatching patternMatching = new PatternMatching();
        patternMatching.printTypeB(20);
    }
}
