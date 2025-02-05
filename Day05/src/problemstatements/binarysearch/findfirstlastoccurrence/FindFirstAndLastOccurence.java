package problemstatements.binarysearch.findfirstlastoccurrence;

//Create the class name FindFirstAndLastOccurence
public class FindFirstAndLastOccurence {

    //Create the method name findFirstAndLastOccurrence
    public static int[] findFirstAndLastOccurrence(int[] arr, int target) {
        //Call the method name findFirstOccurrrence
        int first = FindFirstOccurrence.findFirstOccurrrence(arr,target);
        //Call the method name findLastOccurrrence
        int last = FindLastOccurrence.findLastOccurrrence(arr, target);
        return new int[]{first, last};
    }
}
