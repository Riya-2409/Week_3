package stackandqueue.queueusingstack;

import java.util.*;
import java.util.Stack;

//Create the class name Queue which is used for implementation of queue using stack
public class Queue {

    //Here we use stack class
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    //Check if stack1 is empty or not
    public  boolean isEmpty(){
        return stack1.isEmpty();
    }

    //Add the data in the stack
    public  void add(int data){

        //Check the condition
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        //Push the data in stack 1
        stack1.push(data);

        //Check the condition and add in stack1 and remove from stack2
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    //Remove the data from the stack
    public  int remove(){
        //Check the condition is stack1 is empty print stack is empty
        while(stack1.isEmpty()){
            System.out.println("queue is empty");
        }
        //Remove data from the stack1
        return stack1.pop();
    }

    //Returns the element without removing it.
    public  int peek(){
        //Check the condition is stack1 is empty print stack is empty
        while(stack1.isEmpty()) {
            System.out.println("queue is empty");

        }
        return stack1.peek();
    }
}
