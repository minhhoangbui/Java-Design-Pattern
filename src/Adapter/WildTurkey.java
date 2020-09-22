package Adapter;

public class WildTurkey implements Turkey{
    @Override
    public void fly() {
        System.out.println("I'm flying as a true turkey");
    }

    @Override
    public void gobble() {
        System.out.println("Gobble, gobble...");
    }
}