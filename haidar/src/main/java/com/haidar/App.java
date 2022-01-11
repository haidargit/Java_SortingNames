package com.haidar;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public final class App {

    // Methods for showing the result
    public void showSortedNames() throws FileNotFoundException {
        // File sortedResult = new File("sorted-names-list.txt");
        // GetFileFromResource getTxtFileClass = new GetFileFromResource();

        String fileName = "/sorted-names-list.txt";
        Path currentRelativePath = Paths.get("");
        String pathResult = currentRelativePath.toAbsolutePath().toString();
        Scanner readResultNames = new Scanner(pathResult+fileName);
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
        System.out.println("# # Below are the sorted result by using their last name # # \n");
        appInstantiation.showSortedNames();
    }
}
