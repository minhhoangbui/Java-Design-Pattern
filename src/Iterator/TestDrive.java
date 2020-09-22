package Iterator;

import java.util.ArrayList;

public class TestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerHouseMenu = new DinerMenu();
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerHouseMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
