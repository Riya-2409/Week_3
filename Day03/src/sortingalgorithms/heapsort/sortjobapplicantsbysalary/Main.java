package sortingalgorithms.heapsort.sortjobapplicantsbysalary;

public class Main {

    public static void main(String[] args) {
        int salaries[] = {5, 3, 8, 4, 2};

        // Call Heap Sort to sort salaries in ascending order
        JobApplicant.heapSort(salaries);

        // Print sorted array
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
    }
}
