package com.sumey.design.factory.abstractFactory;

public class AbstractTest {
    public static void main(String[] args) {
        PersonFactory factory = new MCFactory();
        Girl girl = factory.getGirl();
        girl.drawWoman();
    }
}
