package problemstatements.challengeproblem.searchchallenge;

//Create the class name SearchMissing
public class SearchMissing {

    //Create the method name linearSearch for finding the missing positive integer
    public static int linearSearch(int arr[]){
        //Create the boolean variable found and create the new bject
        boolean[] found = new boolean[arr.length + 1];
        //run the loop
        for(int i=0;i<arr.length;i++){
            //check the condition
            if(arr[i]>0 && arr[i]< arr.length && arr[arr[i] - 1] != arr[i]){
                //Swap
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1]= temp;

            }
        }
        //Run the loop
        for (int i = 0; i < arr.length; i++) {
            //Check the condition
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return arr.length + 1;
    }
}
