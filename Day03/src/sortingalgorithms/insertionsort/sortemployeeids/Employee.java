package sortingalgorithms.insertionsort.sortemployeeids;

//Create the class name Employee
public class Employee {

    //Create the method name insertionSort
    public static void insertionSort(int employeeID[]){
        int n = employeeID.length;
        //Run the loop
        for (int i = 1; i < n; i++) {

            // Current element to be placed correctly
            int key = employeeID[i];

            //create the integer variable n
            int j = i - 1;

            // Move elements that are greater than key to one position ahead
            while (j >= 0 && employeeID[j] > key) {
                employeeID[j + 1] = employeeID[j];
                j--;
            }
            // Insert the key at its correct position
            employeeID[j + 1] = key;

        }
    }
}
