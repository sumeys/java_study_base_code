package com.sumey.design.template;

public class Coffee extends RefreshBeverge {

    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");

    }

    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }
}
