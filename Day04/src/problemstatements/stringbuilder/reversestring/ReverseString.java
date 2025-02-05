package problemstatements.stringbuilder.reversestring;

//Create the class name ReverseString that uses StringBuilder to reverse a given string
public class ReverseString {

    //Create the method name reverse
    public static String reverse(String str){

        //Create the StringBuilder Object
        StringBuilder sb = new StringBuilder();

        //Run the loop
        for(int i= str.length()-1;i>=0;i--){
            //Append the string to the StringBuilder
            sb.append(str.charAt(i));
        }
        //Convert the StringBuilder back to a string and return it
        return sb.toString();
    }
}
