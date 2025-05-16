package com.examen.inyeccionDependencias.variable;

public class PcMac implements Pc {

    private String version;

    public PcMac(String version) {

        this.version = version;
    }
    @Override
    public void encender(){
        System.out.println("Enciende Pc: " + version);
    }
}
