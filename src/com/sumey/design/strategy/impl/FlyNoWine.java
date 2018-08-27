package com.sumey.design.strategy.impl;

import com.sumey.design.strategy.FlyingStrategy;

public class FlyNoWine implements FlyingStrategy {

    @Override
    public void performFly() {
        System.out.println("我不会飞行！");
    }
}
