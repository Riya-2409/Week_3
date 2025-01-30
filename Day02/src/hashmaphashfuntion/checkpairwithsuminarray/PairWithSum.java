package hashmaphashfuntion.checkpairwithsuminarray;

import java.util.HashMap;

//Create the class PairWithSum to find if there exists a pair of elements whose sum is equal to the target
public class PairWithSum {

    //Create thew method name findPairWithSum
    public static int[] findPairWithSum(int[] arr, int target) {

        // Initialize a HashMap to store the element values and their indices
        HashMap<Integer, Integer> map = new HashMap<>();


        //Run the loop
        for (int i = 0; i < arr.length; i++) {

            //Create the integer variable complement and find the difference
            int complement = target - arr[i];

            //Check the condition
            if (map.containsKey(complement)) {

                // Return the pair
                return new int[]{complement, arr[i]};
            }

            // Store number and its index
            map.put(arr[i], i);
        }

        // Return an empty array if no pair found
        return new int[0];
    }
}
