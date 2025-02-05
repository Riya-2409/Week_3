package problemstatements.linearsearch.negativenumber;

public class Main {

    //Create the main method
    public static void main(String args[]){
        int arr[] = {3,5,6,-8,9,1,2};
        //Call the method linearSearch
        int index = FirstNegativeNumber.linearSearch(arr);
        //Check the condition if index is equals to -1 print not found otherwise print the index
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("First negative number is at index: "+index);
        }
    }
}
