package assignment;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        // creating TreeSet
        TreeSet<Integer> tree_num1 = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_num1.add(10);
        tree_num1.add(22);
        tree_num1.add(36);
        tree_num1.add(25);
        tree_num1.add(50);
        tree_num1.add(42);
        tree_num1.add(18);

        //find Greater than or equal
        System.out.println("Greater than or equal to 25 : " + tree_num1.ceiling(25));
        System.out.println("Greater than or equal to 9 : " + tree_num1.ceiling(9));

        //tree_set1
        System.out.println("Original tree_set: " + tree_num1);

        //retrieve and remove the first element
        System.out.println("Removes the first(lowest) element: " + tree_num1.pollFirst());
        System.out.println("Tree_set after remove first element: " + tree_num1);

        //Create another new tree_set2
        TreeSet<Integer> tree_num2 = new TreeSet<>();
        tree_num2.add(10);
        tree_num2.add(22);
        tree_num2.add(35);
        tree_num2.add(15);
        tree_num2.add(50);
        tree_num2.add(42);
        tree_num2.add(28);

        //tree_set2
        System.out.println("tree_set2" + tree_num2);

        //comparison tree_set1 and tree_set2 by yes and no
        TreeSet<String> result_set = new TreeSet<String>();

        for (Integer element:tree_num1) {
            System.out.println(tree_num2.contains(element) ? "Yes" : "No");
        }
    }
}