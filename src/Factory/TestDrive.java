package Factory;

// In Simple Factory, we use composition to decide how to make pizza
// In Factory Method, we use inheritance in order to let subclasses decide how to make them by using
// factory method. We could also use composition (ingredient factory) to create ingredients for cheese pizza
// from different locations (Abstract Factory) instead of having many concrete classes of Pizza. Abstract
// Factory can be considered to be a more advanced version of Simple Factory

public class TestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicageStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Hoang ordered a " + pizza.getName());

        pizza = chicageStore.orderPizza("cheese");
        System.out.println("Duc ordered a " + pizza.getName());
    }
}
