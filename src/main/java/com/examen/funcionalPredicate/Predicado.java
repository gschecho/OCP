package com.examen.funcionalPredicate;

@FunctionalInterface
public interface Predicado <T>{

    boolean probar(T t);

    static void probarstatic(){
        System.out.println("Método estático de la interface");
    }

    default void probarDefault(){
        System.out.println("Método default de la interface");
    }


    //Funcion de orden superior
    static <T> Predicado<T> returnPredicate(){
        return x -> true;
    }


   /*
   static <T> Predicado<T>negate(Predicado<T> p ){
        return x -> !p.probar(x);
    }
    */

//DEFAULT
    default Predicado<T>negate(){
        return x -> !this.probar(x);
    }

    //CUMPLIR 2 PREDICADOS
    static <T> Predicado<T> and (Predicado<T> pre1, Predicado<T> pre2){
        return x -> (pre1.probar(x) && pre2.probar(x));
    }

    //CUMPLIR 2 PREDICADOS
    static <T> Predicado<T> or (Predicado<T> pre1, Predicado<T> pre2){
        return x -> (pre1.probar(x) || pre2.probar(x));
    }



    // METODOS DEFAULT Son metodos de instancia, necesitas tener una instancia del objeto que tiene el metodo para poder ejecutarlo
    // Los metodos default en este caso en lugar de pasarle dos parametros utilizamos el this para obtener el objeto en primera instancia y solo le pasamos un predicado como segundo parametro



}
