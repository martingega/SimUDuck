package org.simuduck.ducks;

import org.simuduck.FlyBehavior;
import org.simuduck.QuackBehavior;

/**
 *  All ducks quack and swim, this superclass takes
 *  care of the implementation code.
 */
public abstract class Duck {

    // The behavior variables are declared as the behavior INTERFACE type
    FlyBehavior flyBehavior; // each Duck has a reference to something that implements the FlyBehavior interface
    QuackBehavior quackBehavior; // each Duck has a reference to something that implements the QuackBehavior interface
    public Duck(){

    }

    // this method replaces quack()
    String performQuack(){
        return quackBehavior.quack(); // the Duck object delegates the quack behavior to the object referenced by quackBehavior
    }

    // this method replaces fly()
    String performFly(){
        return flyBehavior.fly(); // the Duck object delegates the fly behavior to the object referenced by flyBehavior
    }
    String swim(){
        return "Normal swimming duck";
    }

    abstract String display(); // this method is abstract since all duck subtypes look different

    // other duck-like methods...
}
