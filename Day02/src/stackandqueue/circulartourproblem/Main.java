package stackandqueue.circulartourproblem;

public class Main {

    public static void main(String[] args) {
        int[] petrol = {7,8,5,11,7,6};
        int[] distance = {6,7,8,9,7,5};

        int startIndex = CircularTour.startingPoint(petrol, distance);
        if (startIndex == -1) {
            System.out.println("No circular tour is possible");
        } else {
            System.out.println("Start at petrol pump: " + startIndex);
        }
    }
}
