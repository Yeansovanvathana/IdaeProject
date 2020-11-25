package assignment;
import java.util.Scanner;

public class ChiliToprofit {
    public static void main(String[] args)
    {
        int child,adult;
        double totalchild, totaladult, grandTotal;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number of child meal :");
        child = num.nextInt();
        totalchild = child * 4;
        System.out.println("Enter number of adult meal :");
        adult = num.nextInt();
        totaladult = adult * 7;
        grandTotal = totaladult + totalchild;
        System.out.println(child+" child meals were ordered at 4 each.");
        System.out.println("Total is "+totalchild);
        System.out.println(adult+" child meals were ordered at 4 each.");
        System.out.println("Total is "+totaladult);
        System.out.println("Grand total for all meal is "+ grandTotal);

    }

}
