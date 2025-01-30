package hashmaphashfuntion.longestconsecutivesequence;

import java.util.*;

//Create the class name LongestConsecutiveSequence to find the length of the longest consecutive elements sequence.
public class LongestConsecutiveSequence {

    //Create the method namelongestConsecutive
    public static int longestConsecutive(int[] nums) {

        //Create the integer variable longestLength and assign it 0
        int longestLength = 0;

        // Initialize a HashMap to store the element values and their indices
        HashMap<Integer, Boolean> numberTravelledMap = new HashMap<>();

        //Run the foreach loop
        for (int num : nums) {
            numberTravelledMap.put(num, Boolean.FALSE);
        }

        //Run the foreach loop
        for (int num : nums) {

            //Create the integer variable longestLength and assign it 1
            int currentLength = 1;

            // Check in forward direction
            int nextNum = num + 1;

            //Run the while loop
            while (numberTravelledMap.containsKey(nextNum) &&
                    numberTravelledMap.get(nextNum) == false) {

                //Increase the currentLength
                currentLength++;

                numberTravelledMap.put(nextNum, Boolean.TRUE);

                // Move to the next number
                nextNum++;
            }

            // Check in reverse direction
            int prevNum = num - 1;

            while (numberTravelledMap.containsKey(prevNum) &&
                    numberTravelledMap.get(prevNum) == false) {

                //Increase the currentLength
                currentLength++;
                numberTravelledMap.put(prevNum, Boolean.TRUE);

                // Move to the previous number
                prevNum--;
            }

            longestLength = Math.max(longestLength, currentLength);
        }

        //Return the longestLength
        return longestLength;
    }
}
