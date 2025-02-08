package com.datastructurecompareson;

import java.util.*;

//Program to compare Array (O(N)), HashSet (O(1)), and TreeSet (O(log N)) for searching elements.
public class DataStructuresComparisonForSearching {

        // Method to create and return an Array with given size N
        public static int[] createArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }
            return array;
        }

        // Method to create and return a HashSet with given size N
        public static HashSet<Integer> createHashSet(int size) {
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }
            return hashSet;
        }

        // Method to create and return a TreeSet with given size N
        public static TreeSet<Integer> createTreeSet(int size) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < size; i++) {
                treeSet.add(i);
            }
            return treeSet;
        }

        // Method to perform Array search: Linear Search (O(N))
        public static boolean arraySearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return true;
                }
            }
            return false;
        }

        // Method to perform HashSet search: O(1) (on average)
        public static boolean hashSetSearch(HashSet<Integer> set, int target) {
            return set.contains(target);
        }

        // Method to perform TreeSet search: O(log N)
        public static boolean treeSetSearch(TreeSet<Integer> set, int target) {
            return set.contains(target);
        }

        // Method to measure and print the execution time
        public static void measureExecutionTime(String method, long startTime, long endTime) {
            long duration = (endTime - startTime) / 1000000; // Convert to milliseconds
            System.out.println("Time taken for " + method + " search: " + duration + "ms");
        }

        // Method to perform the search for a dataset of given size and measure time taken
        public static void compareSearchPerformance(int size, int target) {
            System.out.println("Testing search performance for dataset size: " + size);

            // Create data structures
            int[] array = createArray(size);
            HashSet<Integer> hashSet = createHashSet(size);
            TreeSet<Integer> treeSet = createTreeSet(size);

            // Perform Array Search
            long startTime = System.nanoTime();
            arraySearch(array, target);
            long endTime = System.nanoTime();
            measureExecutionTime("Array", startTime, endTime);

            // Perform HashSet Search
            startTime = System.nanoTime();
            hashSetSearch(hashSet, target);
            endTime = System.nanoTime();
            measureExecutionTime("HashSet", startTime, endTime);

            // Perform TreeSet Search
            startTime = System.nanoTime();
            treeSetSearch(treeSet, target);
            endTime = System.nanoTime();
            measureExecutionTime("TreeSet", startTime, endTime);
        }


}
