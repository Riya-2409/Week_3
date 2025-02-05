package problemstatements.binarysearch.findrotationpoint;

//Create the class name RotationPoint
public class RotationPoint {

    //Create the method name binary search
    public static int binarySearch(int rotateArr[]){
        //Create the integer variable left and assign it 0
        int left = 0;
        //Create the integer variable right and assign it array length-1
        int right = rotateArr.length-1;
        //Run the loop if left is less than right
        while(left<right){
            //Create the integer variable mid and find the mid
            int mid = (left + right) / 2;
            //Check the condition if arr[mid] is grater than the arr[right]
            if(rotateArr[mid] > rotateArr[right]){
                //the smallest element is in the right half
                left = mid + 1;
            }else{
                //the smallest element is in the left half
                right = mid;
            }
        }
        //return the left
        return left;
    }
}
