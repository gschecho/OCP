package com.examen.inyeccionDependencias.variable;

public class Principal  {
    public static void main(String[] args) {
        Becario becario = new Becario("Martín");
        Inyector.inyectarPc(becario);
        becario.encenderPc();
    }
}
