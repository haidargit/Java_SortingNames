package com.haidar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * This is Unit test for 'Name Sorter App'
 */
class AppTest {

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

        readNames.close();
        return nameCountExpected;

    }

    // public static int sumTotalSortedNames() throws FileNotFoundException {
    //     GetFileFromResource getTxtFileClass = new GetFileFromResource();
    //     int nameCountActual = 0;
    //     String fileName = "sorted-names-list.txt";
    //     InputStream unsortedFile = getTxtFileClass.getFileFromResourceAsStream(fileName);
    //     Scanner readNames = new Scanner(unsortedFile);
    //     while (readNames.hasNextLine()) {
    //         nameCountActual += 1;
    //     }

    //     readNames.close();
    //     return nameCountActual;
    // }

    @Test
    void testApp() throws IOException {
        // 1st Unit Test
        // Comparing the sum total of names from the "sorted-names-list.txt" and "sorted-names-list.txt"
        // Both totals should be same
        // Assertions.assertEquals(AppTest.sumTotalUnsortedNames(), AppTest.sumTotalSortedNames());
        assertEquals(AppTest.sumTotalUnsortedNames(), 10);

        // 2nd Unit Test
        // We'll add continuous space character or whitespaces to test our primay method sortByLastName
        // Then our method must persistent and know the Last Name, even though we have so many spaces.
    }
}
