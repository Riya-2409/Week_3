package hashmaphashfuntion.twosumproblem;

import java.util.*;

// Class with name TwoSumProblem
public class TwoSum {

        //Create the method twoSum
        public static int[] twoSum(int[] nums, int target) {

            //Create the integer variable n and assign nums length
            int n=nums.length;
            int arr[]=new int[2];

            // Initialize a HashMap to store the element values and their indices
            HashMap<Integer,Integer>map=new HashMap<>();

            // Iterate through the array
            for(int i=0;i<n;i++){
                int num=nums[i];
                int moreneed=target-num;

                // Check if the moreneed exists in the map
                if(map.containsKey(moreneed))
                {
                    arr[0]=map.get(moreneed);
                    arr[1]=i;
                    return arr;
                }
                // Otherwise, add the current number and its index to the map
                map.put(nums[i],i);

            }
            return arr;
        }
    }


