package com.sumey.design.strategy;

/**
 * 策略模式(将可变的部分从程序中抽象分离成算法接口，在接口下分别封装成一系列算法实现)
 *
 * 优点：使用了组合，使架构更加灵活；富有弹性，可以较好的应对开发；代码复用；减少分支
 *
 * 缺点：客户端需要了解每个策略的实现细节；增加了对象的数目
 *
 * 使用场景：许多相关的类仅仅是行为上的差异；运行时选取不同的算法变体；有大量的分支选择语句
 *
 * */


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
