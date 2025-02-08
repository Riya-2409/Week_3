package com.stringconcatenation;

public class Main {

    //Create the main method
    public static void main(String[] args) {

        // Test with 1000 elements
        ConcatenationString.stringConcatenationPerformance(1000);
        // Test with 10000 elements
        ConcatenationString.stringConcatenationPerformance(10000);
        // Test with 100000 elements
        ConcatenationString.stringConcatenationPerformance(100000);
        // Test with 1000000 elements
        ConcatenationString.stringConcatenationPerformance(1000000);
    }
}
