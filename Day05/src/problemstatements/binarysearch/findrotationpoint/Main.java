package problemstatements.binarysearch.findrotationpoint;

public class Main {

    //Create the main method
    public static void main(String args[]){
        int rotateArr[] = {4,5,6,7,0,1,2};
        //Call the method binarySearch
        int rotationPoint = RotationPoint.binarySearch(rotateArr);
        //Print the rotation point
        System.out.println("Rotation Point Index: " + rotationPoint);
        //Print the smallest element in the array
        System.out.println("Smallest Element: " + rotateArr[rotationPoint]);
    }
}
