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

    public void RunMainSortApp() throws IOException{
        SortingMethod sortingClassInstantiation = new SortingMethod();
        sortingClassInstantiation.sortByLastName();
    }

    @Test
    void testApp() throws IOException{
        AppTest appTest = new AppTest();
        appTest.RunMainSortApp();
        
        // 1st Unit Test
        // Comparing the sum total of names from the "sorted-names-list.txt" and "sorted-names-list.txt"
        // Both totals should be same
        assertEquals(CountTotalUnsortedAndSortedTest.sumTotalUnsortedNames(), CountTotalUnsortedAndSortedTest.sumTotalSortedNames());

        // 2nd Unit Test
        // We'll add continuous space character or whitespaces to test our primay method sortByLastName
        // Then our method must persistent and know the Last Name, even though we have so many spaces.
    }
}
