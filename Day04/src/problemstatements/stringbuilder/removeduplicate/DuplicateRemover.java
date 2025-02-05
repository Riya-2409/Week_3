package problemstatements.stringbuilder.removeduplicate;

import java.util.HashSet;

//Create the class name DuplicateRemover that uses StringBuilder to remove all
//duplicate characters from a given string while maintaining the original order
public class DuplicateRemover {

    //Create the method name removeDuplicate
    public static String removeDuplicate(String str){

        //Create the StringBuilder Object
        StringBuilder sb = new StringBuilder();

        // Create a HashSet to track already seen characters
        HashSet<Character> hs = new HashSet<>();

        // Iterate through each character in the string using a for loop
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //Check the condition if the character already in the hashset
            if(!hs.contains(ch)){
                // Append the character to StringBuilder if not seen before
                sb.append(ch);
                // Add the character to the HashSet
                hs.add(ch);
            }
        }

        //Convert the StringBuilder back to a string and return it
        return sb.toString();
    }
}
