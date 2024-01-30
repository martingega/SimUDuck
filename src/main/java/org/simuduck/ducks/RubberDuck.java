package org.simuduck.ducks;

import org.simuduck.FlyNoWay;
import org.simuduck.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck(){
        quackBehavior = new Squeak(); // rubber ducks squeak
        flyBehavior = new FlyNoWay(); // rubber ducks can't fly
    }
    @Override
    String display() {
        return "I look like a rubberduck";
    }

}
