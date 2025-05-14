package com.examen.observer.conObserver.subject;

public class Mouse extends Subject {


     void click () {
         System.out.println("mouse click");
         notificar();
       }
}

