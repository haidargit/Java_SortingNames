package com.haidar;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class CountTotalUnsortedAndSorted {
    // Counting how many names inside unsorted file
    // public int nameCountExpected = 0;

    // Counting how many names inside Sorted file.
    // The expected total names should be same with the total actual names after
    // sorting
    // public int nameCountActual = 0;

    public static int sumTotalUnsortedNames() throws FileNotFoundException {
        GetFileFromResource getTxtFileClass = new GetFileFromResource();
        int nameCountExpected = 0;
        String fileName = "unsorted-names-list.txt";
        InputStream unsortedFile = getTxtFileClass.getFileFromResourceAsStream(fileName);
        // Change any other file(s) as you wanted to sort.
        // Just change the file name "unsorted-names-list.txt" above to "your-file.txt"
        
        Scanner readNames = new Scanner(unsortedFile);
        while (readNames.hasNextLine()) {
            nameCountExpected += 1;
        }

        // close the scanner/input read
        readNames.close();

        return nameCountExpected;

    }

    public static int sumTotalSortedNames() throws FileNotFoundException {
        GetFileFromResource getTxtFileClass = new GetFileFromResource();
        int nameCountActual = 0;
        String fileName = "sorted-names-list.txt";
        InputStream unsortedFile = getTxtFileClass.getFileFromResourceAsStream(fileName);
        Scanner readNames = new Scanner(unsortedFile);
        while (readNames.hasNextLine()) {
            nameCountActual += 1;
        }

        readNames.close();
        return nameCountActual;
    }

}
