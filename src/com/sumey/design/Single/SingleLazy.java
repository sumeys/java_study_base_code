package com.sumey.design.Single;

public class SingleLazy {

    //1.将构造方法私有化,不允许外边直接创建对象
    private SingleLazy() {
    }

    //2.声明类的唯一实例，使用private static修饰
    private static SingleLazy instance;

    //3.提供一个用于获取实例的方法
    public static SingleLazy getInstance() {
        if (instance == null) {
            instance = new SingleLazy();
        }
        return instance;
    }
}
