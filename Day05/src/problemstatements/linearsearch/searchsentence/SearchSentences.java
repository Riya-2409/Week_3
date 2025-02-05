package problemstatements.linearsearch.searchsentence;

//Create the class name SearchWord
public class SearchSentences {

    //Create the class name linear search
    public static String linearSearch(String sentence[],String word){
        //Run the loop to the length of the array
        for(int i=0;i<sentence.length;i++){
            //Create the string variable sentences and store the index of the sentences
            String sentences = sentence[i];
            //Check the condition if the sentence contains the word return sentence
            if(sentences.contains(word)){
                 return sentences;
            }
        }
        //If the word is not found then retun not found
        return "Not Found";
    }
}
