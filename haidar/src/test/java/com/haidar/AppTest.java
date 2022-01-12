package com.haidar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

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
    }
}
