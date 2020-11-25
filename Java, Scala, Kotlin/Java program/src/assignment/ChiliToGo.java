package assignment;

import java.util.Scanner;
class ChiliToGo {
    public static void main(String[] args)
    {
        int child,adult;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of child meals: ");
        child = in.nextInt();
        System.out.print("Enter the number of adult meals: ");
        adult = in.nextInt();
        double child_Meals_Price = child * 4;
        double adult_Meals_Price = adult * 7;

        System.out.println("price of child meals = $" + child_Meals_Price);
        System.out.println("Price of adult meals = $" + adult_Meals_Price);
        System.out.println("Total price of child and adult = $" + (child_Meals_Price+adult_Meals_Price));
    }
}
