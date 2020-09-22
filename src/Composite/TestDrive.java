package Composite;

public class TestDrive {
    public static void main(String[] args) {
        MenuComponent allMenus = new Menu("All menus", "Menus of a whole day");
        MenuComponent pancakeHouseMenu = new Menu("Pancake House", "Breakfast  only");
        MenuComponent dinerMenu = new Menu("Diner", "Lunch only");
        MenuComponent cafeMenu = new Menu("Cafe House", "Dinner only");

        pancakeHouseMenu.add(new MenuItem("K&B Pancake",
                "Pancake with scrambled egg and toast",
                2.99, true));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake",
                "Pancake with fried egg and sausage",
                3.99, false));

        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "Bacon with lettuce and tomato",
                2.99, false));
        dinerMenu.add(new MenuItem("Hotdog",
                "A hot dog with relish, onions and cheese",
                3.06, false));

        cafeMenu.add(new MenuItem("Apple Pie", "Apple Pie with flaky flavour," +
                "topped with ice-cream", 2.0, true));

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenus();
    }
}
