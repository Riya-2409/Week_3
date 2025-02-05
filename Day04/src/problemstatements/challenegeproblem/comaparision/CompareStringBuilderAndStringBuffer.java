package problemstatements.challenegeproblem.comaparision;

//Create the class name CompareStringBuilderAndStringBuffer
public class CompareStringBuilderAndStringBuffer {

    //Create the main method
    public static void main(String[] args) {
        //Create the string variable str
        String str = "hello";
        //Create the integer variable iterations
        int iterations = 1_000_000;
        //Create the long variable startTime,endTime
        long startTime,endTime;

        // Testing StringBuilder Performance
        startTime = System.nanoTime();
        //Create the StringBuilder Object
        StringBuilder sb = new StringBuilder();
        //Run the loop to the iterations
        for (int i = 0; i < iterations; i++) {
            // Append the string to StringBuilder
            sb.append(str);
        }
        endTime = System.nanoTime();
        //Create the long variable durationSB and find difference
        long durationSB = endTime - startTime;
        //Print the stringbuilder performance
        System.out.println("StringBuilder time: " + durationSB / 1_000_000 + " ms");

        // Testing StringBuffer Performance
        startTime = System.nanoTime();
        //Create the StringBuffer Object
        StringBuffer sbf = new StringBuffer();
        //Run the loop
        for (int i = 0; i < iterations; i++) {
            // Append the string to StringBuffer
            sbf.append(str);
        }
        endTime = System.nanoTime();
        //Create the long variable durationSBF and find difference
        long durationSBF = endTime - startTime;
        //Print the stringbuffer performance
        System.out.println("StringBuffer time: " + durationSBF / 1_000_000 + " ms");
    }
}

