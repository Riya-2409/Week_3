package stackandqueue.slidingwindowmaximum;

import java.util.Arrays;


//create the class main
public class Main {

    //Create the main method
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(SlidingWindow.maximumSlidingWindow(nums, k)));
    }
}
