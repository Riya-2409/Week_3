package stackandqueue.sortastackusingrecursion;

import java.util.Stack;

//Create the class name Insert to insert the element in the Stack in the ascending order
public class SortedInsert {

    //Create the method name sortedInsert
     static void sortedInsert(Stack<Integer> stack, int element) {

        //Check the condition if the stack is empty or element is greater than the top of the element
        if (stack.isEmpty() || stack.peek() <= element) {

            //Push the element in the stack
            stack.push(element);
        } else {

            // Remove the top item
            int temp = stack.pop();

            // Recursively insert element in the correct position
            sortedInsert(stack, element);

            // Push back the removed element
            stack.push(temp);
        }
    }
}