import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(String name, double price, int qty) {
        items.add(new CartItem(name, price, qty));
        System.out.println(name + " added to cart.");
    }

    void removeItem(String name) {
        items.removeIf(item -> item.itemName.equalsIgnoreCase(name));
        System.out.println(name + " removed from cart.");
    }

    void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.price * item.quantity;
        }
        System.out.println("Total Shopping Cart Cost: " + total);
        System.out.println("-------------------------");
    }
}

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart();
        myCart.addItem("Headphones", 1500.0, 1);
        myCart.addItem("Charger", 500.0, 2);
        myCart.displayTotalCost();
        myCart.removeItem("Charger");
        myCart.displayTotalCost();
    }
}