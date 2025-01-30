package hashmaphashfuntion.twosumproblem;

public class Main {

    public static void main(String args[]){
        // Array
        int array[] = {2,7,11,15};
        // Target
        int target = 9;
        int[] result = TwoSum.twoSum(array, target);
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found");
        }
    }
}

