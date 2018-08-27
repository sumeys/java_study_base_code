package com.sumey.design.strategy;

import com.sumey.design.strategy.impl.FlyNoWine;

public class BigYellow extends Duck {

    public BigYellow() {
        super();
        super.setFlyingStrategy(new FlyNoWine());
    }

    @Override
    public void display() {
        System.out.println("我是大黄鸭");
    }
}
