package com.haidar;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortingMethod {
    // Our Main Sort Method
    public void sortByLastName() throws IOException {
        ArrayList<String> unsortedNames = new ArrayList<String>(saveUnsortedNamestoList());
        
        Collections.sort(unsortedNames, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // Using Regex expression \\s+ which matches sequence of one or more whitespace characters
                String[] left = o1.split("\\s+");
                String[] rightCorner = o2.split("\\s+");

                return left[left.length - 1].compareTo(rightCorner[rightCorner.length - 1]);
            }
        });

        // After running the sorting method above,
        // insert the sorted names into the destination file   ==>   "sorted-names-list.txt"
        FileWriter writer = new FileWriter("sorted-names-list.txt");

        for (String result : unsortedNames) {
            writer.write(result + System.lineSeparator());
        }
        // close the scanner/input read
        writer.close();
    }

    // Methods for saving Unsorted Names into the List
    public ArrayList<String> saveUnsortedNamestoList() throws FileNotFoundException {
        ArrayList<String> allNames = new ArrayList<String>();
        GetFileFromResource getTxtFileClass = new GetFileFromResource();

        String fileName = "unsorted-names-list.txt";
        InputStream unsortedFile = getTxtFileClass.getFileFromResourceAsStream(fileName);
        // Change any other file(s) as you wanted to sort.
        // Just change the file name "unsorted-names-list.txt" above to "your-file.txt"
        
        Scanner readNames = new Scanner(unsortedFile);
        while (readNames.hasNextLine()) {
            String data = readNames.nextLine();
            allNames.add(data);
        }
        readNames.close();
        return allNames;
    }
}