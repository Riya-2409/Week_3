package day01linkedlist.singlylinkedlist.inventorymanagementsystem;

//Create the class name InventoryList
public class InventoryList {

    public static Inventory head;
    public static Inventory tail;

    // Constructor to initialize the inventory list
    public InventoryList() {
        this.head = null;
        this.tail = null;
    }

    // Add item at the beginning
    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {

        Inventory newItem = new Inventory(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // Add item at the end
    public void addAtEnd(String itemName, int itemId, int quantity, double price) {

        Inventory newItem = new Inventory(itemName, itemId, quantity, price);
        if (head == null) {
            head = tail =  newItem;
        }
        tail.next = newItem;
        tail = newItem;
    }

    // Add item at a specific position
    public void addAtPosition(int position, String itemName, int itemId, int quantity, double price) {

        if (position < 1) {
            System.out.println("Invalid position!");
            return;
        }
        Inventory newItem = new Inventory(itemName, itemId, quantity, price);
        if (position == 1) {
            newItem.next = head;
            head = newItem;
            return;
        }
        Inventory temp = head;
        int i=1;
        while(i<position-1){
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            System.out.println("Position exceeds inventory size.");
            return;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    // Remove item by Item ID
    public void removeById(int itemId) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Inventory temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Item with ID " + itemId + " not found.");
            return;
        }
        temp.next = temp.next.next;
    }

    // Update quantity by Item ID
    public void updateQuantity(int itemId, int newQuantity) {

        Inventory temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                System.out.println("Quantity updated for Item ID " + itemId);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + itemId + " not found.");
    }

    // Search for an item by Item ID or Name
    public void searchItem(String name, int itemId) {
        Inventory temp = head;
        while(temp!=null){
            if(temp.itemId == itemId){
                System.out.println("Item found: "+" Item name: "+temp.itemName+ " quantity: "+temp.quantity+" price: "+temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with item id "+itemId+" Not found");
    }

    // Calculate total value of inventory
    public void calculateTotalValue() {

        Inventory temp = head;
        double totalValue = 0;
        while (temp != null) {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: $" + totalValue);
    }

    // Sort inventory by Item Name or Price
    public void sortInventory(String sortBy, boolean ascending) {
        if (head == null || head.next == null) return;

        head = mergeSort(head, sortBy, ascending);
    }

    private Inventory mergeSort(Inventory head, String sortBy, boolean ascending) {
        if (head == null || head.next == null) return head;

        Inventory middle = getMiddle(head);
        Inventory nextOfMiddle = middle.next;
        middle.next = null;

        Inventory left = mergeSort(head, sortBy, ascending);
        Inventory right = mergeSort(nextOfMiddle, sortBy, ascending);

        return merge(left, right, sortBy, ascending);
    }

    private Inventory merge(Inventory left, Inventory right, String sortBy, boolean ascending) {
        if (left == null) return right;
        if (right == null) return left;

        boolean condition;
        if (sortBy.equalsIgnoreCase("price")) {
            condition = ascending ? left.price <= right.price : left.price > right.price;
        } else { // Default: Sort by Name
            condition = ascending ? left.itemName.compareToIgnoreCase(right.itemName) <= 0
                    : left.itemName.compareToIgnoreCase(right.itemName) > 0;
        }

        if (condition) {
            left.next = merge(left.next, right, sortBy, ascending);
            return left;
        } else {
            right.next = merge(left, right.next, sortBy, ascending);
            return right;
        }
    }

    private Inventory getMiddle(Inventory head) {
        if (head == null) return head;

        Inventory slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Display all items
    public void displayAllItems() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        Inventory temp = head;
        while (temp != null) {
            System.out.println("Item Name: " + temp.itemName + ", ID: " + temp.itemId +
                    ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }

}
