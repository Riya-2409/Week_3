package com.searchatarget;

import java.util.Arrays;
import java.util.Random;

public class PerformanceComparison {

    public static int linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[],int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }

    public static void performanceTest(int n){
        Random random = new Random();
        int input [] = new int[n];
        for(int i=0;i<n;i++){
            input[i] = random.nextInt(1000000);
        }
        int target = input[random.nextInt(n)];
        long startTime = System.nanoTime();
        int linearResult = linearSearch(input,random.nextInt(1000000));
        long endTime = System.nanoTime();
        long linearTime = (endTime -startTime);
        System.out.println("Linear Search for "+n+" elements "+ linearTime+" ns");

        Arrays.sort(input);
        startTime = System.nanoTime();
        int binaryResult = binarySearch(input,random.nextInt(1000000));
        endTime = System.nanoTime();
        long binaryTime = (endTime - startTime);
        System.out.println("Binary Search for "+n+ " elements "+ binaryTime+" ns");

    }
}
