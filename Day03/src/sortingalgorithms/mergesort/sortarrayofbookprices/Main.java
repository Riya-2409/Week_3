package sortingalgorithms.mergesort.sortarrayofbookprices;

import java.util.Arrays;
public class Main {

    //Create the main method
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        //Call the method name mergeSort
        SortArrayOfBookPrices.mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}
