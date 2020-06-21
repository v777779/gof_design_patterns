package com.example.gofp.head_first.sol.behavioral.strategy.classes;

public abstract class Duck {

    protected QuackBehaviour quackBehaviour;
    protected FlyBehaviour flyBehaviour;
    protected SwimBehaviour swimBehaviour;

    public Duck() {
    }


    public abstract void display();


    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }
    public void performSwim(){
        swimBehaviour.swim();
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }
}
