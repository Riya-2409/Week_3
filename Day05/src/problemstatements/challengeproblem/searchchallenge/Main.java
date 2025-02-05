package problemstatements.challengeproblem.searchchallenge;

public class Main {

    //Create the main method
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        //Call the method name linearSearch
        int missingNumber = SearchMissing.linearSearch(arr);
        //Print the missing number
        System.out.println("First missing positive number: " + missingNumber);

        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        //Call the method binarySearch
        int index = TargetIndex.binarySearch(sortedArray, target);

        //Check the condition
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found.");
        }
    }
}
