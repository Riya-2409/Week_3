package com.stringconcatenation;

//Create the class name ConcatenationString
public class ConcatenationString {

    public static void stringConcatenationPerformance(int n){
        //Create an array of string of size n
        String strings[] = new String[n];
        for(int i=0;i<n;i++){
            // Assigning a string with index to each element
            strings[i] = "string"+i;
        }
        // Measure time for String concatenation
        // start measuring time for Strings
        long startTime = System.nanoTime();
        String resultString = "";
        // Initialize an empty string to store the result
        for (int i = 0; i < n; i++) {
            // Concatenate each string using the "+" operator (O(N²))
            resultString += strings[i];
        }
        //End time for String
        long endTime = System.nanoTime();
        long stringTime =(endTime-startTime)/1000000;
        //Print String time
        System.out.println("String concatenation for " + n + " elements: " + stringTime + " ms");

        // Measure time for StringBuilder concatenation
        //Start time for stringBuilder
        startTime = System.nanoTime();
        // Create a StringBuilder object
        StringBuilder resultStringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            // StringBuilder concatenation (O(N))
            resultStringBuilder.append(strings[i]);
        }
        //End time for stringBuilder
        endTime = System.nanoTime();
        long stringBuilderTime =(endTime-startTime)/1000000;
        //Print stringBuilderTime
        System.out.println("StringBuilder concatenation for " + n + " elements: " + stringBuilderTime + " ms");

        // Measure time for StringBuffer concatenation
        //Start time for StringBuffer
        startTime = System.nanoTime();
        //Create StringBuffer object
        StringBuffer resultStringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            // StringBuffer concatenation (O(N))
            resultStringBuffer.append(strings[i]);
        }
        //end time for StringBuffer
        endTime = System.nanoTime();
        long stringBufferTime = (endTime-startTime)/1000000;
        //Print stringBufferTime
        System.out.println("StringBuffer concatenation for " + n + " elements: " + stringBufferTime + " ms");
    }

}
