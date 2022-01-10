import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortingProcessByLastName {

  public void sortLast(ArrayList<String> al) {
    Collections.sort(al, new Comparator<String> () {
      @Override
      public int compare(String o1, String o2) {
        String[] split1 = o1.split(" ");
        String[] split2 = o2.split(" ");
        String lastName1 = split1[1];
        String lastName2 = split2[1];
        if (lastName1.compareTo(lastName2) > 0) {
          return 1;
        } else {
          return -1;
        }
      }
    });
    System.out.println(al);
  }

  public static void main(String[] args) {
    // creating new instance of Array List object for names
    ArrayList<String> al = new ArrayList<String> ();

    try {
        File setOfNames = new File("unsorted-names-list");
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
    // al.add("Daenerys Targaryen");
    // al.add("Jon Show");
    // al.add("Tyrion Lannister");
    // al.add("Joffrey Baratheon");
    SortingProcessByLastName i = new SortingProcessByLastName();
    
    System.out.println("Sorting a set of names using their Last name");
    i.sortLast(al);
  }

}