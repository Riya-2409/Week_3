package com.sortinglargedata;

public class Main {

    //Create the main method
    public static void main(String args[]){

        // Test with 1000 elements
        CompareSortingAlgorithm.performanceTest(1000);
        // Test with 10,000 elements
        CompareSortingAlgorithm.performanceTest(10000);
        // Test with 100,000 elements
        CompareSortingAlgorithm.performanceTest(100000);
    }
}
