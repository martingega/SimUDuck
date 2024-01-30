package org.simuduck.ducks;

import org.simuduck.FlyWithWings;
import org.simuduck.Quack;

/**
 *  Each duck subtype is responsible for implementing its
 *  own display() behavior for how it looks on the screen
 */
public class RedheadDuck extends Duck {

    public RedheadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    String display() {
        return "I look like a redhead";
    }

}
