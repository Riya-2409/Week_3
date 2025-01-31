package sortingalgorithms.heapsort.sortjobapplicantsbysalary;

//Create the class name JobApplicant
public class JobApplicant {

    //Create the class name heapSort
    public static void heapSort(int salaries[]) {
        //Create the integer n and store the length of the array
        int n = salaries.length;

        //Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        //Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap root (max element) with the last element
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Reheapify the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Create the method name heapify
    public static void heapify(int salaries[], int n, int i) {
        // Assume root is the largest
        int largest = i;
        // Left part
        int left = 2 * i + 1;
        // Right part
        int right = 2 * i + 2;

        // If left child is larger than root
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // If right child is larger than the largest so far
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If largest is not root, swap and continue heapifying
        if (largest != i) {
            int temp = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(salaries, n, largest);
        }
    }
}
