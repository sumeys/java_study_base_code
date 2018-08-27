package com.sumey.design.strategy;

public abstract class Duck {

    //通用行为，由超类实现
    public void quack() {
        System.out.println("嘎嘎嘎～");
    }

    public abstract void display();

    private FlyingStrategy flyingStrategy;

    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }

    public void fly() {
        flyingStrategy.performFly();
    }
}
