package stackandqueue.sortastackusingrecursion;

import java.util.Stack;

//Create the class main
public class SortMain {

    //Create the main method
    public static void main(String[] args) {

        //Here  we use stack class
        Stack<Integer> stack = new Stack<>();

        //Push the element in the stack
        stack.push(5);
        stack.push(14);
        stack.push(32);
        stack.push(2);
        stack.push(41);

        //Print the original stack
        System.out.println("Original stack: " + stack);
        Sort.sortStack(stack);

        //Print the Sorted stack
        System.out.println("Sorted stack: " + stack);
    }
}
