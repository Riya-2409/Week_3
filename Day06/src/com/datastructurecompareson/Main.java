package com.datastructurecompareson;

//Main Class
public class Main {

        //Create the main method
        public static void main(String[] args) {
            // Test search performance for different dataset sizes
            int[] testSizes = {1000, 10000, 100000, 1000000};  // Varying dataset sizes

            for (int size : testSizes) {
                // Search for the target value in the middle of the range (for example, size / 2)
                DataStructuresComparisonForSearching. compareSearchPerformance(size, size / 2);
            }
        }


}
