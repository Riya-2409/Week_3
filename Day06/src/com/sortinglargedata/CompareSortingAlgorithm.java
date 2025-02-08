package com.sortinglargedata;

import java.util.Arrays;
import java.util.Random;

//Create the class name CompareSortingAlgorithm
public class CompareSortingAlgorithm {

    //Bubble Sort Implementation
    //Create the method name bubbleSort
    public static void bubbleSort(int arr[]){
        //Run the loop, The outer loop goes from the start of the array to arr.length - 1
        for(int i=0;i<arr.length-1;i++){
            // Inner loop performs the actual comparison and swapping
            //Run the loop, The inner loop goes from the start of the array to arr.length - 1 - i
            for(int j=0;j<arr.length-1-i;i++){
                // Check if the current element is greater than the next element
                if(arr[j]>arr[j+1]){
                    //Swap the element
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //Merge Sort Implementation
    //Create the method name mergeSort
    public static void mergeSort(int arr[],int si,int ei){

        //Check the condition
        if (si >= ei) {
            return;
        }

        //Create the integer variable mid and find the mid
        int mid = si + (ei - si) / 2;
        //Sort Left Part
        mergeSort(arr, si, mid);
        //Sort Left Part
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    //Create the method name merge
    public static void merge(int arr[], int si, int mid, int ei) {
        // Temporary array to store merged values
        int temp[] = new int[ei - si + 1];
        // Pointer for the left half,right half,temp array
        int i = si, j = mid + 1, k = 0;

        // Compare elements from both halves and insert the smaller element into temp
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left half, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half, if any
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    //Quick Sort Implementation
    //Create the class name quickSort
    public static void quickSort(int arr[], int si, int ei) {
        // Base case to stop recursion
        if (si >= ei) {
            return;
        }
        // Find the partition index
        int pIdx = partition(arr, si, ei);
        // Sort left part
        quickSort(arr, si, pIdx - 1);
        // Sort right part
        quickSort(arr, pIdx + 1, ei);
    }

    //Create the method name partition
    public static int partition(int arr[], int si, int ei) {
        // Choosing the last element as the pivot
        int pivot = arr[ei];
        // Index to place elements smaller than pivot
        int i = si - 1;
        // Traverse through the array from si to ei-1
        for (int j = si; j < ei; j++) {
            // If the current element is smaller than pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap ecommerce[i] and ecommerce[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Swap pivot to the correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        // Return pivot index
        return i;
    }

    //Create the method name performanceTest to perform test
    public static void performanceTest(int n){
        // Initialize the random number generator
        Random random = new Random();
        // Create an array of size 'n'
        int input [] = new int[n];
        // Run the loop to populate the array with random integers between 0 and 1,000,000
        for(int i=0;i<n;i++){
            input[i] = random.nextInt(1000000);
        }
        // Randomly choose a target value from the array
        int target = input[random.nextInt(n)];

        // Bubble Sort performance
        int bubbleSortDataset[] = Arrays.copyOf(input,input.length);
        // End measuring time for mergeSort
        long startTime = System.nanoTime();
        // Perform bubble Sort
        bubbleSort(bubbleSortDataset);
        // End measuring time for bubble sort
        long endTime = System.nanoTime();
        //Create the long variable bubbleSortTime and Convert to milliseconds
        long bubbleSortTime = (endTime-startTime)/1000000;
        //print the time taken
        System.out.println("Bubble Sort for " + n + " elements: " + bubbleSortTime + " ms");

        // Bubble Sort performance
        int[] mergeSortDataset = Arrays.copyOf(input, input.length);
        // End measuring time for mergeSort
        startTime = System.nanoTime();
        // Perform merge Sort
        mergeSort(mergeSortDataset, 0, mergeSortDataset.length - 1);
        // End measuring time for merge sort
        endTime = System.nanoTime();
        //Create the long variable mergeSortTime and Convert to milliseconds
        long mergeSortTime = (endTime - startTime) / 1000000;
        //print the time taken
        System.out.println("Merge Sort for " + n + " elements: " + mergeSortTime + " ms");

        // Quick Sort performance
        int quickSortDataset[] = Arrays.copyOf(input,input.length);
        // End measuring time for quickSort
        startTime = System.nanoTime();
        // Perform Quick Sort
        quickSort(quickSortDataset, 0, quickSortDataset.length - 1);
        // End measuring time for quickSort
        endTime = System.nanoTime();
        //Create the long variable quickSortTime and Convert to milliseconds
        long quickSortTime = (endTime-startTime)/1000000;
        //print the time taken
        System.out.println("Bubble Sort for " + n + " elements: " + quickSortTime + " ms");
    }


}
