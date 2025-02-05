package problemstatements.stringbuilder.reversestring;

//Create the class name Main
public class Main {

    //Create the main method
    public static void main(String args[]){
        String str = "Hello";
        //Call the method reverse and store in the reverseString variable
        String reverseString = ReverseString.reverse(str);
        //Print the String
        System.out.println(reverseString);
    }
}
