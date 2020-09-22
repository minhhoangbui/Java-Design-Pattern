package Adapter;

public class MallardDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("I'm flying as a Mallard Duck");
    }

    @Override
    public void quack() {
        System.out.println("Quack, quack, quack!!!");
    }
}
