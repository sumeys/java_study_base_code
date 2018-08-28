package com.sumey.design.adapt;

/**
 * 基于继承方式的适配器模式
 * */

public class TwoPlugAdapterExtend extends GBTwoPlug implements ThreePlgin {

    @Override
    public void powerWithThree() {
        System.out.print("借助继承适配器");
        this.powerWithTwo();
    }
}
