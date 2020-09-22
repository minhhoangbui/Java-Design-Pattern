package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItems("K&B Pancake",
                "Pancake with scrambled egg and toast",
                true, 2.99);
        addItems("Regular Pancake",
                "Pancake with fried egg and sausage",
                false, 3.99);
    }

    public void addItems(String name, String description,
                         boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems(){
        return menuItems;
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
