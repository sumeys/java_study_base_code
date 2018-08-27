package com.sumey.design.adapt;

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
