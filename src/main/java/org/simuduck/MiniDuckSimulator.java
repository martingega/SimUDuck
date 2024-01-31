package org.simuduck;

import org.simuduck.ducks.Duck;
import org.simuduck.ducks.MallardDuck;
import org.simuduck.ducks.ModelDuck;
import org.simuduck.flybehavior.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        System.out.println(mallard.performQuack()); // this calls the MallardDuck's inherited performQuack() method which calls quack() on the duck's inherited quackBehavior reference
        System.out.println(mallard.performFly()); // the same with MallardDuck's inherited performFly() method

        Duck model = new ModelDuck();
        // initially the model duck cannot fly
        System.out.println(model.performFly()); // this delegates to the flyBehavior object set in the ModelDuck's conctructor, which is a FlyNoWay instance
        // we change the model duck flying capability giving it a rocket poweder flying behavior
        model.setFlyBehavior(new FlyRocketPowered()); // this invokes the model's inherited behavior setter method
        // now the model duck dynamically changed its flying behavior
        System.out.println(model.performFly());
    }

}