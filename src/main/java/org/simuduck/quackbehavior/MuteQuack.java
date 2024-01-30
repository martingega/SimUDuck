package org.simuduck.quackbehavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public String quack() {
        return "Cannot quack"; // do nothing
    }
}
