package com.haidar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortingMethod {
    // Sort Method
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

        // Insert the sorted names into the other file ==> sorted-names-list.txt
        FileWriter writer = new FileWriter("sorted-names-list.txt");
        for (String result : unsortedNames) {
            writer.write(result + System.lineSeparator());
        }
        // close the scanner/input read
        writer.close();
    }

    // Methods for saving Unsorted Names into the List
    public ArrayList<String> saveUnsortedNamestoList() {
        ArrayList<String> allNames = new ArrayList<String>();

        // Reading process .txt file which contains set of Names
        try {
            File setOfNames = new File("unsorted-names-list.txt");
            // or you can change any other file(s) as you wanted to sort.
            // Just change the file name "unsorted-names-list.txt" above to "your-file.txt"
            Scanner readNames = new Scanner(setOfNames);
            while (readNames.hasNextLine()) {
                String data = readNames.nextLine();
                allNames.add(data);
            }
            readNames.close();
        } catch (FileNotFoundException e) {
            System.out.println("Make sure the File name/location is valid.");
            e.printStackTrace();
        }
        return allNames;
    }
}
