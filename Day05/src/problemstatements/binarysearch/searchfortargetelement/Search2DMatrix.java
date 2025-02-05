package problemstatements.binarysearch.searchfortargetelement;

//Create the class name Matrix
public class Search2DMatrix {

    //Create the method name searchMatrix
    public static boolean searchMatrix(int matrix[][],int target){
        //Check the condition if the matrix is empty and has no column retun false
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        //Create integer variable rows and find the no. of rows in the matrix
        int rows = matrix.length;
        //Create integer variable rows and find the no. of rows in the matrix
        int cols = matrix[0].length;
        //Create integer variable rows and assign it 0
        int left = 0;
        //Create integer variable rows and calculate no. of rows * no. of column -1
        int right = rows * cols - 1;

        //Run the loop if left is less than right
        while(left<=right) {
            //Create the integer variable mid and find the mid
            int mid = left + (right - left) / 2;
            //Create the integer variable midElement and Convert mid to row and column indices
            int midElement = matrix[mid / cols][mid % cols];
            //Check the condition if midElement == target then return true
            if (midElement == target) {
                return true;
            }//Check the condition if midElement less than  target then return left = mid+1
            else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
