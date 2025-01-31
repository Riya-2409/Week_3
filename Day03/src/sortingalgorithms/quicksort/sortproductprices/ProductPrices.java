package sortingalgorithms.quicksort.sortproductprices;

//Create the class name ProductPrices
public class ProductPrices {

    //Create the method name quickSort
    public static void quickSort(int ecommerce[], int si, int ei) {
        // Base case to stop recursion
        if (si >= ei) {
            return;
        }
        // Find the partition index
        int pIdx = partition(ecommerce, si, ei);
        // Sort left part
        quickSort(ecommerce, si, pIdx - 1);
        // Sort right part
        quickSort(ecommerce, pIdx + 1, ei);
    }

    //Create the method name partition
    public static int partition(int ecommerce[], int si, int ei) {
        // Choosing the last element as the pivot
        int pivot = ecommerce[ei];
        // Index to place elements smaller than pivot
        int i = si - 1;
        // Traverse through the array from si to ei-1
        for (int j = si; j < ei; j++) {
            // If the current element is smaller than pivot
            if (ecommerce[j] <= pivot) {
                i++;
                // Swap ecommerce[i] and ecommerce[j]
                int temp = ecommerce[j];
                ecommerce[j] = ecommerce[i];
                ecommerce[i] = temp;
            }
        }
        // Swap pivot to the correct position
        i++;
        int temp = ecommerce[i];
        ecommerce[i] = ecommerce[ei];
        ecommerce[ei] = temp;

        // Return pivot index
        return i;
    }

}
