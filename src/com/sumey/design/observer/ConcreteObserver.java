package com.sumey.design.observer;

/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标状态保持一致
 */
public class ConcreteObserver implements Observer {

    private String observerState;

    @Override
    public void update(Subject subject) {
        observerState = ((ConcreteSubject) subject).getSubjectState();
    }
}
