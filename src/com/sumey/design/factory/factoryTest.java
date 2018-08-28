package com.sumey.design.factory;

public class factoryTest {
    public static void main(String[] args) {
        HairFactory factory = new HairFactory();
//        HairIf left = factory.getHair("left");
//        left.draw();
//
//        HairIf left = factory.getHairByClass("com.sumey.design.factory.LeftHair");
//        left.draw();


        HairIf left = factory.getHairByClass("in");
        left.draw();
    }
}
