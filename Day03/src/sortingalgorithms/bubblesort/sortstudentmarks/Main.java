package sortingalgorithms.bubblesort.sortstudentmarks;

import java.util.Arrays;

public class Main {
    //Create the main method
    public static void main(String[] args) {
        int[] studentMarks = {78, 92, 45, 89, 60, 33, 99, 50};
        System.out.println("Original Marks: " + Arrays.toString(studentMarks));

        SortStudentMarks.buubleSort(studentMarks);

        System.out.println("Sorted Marks: " + Arrays.toString(studentMarks));
    }
}
