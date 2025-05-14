package com.examen.observer.conObserver.observadores;

import com.examen.observer.conObserver.subject.Subject;

public abstract class  Observer{

    Subject sub;

    public Observer(Subject sub) {
        this.sub = sub;
        sub.attach(this);
    }

    public abstract void update();
}
