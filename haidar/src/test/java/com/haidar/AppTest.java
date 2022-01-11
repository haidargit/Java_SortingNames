package com.haidar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

/**
 * This is Unit test for 'Name Sorter App'
 */
class AppTest {

    @Test
    void testApp() throws IOException {
        // instantiate Sorting Method and CountTotalUnsortedAndSortedTestclass to call sortByLastName primary method, and etc.
        SortingMethod sortingClass = new SortingMethod();
        sortingClass.sortByLastName();
        CountTotalUnsortedAndSortedTest countClass = new CountTotalUnsortedAndSortedTest(); 
        
        // First Unit Test Idea
        // Comparing the sum total of names from the sorted-names-list.txt and sorted-names-list.txt
        // Both totals should be same
        assertEquals(countClass.sumTotalSortedNames(), countClass.sumTotalUnsortedNames());
        assertEquals(10, countClass.sumTotalUnsortedNames());
        
        // Second Unit Test Idea
        // We'll add continuous space character or whitespaces to test our primay method sortByLastName
        // Then our method must persistent and know the Last Name, even though we have so many spaces.
    }
}
