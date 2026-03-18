class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryMain {
    public static void main(String[] args) {
        Item item = new Item(501, "Laptop", 45000.0);
        item.displayItemDetails();
        int qty = 3;
        System.out.println("Total cost for " + qty + " items: " + item.calculateTotalCost(qty));
        System.out.println("-------------------------");
    }
}