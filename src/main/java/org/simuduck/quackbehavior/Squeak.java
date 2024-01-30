package org.simuduck.quackbehavior;

public class Squeak implements QuackBehavior{
    @Override
    public String quack() {
        return "Duck squeaking"; // quacks that squeak
    }
}
