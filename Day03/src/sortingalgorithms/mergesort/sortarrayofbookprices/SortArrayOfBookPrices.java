package sortingalgorithms.mergesort.sortarrayofbookprices;

//Create the class name SortArrayOfBookPrices
public class SortArrayOfBookPrices {

    //Create the method name mergeSort
    public static void mergeSort(int prices[], int si, int ei) {

        //Check the condition
        if (si >= ei) {
            return;
        }

        //Create the integer variable mid and find the mid
        int mid = si + (ei - si) / 2;
        //Sort Left Part
        mergeSort(prices, si, mid);
        //Sort Left Part
        mergeSort(prices, mid + 1, ei);
        merge(prices, si, mid, ei);
    }

    //Create the method name merge
    public static void merge(int prices[], int si, int mid, int ei) {
        // Temporary array to store merged values
        int temp[] = new int[ei - si + 1];
        // Pointer for the left half,right half,temp array
        int i = si, j = mid + 1, k = 0;

        // Compare elements from both halves and insert the smaller element into temp
        while (i <= mid && j <= ei) {
            if (prices[i] < prices[j]) {
                temp[k++] = prices[i++];
            } else {
                temp[k++] = prices[j++];
            }
        }

        // Copy remaining elements from left half, if any
        while (i <= mid) {
            temp[k++] = prices[i++];
        }

        // Copy remaining elements from right half, if any
        while (j <= ei) {
            temp[k++] = prices[j++];
        }

        // Copy sorted elements back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            prices[i] = temp[k];
        }
    }
}
