package org.simuduck.ducks;

import org.simuduck.flybehavior.FlyWithWings;
import org.simuduck.quackbehavior.Quack;

/**
 *  Each duck subtype is responsible for implementing its
 *  own display() behavior for how it looks on the screen
 */
public class MallardDuck extends Duck {

    /* MallardDuck inherits the quackBehavior and flyBehavior
     * instance variables from class Duck
     */
    public MallardDuck() {
        quackBehavior = new Quack(); // uses the Quack class to handle its quack, so when performQuack is called, the responsibilt for the quack is delegated to the Quack object
        flyBehavior = new FlyWithWings(); // uses FlyWithWings as its FlyBehavior type
    }

    @Override
    String display() {
        return "I look like a mallard";
    }


}
