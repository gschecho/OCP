package com.examen.observer.conObserver.subject;

import com.examen.observer.conObserver.observadores.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    List<Observer> listaObservadores;


    public Subject() {
        this.listaObservadores = new ArrayList<>();
    }

    public void attach(Observer o){
        listaObservadores.add(o);
    }

    void detach(Observer o){
        listaObservadores.remove(o);
    }

    void notificar(){
       for(Observer o: listaObservadores){
           o.update();
       }
    }

}
