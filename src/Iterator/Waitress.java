package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus){
        this.menus = menus;
    }

    public void printMenu() {
        for(Menu menu: menus){
            Iterator iterator = menu.createIterator();
            printMenu(iterator);
        }

    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", " + menuItem.getPrice());
            System.out.println("-----");
            System.out.println(menuItem.getDescription());
        }
    }
}
