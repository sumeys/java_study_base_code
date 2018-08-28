package com.sumey.design.adapt;

/**
 * 特点：（1）透明：通过适配器，客户端可以调用统一接口
 * 		（2）重用：复用了现存类
 * 		（3）低耦合：将目标类和适配器类解耦
 * */

public class NoteBook {

    private ThreePlgin plug;

    public NoteBook(ThreePlgin plug) {
        this.plug = plug;
    }

    //使用插座充电
    public void charge() {
        plug.powerWithThree();
    }

}
