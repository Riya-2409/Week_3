package problemstatements.binarysearch.findpeakelement;

//Create the class name PeakElement
public class PeakElement {

    //Create the method name binarySearch
    public static int binarySearch(int arr[]){
        //Create the integer variable left and assign it 0
        int left = 0;
        //Create the integer variable right and assign it array length-1
        int right = arr.length-1;
        //Run the loop if left is less than right
        while(left<right){
            //Create the integer variable mid and find the mid
            int mid = left + (right-left) / 2;
            //Check the condition if arr[mid]>arr[mid-1] and arr[mid]>arr[mid+1] and return mid
            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                return mid;
            } else if( arr[mid] < arr[mid - 1]){
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
