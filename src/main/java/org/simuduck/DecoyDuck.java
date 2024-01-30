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

    @Override
    String quack(){
        return ""; // override to do nothing
    }

    @Override
    String fly(){
        return ""; // override to do nothing
    }
}
