package com.examen.inyeccionDependencias.variable;

public class Inyector {

    static void inyectarPc(Becario becario){
        becario.myPc = new PcWindows("Windows 10");
    }
}
