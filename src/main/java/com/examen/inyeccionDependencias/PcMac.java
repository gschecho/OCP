package com.examen.inyeccionDependencias;

public class PcMac {

    private String version;

    public PcMac(String version) {

        this.version = version;
    }

    public void encender(){
        System.out.println("Enciende Pc: " + version);
    }
}
