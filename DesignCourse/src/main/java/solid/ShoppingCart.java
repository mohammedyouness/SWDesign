package solid;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public List<Item> cartItems = new ArrayList<Item>();

    public void removeFromCart(Item item) {
        if(cartItems.contains(item)) {
            cartItems.remove(item);
        } else {
            System.out.println("No item found...");
        }
    }

    public void add(Item item) {
        // check available quantity


    }

    public int getItemsCount() {
        return cartItems.size();
    }



}