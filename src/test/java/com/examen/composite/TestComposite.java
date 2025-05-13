package com.examen.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestComposite {

    @Test
    public void testConstante(){
        double testValor = 3.0;
        Expresion e = new Consonante(testValor);
        assertEquals(testValor, e.getValor(), 0.0);

    }



    @Test
    public void testSuma(){
        double testValorA = 2.0;
        double testValorB = 4.0;
        Expresion izquierda = new Consonante(testValorA);
        Expresion derecha = new Consonante(testValorB);
        Expresion suma = new Suma(izquierda, derecha);
        assertEquals(testValorA + testValorB, suma.getValor(), 0.0);
    }

    @Test
    public void testResta(){
        double testValorA = 2.0;
        double testValorB = 4.0;
        Expresion izquierda = new Consonante(testValorA);
        Expresion derecha = new Consonante(testValorB);
        Expresion resta = new Resta(izquierda, derecha);
        assertEquals(testValorA - testValorB, resta.getValor(), 0.0);
    }

    @Test
    public void testMultiplicacion(){
        double testValorA = 2.0;
        double testValorB = 4.0;
        Expresion izquierda = new Consonante(testValorA);
        Expresion derecha = new Consonante(testValorB);
        Expresion multiplicacion = new Multi(izquierda, derecha);
        assertEquals(testValorA * testValorB, multiplicacion.getValor(), 0.0);
    }

    @Test
    public void testDivision(){
        double testValorA = 2.0;
        double testValorB = 4.0;
        Expresion izquierda = new Consonante(testValorA);
        Expresion derecha = new Consonante(testValorB);
        Expresion division = new Division(izquierda, derecha);
        assertEquals(testValorA / testValorB, division.getValor(), 0.0);
    }


    @Test
    public void testExpresionCompleja(){
        Expresion e = new Division(
                new Multi(
                        new Suma(
                                new Consonante(4.0),
                                new Consonante(6.0)
                        ),
                        new Consonante(200.0)
                ),
                new Suma(
                        new Consonante(3),
                        new Consonante(83)

                )
        );

        assertEquals(23.2558, e.getValor(), 0.0001);
    }


}
