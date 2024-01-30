package org.simuduck;

/**
 *  Each duck subtype is responsible for implementing its
 *  own display() behavior for how it looks on the screen
 */
public class RedheadDuck extends Duck implements Flyable, Quackable{

    @Override
    String display() {
        return "I look like a redhead";
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
