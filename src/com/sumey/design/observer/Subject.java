package com.sumey.design.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道它的观察者，并可以添加和删除,通知观察者
 */

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : observers
                ) {
            observer.update(this);
        }
    }


}
