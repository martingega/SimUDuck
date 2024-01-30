package org.simuduck.quackbehavior;

public class Quack implements QuackBehavior{
    @Override
    public String quack() {
        return "Duck quacking"; // quacks that really quack
    }
}
