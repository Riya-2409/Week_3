package problemstatements.challenegeproblem.comaparision;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

//Create the class name CompareFileReaderAndInputStreamReader
public class CompareFileReaderAndInputStreamReader {

    //Create the main method
    public static void main(String args[]) {
        // Specify the file path
        String filePath = "D:/calculator/file.txt";

        //FileReader
        // Declare FileReader  variables
        FileReader fileReader = null;

        // Declare BufferedReader  variables
        BufferedReader brFileReader = null;

        // Declare InputStreamReader  variables
        InputStreamReader inputStreamReader = null;

        // Declare BufferedReader  variables
        BufferedReader brInputStream = null;

        //Use try-catch block
        try {
            // Testing filereader Performance
            long startTime = System.nanoTime();
            // Create a FileReader object to read the file
            fileReader = new FileReader(filePath);
            // Create a BufferedReader object to read the file
            brFileReader = new BufferedReader(fileReader);
            //Create the long variable wordCountFileReader and initialize it 0
            long wordCountFileReader = 0;
            String line;
            // Read the file line by line
            while ((line = brFileReader.readLine()) != null) {
                // Convert the line to lowercase and split it into words based on spaces
                wordCountFileReader += line.split("\\s+").length;
            }
            long endTime = System.nanoTime();
            long durationFileReader = endTime - startTime;
            System.out.println("FileReader word count: " + wordCountFileReader);
            System.out.println("FileReader time: " + durationFileReader / 1_000_000 + " ms");

            // InputStreamReader
            // Testing InputStreamReader Performance
            startTime = System.nanoTime();
            // Create a InputStreamReader object to read the file
            inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
            // Create a BufferedReader object to read the file
            brInputStream = new BufferedReader(inputStreamReader);
            //Create the long variable wordCountInputStream and initialize it 0
            long wordCountInputStream = 0;
            // Read the file line by line
            while ((line = brInputStream.readLine()) != null) {
                // Convert the line to lowercase and split it into words based on spaces
                wordCountInputStream += line.split("\\s+").length;
            }
            endTime = System.nanoTime();
            long durationInputStream = endTime - startTime;
            System.out.println("InputStreamReader word count: " + wordCountInputStream);
            System.out.println("InputStreamReader time: " + durationInputStream / 1_000_000 + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
