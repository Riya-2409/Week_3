package hashmaphashfuntion.subarrayswithzerosum;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int arr[] = {2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4};
        int count =  Subarray.subarrayWithSumZero(arr);
        System.out.println("Number of zero sum subarrays: " + count);
    }
}
