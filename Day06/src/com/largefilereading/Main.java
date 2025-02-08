package com.largefilereading;

import java.io.IOException;

public class Main {

    public static void main(String args[]){
        String filePath = "D:/calculator/file.txt";
        String filePath2 = "D:/Addition/File.txt";
        String filePath3 = "D:/Cpagemini Training/File.txt";
        // Test with file
        try {
            // Test for 500MB size file
            ReadingLargeFile.performanceTest(filePath);
            ReadingLargeFile.performanceTest(filePath2);
            ReadingLargeFile.performanceTest(filePath3);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file");
        }
    }
}
