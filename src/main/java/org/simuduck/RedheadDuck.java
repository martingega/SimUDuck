package org.simuduck;

/**
 *  Each duck subtype is responsible for implementing its
 *  own display() behavior for how it looks on the screen
 */
public class RedheadDuck extends Duck {

    @Override
    String display() {
        return "I look like a redhead";
    }
}
