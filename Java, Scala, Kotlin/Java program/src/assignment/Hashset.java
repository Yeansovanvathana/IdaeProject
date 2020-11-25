package assignment;
import java.util.HashSet;

public class Hashset {

    public static void main(String[] arg){

        HashSet<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("orange");
        hs.add("banana");
        System.out.println("Hashset :"+ hs);

        //convert Hashset to array

        String[] arr = new String[hs.size()];
        hs.toArray(arr);
        System.out.println("Array"+ hs);

        //get size of element in hashset

        System.out.println("Size of the hashset : " + hs.size());

        //  use clear() method removes all the elements from a hash set
        hs.clear();

        System.out.println("HashSet content: "+hs);
        //and hashset become empty
    }
}
