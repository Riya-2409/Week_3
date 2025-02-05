package problemstatements.linearsearch.negativenumber;

//Create the class name FirstNegativeNumber
public class FirstNegativeNumber {

    //Create the method name linearSearch
    public static int linearSearch(int arr[]){
        //Run the loop to the length of the array
        for(int i=0;i<arr.length;i++){
            //Check the condition if array of i is less than 0 return its index
            if(arr[i]<0){
                return i;
            }
        }
        //If key is not found return -1
        return -1;
    }
}
