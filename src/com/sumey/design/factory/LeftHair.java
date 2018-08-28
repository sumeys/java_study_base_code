package com.sumey.design.factory;


//左偏分发型
public class LeftHair implements HairIf {
    @Override
    public void draw() {
        System.out.println("左偏分发型");
    }
}
