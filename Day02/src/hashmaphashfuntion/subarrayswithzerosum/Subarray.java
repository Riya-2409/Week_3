package hashmaphashfuntion.subarrayswithzerosum;

import java.util.*;

// Create the class Subarray to find all subarrays whose elements sum up to zero.
public class Subarray {

    // Method to find the number of subarrays with sum zero
    public static int subarrayWithSumZero(int arr[]) {

        //Create the integer variable count and initialize with it zero;
        int count = 0;

        // Initialize a HashMap to store the element values and their indices
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        // Initialize with sum 0 at index -1 to handle cases where subarray starts from index 0
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum exists in map, add the frequency to count
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }

            // Update frequency of the sum in the map
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

}
