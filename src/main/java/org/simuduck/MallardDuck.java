package org.simuduck;

/**
 *  Each duck subtype is responsible for implementing its
 *  own display() behavior for how it looks on the screen
 */
public class MallardDuck extends Duck implements Flyable, Quackable{

    @Override
    String display() {
        return "I look like a mallard";
    }

    @Override
    public String fly() {
        return "Normal flying duck";
    }

    @Override
    public String quack() {
        return "Normal quacking duck";
    }
}
