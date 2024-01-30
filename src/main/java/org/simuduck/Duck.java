package org.simuduck;

/**
 *  All ducks quack and swim, this superclass takes
 *  care of the implementation code.
 */
public abstract class Duck {

    String quack(){
        return "Normal duck quack";
    }

    String swim(){
        return "Normal swimming duck";
    }

    abstract String display(); // this method is abstract since all duck subtypes look different

    // other duck-like methods...
}
