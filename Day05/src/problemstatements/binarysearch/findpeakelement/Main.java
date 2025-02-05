package problemstatements.binarysearch.findpeakelement;

public class Main {

    //Create the main method
    public static void main(String[]args){
        int arr[] = {1, 3, 20, 4, 1, 0};
        //Call the method binarySearch
        int peakIndex = PeakElement.binarySearch(arr);
        //Print the peakindex
        System.out.println("Peak Element Index: " + peakIndex);
        //Print the peak element
        System.out.println("Peak Element: " + arr[peakIndex]);
    }
}
