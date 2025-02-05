package problemstatements.inputstream.readuserinput;

import java.io.*;

//Create the class name ReadUserInputToFile
public class ReadUserInputToFile {

        //Create the main method
        public static void main(String[] args) {
            // Define the output file path
            String filePath = "D:/calculator/file.txt";

            // Declare BufferedReader and FileWriter
            BufferedReader bufferedReader = null;
            FileWriter fileWriter = null;

            try {
                // Create an InputStreamReader to read user input from the console
                InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                bufferedReader = new BufferedReader(inputStreamReader);

                // Create a FileWriter to write input to the file
                fileWriter = new FileWriter(filePath, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                System.out.println("Enter text to write to the file (type 'exit' to stop):");

                String userInput;
                // Read user input line by line
                while (!(userInput = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                    // Write the user input to the file with a new line
                    bufferedWriter.write(userInput);
                    bufferedWriter.newLine();
                }

                System.out.println("User input has been saved to " + filePath);

                // Close BufferedWriter
                bufferedWriter.close();

            } catch (IOException e) {
                // Handle errors that occur while reading the file
                System.out.println("Error: " + e.getMessage());
            }
        }
}
