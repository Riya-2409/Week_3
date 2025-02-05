package problemstatements.stringbuffer.comparestringbufferwithstringbuilder;

//Create the class name Comapre
public class Compare {

    //Create the main method
    public static void main(String args[]){

        //Create the FINAL integer variable ITERATION and assign it the value
        final int  ITERATION = 1000000;
        //Create the string variable str
        String str = "hello";
        //Create the long variable startTime,endTime
        long startTime,endTime;

        //Create the StringBuffer object
        StringBuffer sbr = new StringBuffer();
        // Testing StringBuffer Performance
        startTime = System.nanoTime();
        for(int i=0;i<ITERATION;i++){
            // Append the str to StringBuffer
            sbr.append(str);
        }
        endTime = System.nanoTime();
        //Create the long variable stringBufferTime and find the difference
        long stringBufferTime = endTime-startTime;
        //Print the stringBufferTime
        System.out.println("StringBuffer Time: "+stringBufferTime+" ns");

        //Create the StringBuilder object
        StringBuffer sbl = new StringBuffer();
        // Testing StringBuffer Performance
        startTime = System.nanoTime();
        for(int i=0;i<ITERATION;i++){
            // Append the str to StringBuilder
            sbr.append(str);
        }
        endTime = System.nanoTime();
        //Create the long variable stringBuilderTime and find the difference
        long stringBuilderTime = endTime-startTime;
        System.out.println("StringBuilder Time: "+stringBuilderTime+" ns");

        //Conpare the stringBuffer and StringBuilder
        if(stringBufferTime>stringBuilderTime){
            System.out.println("StringBuilder is faster by " + (stringBufferTime - stringBuilderTime) + " ns");
        }else if(stringBufferTime<stringBuilderTime){
            System.out.println("StringBuilder is faster by " + (stringBuilderTime - stringBufferTime) + " ns");
        }else {
            System.out.println("Both performed equally.");
        }
    }
}
