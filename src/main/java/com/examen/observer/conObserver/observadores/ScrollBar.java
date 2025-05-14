package com.examen.observer.conObserver.observadores;

import com.examen.observer.conObserver.subject.Subject;

public class ScrollBar extends Observer{

    public ScrollBar(Subject sub) {
        super(sub);
    }

    public void deslizarScroll(){
        System.out.println("Deslizando el Mouse");
    }

    @Override
    public void update() {
        deslizarScroll();
    }
}
