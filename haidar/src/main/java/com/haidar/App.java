package com.haidar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public final class App {

    // Methods for showing the result
    public void showSortedNames() throws FileNotFoundException {
        File sortedResult = new File("sorted-names-list.txt");
        // GetFileFromResource getTxtFileClass = new GetFileFromResource();
        // String fileName = "sorted-names-list.txt";
        // InputStream unsortedFile = getTxtFileClass.getFileFromResourceAsStream(fileName);
        Scanner readResultNames = new Scanner(sortedResult);
        while (readResultNames.hasNextLine()) {
            String data = readResultNames.nextLine();
            System.out.println(data);
        }

        // close the scanner/input read
        readResultNames.close();
    }

    public static void main(String[] args) throws IOException {
        App appInstantiation = new App();
        SortingMethod sortingClassInstantiation = new SortingMethod();

        sortingClassInstantiation.sortByLastName();
        System.out.println("");
        System.out.println("# # Below are the sorted result by using their last name # # \n");
        appInstantiation.showSortedNames();
    }
}
