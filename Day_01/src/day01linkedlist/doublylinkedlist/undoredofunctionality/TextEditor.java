package day01linkedlist.doublylinkedlist.undoredofunctionality;

//Create the class name TextEditor
public class TextEditor {

    private Text head;
    private Text tail;
    private Text current;
    private final int maxHistorySize;
    private int currentSize;

    public TextEditor(int maxHistorySize) {
        this.maxHistorySize = maxHistorySize;
        this.currentSize = 0;
    }

    // Add a new text state
    public void addTextState(String content) {
        Text newState = new Text(content);

        if (current != null) {
            current.next = newState;
            newState.prev = current;
        } else {
            head = newState;
        }

        current = newState;
        tail = newState;

        // Adjust history size
        if (currentSize < maxHistorySize) {
            currentSize++;
        } else {
            // Remove oldest state
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        }

        System.out.println("Text state added: " + content);
    }

    // Undo functionality
    public void undo() {
        if (current == null || current.prev == null) {
            System.out.println("Undo not possible.");
            return;
        }

        current = current.prev;
        System.out.println("Undo: Current state is \"" + current.content + "\"");
    }

    // Redo functionality
    public void redo() {
        if (current == null || current.next == null) {
            System.out.println("Redo not possible.");
            return;
        }

        current = current.next;
        System.out.println("Redo: Current state is \"" + current.content + "\"");
    }

    // Display the current state
    public void displayCurrentState() {
        if (current == null) {
            System.out.println("No text state available.");
        } else {
            System.out.println("Current state: \"" + current.content + "\"");
        }
    }

    // Display all states for debugging
    public void displayAllStates() {
        System.out.println("All states in history:");
        Text temp = head;
        while (temp != null) {
            System.out.println(temp.content);
            temp = temp.next;
        }
    }

}
