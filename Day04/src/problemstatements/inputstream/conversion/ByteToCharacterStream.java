package problemstatements.inputstream.conversion;

import java.io.*;

//Create the class name ByteToCharacterStream
public class ByteToCharacterStream {

        //Create the main method
        public static void main(String[] args) {
            // File path
            String filePath = "D:/calculator/file.txt";

            // Declare FileInputStream, InputStreamReader, and BufferedReader
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;

            try {
                // Create a FileInputStream to read the binary file
                fileInputStream = new FileInputStream(filePath);

                // Wrap FileInputStream in InputStreamReader
                inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

                // Wrap InputStreamReader in BufferedReader for efficient reading
                bufferedReader = new BufferedReader(inputStreamReader);

                String line;
                // Read file line by line and print it to the console
                while ((line = bufferedReader.readLine()) != null) {
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
