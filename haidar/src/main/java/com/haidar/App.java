package com.haidar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public final class App {

    // Methods for showing the result
    public void showSortedNames() {
        try {
            File sortedResult = new File("sorted-names-list.txt");
            Scanner readResultNames = new Scanner(sortedResult);
            while (readResultNames.hasNextLine()) {
                String data = readResultNames.nextLine();
                System.out.println(data);
            }

            // close the scanner/input read
            readResultNames.close();
        } catch (FileNotFoundException e) {
            System.out.println("Make sure the File name/location is valid.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        App appInstantiation = new App();
        SortingMethod sortingClassInstantiation = new SortingMethod();

        sortingClassInstantiation.sortByLastName();
        System.out.println("## Sorted result by using their Last name ## \n");
        appInstantiation.showSortedNames();


    }
}
