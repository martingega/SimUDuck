package org.simuduck.ducks;

import org.simuduck.FlyNoWay;
import org.simuduck.MuteQuack;

/**
 * We now add a new Wooden Decoy Duck type
 * that doesn't fly or quack
 */
public class DecoyDuck extends Duck {

    public DecoyDuck(){
        quackBehavior = new MuteQuack(); // decoy ducks cannot quack
        flyBehavior = new FlyNoWay(); // decoy ducks cannot fly
    }

    @Override
    String display() {
        return "I look like a decoy duck";
    }

}
