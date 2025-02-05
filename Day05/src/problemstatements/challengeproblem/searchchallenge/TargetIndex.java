package problemstatements.challengeproblem.searchchallenge;

//Create the class name TargetIndex
public class TargetIndex {

    //Create the method name binarySearch for find the target index
    public static int binarySearch(int[] arr, int target) {
        //Create the integer variable left and assign it 0
        int left = 0;
        //Create the integer variable right and assign it length of array -1
        int right = arr.length - 1;
        //Run the while loop
        while (left <= right) {
            //Create the integer variable mid and find the middle
            int mid = left + (right - left) / 2;

            //Check the condition
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
