package assignment;

import java.util.*;

public class linkedlist1 {
    public static void main(String[] arg){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Book-2");
        ll.add("Book-3");
        System.out.println("The original linkedlist :" + ll);
        //Swap 2 element
        Collections.swap(ll,0,1);
        System.out.println("The finally swap element :" + ll);
    }
}
