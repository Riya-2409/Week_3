package com.fibonacci;

// Program to compare Recursive (O(2ⁿ)) vs Iterative (O(N)) Fibonacci solutions.
public class FibonacciSeries {

        // Recursive
        public static int fibonacciRecursive(int n) {
            if (n <= 1) return n;
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }

        // Iterative:
        public static int fibonacciIterative(int n) {
            int a = 0, b = 1, sum;
            for (int i = 2; i <= n; i++) {
                sum = a + b;
                a = b;
                b = sum;
            }
            return b;
        }

        // Method to measure execution time
        public static void measureExecutionTime(String method, int n, String approach) {
            long startTime = System.nanoTime();

            // Execute the respective Fibonacci function based on the approach
            if (approach.equals("recursive")) {
                fibonacciRecursive(n);
            } else if (approach.equals("iterative")) {
                fibonacciIterative(n);
            }

            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000000; // Convert to milliseconds
            System.out.println("Time taken for " + method + " approach with N = " + n + " is " + duration + "ms");
        }



}
