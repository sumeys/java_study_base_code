package com.sumey.design.factory.abstractFactory;

import com.sumey.design.factory.abstractFactory.Girl;

public class HNGirl implements Girl {
    @Override
    public void drawWoman() {
        System.out.println("新年系列的女孩子");
    }
}
