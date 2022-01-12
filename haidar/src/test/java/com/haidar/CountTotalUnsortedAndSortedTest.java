package com.haidar;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountTotalUnsortedAndSortedTest {

    public static long sumTotalUnsortedNames() throws FileNotFoundException {
        String pathCurr = System.getProperty("user.dir");
        Path path = Paths.get(pathCurr+"/src/main/resources/unsorted-names-list.txt");

        long linesExpected = 0;
        try {
            linesExpected = Files.lines(path).count();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return linesExpected;

    }

    public static long sumTotalSortedNames() throws FileNotFoundException {

        Path path = Paths.get("sorted-names-list.txt");

        long lines = 0;
        try {

            lines = Files.lines(path).count();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

}