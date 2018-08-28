package com.sumey.design.template;

public class Tea extends RefreshBeverge {
    @Override
    protected void brew() {
        System.out.println("用80度水冲泡茶叶5分钟");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    // 子类选择挂载钩子函数
    @Override
    protected boolean isChoosed() {
        return false;
    }
}
