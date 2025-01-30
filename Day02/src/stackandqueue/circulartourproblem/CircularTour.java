package stackandqueue.circulartourproblem;

import java.util.*;

//Create the class name CircularTour to determine the starting point for completing a circular tour.
public class CircularTour {

    //Create the method name startingPoint
    public static int startingPoint(int petrol[], int distance[]) {

        //Here we use Deque class
        Queue<Integer> queue = new ArrayDeque<>();

        //Create the integer variable start,extraFuel,requiredFuel and assign it to 0
        int start = 0;
        int total = 0;
        int current = 0;

        //Run the loop
        for (int i = 0; i < petrol.length; i++) {

            //Create the integer variable balance and find the difference between the petrol and disatnce
            int balance = petrol[i] - distance[i];
            total += balance;
            current += balance;
            queue.add(i);

            // If current surplus becomes negative, remove elements from queue and reset start
            while (current < 0 && !queue.isEmpty()) {
                int failedPump = queue.poll();
                start = failedPump + 1;
                current -= (petrol[failedPump] - distance[failedPump]);
            }
        }
        // If total petrol is less than total distance, a circular tour isn't possible
        return (total >= 0) ? start : -1;
    }
}
