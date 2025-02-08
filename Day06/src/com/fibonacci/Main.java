package com.fibonacci;

//Main Class
public class Main {

        //Main Method
        public static void main(String[] args) {
            int[] testValues = {10, 30, 50, 100};

            for (int n : testValues) {
                // Measuring performance for Recursive approach
                FibonacciSeries.measureExecutionTime("Recursive", n, "recursive");

                // Measuring performance for Iterative approach
                FibonacciSeries.measureExecutionTime("Iterative", n, "iterative");
            }
        }

}
