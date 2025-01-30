package stackandqueue.sortastackusingrecursion;

import java.util.Stack;

//Create a class name sort to sort the stack in ascending order
public class Sort {

    //Create the sortStack Method
    public static void sortStack(Stack<Integer> stack) {

        //Check the condition if the stack is not empty
        if (!stack.isEmpty()) {

            // Remove the top item and store in the element variable
            int element = stack.pop();

            // Sort the remaining stack
            sortStack(stack);

            // Insert back in sorted order
            SortedInsert.sortedInsert(stack, element);
        }
    }
}
