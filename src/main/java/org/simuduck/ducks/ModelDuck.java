package org.simuduck.ducks;

import org.simuduck.flybehavior.FlyNoWay;
import org.simuduck.quackbehavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay(); // the model duck begins life without a way to fly
        quackBehavior = new Quack(); // the model duck can quack
    }

    @Override
    public String display() {
        return "I am a model duck";
    }
}
