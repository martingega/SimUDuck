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

    /*
     * By putting fly() in the superclass, we gave flying
     * ability to ALL duck, including those that shouldn't
     */
    String fly(){
        return "Normal flying duck";
    }
    // other duck-like methods...
}
