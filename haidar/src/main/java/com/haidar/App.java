package com.haidar;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public final class App {
    private App() {
    }
    public void sortByLastName(ArrayList<String> al) throws IOException {
        Collections.sort(al, new Comparator<String> () {
          @Override
          public int compare(String o1, String o2) {
            // Using Regex expression \\s+  which matches sequence of one or more whitespace characters
            String[] left = o1.split("\\s+");
            String[] rightCorner = o2.split("\\s+");
            
            return left[left.length - 1].compareTo(rightCorner[rightCorner.length - 1]);
          }
        });
    
        // Insert the sorted names into the other file ==> sorted-names-list.txt
        FileWriter writer = new FileWriter("sorted-names-list.txt");
        for(String result: al){
            writer.write(result + System.lineSeparator());
        }
        writer.close();
    
        try {
            File sortedResult = new File("sorted-names-list.txt");
            Scanner readResultNames = new Scanner(sortedResult);
            while (readResultNames.hasNextLine()){
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
        // creating new instance of Array List object for names
        ArrayList<String> al = new ArrayList<String> ();
    
        //  Reading process .txt file which contains set of Names
        try {
            File setOfNames = new File("unsorted-names-list.txt");
            //  or you can change any other file(s) as you wanted to sort. 
            //  Just change the file name "unsorted-names-list.txt" above to "your-file.txt"
            Scanner readNames = new Scanner(setOfNames);
            while (readNames.hasNextLine()){
                String data = readNames.nextLine();
                al.add(data);
            }
    
            // close the scanner/input read
            readNames.close();
        } catch (FileNotFoundException e) {
            System.out.println("Make sure the File name/location is valid.");
            e.printStackTrace();
        }
        App i = new App();
        
        System.out.println("## Sorted result by using their Last name ## \n");
        i.sortByLastName(al);
      }
}
