package com.sumey.design.strategy.impl;

import com.sumey.design.strategy.FlyingStrategy;

public class FlyWithWine implements FlyingStrategy {

    @Override
    public void performFly() {
        System.out.println("振翅高飞");
    }
}
