package solid;

import java.util.ArrayList;
public class Stock {
    public static ArrayList<Item> items = new ArrayList<>();
    public static ArrayList<Item> returnStock() {
        items.add(new Item("101", 5, 4));
        items.add(new Item("102", 10, 9));
        items.add(new Item("103", 15, 14));
        return items;
    }

}
