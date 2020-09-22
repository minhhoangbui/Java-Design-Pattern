package Strategy;

public class MallardDuck extends Duck{
    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        setFlyBehavior(flyBehavior);
        setQuackBehavior(quackBehavior);
    }
    @Override
    public void display() {

        System.out.println("I'm a Mallard Duck");
        flyBehavior.fly();
        quackBehavior.quack();
    }
}
