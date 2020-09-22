package Strategy;

public class TestDrive {
    public static void main(String[] args) {
        FlyBehavior flyBehavior = new FlyWithWings();
        QuackBehavior quackBehavior = new Quack();

        Duck minkDuck = new MallardDuck(flyBehavior, quackBehavior);
        minkDuck.display();
    }
}
