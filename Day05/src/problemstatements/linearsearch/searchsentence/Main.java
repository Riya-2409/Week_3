package problemstatements.linearsearch.searchsentence;

public class Main {

    //Create the main method
    public static void main(String rags[]){
        String sentence[] = {"Bhopal is the capital of Madhya Pradesh,India","Bhopal is a beautiful city"," It is known city of lake"};
        String word = "beautiful";
        //Call the linearSearch method
        String result = SearchSentences.linearSearch(sentence,word);
        //Print the result
        System.out.println(result);
    }
}
