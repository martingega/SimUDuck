package org.simuduck;

import org.simuduck.ducks.Duck;
import org.simuduck.ducks.MallardDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        System.out.println(mallard.performQuack()); // this calls the MallardDuck's inherited performQuack() method which calls quack() on the duck's inherited quackBehavior reference
        System.out.println(mallard.performFly()); // the same with MallardDuck's inherited performFly() method
    }

}