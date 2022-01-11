package com.haidar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountTotalUnsortedAndSortedTest {
    // Counting how many names inside unsorted file
    // public int nameCountExpected = 0;

    // Counting how many names inside Sorted file.
    // The expected total names should be same with the total actual names after
    // sorting
    // public int nameCountActual = 0;

    public int sumTotalUnsortedNames() {
        int nameCountExpected = 0;
        // Reading process of .txt file which contains the set of Unsorted Names
        try {
            File setOfNames = new File("unsorted-names-list.txt");
            // or you can change any other file(s) as you wanted to sort.
            // Just change the file name "unsorted-names-list.txt" above to "your-file.txt"
            Scanner readNames = new Scanner(setOfNames);
            while (readNames.hasNextLine()) {
                nameCountExpected += 1;
            }

            // close the scanner/input read
            readNames.close();
        } catch (FileNotFoundException e) {
            System.out.println("Make sure the File name/location is valid.");
            e.printStackTrace();
        }

        return nameCountExpected;

    }

    public int sumTotalSortedNames() {
        int nameCountActual = 0;
        // Reading process of .txt file which contains the set of Sorted Names
        try {
            File setOfNames = new File("sorted-names-list.txt");
            Scanner readNames = new Scanner(setOfNames);
            while (readNames.hasNextLine()) {
                nameCountActual += 1;
            }

            readNames.close();
        } catch (FileNotFoundException e) {
            System.out.println("Make sure the File name/location is valid.");
            e.printStackTrace();
        }
        return nameCountActual;
    }

}
