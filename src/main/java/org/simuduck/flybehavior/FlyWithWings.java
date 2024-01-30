package org.simuduck.flybehavior;

/**
 * Here's the implementation of flying for
 * all ducks that have wings.
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public String fly() {
        return "Ducks flying with wings";
    }
}
