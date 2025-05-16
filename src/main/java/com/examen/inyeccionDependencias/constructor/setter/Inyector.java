package com.examen.inyeccionDependencias.constructor.setter;

public class Inyector {

    static Becario getBecario(){

        Pc pcLinux = new PcLinux("Ubuntu");
        Pc pcWindows = new PcWindows("Windows 10");

        return new Becario("Manuel", pcLinux);

    }
}
