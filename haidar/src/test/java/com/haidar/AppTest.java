package com.haidar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This is Unit test for 'Name Sorter App'
 */
class AppTest {

    @Test
    void testApp() {
        // App sorterAppUnitTest = new App();
        // test call 
        

        // Counting how many names inside unsorted file
        int nameCountExpected = 0;

        // Reading process of .txt file which contains the set of Unsorted Names
        try {
            File setOfNames = new File("unsorted-names-list.txt");
            // or you can change any other file(s) as you wanted to sort.
            // Just change the file name "unsorted-names-list.txt" above to "your-file.txt"
            Scanner readNames = new Scanner(setOfNames);
            while (readNames.hasNextLine()) {
                nameCountExpected +=1;
            }

            // close the scanner/input read
            readNames.close();
        } catch (FileNotFoundException e) {
            System.out.println("Make sure the File name/location is valid.");
            e.printStackTrace();
        }

        // Counting how many names inside Sorted file. 
        // The expected total names should be same with the total actual names after sorting
        int nameCountActual = 10;

        // Reading process of .txt file which contains the set of Sorted Names
        try {
            File setOfNames = new File("sorted-names-list.txt");
            Scanner readNames = new Scanner(setOfNames);
            while (readNames.hasNextLine()) {
                nameCountActual +=1;
            }

            readNames.close();
        } catch (FileNotFoundException e) {
            System.out.println("Make sure the File name/location is valid.");
            e.printStackTrace();
        }
        
        assertEquals(nameCountExpected, nameCountActual);

    }
}
