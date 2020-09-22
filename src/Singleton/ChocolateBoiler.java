package Singleton;

public class ChocolateBoiler {
    private static ChocolateBoiler chocolateBoiler;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            chocolateBoiler = new ChocolateBoiler();
        }
        System.out.println("Status: Empty? " + chocolateBoiler.empty + " Boiled? " + chocolateBoiler.boiled);
        return chocolateBoiler;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
        System.out.println("After filling: \n");
        System.out.println("Status: Empty? " + chocolateBoiler.empty + " Boiled? " + chocolateBoiler.boiled);

    }

    public void drain () {
        if (! isEmpty() && isBoiled())
            empty = true;
        System.out.println("After draining: \n");
        System.out.println("Status: Empty? " + chocolateBoiler.empty + " Boiled? " + chocolateBoiler.boiled);
    }

    public void boil() {
        if (!isEmpty() && !isBoiled())
            boiled  = true;
        System.out.println("After boiling: \n");
        System.out.println("Status: Empty? " + chocolateBoiler.empty + " Boiled? " + chocolateBoiler.boiled);
    }


}
