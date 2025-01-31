package sortingalgorithms.insertionsort.sortemployeeids;

import java.util.*;

public class Main {

    //Create the main method
    public static void main(String[] args) {
        int[] employeeID = {5, 3, 8, 4, 2};
        Employee.insertionSort(employeeID);
        System.out.println(Arrays.toString(employeeID));
    }

}


