package Template;

public class TestDrive {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        tea.prepare();
        coffee.prepare();

        CaffeineBeverageWithHook coffeeH = new CoffeeWithHook();
        coffeeH.prepare();
    }
}
