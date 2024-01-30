package org.simuduck;

public class RubberDuck extends Duck {

    @Override
    String display() {
        return "I look like a rubberduck";
    }

    /*
     * Rubber ducks don't quack so the method
     * is overriden to "Squeak"
     */
    @Override
    String quack(){
        return "Squeak";
    }
}
