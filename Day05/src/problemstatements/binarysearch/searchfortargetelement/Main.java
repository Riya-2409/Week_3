package problemstatements.binarysearch.searchfortargetelement;

public class Main {

    //Create the main method
    public static void main(String args[]){
        int matrix[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 11;
        //Call the method searchMatrix
        System.out.println(Search2DMatrix.searchMatrix(matrix,target));
    }
}
