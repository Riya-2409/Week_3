package problemstatements.binarysearch.findfirstlastoccurrence;

//Create the class name FirstAndLastOccurrence
public class FindFirstOccurrence {

    //Create the method name finfFirstOccurrrence
    public static int findFirstOccurrrence(int arr[],int target){
        //Create the integer variable left and assign it 0
        int left = 0;
        //Create the integer variable right and take the length of the array
        int right = arr.length -1;
        //Create the integer variable firstOccurrence and assign it -1
        int firstOccurrence = -1;

        //Run the loop till the left is less than equal to right
        while (left <= right) {
            //Create the integer variable mid and find the mid
            int mid = left + (right - left) / 2;

            //Check the condition
            if (arr[mid] == target) {
                firstOccurrence = mid;
                // Continue searching on the left side
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstOccurrence;
    }
}
