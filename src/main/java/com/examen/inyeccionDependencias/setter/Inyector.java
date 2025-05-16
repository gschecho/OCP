package com.examen.inyeccionDependencias.setter;

public class Inyector {

    static void inyectarPc(Becario becario){
        becario.setMyPc( new PcWindows("Windows 10"));
    }
}
