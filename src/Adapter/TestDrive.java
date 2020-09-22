package Adapter;

public class TestDrive {
    public static void main(String[] args) {
        Duck mDuck = new MallardDuck();
        Turkey wTurkey = new WildTurkey();
        Duck fraudDuck = new TurkeyAdapter(wTurkey);
        System.out.println("The Duck says:");
        testDuck(mDuck);

        System.out.println("The Turkey says:");
        wTurkey.fly();
        wTurkey.gobble();

        System.out.println("The fraud Duck says:");
        testDuck(fraudDuck);
    }

    static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
