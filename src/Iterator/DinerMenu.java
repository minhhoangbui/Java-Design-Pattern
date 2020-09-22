package Iterator;

import java.util.Iterator;

public class DinerMenu implements Menu{
    static final int MAX=6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX];

        addItem("Vegetarian BLT",
                "Bacon with lettuce and tomato",
                true, 2.99);

        addItem("Hotdog",
                "A hot dog with relish, onions and cheese",
                false, 3.05);

    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX)
            System.err.println("Menu is full. Cannot add anything more");
        else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
