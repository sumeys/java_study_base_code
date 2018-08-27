package com.sumey.design.strategy;

public class DuckTest {
    public static void main(String[] args) {
        Duck duck = new BigYellow();
        duck.display();
        duck.quack();
        duck.fly();
    }
}
