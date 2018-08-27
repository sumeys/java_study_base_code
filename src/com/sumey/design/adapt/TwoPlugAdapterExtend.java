package com.sumey.design.adapt;

public class TwoPlugAdapterExtend extends GBTwoPlug implements ThreePlgin {

    @Override
    public void powerWithThree() {
        System.out.print("借助继承适配器");
        this.powerWithTwo();
    }
}
