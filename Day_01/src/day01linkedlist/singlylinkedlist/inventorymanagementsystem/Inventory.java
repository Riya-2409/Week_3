package day01linkedlist.singlylinkedlist.inventorymanagementsystem;

//Create the class name inventory
public class Inventory {

    String itemName;
    int itemId;
    int quantity;
    double price;
    Inventory next;

    // Constructor to initialize inventory item
    public Inventory(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
