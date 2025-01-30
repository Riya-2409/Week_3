package hashmaphashfuntion.checkpairwithsuminarray;

//Create the class main
public class Main {

    //Create the main method
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 8, 7};
        int target = 10;

        int[] result = PairWithSum.findPairWithSum(arr, target);

        if (result.length > 0) {
            System.out.println("Pair found: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("No pair found.");
        }
    }
}
