package problemstatements.stringbuffer.concatestring;

//Create the class name ConcateString that uses StringBuffer
// to concatenate all the strings in the array efficiently.
public class ConcateString {

    //Create the method name stringConcatenator
    public static String stringConcatenator(String[] str){

        //Create the StringBuffer Object
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length;i++){
            // Append the character to StringBuilder
            sb.append(str[i]);
        }
        //Convert the StringBuilder back to a string and return it
        return sb.toString();
    }
}
