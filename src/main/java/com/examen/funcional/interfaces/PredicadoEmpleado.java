package com.examen.funcional.interfaces;


import com.examen.funcional.entities.Empleado;

@FunctionalInterface
public interface PredicadoEmpleado {

    boolean probar(Empleado e);
}
