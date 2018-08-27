package com.sumey.design.strategy;

import com.sumey.design.strategy.impl.FlyWithWine;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super();
        super.setFlyingStrategy(new FlyWithWine());
    }

    @Override
    public void display() {
        System.out.println("我的头是红色的");
    }
}
