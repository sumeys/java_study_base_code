package com.sumey.design.strategy;

import com.sumey.design.strategy.impl.FlyWithWine;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super();
        super.setFlyingStrategy(new FlyWithWine());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是绿色的");
    }
}
