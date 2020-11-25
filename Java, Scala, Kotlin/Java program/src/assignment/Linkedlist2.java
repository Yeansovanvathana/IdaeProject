package assignment;

import java.util.LinkedList;

public class Linkedlist2 {
    public static void main(String[] arg){
        LinkedList ll = new LinkedList();
        ll.add("Book-1");
        ll.add("Book-2");
        ll.add("Book-3");
        ll.add("Book-4");
        System.out.println("The original Linkedlist :" + ll);

        // peek at the first element
        System.out.println("First element of Linkedlist : " + ll.peekFirst());
    }
}
