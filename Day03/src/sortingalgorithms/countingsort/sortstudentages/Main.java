package sortingalgorithms.countingsort.sortstudentages;
import java.util.Arrays;

public class Main {

    //Create the main method
    public static void main(String[] args) {
        int[] studentAges = {12, 15, 11, 18, 10, 14, 13, 12, 16, 17};
        // Call counting sort function
        StudentAges.countingSort(studentAges);
        // Print sorted array
        System.out.println("Sorted Ages: " + Arrays.toString(studentAges));
    }
}

