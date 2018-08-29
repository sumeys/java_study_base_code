package com.sumey.design.factory.abstractFactory;

import com.sumey.design.factory.abstractFactory.Boy;

public class MCBoy implements Boy {
    @Override
    public void drawMan() {
        System.out.println("圣诞系列的男孩子");
    }
}
