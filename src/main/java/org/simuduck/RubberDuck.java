package org.simuduck;

public class RubberDuck extends Duck implements Quackable{

    @Override
    String display() {
        return "I look like a rubberduck";
    }

    @Override
    public String quack() {
        return "Squeak";
    }
}
