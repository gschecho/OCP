package com.examen.inyeccionDependencias;

public class PcWindows {

    private String version;

    public PcWindows(String version) {
        this.version = version;
    }

    public void encender(){
        System.out.println("Enciende Pc: " + version);
    }
}
