package com.sumey.design.template;

public class RefreshBevergeTest {
    public static void main(String[] args) {
        System.out.println("咖啡制备中");
        RefreshBeverge b1 = new Coffee();
        b1.prepareBevergeTemplate();
        System.out.println("咖啡好了");

        System.out.println("************************");
        System.out.println("茶制备中");
        RefreshBeverge b2 = new Tea();
        b2.prepareBevergeTemplate();
        System.out.println("茶好了");
    }
}
