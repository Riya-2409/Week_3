package problemstatements.filereader.readafile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Create the class name ReadAFile
public class ReadAFile {

       //Create the main method
        public static void main(String[] args) {
            //Define the specific path
            String filePath = "D:/calculator/file.txt";

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
                    // Print each line to the console
                    System.out.println(line);
                }

            } catch (FileNotFoundException e) {
                // Handle case where the specified file is not found
                System.out.println("File not found: " + e.getMessage());
            } catch (IOException e) {
                // Handle errors that occur while reading the file
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
    }

