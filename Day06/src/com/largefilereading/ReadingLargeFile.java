package com.largefilereading;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


//Create the class nameReadingLargeFile
public class ReadingLargeFile {

    //Create the method to read file using FileReader
    public static void readFileUsingFileReader(String filePath)throws IOException {
        //FileReader Object
        FileReader fileReader = new FileReader(filePath);

        // Read the file character by character
        int character;
        while ((character = fileReader.read()) != -1) {
            //Just reading a file character by character
        }
        fileReader.close();

    }

    //Create the method name readFileUsingInputStreamReader to raed a file
    public static void readFileUsingInputStreamReader(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        //InputStreamReader Object
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        int character;
        // Read the file byte by byte and convert it to characters
        while ((character = inputStreamReader.read()) != -1) {
            //Just reading a file character by character
        }

        inputStreamReader.close();
    }

    //Create the method name performanceTest
    public static void performanceTest(String filePath) throws IOException{
        long startTime = System.nanoTime();
        readFileUsingFileReader(filePath);
        long endTime = System.nanoTime();
        long fileReaderTime = endTime-startTime;
        System.out.println("FileReader time: "+fileReaderTime/1000000+" ms");

        //Measure time by InputStreamReader
        startTime = System.nanoTime();
        readFileUsingInputStreamReader(filePath);
        endTime = System.nanoTime();
        long inputStreamReaderTime = endTime-startTime;
        System.out.println("InputStreamReader: "+inputStreamReaderTime/1000000+" ms");

    }
}
