package day01linkedlist.singlylinkedlist.inventorymanagementsystem;

//Create the InventoryManagementSystemMain class
public class InventoryManagementSystemMain {

    public static void main(String[] args) {

        //Create the inventory list object
        InventoryList inventory = new InventoryList();

        // Add items
        inventory.addAtEnd("Laptop", 101, 5, 1000.0);
        inventory.addAtBeginning("Mouse", 102, 50, 20.0);
        inventory.addAtEnd("Keyboard", 103, 30, 50.0);
        inventory.addAtPosition(2, "Monitor", 104, 10, 200.0);

        // Display all items
        System.out.println("All Inventory Items:");
        inventory.displayAllItems();

        // Update quantity
        System.out.println("Updating quantity for Item ID 102:");
        inventory.updateQuantity(102, 60);

        // Search for an item
        System.out.println("Searching for Item with ID 103:");
        inventory.searchItem("Keyboard",103);

        // Calculate total value
        System.out.println("Calculating total inventory value:");
        inventory.calculateTotalValue();

        // Sort by price ascending
        System.out.println("Sorting inventory by Price (Ascending):");
        inventory.sortInventory("price", true);
        inventory.displayAllItems();

        // Remove an item
        System.out.println("Removing Item with ID 104:");
        inventory.removeById(104);
        inventory.displayAllItems();
    }
}
