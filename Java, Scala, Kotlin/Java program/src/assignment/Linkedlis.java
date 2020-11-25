package assignment;

import java.util.LinkedList;

public class Linkedlis {
    public static void main(String[] arg){
        LinkedList<String> ll = new LinkedList<String>();
            ll.add("B");
            ll.add("C");
            ll.add("D");
            ll.add("E");
        System.out.println("original Linkedlist :" +ll);

        //insert first and last element
            ll.addFirst("A");
            ll.addLast("F");
        System.out.println("The finally Linkedlist :" +ll);
    }
}
