package day01linkedlist.doublylinkedlist.undoredofunctionality;

public class UnoRedoFuntionalityMain {

    public static void main(String[] args) {

        //Create the
        TextEditor editor = new TextEditor(10);

        // Simulating text editor actions
        editor.addTextState("Hello");
        editor.addTextState("Hello, World");
        editor.addTextState("Hello, World!");
        editor.addTextState("Hello, World! How are you?");
        editor.displayCurrentState();

        // Perform undo actions
        editor.undo();
        editor.undo();
        editor.displayCurrentState();

        // Perform redo actions
        editor.redo();
        editor.displayCurrentState();

        // Add more states to demonstrate history limitation
        editor.addTextState("Adding more content.");
        editor.addTextState("State with a long sentence to exceed the history size.");
        editor.addTextState("Final text state.");
        editor.displayAllStates();
    }
}
