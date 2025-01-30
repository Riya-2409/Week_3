package stackandqueue.slidingwindowmaximum;

import java.util.*;

//Create the class name SlidingWindow  to find the maximum element in each sliding window of size k.
public class SlidingWindow {

    //Create the method name maximumSlidingWindow
    public static int[] maximumSlidingWindow(int nums[],int k){

        //Check the condition if nums is equal to null or k is smaller than 0
        if(nums == null || k<0)
            return new int[0];

        //Create the integer variable n and assign the length of the num
        int n = nums.length;

        //Create the integer array variable result and create new object
        int result[] = new int[n-k+1];

        //Here we use deque class
        Deque<Integer> deque = new ArrayDeque<>();

        //Run the loop
        for(int i=0;i<n;i++){

            //Remove the element no in the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove elements smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current element at the back of the deque
            deque.offerLast(i);

            // Store the maximum in the result
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;

    }

}
