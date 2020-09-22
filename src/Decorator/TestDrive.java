package Decorator;

public class TestDrive {
    public static void main(String[] args) {
        Beverage beverage1 = new Expresso();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);

        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
