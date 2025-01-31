package sortingalgorithms.quicksort.sortproductprices;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        ProductPrices.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}
