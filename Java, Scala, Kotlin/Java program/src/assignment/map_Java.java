package assignment;
import java.util.*;
import java.util.Map.Entry;

public class map_Java {
    public static void main(String args[]) {

        TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();

        tree_map.put(2, "Book-1");
        tree_map.put(4, "Book-2");
        tree_map.put(6, "Book-3");
        tree_map.put(8, "Book-4");
        tree_map.put(10, "Book-5");

        System.out.println("Original : " + tree_map);
        System.out.println("Keys greater than or equal to 4: " + tree_map.ceilingEntry(4));
        System.out.println("Keys greater than or equal to 7: " + tree_map.ceilingEntry(7));
        System.out.println("Keys greater than or equal to 10: " + tree_map.ceilingEntry(10));

        //get NavigableSet view of the keys contained in a map
        System.out.println("Orginal TreeMap content: " + tree_map.navigableKeySet());
    }
}