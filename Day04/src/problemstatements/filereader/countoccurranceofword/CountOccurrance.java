package problemstatements.filereader.countoccurranceofword;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Create the class name  CountOccurrance
public class CountOccurrance {

    //Create the main method
        public static void main(String[] args) {

            // Specify the file path
            String filePath = "D:/calculator/file.txt";
            // Define the target word to be counted in the file
            String targetWord = "riya";

            //Create the integer variable wordCount and assign it 0
            int wordCount = 0;

            // Declare FileReader and BufferedReader variables
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;

            //Use try catch block to handle exception
            try {
                // Create a FileReader object to read the file
                fileReader = new FileReader(filePath);
                bufferedReader = new BufferedReader(fileReader);

                String line;
                // Read the file line by line
                while ((line = bufferedReader.readLine()) != null) {
                    // Convert the line to lowercase and split it into words based on spaces
                    String[] words = line.toLowerCase().split("\\s+");

                    // Iterate through each word in the line
                    for (String word : words) {
                        // Remove punctuation and compare words
                        word = word.replaceAll("[^a-zA-Z]", "");
                        // Compare the cleaned word with the target word
                        if (word.equals(targetWord.toLowerCase())) {
                            // Increment the count if a match is found
                            wordCount++;
                        }
                    }
                }

                // Print the final count of occurrences of the target word
                System.out.println("The word \"" + targetWord + "\" appears " + wordCount + " times in the file.");

            } catch (IOException e) {
                // Handle errors that occur while reading the file
               e.printStackTrace();
            }
        }
    }



