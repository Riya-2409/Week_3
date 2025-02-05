package problemstatements.stringbuilder.removeduplicate;

public class Main {

    //Crate the main Method
    public static void main(String[] args) {
        String str = "programming";
        //Call the method removeDuplicate
        String result = DuplicateRemover.removeDuplicate(str);
        //print the output
        System.out.println(result);
    }
}
