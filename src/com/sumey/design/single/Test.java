package com.sumey.design.single;

public class Test {
    public static void main(String[] args) {
        SingleLazy s1 = SingleLazy.getInstance();
        SingleLazy s2 = SingleLazy.getInstance();
        if (s1 == s2) {
            System.out.println("s1和s2是一个");
        }


    }
}
