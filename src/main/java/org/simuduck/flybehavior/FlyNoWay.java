package org.simuduck.flybehavior;

/**
 * Here's the implementation for alll
 * ducks that can't fly
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public String fly() {
        return "I cannot fly"; // do nothing
    }

}
