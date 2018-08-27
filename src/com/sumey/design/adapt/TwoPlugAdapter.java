package com.sumey.design.adapt;


// 二相转三相的插座适配器
public class TwoPlugAdapter implements ThreePlgin {

    private GBTwoPlug plug;

    public TwoPlugAdapter(GBTwoPlug plug) {
        this.plug = plug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("通过转化");
        plug.powerWithTwo();
    }
}
