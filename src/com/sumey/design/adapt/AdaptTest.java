package com.sumey.design.adapt;

public class AdaptTest {
    public static void main(String[] args) {
        GBTwoPlug two = new GBTwoPlug();
        ThreePlgin three = new TwoPlugAdapter(two);
        NoteBook nb = new NoteBook(three);
        nb.charge();

        three = new TwoPlugAdapterExtend();
        nb = new NoteBook(three);
        nb.charge();
    }
}
