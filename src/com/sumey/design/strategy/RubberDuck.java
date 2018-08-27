package com.sumey.design.strategy;

import com.sumey.design.strategy.impl.FlyNoWine;
import com.sumey.design.strategy.impl.FlyWithWine;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        super.setFlyingStrategy(new FlyNoWine());
    }

    @Override
    public void display() {
        System.out.println("我是橡胶鸭");
    }

    @Override
    public void quack() {
        System.out.println("橡胶鸭嘎嘎嘎～");
    }
}
