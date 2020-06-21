package com.example.gofp.head_first.sol.behavioral.strategy;

import com.example.gofp.binding.BasePattern;
import com.example.gofp.binding.Systems;
import com.example.gofp.head_first.sol.behavioral.strategy.classes.DecoyDuck;
import com.example.gofp.head_first.sol.behavioral.strategy.classes.Duck;
import com.example.gofp.head_first.sol.behavioral.strategy.classes.FlyRocket;
import com.example.gofp.head_first.sol.behavioral.strategy.classes.MallardDuck;
import com.example.gofp.head_first.sol.behavioral.strategy.classes.ModelDuck;
import com.example.gofp.head_first.sol.behavioral.strategy.classes.RubberDuck;

public class Strategy extends BasePattern {
    @Override
    public void main() {
        Duck mallardDack = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();
        Duck modelDuck = new ModelDuck();

        mallardDack.display();
        mallardDack.performQuack();
        mallardDack.performFly();
        mallardDack.performSwim();

        Systems.out.println();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        rubberDuck.performSwim();

        Systems.out.println();
        decoyDuck.display();
        decoyDuck.performQuack();
        decoyDuck.performFly();
        decoyDuck.performSwim();

        Systems.out.println();

        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.performSwim();
        modelDuck.setFlyBehaviour(new FlyRocket());
        modelDuck.performFly();
    }
}
