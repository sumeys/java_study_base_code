package com.sumey.design.template;


/**
 * 准备一个抽象类，将部分逻辑以具体方法的形式实现，让声明一些抽象方法交由子类实现，用钩子方法给予子类更大的灵活性，最后将方法汇总构成一个不可改变的模板方法。
 *
 * 适用场景：算法或操作遵循相似的逻辑；重构时把相同代码抽取到父类中；新建时将核心算法设计为模板方法
 *
 * 优点：封装性好；复用性好；屏蔽细节；便于维护
 *
 * 缺点：在存在复杂继承的关系中，由于java只允许单一继承，因此应用模板方法时会造成困难
 *
 * */

/*
 * example：提神饮料
 * */

public abstract class RefreshBeverge {

    //制备饮料的模板方法，封装了所有子类共同遵守的算法框架
    public final void prepareBevergeTemplate() {
        //1，将水煮沸
        boilWater();
        //2,泡制饮料
        brew();
        //3,倒入杯中
        pourInCup();
        //4,加入调味料
        if (isChoosed()) {
            addCondiments();
        }
    }

    //钩子方法，Hook，提供一个默认空的实现，具体子类决定是否挂钩
    protected boolean isChoosed() {
        return true;
    }

    private void boilWater() {
        System.out.println("将水煮沸");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("将饮料倒入杯中");
    }

    protected abstract void addCondiments();
}
