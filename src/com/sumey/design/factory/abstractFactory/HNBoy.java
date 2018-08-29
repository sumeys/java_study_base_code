package com.sumey.design.factory.abstractFactory;

import com.sumey.design.factory.abstractFactory.Boy;

public class HNBoy implements Boy {
    @Override
    public void drawMan() {
        System.out.println("新年系列的男孩子");
    }
}
