package org.simuduck;

/**
 * We now add a new Wooden Decoy Duck type
 * that doesn't fly or quack
 */
public class DecoyDuck extends Duck{

    @Override
    String display() {
        return "I look like a decoy duck";
    }

}
