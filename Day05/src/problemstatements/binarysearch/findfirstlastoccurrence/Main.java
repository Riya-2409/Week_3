package problemstatements.binarysearch.findfirstlastoccurrence;

public class Main {

    public static void main(String args[]) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        //Call the method findFirstAndLastOccurrence
        int[] result = FindFirstAndLastOccurence.findFirstAndLastOccurrence(arr, target);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }
}
