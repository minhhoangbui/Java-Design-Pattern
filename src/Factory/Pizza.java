package Factory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing " + dough + " and " + sauce);
        System.out.println("Adding toppings: ");
        for(String t: toppings) {
            System.out.println(" " + t);
        }
    }

    void bake() {
        System.out.println("Baking for 2 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting pizza...");
    }

    void box() {
        System.out.println("Putting pizza in the box...");
    }

    public String getName() {
        return name;
    }
}
