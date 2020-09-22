package Singleton;

public class TestDrive {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        ChocolateBoiler clonedboiler = ChocolateBoiler.getInstance();
    }
}
